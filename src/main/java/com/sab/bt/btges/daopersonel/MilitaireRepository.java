package com.sab.bt.btges.daopersonel;

import java.util.List;

import com.sab.bt.btges.entities.Grade;
import com.sab.bt.btges.entities.Militaire;
import com.sab.bt.btges.entities.Origine;
import com.sab.bt.btges.entities.Position;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface MilitaireRepository extends JpaRepository<Militaire,String>{
    

    List<Militaire> findByGradeAndOrigine(Grade gr, Origine or);
    List<Militaire> findByGradeAndDetacheAuCorps(Grade gr, Boolean dac);


    Long countByGradeAndPositionNot(Grade grade, Position ps);
    List<Militaire> findByGradeAndSexeTrue(Grade gr);
    List<Militaire> findByGradeAndSexeFalse(Grade gr);


  
    
    @Query(value = "SELECT sum(anneenaissance) from Militaire where id_gr = ?1", nativeQuery = true)
    int getsumGr(Long gr);



}