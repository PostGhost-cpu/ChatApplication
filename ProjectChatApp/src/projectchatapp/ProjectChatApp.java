/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projectchatapp;

public class ProjectChatApp {
    
    public static void main(String[] args) {
        // Registration
        Login login = new Login();
        // Example data
        login.setUsername("user_");
        login.setPassword("Password123!");
        login.setCellphone("+27 123 456 7890"); // String allows to preserve leading zeros & handle special characters (+, -)
        
        String firstName = "John";
        String lastName = "Doe";
        
        // Checks conditions
        boolean usernameState = login.checkUserName();
        boolean passwordState = login.checkPasswordComplexity();
        boolean cellphoneState = login.checkCellPhoneNumber();
        if (usernameState && passwordState && cellphoneState) {
            System.out.println("Welcome " + firstName + " " + lastName + " it is great to see you again.");
        } else {
            System.out.println("Username or password incorrect, please try again.");
        }
    }
    
}

/* 
    Credit: Website - w3school - Java Tutorial
    Source: https://www.w3schools.com/java/

    Credit: Website - w3school - JavaScript RegExp Patterns
    Source: https://www.w3schools.com/jsref/jsref_obj_regexp.asp

    Credit: YouTube - CodeLuky - Phone Number Validation with RegEx: A Beginner's Guide
    Source: https://www.youtube.com/watch?v=2ynftHoCyRU

    Credit: 
    Source: URL

    Credit: 
    Source: URL
*/