package com.sab.bt.btges.metierpersonel;

import java.util.List;

import com.sab.bt.btges.entities.Affectation;
import com.sab.bt.btges.entities.Categorie;
import com.sab.bt.btges.entities.Origine;
import com.sab.bt.btges.entities.Position;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class AdminController {
   
    @Autowired
    private AdminMetier adm;


    @RequestMapping("/admin")
    public String index(){
        return "admin";
    }
    
    @RequestMapping("/categories")
    public String categories(Model model){
        List<Categorie> listCat = adm.getCategories();
        model.addAttribute("listCat", listCat);
        return "categorie";
    }
    @RequestMapping("/ajouterCategorie")
    public String ajouterCat(Model model,String nomCat){
        adm.addCategorie(new Categorie(nomCat));
        List<Categorie> listCat = adm.getCategories();
        model.addAttribute("listCat", listCat);
        return "categorie";
    }

    @RequestMapping("/affectations")
    public String affectations(Model model){
        List<Affectation> listAff = adm.getAffectations();
        model.addAttribute("listAff", listAff);
        return "affectation";
    }
    @RequestMapping("/ajouterAffectation")
    public String ajouterAff(Model model,String nomCat){
        adm.addAffectation(new Affectation(nomCat));
        List<Affectation> listAff = adm.getAffectations();
        model.addAttribute("listAff", listAff);
        return "affectation";
    }
    @RequestMapping("/origine")
    public String origines(Model model){
        List<Origine> listOr = adm.getOrigines();
        model.addAttribute("listOr", listOr);
        return "origine";
    }
    @RequestMapping("/ajouterOrigine")
    public String ajouterOr(Model model,String nomCat){
        adm.addOrigine(new Origine(nomCat));
        List<Origine> listOr = adm.getOrigines();
        model.addAttribute("listOr", listOr);
        return "origine";
    }
    @RequestMapping("/position")
    public String positions(Model model){
        List<Position> listPos = adm.getPositions();
        model.addAttribute("listOr", listPos);
        return "position";
    }
    @RequestMapping("/ajouterPosition")
    public String ajouterPos(Model model,String nomCat){
        adm.addPosition(new Position(nomCat));
        List<Position> listPos = adm.getPositions();
        model.addAttribute("listOr", listPos);
        return "position";
    }
}