package com.example.session.w3;

import java.text.SimpleDateFormat;
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

    private Boolean gioiTinh = Boolean.TRUE; // True - Nu, False - Nam
    private TinhThanh queQuan = TinhThanh.Ha_Noi;

    private Date ngayTao;
    private String nguoiTao;
    private Date ngaySua;
    private String nguoiSua;

    private Boolean daXoa = Boolean.FALSE;

    public NguoiYeu() {}

    public NguoiYeu(String hoTen, Integer canNang, Float chieuCao) {
        this.hoTen = hoTen;
        this.canNang = canNang;
        this.chieuCao = chieuCao;
    }

    public Boolean getDaXoa() {
        return daXoa;
    }

    public void setDaXoa(Boolean daXoa) {
        this.daXoa = daXoa;
    }

    public Date getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }

    public String getNguoiTao() {
        return nguoiTao;
    }

    public void setNguoiTao(String nguoiTao) {
        this.nguoiTao = nguoiTao;
    }

    public Date getNgaySua() {
        return ngaySua;
    }

    public void setNgaySua(Date ngaySua) {
        this.ngaySua = ngaySua;
    }

    public String getNguoiSua() {
        return nguoiSua;
    }

    public void setNguoiSua(String nguoiSua) {
        this.nguoiSua = nguoiSua;
    }

    public Boolean getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(Boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public TinhThanh getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(TinhThanh queQuan) {
        this.queQuan = queQuan;
    }

    public String getSinhNhatHTML() {
        return new SimpleDateFormat("yyyy-MM-dd").format(this.sinhNhat);
    }

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
