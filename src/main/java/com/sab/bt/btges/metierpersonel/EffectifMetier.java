package com.sab.bt.btges.metierpersonel;

import java.util.Date;
import java.util.List;

import com.sab.bt.btges.entities.Militaire;
import com.sab.bt.btges.entities.RecapGr;

public interface EffectifMetier {
    
    public Militaire ajouterMilitaire(
        String matricule,
        String nom,
        String prenom,
        Date datenaissance,
        String sexe,
        String detacheAuCorps,
        String[] Stages,
        String position,
        String origine,
        String categorie,
        String grade
        
     );


     public List<RecapGr> fichePotentiel();
}