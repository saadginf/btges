package com.sab.bt.btges.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
public class noteSportAnnuelle implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private double abdos;
    private double resistance;
    private double endurance;
    @Temporal(TemporalType.DATE)
    private Date date;

    @OneToOne(mappedBy = "ntSA")
    private Militaire militaire;

    


   

    /**
     * @return Date return the date
     */
    public Date getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(Date date) {
        this.date = date;
    }


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
     * @return double return the abdos
     */
    public double getAbdos() {
        return abdos;
    }

    /**
     * @param abdos the abdos to set
     */
    public void setAbdos(double abdos) {
        this.abdos = abdos;
    }

    /**
     * @return double return the resistance
     */
    public double getResistance() {
        return resistance;
    }

    /**
     * @param resistance the resistance to set
     */
    public void setResistance(double resistance) {
        this.resistance = resistance;
    }

    /**
     * @return double return the endurance
     */
    public double getEndurance() {
        return endurance;
    }

    /**
     * @param endurance the endurance to set
     */
    public void setEndurance(double endurance) {
        this.endurance = endurance;
    }

    public noteSportAnnuelle(double abdos, double resistance, double endurance, Date date) {
        this.abdos = abdos;
        this.resistance = resistance;
        this.endurance = endurance;
        this.date = date;
    }

}
