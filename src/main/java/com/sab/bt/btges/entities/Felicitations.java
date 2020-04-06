package com.sab.bt.btges.entities;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
@Entity
public class Felicitations extends infoMilitaire {
    
    
    
    @ManyToMany(mappedBy = "decorations")
    private Set<Militaire> miltaires;
    
    
    public Felicitations(String libbele) {
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
