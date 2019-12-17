package com.application.entity;
// Generated Dec 16, 2019 3:13:56 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * TUser generated by hbm2java
 */
public class TUser  implements java.io.Serializable {


     private Integer FIdUser;
     private String FNamaUser;
     private String FNik;
     private String FGolonganDarah;
     private String FEmail;
     private String FPassword;
     private Date FTglLahir;
     private String FJkelamin;
     private String FPekerjaan;
     private String FNomorHp;
     private String FAlamat;
     private Set<THistori> THistoris = new HashSet<THistori>(0);

    public TUser() {
    }

	
    public TUser(String FNamaUser, String FNik, String FEmail, String FPassword, String FNomorHp) {
        this.FNamaUser = FNamaUser;
        this.FNik = FNik;
        this.FEmail = FEmail;
        this.FPassword = FPassword;
        this.FNomorHp = FNomorHp;
    }
    public TUser(String FNamaUser, String FNik, String FGolonganDarah, String FEmail, String FPassword, Date FTglLahir, String FJkelamin, String FPekerjaan, String FNomorHp, String FAlamat, Set<THistori> THistoris) {
       this.FNamaUser = FNamaUser;
       this.FNik = FNik;
       this.FGolonganDarah = FGolonganDarah;
       this.FEmail = FEmail;
       this.FPassword = FPassword;
       this.FTglLahir = FTglLahir;
       this.FJkelamin = FJkelamin;
       this.FPekerjaan = FPekerjaan;
       this.FNomorHp = FNomorHp;
       this.FAlamat = FAlamat;
       this.THistoris = THistoris;
    }
   
    public Integer getFIdUser() {
        return this.FIdUser;
    }
    
    public void setFIdUser(Integer FIdUser) {
        this.FIdUser = FIdUser;
    }
    public String getFNamaUser() {
        return this.FNamaUser;
    }
    
    public void setFNamaUser(String FNamaUser) {
        this.FNamaUser = FNamaUser;
    }
    public String getFNik() {
        return this.FNik;
    }
    
    public void setFNik(String FNik) {
        this.FNik = FNik;
    }
    public String getFGolonganDarah() {
        return this.FGolonganDarah;
    }
    
    public void setFGolonganDarah(String FGolonganDarah) {
        this.FGolonganDarah = FGolonganDarah;
    }
    public String getFEmail() {
        return this.FEmail;
    }
    
    public void setFEmail(String FEmail) {
        this.FEmail = FEmail;
    }
    public String getFPassword() {
        return this.FPassword;
    }
    
    public void setFPassword(String FPassword) {
        this.FPassword = FPassword;
    }
    public Date getFTglLahir() {
        return this.FTglLahir;
    }
    
    public void setFTglLahir(Date FTglLahir) {
        this.FTglLahir = FTglLahir;
    }
    public String getFJkelamin() {
        return this.FJkelamin;
    }
    
    public void setFJkelamin(String FJkelamin) {
        this.FJkelamin = FJkelamin;
    }
    public String getFPekerjaan() {
        return this.FPekerjaan;
    }
    
    public void setFPekerjaan(String FPekerjaan) {
        this.FPekerjaan = FPekerjaan;
    }
    public String getFNomorHp() {
        return this.FNomorHp;
    }
    
    public void setFNomorHp(String FNomorHp) {
        this.FNomorHp = FNomorHp;
    }
    public String getFAlamat() {
        return this.FAlamat;
    }
    
    public void setFAlamat(String FAlamat) {
        this.FAlamat = FAlamat;
    }
    public Set<THistori> getTHistoris() {
        return this.THistoris;
    }
    
    public void setTHistoris(Set<THistori> THistoris) {
        this.THistoris = THistoris;
    }




}


