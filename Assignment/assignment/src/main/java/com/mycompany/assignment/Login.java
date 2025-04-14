/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment;
/**
 *
 * @author RC_Student_lab
 */
public class Login {
    //Attributes (fields)
    private String firstName;
    private String lastName;
    private String userName;
    private String passWord;
    private String cellNumber;
    
    public Login(String firstName, String lastName, String userName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.cellNumber = cellNumber;
        this.passWord = passWord;
    }
    public boolean checkUserName() {
        return userName.contains("_")&&userName.length()<=5;
    }
    public boolean checkPasswordComplexity(String password) {
        return passWord.length() >=8&&
               passWord.matches(".*[A-Z].*")&&
               passWord.matches(".*[a-z].*")&&
               passWord.matches(".*[0-9].*")&&
               passWord.matches(".*[!@#$%^&*()].*");
    }
    public boolean checkcellPhoneNumber(String cellNumber) {
        return cellNumber.length() == 10 && cellNumber.startsWith("+27");
    }
    public static boolean iscellPhoneNumberValid(String cellNumber) {
     return cellNumber.matches("^\\+27\\d(10)$");
    }
    String register(String userName, String passWord, String cellNumber) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    String getLoginMessage(String inputUsername, String inputPassword) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}