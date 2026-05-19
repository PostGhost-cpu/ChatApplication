/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package projectchatapp;

import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author lab_services_student
 */
public class MessageTest {
    
    public MessageTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of setMessages method, of class Message.
     */
    @Test
    public void testSetMessages() {
        System.out.println("setMessages");
        String userMessages = "Hi Mike, can you join us for dinner tonight?";
        Message instance = new Message();
        instance.setMessages(userMessages);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRecipient method, of class Message.
     */
    @Test
    public void testSetRecipient() {
        System.out.println("setRecipient");
        String recipientcell = "+27718693002";
        Message instance = new Message();
        instance.setRecipient(recipientcell);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAmount method, of class Message.
     */
    @Test
    public void testSetAmount() {
        System.out.println("setAmount");
        int amount = 2;
        Message instance = new Message();
        instance.setAmount(amount);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMessages method, of class Message.
     */
    @Test
    public void testGetMessages() {
        System.out.println("getMessages");
        Message instance = new Message();
        String expResult = "Hi Keegan, did you receive the payment?";
        String result = instance.getMessages();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRecipient method, of class Message.
     */
    @Test
    public void testGetRecipient() {
        System.out.println("getRecipient");
        Message instance = new Message();
        String expResult = "08575975889";
        String result = instance.getRecipient();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAmount method, of class Message.
     */
    @Test
    public void testGetAmount() {
        System.out.println("getAmount");
        Message instance = new Message();
        int expResult = 0;
        int result = instance.getAmount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMessageId method, of class Message.
     */
    @Test
    public void testGetMessageId() {
        System.out.println("getMessageId");
        Message instance = new Message();
        String expResult = "";
        String result = instance.getMessageId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMessageHash method, of class Message.
     */
    @Test
    public void testGetMessageHash() {
        System.out.println("getMessageHash");
        Message instance = new Message();
        String expResult = "";
        String result = instance.getMessageHash();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkMessageID method, of class Message.
     */
    @Test
    public void testCheckMessageID() {
        System.out.println("checkMessageID");
        Message instance = new Message();
        boolean expResult = false;
        boolean result = instance.checkMessageID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkRecipientCell method, of class Message.
     */
    @Test
    public void testCheckRecipientCell() {
        System.out.println("checkRecipientCell");
        Message instance = new Message();
        String expResult = "";
        String result = instance.checkRecipientCell();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createMessageHash method, of class Message.
     */
    @Test
    public void testCreateMessageHash() {
        System.out.println("createMessageHash");
        Message instance = new Message();
        String expResult = "";
        String result = instance.createMessageHash();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sentMessages method, of class Message.
     */
    @Test
    public void testSentMessages() {
        System.out.println("sentMessages");
        String option = "Send";
        Message instance = new Message();
        String expResult = "Hi Mike, can you join us for dinner tonight?";
        String result = instance.sentMessages(option);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printMessages method, of class Message.
     */
    @Test
    public void testPrintMessages() {
        System.out.println("printMessages");
        Message instance = new Message();
        String expResult = "";
        String result = instance.printMessages();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of returnTotalMessages method, of class Message.
     */
    @Test
    public void testReturnTotalMessages() {
        System.out.println("returnTotalMessages");
        Message instance = new Message();
        int expResult = 0;
        int result = instance.returnTotalMessages();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of storeMessages method, of class Message.
     */
    @Test
    public void testStoreMessages() {
        System.out.println("storeMessages");
        Message instance = new Message();
        String expResult = "";
        String result = instance.storeMessages();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loadStoredMessages method, of class Message.
     */
    @Test
    public void testLoadStoredMessages() {
        System.out.println("loadStoredMessages");
        List<Message> expResult = null;
        List<Message> result = Message.loadStoredMessages();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Message.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Message instance = new Message();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
