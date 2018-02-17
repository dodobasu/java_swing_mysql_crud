/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapp;

/**
 *
 * @author Easy
 */
public class User {

private int id;
private String username,password,user_status;

public User(int id,String username,String password,String user_status){
     this.id=id;
     this.username=username;
     this.password=password;
     this.user_status=user_status;
    
}

    User(int aInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

public int getid(){
  return id;  
}
public String getusername(){
  return username;  
}

public String getpassword(){
  return password;  
}

public String getuser_status(){
  return user_status;  
}

}
