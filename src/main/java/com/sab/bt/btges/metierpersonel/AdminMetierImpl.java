package com.sab.bt.btges.metierpersonel;

import java.util.List;

import com.sab.bt.btges.daopersonel.AffectationRepository;
import com.sab.bt.btges.daopersonel.CategorieRepository;
import com.sab.bt.btges.daopersonel.GradeRepository;
import com.sab.bt.btges.daopersonel.OrigineRepository;
import com.sab.bt.btges.daopersonel.PositionRepository;
import com.sab.bt.btges.daopersonel.StagesRepository;
import com.sab.bt.btges.entities.Affectation;
import com.sab.bt.btges.entities.Categorie;
import com.sab.bt.btges.entities.Grade;
import com.sab.bt.btges.entities.Origine;
import com.sab.bt.btges.entities.Position;
import com.sab.bt.btges.entities.Stages;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class AdminMetierImpl implements AdminMetier {
    @Autowired
    private AffectationRepository affRepo;
    @Autowired
    private CategorieRepository catRepo;
    @Autowired
    private OrigineRepository orRepo;
    @Autowired
    private PositionRepository posRepo;
    @Autowired
    StagesRepository stRepo;
    @Autowired
    GradeRepository grRepo;

    @Override
    public Affectation addAffectation(Affectation a) {
        return affRepo.save(a);
    }

    @Override
    public List<Affectation> getAffectations() {
        return affRepo.findAll();
    }

    @Override
    public void deleteAffectation(Affectation a) {
        affRepo.delete(a);
    }

    @Override
    public Categorie addCategorie(Categorie c) {
        return catRepo.save(c);
    }

    @Override
    public List<Categorie> getCategories() {
        return catRepo.findAll();
    }

    @Override
    public void deleteCategorie(Categorie c) {
        catRepo.delete(c);
    }

    @Override
    public List<Origine> getOrigines() {
        return orRepo.findAll();
    }

    @Override
    public Origine addOrigine(Origine origine) {
        return orRepo.save(origine);

    }

    @Override
    public List<Position> getPositions() {
        // TODO Auto-generated method stub
        return posRepo.findAll();
    }

    @Override
    public Position addPosition(Position position) {
        return posRepo.save(position);
    }

    @Override
    public List<Stages> getStages() {
        // TODO Auto-generated method stub
        return stRepo.findAll();
    }

    @Override
    public Stages addStage(Stages stages) {
        return stRepo.save(stages);
    }

    @Override
    public Grade addGrade(Grade grade) {
        // TODO Auto-generated method stub
        return grRepo.save(grade);
    }

    @Override
    public List<Grade> getGrades() {
        // TODO Auto-generated method stub
        return grRepo.findAll();
    }
    
}