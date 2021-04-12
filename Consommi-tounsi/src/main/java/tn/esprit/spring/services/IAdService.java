package tn.esprit.spring.services;
import tn.esprit.spring.entity.Ad;

public interface IAdService {
	public void createAd(Ad ad);

	public void updateAd(Ad adv);

	public void deleteAd(int id);

}
