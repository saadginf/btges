package com.sab.bt.btges.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity 
public class Militaire implements Serializable{
    @Id
    private String matricule;
    private String nom;
    private String prenom;
    private Boolean sexe;
    private Boolean detacheAuCorps;
    @Temporal(TemporalType.DATE)
    private Date dateNaissance;
    @Temporal(TemporalType.DATE)
    private Date dateEngagement;
    @Temporal(TemporalType.DATE)
    private Date nomination;
    private String lieuNaissance;
    private double sejourOps;
    private String cin;
    @ManyToOne
    @JoinColumn(name="ID_CAT")
    private Categorie categorie;
    @ManyToOne
    @JoinColumn(name="ID_FON")
    private Fonction fonction;
    @ManyToOne
    @JoinColumn(name="ID_GR")
    private Grade grade;
    @ManyToOne
    @JoinColumn(name="ID_NIV")
    private NiveauSco niveau;
    @ManyToOne
    @JoinColumn(name="ID_OR")
    private Origine origine;
    @ManyToOne
    @JoinColumn(name="ID_POS")
    private Position position;
    @ManyToOne
    @JoinColumn(name="ID_SFAM")
    private SituationFam sitFam;
    @ManyToOne
    @JoinColumn(name="ID_SPEC")
    private Specialite specialite;
    @ManyToOne
    @JoinColumn(name="ID_AFF")
    private Affectation affectation;
    @ManyToMany
    @JoinTable(
  name = "EFF_STG", 
  joinColumns = @JoinColumn(name = "MIL_id"), 
  inverseJoinColumns = @JoinColumn(name = "STG_id"))     
    private Set<Stages> stages =new HashSet <Stages> ();
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "note_sport", referencedColumnName = "id")
    private noteSportAnnuelle ntSA;
    @ManyToMany
    @JoinTable(
        name = "DECO_MIL", 
    joinColumns = @JoinColumn(name = "MIL_id"), 
    inverseJoinColumns = @JoinColumn(name = "DECO_id"))     
      private Set<Decorations> decorations;


      @ManyToMany
    @JoinTable(
        name = "FEL_MIL", 
    joinColumns = @JoinColumn(name = "MIL_id"), 
    inverseJoinColumns = @JoinColumn(name = "FEL_ID"))     
      private Set<Felicitations> felicitations;


      @ManyToMany
    @JoinTable(
        name = "DIP_CIV", 
    joinColumns = @JoinColumn(name = "MIL_id"), 
    inverseJoinColumns = @JoinColumn(name = "DIP_CIV"))     
      private Set<DiplomesCivils> diplomesCivils;



      @ManyToMany
    @JoinTable(
        name = "PUN_MIL", 
    joinColumns = @JoinColumn(name = "MIL_id"), 
    inverseJoinColumns = @JoinColumn(name = "PUN_id"))     
      private Set<Punitions> punitions;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "NOTE_ID", referencedColumnName = "id")
    private Notes note;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "NOTE_CIE_ID", referencedColumnName = "id")
    private NoteCie noteCie;

    private double aptitudeOps;
    private boolean aptitudePhy;
    private boolean aptitudeAdm;
    private boolean aptitudeTechnique;
    private boolean aptitudeExploit;
    private boolean aptitudeInfo;

    /**
     * @return String return the matricule
     */
    public String getMatricule() {
        return matricule;
    }

    /**
     * @param matricule the matricule to set
     */
    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    /**
     * @return String return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * @return String return the prenom
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * @param prenom the prenom to set
     */
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public Boolean getSexe() {
        return sexe;
    }

    /**
     * @param prenom the prenom to set
     */
    public void setSexe(Boolean sexe) {
        this.sexe = sexe;
    }

  
   
   
    public Boolean getDetacheAuCorps() {
        return detacheAuCorps;
    }

    /**
     * @param prenom the prenom to set
     */
    public void setDetacheAuCorps(Boolean detacheAuCorps) {
        this.detacheAuCorps = detacheAuCorps;
    }
    /**
     * @return Date return the dateNaissance
     */
    public Date getDateNaissance() {
        return dateNaissance;
    }

    /**
     * @param dateNaissance the dateNaissance to set
     */
    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    /**
     * @return String return the lieuNaissance
     */
    public String getLieuNaissance() {
        return lieuNaissance;
    }

    /**
     * @param lieuNaissance the lieuNaissance to set
     */
    public void setLieuNaissance(String lieuNaissance) {
        this.lieuNaissance = lieuNaissance;
    }

    /**
     * @return String return the cin
     */
    public String getCin() {
        return cin;
    }

    /**
     * @param cin the cin to set
     */
    public void setCin(String cin) {
        this.cin = cin;
    }

    /**
     * @return Categorie return the categorie
     */
    public Categorie getCategorie() {
        return categorie;
    }

    /**
     * @param categorie the categorie to set
     */
    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    /**
     * @return Fonction return the fonction
     */
    public Fonction getFonction() {
        return fonction;
    }

    /**
     * @param fonction the fonction to set
     */
    public void setFonction(Fonction fonction) {
        this.fonction = fonction;
    }

    /**
     * @return Grade return the grade
     */
    public Grade getGrade() {
        return grade;
    }

    /**
     * @param grade the grade to set
     */
    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    /**
     * @return NiveauSco return the niveau
     */
    public NiveauSco getNiveau() {
        return niveau;
    }

    /**
     * @param niveau the niveau to set
     */
    public void setNiveau(NiveauSco niveau) {
        this.niveau = niveau;
    }

    /**
     * @return Origine return the origine
     */
    public Origine getOrigine() {
        return origine;
    }

    /**
     * @param origine the origine to set
     */
    public void setOrigine(Origine origine) {
        this.origine = origine;
    }

    /**
     * @return Position return the position
     */
    public Position getPosition() {
        return position;
    }

    /**
     * @param position the position to set
     */
    public void setPosition(Position position) {
        this.position = position;
    }

    /**
     * @return SituationFam return the sitFam
     */
    public SituationFam getSitFam() {
        return sitFam;
    }

    /**
     * @param sitFam the sitFam to set
     */
    public void setSitFam(SituationFam sitFam) {
        this.sitFam = sitFam;
    }

    /**
     * @return Specialite return the specialite
     */
    public Specialite getSpecialite() {
        return specialite;
    }

    /**
     * @param specialite the specialite to set
     */
    public void setSpecialite(Specialite specialite) {
        this.specialite = specialite;
    }

    /**
     * @return Set<Stages> return the stages
     */
    public Set<Stages> getStages() {
        return stages;
    }

    /**
     * @param stages the stages to set
     */
    public void setStages(Set<Stages> stages) {
        this.stages = stages;
    }

   


    /**
     * @return boolean return the aptitudePhy
     */
    public boolean isAptitudePhy() {
        return aptitudePhy;
    }

    /**
     * @param aptitudePhy the aptitudePhy to set
     */
    public void setAptitudePhy(boolean aptitudePhy) {
        this.aptitudePhy = aptitudePhy;
    }

  

    /**
     * @return boolean return the aptitudeAdm
     */
    public boolean isAptitudeAdm() {
        return aptitudeAdm;
    }

    /**
     * @param aptitudeAdm the aptitudeAdm to set
     */
    public void setAptitudeAdm(boolean aptitudeAdm) {
        this.aptitudeAdm = aptitudeAdm;
    }


    /**
     * @return Affectation return the affectation
     */
    public Affectation getAffectation() {
        return affectation;
    }

    /**
     * @param affectation the affectation to set
     */
    public void setAffectation(Affectation affectation) {
        this.affectation = affectation;
    }

    public Militaire(String matricule, String nom, String prenom, Date dateNaissance, String lieuNaissance,
            String cin) {
        this.matricule = matricule;
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.lieuNaissance = lieuNaissance;
        this.cin = cin;
    }


    public Militaire() {
	}

	/**
     * @return boolean return the aptitudeTechnique
     */
    public boolean isAptitudeTechnique() {
        return aptitudeTechnique;
    }

    /**
     * @param aptitudeTechnique the aptitudeTechnique to set
     */
    public void setAptitudeTechnique(boolean aptitudeTechnique) {
        this.aptitudeTechnique = aptitudeTechnique;
    }


    /**
     * @return boolean return the aptitudeExploit
     */
    public boolean isAptitudeExploit() {
        return aptitudeExploit;
    }

    /**
     * @param aptitudeExploit the aptitudeExploit to set
     */
    public void setAptitudeExploit(boolean aptitudeExploit) {
        this.aptitudeExploit = aptitudeExploit;
    }

    /**
     * @return boolean return the aptitudeInfo
     */
    public boolean isAptitudeInfo() {
        return aptitudeInfo;
    }

    /**
     * @param aptitudeInfo the aptitudeInfo to set
     */
    public void setAptitudeInfo(boolean aptitudeInfo) {
        this.aptitudeInfo = aptitudeInfo;
    }


    /**
     * @return Date return the dateEngagement
     */
    public Date getDateEngagement() {
        return dateEngagement;
    }

    /**
     * @param dateEngagement the dateEngagement to set
     */
    public void setDateEngagement(Date dateEngagement) {
        this.dateEngagement = dateEngagement;
    }

    /**
     * @return double return the sejourOps
     */
    public double getSejourOps() {
        return sejourOps;
    }

    /**
     * @param sejourOps the sejourOps to set
     */
    public void setSejourOps(double sejourOps) {
        this.sejourOps = sejourOps;
    }

    /**
     * @return noteSportAnnuelle return the ntSA
     */
    public noteSportAnnuelle getNtSA() {
        return ntSA;
    }

    /**
     * @param ntSA the ntSA to set
     */
    public void setNtSA(noteSportAnnuelle ntSA) {
        this.ntSA = ntSA;
    }

    /**
     * @return Set<Punitions> return the punitions
     */
    public Set<Punitions> getPunitions() {
        return punitions;
    }

    /**
     * @param punitions the punitions to set
     */
    public void setPunitions(Set<Punitions> punitions) {
        this.punitions = punitions;
    }


    /**
     * @return Set<Decorations> return the decorations
     */
    public Set<Decorations> getDecorations() {
        return decorations;
    }

    /**
     * @param decorations the decorations to set
     */
    public void setDecorations(Set<Decorations> decorations) {
        this.decorations = decorations;
    }

    /**
     * @return Set<Felicitations> return the felicitations
     */
    public Set<Felicitations> getFelicitations() {
        return felicitations;
    }

    /**
     * @param felicitations the felicitations to set
     */
    public void setFelicitations(Set<Felicitations> felicitations) {
        this.felicitations = felicitations;
    }

    /**
     * @return Set<DiplomesCivils> return the diplomesCivils
     */
    public Set<DiplomesCivils> getDiplomesCivils() {
        return diplomesCivils;
    }

    /**
     * @param diplomesCivils the diplomesCivils to set
     */
    public void setDiplomesCivils(Set<DiplomesCivils> diplomesCivils) {
        this.diplomesCivils = diplomesCivils;
    }

    /**
     * @return double return the aptitudeOps
     */
    public double getAptitudeOps() {
        return aptitudeOps;
    }

    /**
     * @param aptitudeOps the aptitudeOps to set
     */
    public void setAptitudeOps(double aptitudeOps) {
        this.aptitudeOps = aptitudeOps;
    }


    /**
     * @return Date return the nomination
     */
    public Date getNomination() {
        return nomination;
    }

    /**
     * @param nomination the nomination to set
     */
    public void setNomination(Date nomination) {
        this.nomination = nomination;
    }

    /**
     * @return Notes return the note
     */
    public Notes getNote() {
        return note;
    }

    /**
     * @param note the note to set
     */
    public void setNote(Notes note) {
        this.note = note;
    }

    /**
     * @return NoteCie return the noteCie
     */
    public NoteCie getNoteCie() {
        return noteCie;
    }

    /**
     * @param noteCie the noteCie to set
     */
    public void setNoteCie(NoteCie noteCie) {
        this.noteCie = noteCie;
    }
    
}