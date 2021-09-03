/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookstore.Entity;

/**
 *
 * @author CongLam
 */
public class NguoiDung {
    private String taiKhoan;
    private String matKhau;
    private int quyenTruyCap;
    private String tenNguoiDung;
    private String email;

    public String getTaiKhoan() {
        return taiKhoan;
    }

    public void setTaiKhoan(String taiKhoan) {
        this.taiKhoan = taiKhoan;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public int getQuyenTruyCap() {
        return quyenTruyCap;
    }

    public void setQuyenTruyCap(int quyenTruyCap) {
        this.quyenTruyCap = quyenTruyCap;
    }

    public String getTenNguoiDung() {
        return tenNguoiDung;
    }

    public void setTenNguoiDung(String tenNguoiDung) {
        this.tenNguoiDung = tenNguoiDung;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
