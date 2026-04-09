/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectchatapp;

/**
 *
 * @author lab_services_student
 */
public class Login {
    private String username;
    private String password;
    private String cellphone;
    
    public Login() {
        username = null;
        password = null;
        cellphone = null;
    }
    // Set
    public void setUsername(String userName) {
        username = userName;
    }
    public void setPassword(String passWord) {
        password = passWord;
    }
    public void setCellphone(String cellPhone) {
        cellphone  = cellPhone;
    }
    // Get
    public String getUsername() {
      return username;
    }
    public String getPassword() {
      return password;  
    }
    public String getCellphone() {
      return cellphone;
    }
    // Conditions
    public boolean checkUserName() {
        
    }
    public boolean checkPasswordComplexity() {
        
    }
    public boolean checkCellPhoneNumber() {
        
    }
    public String registerUser() {
        
    }
    public boolean loginUser() {
        
    }
    public String returnLoginStatus() {
        
    }
  }
