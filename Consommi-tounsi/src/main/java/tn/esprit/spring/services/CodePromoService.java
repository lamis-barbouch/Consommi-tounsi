package tn.esprit.spring.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entity.CodePromo;
import tn.esprit.spring.repository.CodePromoRepository;

@Service
public class CodePromoService implements ICodePromoService{
	@Autowired
	CodePromoRepository codePromoRep;
	
	@Override
	public int addCodePromo(CodePromo codePromo) {
		codePromoRep.save(codePromo);
		return codePromo.getId_codePromo();			}

	@Override
	public int updateCodePromo(CodePromo codePromo) {
		codePromoRep.save(codePromo);
		return codePromo.getId_codePromo();
		}

	@Override
	public void deleteCodePromo(int id) {
		codePromoRep.findById(id).orElse(null);
        codePromoRep.deleteById(id);
	}

	@Override
	public List<CodePromo> getAllCodePromo() {
		List<CodePromo> codePromos = new ArrayList<CodePromo>();
		codePromoRep.findAll().forEach(codePromo-> codePromos.add(codePromo));;
		return codePromos;
	}

	@Override
	public CodePromo getCodePromoById(int id) {
		 return codePromoRep.findById(id).get();		
	}
	
	@Override
	public String activatePromo(int id)
	{
	CodePromo c = getCodePromoById(id);
	if (c.isStatus_CodePromo()==false)
	{   c.setStatus_CodePromo(true);
		codePromoRep.save(c);
		return "activated";
	}
	else  return "already activated ";
	}

	@Override
	public String desactivatePromo(int id)
	{
		CodePromo c = getCodePromoById(id);
		if (c.isStatus_CodePromo()==true)
		{   c.setStatus_CodePromo(false);
			codePromoRep.save(c);
			return "desactivated";
		}
		else  return "already desactivated ";
		
	}
	
}
