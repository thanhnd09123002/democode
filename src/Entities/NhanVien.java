/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Entities;

import java.io.Serializable;

/**
 *
 * @author Admin
 */
public class NhanVien implements Serializable {

    private String manv;
    private String tennv;
    private String tuoi;
    private String email;
    private String luong;

    public NhanVien() {
    }

    public NhanVien(String manv, String tennv, String tuoi, String email, String luong) {
        this.manv = manv;
        this.tennv = tennv;
        this.tuoi = tuoi;
        this.email = email;
        this.luong = luong;
    }

    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }

    public String getTennv() {
        return tennv;
    }

    public void setTennv(String tennv) {
        this.tennv = tennv;
    }

    public String getTuoi() {
        return tuoi;
    }

    public void setTuoi(String tuoi) {
        this.tuoi = tuoi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLuong() {
        return luong;
    }

    public void setLuong(String luong) {
        this.luong = luong;
    }

}
