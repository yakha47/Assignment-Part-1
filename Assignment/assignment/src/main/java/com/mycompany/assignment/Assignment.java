/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.assignment;
import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("First name");
        String firstName = scanner.nextLine();
        
        System.out.println("Last name");
        String lastName = scanner.nextLine();
        
        System.out.println("Username");
        String userName = scanner.nextLine();
        
        System.out.println("password");
        String passWord = scanner.nextLine();
        
        System.out.println("Cell number");
        String cellNumber = scanner.nextLine();
        
        Login newUser = new Login(firstName, lastName, userName);
        String registrationResult = newUser.register(userName, passWord, cellNumber);
        System.out.println(registrationResult);
        
        if(!registrationResult.equals("User registered successfully.")) {
          System.out.println("Rectify the above errors and try aga.in");
          return;
        }
        System.out.println("Login");
        System.out.print("Username: ");
        String inputUsername = scanner.nextLine();
        
        System.out.print("Password: ");
        String inputPassword = scanner.nextLine();
        
        String loginResult = newUser.getLoginMessage(inputUsername, inputPassword);
        System.out.println(loginResult);
        
        scanner.close();
    }
}
