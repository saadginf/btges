package com.sab.bt.btges.metierpersonel;

import java.util.List;

import com.sab.bt.btges.entities.Affectation;
import com.sab.bt.btges.entities.Categorie;
import com.sab.bt.btges.entities.Grade;
import com.sab.bt.btges.entities.Origine;
import com.sab.bt.btges.entities.Position;
import com.sab.bt.btges.entities.Stages;

public interface AdminMetier {
    //AFFECATION______
    public Affectation addAffectation(Affectation a);
    

    public List<Affectation> getAffectations();


    public void deleteAffectation(Affectation a );
    //CATEGORIE______________
    public Categorie addCategorie(Categorie c);
    

    public List<Categorie> getCategories();


    public void deleteCategorie(Categorie c );


	public List<Origine> getOrigines();


	public Origine addOrigine(Origine origine);


	public List<Position> getPositions();


	public Position addPosition(Position position);


	public List<Stages> getStages();


	public Stages addStage(Stages stages);


	public Grade addGrade(Grade grade);


	public List<Grade> getGrades();



}