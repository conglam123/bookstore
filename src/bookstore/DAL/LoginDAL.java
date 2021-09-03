/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookstore.DAL;

import bookstore.Entity.NguoiDung;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author CongLam
 */
public class LoginDAL extends SqlDataConnection{
    private final String query = "select * from tb_NguoiDung where TaiKhoan = ? and MatKhau = ?";
    
    public boolean getLogin(String u, String p){
        boolean check = false;
        try {
            openConnection();
            PreparedStatement ps = con.prepareCall(query);
            ps.setString(1, u);
            ps.setString(2, p);
            ResultSet rs = ps.executeQuery();
            if(rs != null && rs.next()) check = true;
            closeConnection();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return check;
    }
    
    public ArrayList<NguoiDung> getLoginData(String u, String p){
        ArrayList<NguoiDung> arr = new ArrayList<>();
        try {
            openConnection();
            PreparedStatement ps = con.prepareCall(query);
            ps.setString(1, u);
            ps.setString(2, p);
            ResultSet rs = ps.executeQuery();
            if(rs != null){
                while (rs.next()) {
                    NguoiDung item = new NguoiDung();
                    item.setTaiKhoan(rs.getString("TaiKhoan"));
                    item.setMatKhau(rs.getString("MatKhau"));
                    item.setQuyenTruyCap(rs.getInt("QuyenTruyCap"));
                    item.setTenNguoiDung(rs.getString("TenNguoiDung"));
                    arr.add(item);
                }
            }
            closeConnection();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return arr;
    }
    
}
