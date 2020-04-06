package com.sab.bt.btges.entities;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
@Entity
public class NiveauSco extends infoMilitaire {

    @OneToMany(mappedBy = "niveau")
    private Set<Militaire> miltaires;
    public NiveauSco(String libbele) {
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