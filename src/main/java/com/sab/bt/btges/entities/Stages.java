package com.sab.bt.btges.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
@Entity
public class Stages extends infoMilitaire {
    
    
    @ManyToMany(mappedBy = "stages")
    private Set<Militaire> miltaires= new HashSet<Militaire>();
    
  
    public Stages() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    
    
    public Stages(String libbele) {
        super(libbele);
        // TODO Auto-generated constructor stub
    }
    

    /**
     * @return Set<Militaire> return the miltaires
     */
    public Set<Militaire> getMiltaires() {
        return miltaires;
    }

    /**
     * @param miltaires the miltaires to set
     */
    public void setMiltaires(Set<Militaire> miltaires) {
        this.miltaires = miltaires;
    }



}