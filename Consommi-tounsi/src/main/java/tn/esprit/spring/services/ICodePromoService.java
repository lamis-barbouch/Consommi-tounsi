package tn.esprit.spring.services;

import java.util.List;

import tn.esprit.spring.entity.CodePromo;

public interface ICodePromoService {
	public int addCodePromo(CodePromo codePromo);  //by admin
	public int updateCodePromo(CodePromo codePromo);  //by admin
    public void deleteCodePromo( int id); //by admin
    public List<CodePromo> getAllCodePromo(); 
    public CodePromo getCodePromoById(int id);
    public String activatePromo (int id);
    public String desactivatePromo (int id);

    
}
