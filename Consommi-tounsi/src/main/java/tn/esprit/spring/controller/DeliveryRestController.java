package tn.esprit.spring.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import tn.esprit.spring.entity.Delivery;
import tn.esprit.spring.entity.DeliveryMan;
import tn.esprit.spring.entity.DeliveryZone;
import tn.esprit.spring.entity.OrderMouna;
import tn.esprit.spring.entity.StatusOrder;
import tn.esprit.spring.exeptions.ResourceNotFoundException;
import tn.esprit.spring.repository.DeliveryManRepository;
import tn.esprit.spring.repository.DeliveryRepository;
import tn.esprit.spring.repository.OrderMounaRepository;
import tn.esprit.spring.services.DeliveryService;

@RestController

public class DeliveryRestController {
	
	@Autowired
	DeliveryRepository deliveryRep ;
	
	@Autowired
	OrderMounaRepository orderRep ;

	@Autowired
	DeliveryManRepository deliveryManRep ;
	@Autowired
	DeliveryService deliveryservice;
	
	@GetMapping("/delivery")
	public List<Delivery> getAllDelivery() {
		return deliveryRep.findAll();
	}
	
	@PostMapping("/Delivery/{id_order}/{address}")
	public Delivery CreateDelivery(@PathVariable(value = "id_order")int id_order,
	 @PathVariable(value = "address")String address) throws ResourceNotFoundException {
		System.out.println("start CreateDelivery ");
		if(id_order!=0 ) {
			OrderMouna ord=null;
			ord=orderRep.findById(id_order).get();
			System.out.println("OrderMouna ---> "+ord.toString());
			Delivery delivery ;
			if(ord.getDelivery()!=null){
				
				System.out.println("delivery ---> "+ord.getDelivery().toString());
				delivery= ord.getDelivery();
			}
			else {
				delivery = new Delivery();
			}
			System.out.println("value of enum "+DeliveryZone.valueOf(address.trim()));
			delivery.setStatus_order(StatusOrder.delivered);
			delivery.setOrder(ord);
			delivery.setDate_delivery(new Date());
			
			
			delivery.setDelivery_zone(DeliveryZone.valueOf(address.trim()));
			if(!DeliveryZone.valueOf(address.trim()).equals(DeliveryZone.boutique)){
				
				List<DeliveryMan> lstDvMan=deliveryManRep.findAll();
				for(DeliveryMan devMan : lstDvMan) {
					if (devMan.getAddress().toString().equals(address)) {
						delivery.setDeliveryman(devMan);
						break;
					}
				
			}
			}
				deliveryRep.save(delivery);
				ord.setDelivery(delivery);
				orderRep.save(ord);
				return 	delivery;
			
			
		}
			return null;
		
	}
	@GetMapping("/Delivery/Client/{id_user}")
	public ResponseEntity<List<Delivery>> getDeliveryClient(@PathVariable(value = "id_user") int id_user)
			throws ResourceNotFoundException {
		List<Delivery> deliverys=deliveryservice.GetDeliveryByClient(id_user).orElseThrow(() -> new ResourceNotFoundException("Product not found for this id Client :: " + id_user));
		return ResponseEntity.ok().body(deliverys);
	}
	}
	


