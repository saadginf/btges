package com.sab.bt.btges.daopersonel;

import com.sab.bt.btges.entities.Categorie;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CategorieRepository extends JpaRepository<Categorie,Long> {
    
}