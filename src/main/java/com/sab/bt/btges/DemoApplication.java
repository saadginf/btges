package com.sab.bt.btges;

import java.util.List;

import com.sab.bt.btges.daopersonel.MilitaireRepository;
import com.sab.bt.btges.entities.RecapGr;
import com.sab.bt.btges.metierpersonel.AdminMetier;
import com.sab.bt.btges.metierpersonel.EffectifMetier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
@Autowired
EffectifMetier effMet;
@Autowired
MilitaireRepository mrepo;
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		
		


	}

	@Override
	public void run(String... args) throws Exception {
		//List<RecapGr> rp =  effMet.fichePotentiel();
		//for (RecapGr recapGr : rp) {
		//	System.out.println(recapGr);
		//}
		int abgAge =  mrepo.getNumbPerGr(76L);
		int abCount = mrepo.getAvgAgeGr(76L);

		System.out.println("---------------------"+ abgAge+"---------------"+abCount+"------------");
	}

}
