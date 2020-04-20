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
    List<Militaire> findByGrade(Grade gr);
    List<Militaire> findByGradeAndPositionNot(Grade gr, Position ps);
    List<Militaire> findByGradeAndPosition(Grade gr, Position ps);
    List<Militaire> findByGradeAndSexeTrue(Grade gr);
    List<Militaire> findByGradeAndSexeFalse(Grade gr);


  
    
    @Query(value = "SELECT count(matricule) from Militaire where id_gr = ?1", nativeQuery = true)
    int getNumbPerGr(Long gr);
    @Query(value = "SELECT avg(anneenaissance) from Militaire where id_gr = ?1", nativeQuery = true)
    double getAvgAgeGr(Long gr);
	


   @Query(value="SELECT  a.libbele, count(m.id_st_actif) FROM militaire m, stages a where m.id_st_actif = a.id and m.id_gr = ?1 group by m.id_gr, a.libbele", nativeQuery = true)
   List<Object[]> countStagesByGrade(Long gr);
}
