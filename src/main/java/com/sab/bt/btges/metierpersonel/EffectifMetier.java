package com.sab.bt.btges.metierpersonel;

import java.util.Date;
import java.util.List;

import com.sab.bt.btges.entities.Militaire;

public interface EffectifMetier {
    
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
        String grade
     );
}