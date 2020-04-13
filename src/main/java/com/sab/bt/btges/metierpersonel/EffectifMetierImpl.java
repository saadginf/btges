package com.sab.bt.btges.metierpersonel;

import java.util.ArrayList;
import java.util.Date;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.sab.bt.btges.daopersonel.AffectationRepository;
import com.sab.bt.btges.daopersonel.CategorieRepository;
import com.sab.bt.btges.daopersonel.GradeRepository;
import com.sab.bt.btges.daopersonel.MilitaireRepository;
import com.sab.bt.btges.daopersonel.OrigineRepository;
import com.sab.bt.btges.daopersonel.PositionRepository;
import com.sab.bt.btges.daopersonel.StagesRepository;
import com.sab.bt.btges.entities.Grade;
import com.sab.bt.btges.entities.Militaire;
import com.sab.bt.btges.entities.Origine;
import com.sab.bt.btges.entities.Position;
import com.sab.bt.btges.entities.RecapGr;
import com.sab.bt.btges.entities.Stages;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EffectifMetierImpl implements EffectifMetier {

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
    @Autowired
    MilitaireRepository mRepo;


    @Override

    public Militaire ajouterMilitaire(String matricule, String nom, String prenom, Date datenaissance, String sexe,
            String detacheAuCorps, String[] stages, String position, String origine, String categorie, String grade) {

        Militaire m = new Militaire();

        m.setMatricule(matricule);
        m.setNom(nom);
        m.setPrenom(prenom);
        m.setDateNaissance(datenaissance);
        m.setSexe(sexe.equals("1") ? true : false);
        m.setPosition(posRepo.findById(Long.parseLong(position)).get());
        m.setCategorie(catRepo.findById(Long.parseLong(categorie)).get());
        m.setGrade(grRepo.findById(Long.parseLong(grade)).get());
        m.setOrigine(orRepo.findById(Long.parseLong(origine)).get());
        m.setDetacheAuCorps(detacheAuCorps.equals("0") ? true : false);
        Set<Stages> st = new HashSet<Stages>();
        for (String s : stages) {
            st.add(stRepo.findById(Long.parseLong(s)).get());
        }
        m.setStages(st);
        return mRepo.save(m);
    }

    @Override
    public List<RecapGr> fichePotentiel() {
        List<RecapGr> recapGr = new ArrayList<RecapGr>();
        List<Grade>   allGrade= grRepo.findAll();


        for (Grade grade : allGrade) {

            RecapGr rG= new RecapGr();
            rG.setGrade(grade.getLibbele());
            
            Origine orEcole = orRepo.findById(90L).get();
            rG.setNbrOrEcole(mRepo.findByGradeAndOrigine(grade, orEcole).size());
            
            Origine orAsp = orRepo.findById(91L).get();
            rG.setNbrOrAsp(mRepo.findByGradeAndOrigine(grade, orAsp).size());

            Origine orCycle = orRepo.findById(92L).get();
            rG.setNbrOrAsp(mRepo.findByGradeAndOrigine(grade, orCycle).size());
            
            Origine orRang = orRepo.findById(93L).get();
            rG.setNbrOrRang(mRepo.findByGradeAndOrigine(grade, orRang).size());




            Position ps = posRepo.findById(31L).get();
            rG.setNbrDetacheAuCorps(mRepo.findByGradeAndDetacheAuCorps(grade, true).size());
            rG.setNbrDetacheDuCorps(mRepo.countByGradeAndPositionNot(grade, ps));
            
            rG.setNbrSF(mRepo.findByGradeAndSexeTrue(grade).size());
            rG.setNbrSM(mRepo.findByGradeAndSexeFalse(grade).size());
           
            
           
            recapGr.add(rG);
        }




        return recapGr;
    }
    
}