/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectchatapp;

public class Message {
    private String messages;
    private String recipientcell;
    private int amountOfmessages;
        
    public Message() {
        messages = null;
        recipientcell = null;
        amountOfmessages = 0;
        
    }
    // Set
    public void setMessages(String userMessages) {
        messages = userMessages;
    }
    public void setRecipient(String recipientCell) {
        recipientcell = recipientCell;
    }
    public void setAmount(int amount) {
        amountOfmessages = amount;
    }
    // Get
    public String getMessages() {
      return messages;
    }
    public String getRecipient() {
        return recipientcell;
    }
    public int getAmount() {
        return amountOfmessages;
    }
    // Conditions
    public boolean checkMessageID() {
        // Randomly generated ten-digit number
        int min = 10000;
        int max = 99999;
        // Generate a random number with specific range
        int first = min + (int)(Math.random() * ((max - min) + 1));
        int second = min + (int)(Math.random() * ((max - min) + 1));
        String full = "" + first + second; // String concatenation
        int uniqueID = Integer.parseInt(full);
        
        if (String.valueOf(uniqueID).length() == 10) { // Convert int to string
            System.out.println(uniqueID);
            return true;
        } 
    }
    public String checkRecipientCell() {
        // Cell number has no more than ten characters and an international code
        if (recipientcell == null) {
            String output = "Cell phone number incorrectly formatted or contains more than ten characters.";
            return output;
        }
        
        boolean cellphoneFormat = recipientcell.matches("^(\\+\\d{1,3}( )?)?((\\(\\d{1,3}\\))|\\d{1,3})[- .]?\\d{3}[- .]$"); // International format
        if (recipientcell.length() <= 10 && cellphoneFormat == true) {
            String output = "Cell phone number successfully added.";
            return output;
        } else {
            String output = "Cell phone number incorrectly formatted or contains more than ten characters.";
            return output;
        }
    }
    public String createMessageHash() {
        // Contains frist two numbers of message id, a colon , number of message & first and last word
        
    }
    public String sentMessages() {
        //
    }
    public String printMessages() {
        //
    }
    public int returnTotalMessages() {
        //
    }
}
