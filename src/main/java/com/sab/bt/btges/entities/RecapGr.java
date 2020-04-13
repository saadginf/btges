package com.sab.bt.btges.entities;

import java.util.HashMap;


public class RecapGr {


    private String grade;
    private int nbrOrEcole;
    private int nbrOrAsp;
    private  int nbrOrSpe;
    private  int nbrOrRang;
    private int nbrSM;
    private int nbrSF;
    private int ops;
    private int nbrDetacheAuCorps;
    private Long nbrDetacheDuCorps;
    private HashMap<String,Integer> stages;
    private double moyAge; 

    /**
     * @return String return the grade
     */
    public String getGrade() {
        return grade;
    }

    /**
     * @param grade the grade to set
     */
    public void setGrade(String grade) {
        this.grade = grade;
    }

    /**
     * @return int return the nbrOrEcole
     */
    public int getNbrOrEcole() {
        return nbrOrEcole;
    }

    /**
     * @param nbrOrEcole the nbrOrEcole to set
     */
    public void setNbrOrEcole(int nbrOrEcole) {
        this.nbrOrEcole = nbrOrEcole;
    }

    /**
     * @return int return the nbrOrAsp
     */
    public int getNbrOrAsp() {
        return nbrOrAsp;
    }

    /**
     * @param nbrOrAsp the nbrOrAsp to set
     */
    public void setNbrOrAsp(int nbrOrAsp) {
        this.nbrOrAsp = nbrOrAsp;
    }

    /**
     * @return int return the nbrOrSpe
     */
    public int getNbrOrSpe() {
        return nbrOrSpe;
    }

    /**
     * @param nbrOrSpe the nbrOrSpe to set
     */
    public void setNbrOrSpe(int nbrOrSpe) {
        this.nbrOrSpe = nbrOrSpe;
    }

    /**
     * @return int return the nbrSM
     */
    public int getNbrSM() {
        return nbrSM;
    }

    /**
     * @param nbrSM the nbrSM to set
     */
    public void setNbrSM(int nbrSM) {
        this.nbrSM = nbrSM;
    }

    /**
     * @return int return the nbrSF
     */
    public int getNbrSF() {
        return nbrSF;
    }

    /**
     * @param nbrSF the nbrSF to set
     */
    public void setNbrSF(int nbrSF) {
        this.nbrSF = nbrSF;
    }

    /**
     * @return int return the ops
     */
    public int getOps() {
        return ops;
    }

    /**
     * @param ops the ops to set
     */
    public void setOps(int ops) {
        this.ops = ops;
    }

    /**
     * @return int return the nbrDetacheAuCorps
     */
    public int getNbrDetacheAuCorps() {
        return nbrDetacheAuCorps;
    }

    /**
     * @param nbrDetacheAuCorps the nbrDetacheAuCorps to set
     */
    public void setNbrDetacheAuCorps(int nbrDetacheAuCorps) {
        this.nbrDetacheAuCorps = nbrDetacheAuCorps;
    }

    /**
     * @return int return the nbrDetacheDuCorps
     */
    public Long getNbrDetacheDuCorps() {
        return nbrDetacheDuCorps;
    }

    /**
     * @param long1 the nbrDetacheDuCorps to set
     */
    public void setNbrDetacheDuCorps(Long long1) {
        this.nbrDetacheDuCorps = long1;
    }

    /**
     * @return HashMap<String,Integer> return the stages
     */
    public HashMap<String,Integer> getStages() {
        return stages;
    }

    /**
     * @param stages the stages to set
     */
    public void setStages(HashMap<String,Integer> stages) {
        this.stages = stages;
    }

    /**
     * @return double return the moyAge
     */
    public double getMoyAge() {
        return moyAge;
    }

    /**
     * @param moyAge the moyAge to set
     */
    public void setMoyAge(double moyAge) {
        this.moyAge = moyAge;
    }


    /**
     * @return int return the nbrOrRang
     */
    public int getNbrOrRang() {
        return nbrOrRang;
    }

    /**
     * @param nbrOrRang the nbrOrRang to set
     */
    public void setNbrOrRang(int nbrOrRang) {
        this.nbrOrRang = nbrOrRang;
    }

    @Override
    public String toString() {
        return "RecapGr [grade=" + grade + ", moyAge=" + moyAge + ", nbrDetacheAuCorps=" + nbrDetacheAuCorps
                + ", nbrDetacheDuCorps=" + nbrDetacheDuCorps + ", nbrOrAsp=" + nbrOrAsp + ", nbrOrEcole=" + nbrOrEcole
                + ", nbrOrRang=" + nbrOrRang + ", nbrOrSpe=" + nbrOrSpe + ", nbrSF=" + nbrSF + ", nbrSM=" + nbrSM
                + ", ops=" + ops + ", stages=" + stages + "]";
    }

}