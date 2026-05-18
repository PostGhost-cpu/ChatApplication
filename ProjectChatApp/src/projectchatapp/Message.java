/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectchatapp;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Message {
    private String messages;
    private String recipientCell;
    private String messageId;
    private String messageHash;
    private int amountOfmessages;
    
    // Array
    private static final List<Message> sentMessagesList = new ArrayList<>();
    private static final List<Message> storedMessagesList = new ArrayList<>();
    private static int totalMessages = 0;
        
    public Message() {
        messages = null;
        recipientCell = null;
        messageId = null;
        messageHash = null;
        amountOfmessages = 0;
        
    }
    
    public Message (String messageText, String recipientCell, int messageNumber) {
        this();
        this.messages = messageText;
        this.recipientCell = recipientCell;
        this.amountOfmessages = messageNumber;
        
    }
    
    // Set
    public void setMessages(String userMessages) {
        messages = userMessages;
    }
    public void setRecipient(String recipientcell) {
        recipientCell = recipientcell;
    }
    public void setAmount(int amount) {
        amountOfmessages = amount;
    }
    // Get
    public String getMessages() {
      return messages;
    }
    public String getRecipient() {
        return recipientCell;
    }
    public int getAmount() {
        return amountOfmessages;
    }
    // Conditions
    public boolean checkMessageID() { // Randomly generated ten-digit number
        if (messageId == null || messageId.isEmpty()) {
            messageId = String.format("%010d", ThreadLocalRandom.current().nextLong(10_000_000_000L));
        }
        return messageId.length() == 10;
    }
    public String checkRecipientCell() {
        // Cell number has no more than ten characters and an international code
        if (recipientCell == null || recipientCell.trim().isEmpty()) {
            return "Cell phone number incorrectly formatted or contains more than ten characters.";
        }
        
        boolean format = recipientCell.matches("^(\\+\\d{1,3}( )?)?((\\(\\d{1,3}\\))|\\d{1,3})[- .]?\\d{3}[- .]$"); // International format
        if (recipientCell.length() <= 10 && format == true) {
            return "Cell phone number successfully added.";
        } else {
            return "Cell phone number incorrectly formatted or contains more than ten characters.";
        }
    }
    public String createMessageHash() {
        // Contains frist two numbers of message Id, a colon , number of message & first and last word
        String hashChar = String.valueOf(messageId);
        // first and last words of the message
        char oneChar = hashChar.charAt(0);
        char twoChar = hashChar.charAt(1);
        
        // Split the string by whitespace
        String[] words = messages.trim().split("\\s+");
        String hashWord;
        if (words.length > 1) {
            String firstWord = words[0];
            String lastWord = words[words.length - 1];
            
            hashWord = "Start: " + firstWord + ", End: " + lastWord;
        } else { 
            hashWord = "Only: " + words[0];
        }
        
        String hash = oneChar + twoChar + ":" + amountOfmessages + hashWord;
        String upperHash = hash.toUpperCase(); // Uppercase
        return upperHash;
    }
    
    private Message copyMessage() {
        Message copy = new Message();
        copy.messageId = this.messageId; 
        copy.recipientCell = this.recipientCell; 
        copy.messages = this.messages; 
        copy.messageHash = this.messageHash; 
        copy.amountOfmessages = this.amountOfmessages; 
        // Returns the duplicated message object
        return copy; 
    }
    public String checkMessageLength() {
        // Checks message is not empty and does not exceed 250 characters
        if (messages == null || messages.length() > 250) {
            return "Please enter a message of less than 250 characters.";
        }
        return "Message sent";
    }
    public String sentMessages(String option) {
        String messageCheck = checkMessageLength();
        if (!"Message sent".equals(messageCheck)) {
            return messageCheck;
        }
        String recipientCheck = checkRecipientCell();
        
        if (!"Cell phone number successfully added.".equals(recipientCheck)) {
           return recipientCheck;
        }
        if (!checkMessageID()) {
            return "Message ID is invalid.";
        }
        createMessageHash();

        Message copy = copyMessage();

        if (option == null) {
            return "Invalid option.";
        }
        // Converts the option to uppercase so input is easier to compare
        String choice = option.trim().toUpperCase();

        if (choice.equals("SEND")) { // Sends and adds it to the sent list
            sentMessagesList.add(copy);
            totalMessages++;
            return "Message successfully sent\n" + copy.toString();
        }
        if (choice.equals("STORE")) { // Stores for later and writes it to JSON
            storedMessagesList.add(copy);
            String storedResult = storeMessages();
            return storedResult + "\n" + copy.toString();
        }
        if (choice.equals("DISREGARD") || choice.equals("O")) { // Disregards the message 
            return "Press O to delete the message";
        }
        // Handles invalid options
        return "Invalid option.";
    }

    public String printMessages() { // Returns a message if nothing has been sent yet
        if (sentMessagesList.isEmpty()) {
            return "No messages sent.";
        }
        // Builds a full list of all sent messages
        StringBuilder builder = new StringBuilder();
        for (Message message : sentMessagesList) {
            builder.append(message).append(System.lineSeparator()).append(System.lineSeparator());
        }
        return builder.toString().trim();
    }

    public int returnTotalMessages() {
        // Returns the total number of messages that have been sent
        return totalMessages;
    }

    public String storeMessages() {
        // Converts the stored message list into JSON and writes it to a file
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        
        try (FileWriter writer = new FileWriter("StoreMessage.json")) {
            gson.toJson(storedMessagesList, writer);
            return "Message successfully stored";
        } catch (IOException e) {
            return "Could not store message: " + e.getMessage();
        }
    }
}

// String json = "id: " + messageId + '\'' + " hash: " + messageHash + " recipient: " + recipientcell + " message: " + messages + '\'';