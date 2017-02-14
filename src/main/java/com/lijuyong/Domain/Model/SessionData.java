package com.lijuyong.Domain.Model;

import java.io.Serializable;

/**
 * Created by john on 2017/2/14.
 */
public class SessionData implements Serializable{
    private  String userName;
    private  String password;

    public String getUserName(){
        return userName;
    }
    public  String getPassword(){
        return  password;
    }
    public void setUserName(String userName){
        this.userName = userName;
    }
    public  void setPassword(String password){
        this.password = password;
    }
    public SessionData(String userName,String password){
        this.userName = userName;
        this.password = password;
    }

}
