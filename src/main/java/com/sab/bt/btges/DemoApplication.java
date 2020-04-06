package com.sab.bt.btges;

import java.util.List;

import com.sab.bt.btges.entities.Categorie;
import com.sab.bt.btges.metierpersonel.AdminMetier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
@Autowired
AdminMetier adm;
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		
		


	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		List<Categorie> listCat = adm.getCategories();
		Categorie cat = listCat.get(0);
		System.out.println(cat.getId());
	}

}
