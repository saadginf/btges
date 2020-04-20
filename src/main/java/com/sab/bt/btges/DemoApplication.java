package com.sab.bt.btges;

import java.util.Calendar;
import java.util.List;

import com.sab.bt.btges.daopersonel.MilitaireRepository;
import com.sab.bt.btges.entities.Militaire;
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
	List<RecapGr> recapGr = effMet.fichePotentiel();
	for (RecapGr recapGr2 : recapGr) {
	System.out.println(recapGr2);
}
	//	List<Object[]> s = mrepo.countStagesByGrade(77L);

	//	for (Object[] objects : s) {
	//		System.out.println(objects[0]+"-----"+objects[1]);
	//	}

		//}
		//int abgAge =  mrepo.getNumbPerGr(76L);
		//int abCount = mrepo.getAvgAgeGr(76L);

		//System.out.println("---------------------"+ l.size()+"------------");
		//int year = Calendar.getInstance().get(Calendar.YEAR);
		//double abcount = mrepo.getAvgAgeGr(78L);
		//int dif = (int) (year - abcount);
		//System.out.println("---------------------"+ dif+"---------------"+ abcount + "------------");
	}

}
