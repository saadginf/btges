package com.sab.bt.btges.daopersonel;

import com.sab.bt.btges.entities.noteSportAnnuelle;

import org.springframework.data.jpa.repository.JpaRepository;

public interface NoteSportRepository extends JpaRepository<noteSportAnnuelle,Long>{
    
}