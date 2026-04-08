/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projectchatapp;

public class ProjectChatApp {
    
    public static void main(String[] args) {
        // Registration and login feature
        String username;
        String password;
        String cellphone; // String allows to preserve leading zeros & handle special characters (+, -)
        // Checks conditions
        // Contains an undersore & no more than 5 characters
        if (username.contains("_") && username.length() <= 5) {
            System.out.println("Username successfully captured.");
        } else {
            System.out.println("Username is not correctly formatted; please ensure that your username contains an underscore and is no more than five characters in length.");
        }
        // At least 8 characters, capital letter, number & special character
        boolean hasCapital = password.matches("[A-Z]");
        boolean hasNumber = password.matches("\\d.");
        boolean hasSpecial = password.matches("[^a-zA-Z0-9]");
        if (password.length() => 8 && hasCapital == true && hasNumber == true && hasSpecial == true) {
            System.out.println("Password successfully captured.");
        } else {
            System.out.println("Password is not correctly formatted; please ensure that the password contains at least eight characters, a capital letter, a number and a special character.");
        }
        // Number contains international country code followed by number
        cellphoneFormat = cellphone.matches("^(\\\\+\\\\d{1,3}( )?)?((\\\\(\\\\d{1,3}\\\\))|\\\\d{1,3})[- .]?\\\\d{3,4}[- .]?\\\\d{4}$"); // International format
        if (cellphoneFormat == cellphone) {
            System.out.println("Cell phone number successfully added.");
        } else {
            System.out.println("Cell phone number incorrectly formatted or does not contain international code.");
        }
    }
    
}
