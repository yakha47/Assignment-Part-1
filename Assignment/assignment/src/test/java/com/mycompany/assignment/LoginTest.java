/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.assignment;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author RC_Student_lab
 */
public class LoginTest {
    
    public LoginTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
        
    }

    @Test
    public void testCheckUserName() {
        System.out.println("checkUserName");
        Login instance = null;
        boolean expResult = false;
        boolean result = instance.checkUserName();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testCheckPasswordComplexity() {
        System.out.println("checkPasswordComplexity");
        String password = "";
        Login instance = null;
        boolean expResult = false;
        boolean result = instance.checkPasswordComplexity(password);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testCheckcellPhoneNumber() {
        System.out.println("checkcellPhoneNumber");
        String cellNumber = "";
        Login instance = null;
        boolean expResult = false;
        boolean result = instance.checkcellPhoneNumber(cellNumber);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testIscellPhoneNumberValid() {
        System.out.println("iscellPhoneNumberValid");
        String cellNumber = "";
        boolean expResult = false;
        boolean result = Login.iscellPhoneNumberValid(cellNumber);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testRegister() {
        System.out.println("register");
        String username = "";
        String password = "";
        String phone = "";
        Login instance = null;
        String expResult = "";
        String result = instance.register(username, password, phone);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetLoginMessage() {
        System.out.println("getLoginMessage");
        String inputUsername = "";
        String inputPassword = "";
        Login instance = null;
        String expResult = "";
        String result = instance.getLoginMessage(inputUsername, inputPassword);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
