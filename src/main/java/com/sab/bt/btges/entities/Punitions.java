package com.sab.bt.btges.entities;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;

@Entity
public class Punitions extends infoMilitaire {

  
    private int duree;
    private double points;
    
    @ManyToMany(mappedBy = "decorations")
    private Set<Militaire> miltaires;
    public Punitions(String libbele) {
        super(libbele);
        // TODO Auto-generated constructor stub
    }


 
    /**
     * @return int return the duree
     */
    public int getDuree() {
        return duree;
    }

    /**
     * @param duree the duree to set
     */
    public void setDuree(int duree) {
        this.duree = duree;
    }

    /**
     * @return double return the points
     */
    public double getPoints() {
        return points;
    }

    /**
     * @param points the points to set
     */
    public void setPoints(double points) {
        this.points = points;
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
