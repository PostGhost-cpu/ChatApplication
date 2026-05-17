/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projectchatapp;
import java.util.Scanner;
public class ProjectChatApp {
    
    public static void main(String[] args) {
        /*
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
        */
        
        // Registration and login feature
        String username;
        String password;
        String cellphone; 
        
        String firstName;
        String lastName;
        // User input
        Scanner input = new Scanner(System.in);
       
        System.out.println("Enter First Name: ");
        firstName = input.nextLine();
        System.out.println("Enter Last Name: ");
        lastName = input.nextLine();
        System.out.println("Create Username - Include an underscore and no more then 5 characters.");
        username = input.nextLine();
        System.out.println("Create Password - Include a capital letter, a number, a special character & at least 8 character.");
        password = input.nextLine();
        System.out.println("Create Cellphone number - Include country code (+27)");
        cellphone = input.nextLine();
        // Set - user values
        Login login = new Login();
        login.setUsername(username);
        login.setPassword(password);
        login.setCellphone(cellphone);
        
        // Checks conditions
        boolean usernameState = login.checkUserName();
        boolean passwordState = login.checkPasswordComplexity();
        boolean cellphoneState = login.checkCellPhoneNumber();
        if (usernameState && passwordState && cellphoneState) {
            System.out.println(login.registerUser(firstName, lastName));
            // Sending messages feature
            System.out.println(" - To message another user press Enter.");
            String enter = input.nextLine(); // Waits for user to press Enter
            
            if (enter.isEmpty()) {
                System.out.println("Welcome to QuickChat.");
                
                System.out.println("Option 1) Send Messages \n " + "Option 2) Show recently sent messages \n" + "Option 3) Quit");
                int option = input.nextInt();
                
                if (option == 1) {
                    // Messages
                    String userMessages;
                    String userRecipient;
                    int messageAmount;
                    
                    // User input
                    System.out.println("Enter a message(s)");
                    userMessages = input.nextLine();
                    System.out.println("Enter the recipirnts cell phone number");
                    userRecipient = input.nextLine();
                    System.out.println("Enter number of how many messages that will be sent");
                    messageAmount = input.nextInt();
                    // Set - user values
                    Message message = new Message();
                    message.setMessages(userMessages);
                    message.setRecipient(userRecipient);
                    message.setAmount(messageAmount);
                    
                    // Methods
                    
                    
                } else if (option == 2) {
                    // Recently Sent
                    System.out.println("Message Sent");
                    
                } else if (option == 3) {
                    // Termination
                    System.exit(0);
                    
                } else {
                    System.out.println("Wrong input");
                }
                
            } else {
                System.out.println("You type: " + enter);
                System.out.println("Cannot wait to see you again!");
            }
        } else {
            System.out.println("Registration failed.");
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

    Credit: Generating Random Numbers in Java
    Source: https://www.geeksforgeeks.org/java/generating-random-numbers-in-java/

    Credit: YouTube - JSON in Java - Writing to files
    Source: https://www.youtube.com/watch?v=pJt-AYrmopo

    Credit: Sonatype - Gson jar download
    Source: https://repo1.maven.org/maven2/com/google/code/gson/gson/2.14.0/

    Credit: YouTube - How to convert JSON to Java objects using Gson
    Source: https://www.youtube.com/watch?v=J94lLj_uG3c

    Credit: YouTube - Gson Tutorial — Getting Started with Java-JSON Serialization & Deserialization
    Source: https://www.youtube.com/watch?v=BbI8FdQOKNs&t=7s

    Credit: YouTube - #7 Gson Tutorial for Beginners - Converting JSON File to an Object
    Source: https://www.youtube.com/watch?v=_ga_W7MQEk0

    Credit: 
    Source:

    Credit: 
    Source:

    Credit: 
    Source:

    Credit: 
    Source:

    Credit: 
    Source:

    Credit: 
    Source:

*/