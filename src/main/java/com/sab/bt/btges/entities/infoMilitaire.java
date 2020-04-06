package com.sab.bt.btges.entities;

import java.io.Serializable;


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
@MappedSuperclass
public  abstract class infoMilitaire implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String libbele;

    /**
     * @return Long return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return String return the libbele
     */
    public String getLibbele() {
        return libbele;
    }

    /**
     * @param libbele the libbele to set
     */
    public void setLibbele(String libbele) {
        this.libbele = libbele;
    }

   
    public infoMilitaire(String libbele) {
        this.libbele = libbele;
    }

    public infoMilitaire() {
    }

}