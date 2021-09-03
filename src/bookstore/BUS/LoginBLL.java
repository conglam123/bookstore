/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookstore.BUS;

import bookstore.DAL.LoginDAL;
import bookstore.Entity.NguoiDung;
import java.util.ArrayList;

/**
 *
 * @author CongLam
 */
public class LoginBLL {
    LoginDAL obj = new LoginDAL();
    public  boolean getLogin(String u,String p){
        return obj.getLogin(u, p);
    }

    public ArrayList<NguoiDung> getLoginData(String u, String p){
        return obj.getLoginData(u, p);
    }
}
