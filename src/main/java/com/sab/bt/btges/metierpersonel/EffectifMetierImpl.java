package com.sab.bt.btges.metierpersonel;

import java.util.Date;
import java.util.List;

import com.sab.bt.btges.entities.Militaire;


import org.springframework.stereotype.Service;

@Service
public class EffectifMetierImpl implements EffectifMetier{

    @Override
   
    public Militaire ajouterMilitaire(
    String matricule, 
    String nom,
    String prenom, 
    Date datenaissance, 
    String sexe,
    Boolean detacheAuCorps, 
    List<String> Stages,
     String position, 
    String origine, 
    String categorie, 
    String grade) {
		
        
        Militaire m = new Militaire();

        m.setMatricule(matricule);
        m.setNom(nom);
        m.setPrenom(prenom);
        m.setDateNaissance(datenaissance);
      


       
        
        return null;
	}
    
}