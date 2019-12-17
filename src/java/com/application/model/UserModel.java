/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.application.model;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kartika
 */
public class UserModel {
    private String IdUser;
    private String namaUser;
    private String NIKUser;
    private String golDarUser;
    private String emailUser;
    private String passUser;
    private String tglLahir;
    private String jnsKelamin;
    private String Pekerjaan;
    private String noHp;
    private String alamatUser;
    private Koneksi db = null;

    /**
     * @return the IdUser
     */
    public String getIdUser() {
        return IdUser;
    }

    /**
     * @param IdUser the IdUser to set
     */
    public void setIdUser(String IdUser) {
        this.IdUser = IdUser;
    }

    /**
     * @return the namaUser
     */
    public String getNamaUser() {
        return namaUser;
    }

    /**
     * @param namaUser the namaUser to set
     */
    public void setNamaUser(String namaUser) {
        this.namaUser = namaUser;
    }

    /**
     * @return the NIKUser
     */
    public String getNIKUser() {
        return NIKUser;
    }

    /**
     * @param NIKUser the NIKUser to set
     */
    public void setNIKUser(String NIKUser) {
        this.NIKUser = NIKUser;
    }

    /**
     * @return the golDarUser
     */
    public String getGolDarUser() {
        return golDarUser;
    }

    /**
     * @param golDarUser the golDarUser to set
     */
    public void setGolDarUser(String golDarUser) {
        this.golDarUser = golDarUser;
    }

    /**
     * @return the emailUser
     */
    public String getEmailUser() {
        return emailUser;
    }

    /**
     * @param emailUser the emailUser to set
     */
    public void setEmailUser(String emailUser) {
        this.emailUser = emailUser;
    }

    /**
     * @return the passUser
     */
    public String getPassUser() {
        return passUser;
    }

    /**
     * @param passUser the passUser to set
     */
    public void setPassUser(String passUser) {
        this.passUser = passUser;
    }

    /**
     * @return the tglLahir
     */
    public String getTglLahir() {
        return tglLahir;
    }

    /**
     * @param tglLahir the tglLahir to set
     */
    public void setTglLahir(String tglLahir) {
        this.tglLahir = tglLahir;
    }

    /**
     * @return the jnsKelamin
     */
    public String getJnsKelamin() {
        return jnsKelamin;
    }

    /**
     * @param jnsKelamin the jnsKelamin to set
     */
    public void setJnsKelamin(String jnsKelamin) {
        this.jnsKelamin = jnsKelamin;
    }

    /**
     * @return the Pekerjaan
     */
    public String getPekerjaan() {
        return Pekerjaan;
    }

    /**
     * @param Pekerjaan the Pekerjaan to set
     */
    public void setPekerjaan(String Pekerjaan) {
        this.Pekerjaan = Pekerjaan;
    }

    /**
     * @return the noHp
     */
    public String getNoHp() {
        return noHp;
    }

    /**
     * @param noHp the noHp to set
     */
    public void setNoHp(String noHp) {
        this.noHp = noHp;
    }

    /**
     * @return the alamatUser
     */
    public String getAlamatUser() {
        return alamatUser;
    }

    /**
     * @param alamatUser the alamatUser to set
     */
    public void setAlamatUser(String alamatUser) {
        this.alamatUser = alamatUser;
    }

    /**
     * @return the db
     */
    public Koneksi getDb() {
        return db;
    }

    /**
     * @param db the db to set
     */
    public void setDb(Koneksi db) {
        this.db = db;
    }
    
    public List cariData(String email, String pass){
        List<UserModel> data = new ArrayList<UserModel>();
        ResultSet rs = null;
        try {
            String sql = "SELECT f_email, f_password, f_id_user FROM t_user WHERE f_email='"+email+"' AND f_password='"+pass+"'";
            rs = db.ambilData(sql);
            while (rs.next()) {
                UserModel m = new UserModel();
                m.setEmailUser(rs.getString("email"));
                m.setPassUser(rs.getString("password"));
                m.setIdUser(rs.getString("idUser"));
                data.add(m);
            }
            db.diskonek(rs);
        } catch (Exception ex) {
            System.out.println("Terjadi Kesalah Saat menampilkan Cari ID" + ex);
        }
        return data;
    }
}
