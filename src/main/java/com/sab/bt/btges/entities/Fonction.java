package com.sab.bt.btges.entities;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
@Entity
public class Fonction extends infoMilitaire {



    @OneToMany(mappedBy = "fonction")
    private Set<Militaire> miltaires;

    public Fonction(String libbele) {
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