package com.sab.bt.btges.metierpersonel;

import java.util.Date;
import java.util.List;

import com.sab.bt.btges.entities.Categorie;
import com.sab.bt.btges.entities.Grade;
import com.sab.bt.btges.entities.Origine;
import com.sab.bt.btges.entities.Position;
import com.sab.bt.btges.entities.Stages;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EffectifController {

    @Autowired
    private AdminMetier adm;

    @RequestMapping("/ajouterMilitaire")
    public String index(Model model) {

        List<Grade> listGr = adm.getGrades();
        model.addAttribute("listGr", listGr);
        List<Origine> listOr = adm.getOrigines();
        model.addAttribute("listOr",listOr);
        List<Position> listPos = adm.getPositions();
        model.addAttribute("listPos",listPos);
        List<Stages> listSt = adm.getStages();
        model.addAttribute("listSt",listSt);
        List<Categorie> listCat= adm.getCategories();
        model.addAttribute("listCat",listCat);
        return "ajouterMilitaire";
    }



    @RequestMapping(value = "/saveMilitaire", method = RequestMethod.POST)
    public String ajouterMilitaire(@RequestParam("matricule")String matricule, 
    @RequestParam("prenom")String prenom, 
    @RequestParam("datenaissance") @DateTimeFormat(pattern = "yyyy-MM-dd")Date datenaissance, 
    @RequestParam("sexe")String sexe,
    @RequestParam("detacheAuCorps") String detacheAuCorps, 
    @RequestParam("stages")String[] stages, 
    @RequestParam("position")String position, 
    String origine, 
    String categorie, 
    String grade) {
		// TODO Auto-generated method stub
        
        System.out.println("teeest--------------------------------");
        System.out.println(sexe+" "+prenom+" "+datenaissance+" "+matricule+" "+detacheAuCorps+"----"+position+"--"+stages.length+"--"+origine);
        
        return "ajouterMilitaire";
	}




}