package com.example.session.w3;

import java.util.Date;
import java.util.UUID;

/**
 * @author PhongTT35
 * @description N/A
 **/
public class NguoiYeu {

    private String ma = UUID.randomUUID().toString();
    private String hoTen;
    private Date sinhNhat = new Date();
    private Integer canNang;
    private Float chieuCao;

    public NguoiYeu() {}

    public NguoiYeu(String hoTen, Integer canNang, Float chieuCao) {
        this.hoTen = hoTen;
        this.canNang = canNang;
        this.chieuCao = chieuCao;
    }

    public String getLove() {return "Ahehe";}

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public Date getSinhNhat() {
        return sinhNhat;
    }

    public void setSinhNhat(Date sinhNhat) {
        this.sinhNhat = sinhNhat;
    }

    public Integer getCanNang() {
        return canNang;
    }

    public void setCanNang(Integer canNang) {
        this.canNang = canNang;
    }

    public Float getChieuCao() {
        return chieuCao;
    }

    public void setChieuCao(Float chieuCao) {
        this.chieuCao = chieuCao;
    }
}
