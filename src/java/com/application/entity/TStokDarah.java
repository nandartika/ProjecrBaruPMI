package com.application.entity;
// Generated Dec 16, 2019 3:13:56 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * TStokDarah generated by hbm2java
 */
public class TStokDarah  implements java.io.Serializable {


     private int FIdTempat;
     private int FDarahA;
     private int FDarahB;
     private int FDarahO;
     private int FDarahAb;
     private Set<THistori> THistoris = new HashSet<THistori>(0);

    public TStokDarah() {
    }

	
    public TStokDarah(int FIdTempat, int FDarahA, int FDarahB, int FDarahO, int FDarahAb) {
        this.FIdTempat = FIdTempat;
        this.FDarahA = FDarahA;
        this.FDarahB = FDarahB;
        this.FDarahO = FDarahO;
        this.FDarahAb = FDarahAb;
    }
    public TStokDarah(int FIdTempat, int FDarahA, int FDarahB, int FDarahO, int FDarahAb, Set<THistori> THistoris) {
       this.FIdTempat = FIdTempat;
       this.FDarahA = FDarahA;
       this.FDarahB = FDarahB;
       this.FDarahO = FDarahO;
       this.FDarahAb = FDarahAb;
       this.THistoris = THistoris;
    }
   
    public int getFIdTempat() {
        return this.FIdTempat;
    }
    
    public void setFIdTempat(int FIdTempat) {
        this.FIdTempat = FIdTempat;
    }
    public int getFDarahA() {
        return this.FDarahA;
    }
    
    public void setFDarahA(int FDarahA) {
        this.FDarahA = FDarahA;
    }
    public int getFDarahB() {
        return this.FDarahB;
    }
    
    public void setFDarahB(int FDarahB) {
        this.FDarahB = FDarahB;
    }
    public int getFDarahO() {
        return this.FDarahO;
    }
    
    public void setFDarahO(int FDarahO) {
        this.FDarahO = FDarahO;
    }
    public int getFDarahAb() {
        return this.FDarahAb;
    }
    
    public void setFDarahAb(int FDarahAb) {
        this.FDarahAb = FDarahAb;
    }
    public Set<THistori> getTHistoris() {
        return this.THistoris;
    }
    
    public void setTHistoris(Set<THistori> THistoris) {
        this.THistoris = THistoris;
    }




}


