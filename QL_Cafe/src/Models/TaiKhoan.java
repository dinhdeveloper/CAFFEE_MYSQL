/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author CanhDinh
 */
public class TaiKhoan {
    private int id, lv;
    private String UserName,Password,fullName;
    public TaiKhoan()
    {
        id=lv=0;
        UserName = "";
        Password = "";
    }
    public TaiKhoan(int id,String Username,String PassWord,int lv,String fullName)
    {
        this.id=id;
        this.lv=lv;
        this.UserName=Username;
        this.Password=PassWord;
        this.fullName = fullName;
    }
    public void SetID(int id)
    {
        this.id=id;
    }
    public int GetID()
    {
        return this.id;
    }
     public void SetLv(int lv)
    {
        this.lv=lv;
    }
    public int GetLv()
    {
        return this.lv;
    }
     public void SetUsername(String Username)
    {
        this.UserName=Username;
    }
    public String GetUsername()
    {
        return this.UserName;
    }
     public void SetPassword(String Password)
    {
        this.Password=Password;
    }
    public String GetPassword()
    {
        return this.Password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    
}
