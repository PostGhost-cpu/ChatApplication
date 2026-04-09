/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projectchatapp;

public class ProjectChatApp {
    
    public static void main(String[] args) {
        // Registration
        // Example data
        String username = "user_name"; 
        String password = "Password123!"; 
        String cellphone = "+27 123 456 7890"; // String allows to preserve leading zeros & handle special characters (+, -)
        
        String firstName = "";
        String lastName = "";
        
        // Checks conditions
        // Contains an undersore & no more than 5 characters
        if (username.contains("_") && username.length() <= 5) {
            System.out.println("Username successfully captured.");
            boolean usernameState = true;
        } else {
            System.out.println("Username is not correctly formatted; please ensure that your username contains an underscore and is no more than five characters in length.");
            boolean usernameState = false;
        }
        // At least 8 characters, capital letter, number & special character
        boolean hasCapital = password.matches(".*[A-Z].*");
        boolean hasNumber = password.matches(".*\\d.*");
        boolean hasSpecial = password.matches(".*[^a-zA-Z0-9].*");
        if (password.length() >= 8 && hasCapital == true && hasNumber == true && hasSpecial == true) {
            System.out.println("Password successfully captured.");
            boolean passwordState = true;
        } else {
            System.out.println("Password is not correctly formatted; please ensure that the password contains at least eight characters, a capital letter, a number and a special character.");
            boolean passwordState = false;
        }
        // Number contains international country code followed by number
        boolean cellphoneFormat = cellphone.matches("^(\\+\\d{1,3}( )?)?((\\(\\d{1,3}\\))|\\d{1,3})[- .]?\\d{3,4}[- .]?\\d{4}$"); // International format
        if (cellphoneFormat == true) {
            System.out.println("Cell phone number successfully added.");
            boolean cellphoneState = true;
        } else {
            System.out.println("Cell phone number incorrectly formatted or does not contain international code.");
            boolean cellphoneState = false;
        }
        // Login
        if (usernameState == true && passwordState == true && cellphoneState == true) {
            System.out.println("Welcome " + firstName, lastName + " it is great to see you again.");
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