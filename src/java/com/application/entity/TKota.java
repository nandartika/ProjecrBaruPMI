package com.application.entity;
// Generated Dec 16, 2019 3:13:56 PM by Hibernate Tools 4.3.1



/**
 * TKota generated by hbm2java
 */
public class TKota  implements java.io.Serializable {


     private Integer FIdKota;
     private int FIdProvinsi;
     private String FNamaKota;

    public TKota() {
    }

    public TKota(int FIdProvinsi, String FNamaKota) {
       this.FIdProvinsi = FIdProvinsi;
       this.FNamaKota = FNamaKota;
    }
   
    public Integer getFIdKota() {
        return this.FIdKota;
    }
    
    public void setFIdKota(Integer FIdKota) {
        this.FIdKota = FIdKota;
    }
    public int getFIdProvinsi() {
        return this.FIdProvinsi;
    }
    
    public void setFIdProvinsi(int FIdProvinsi) {
        this.FIdProvinsi = FIdProvinsi;
    }
    public String getFNamaKota() {
        return this.FNamaKota;
    }
    
    public void setFNamaKota(String FNamaKota) {
        this.FNamaKota = FNamaKota;
    }




}


