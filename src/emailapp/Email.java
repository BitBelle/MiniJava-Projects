/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package emailapp;

import java.util.Scanner;

/**
 *
 * @author mercy
 */
public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int mailboxCapacity = 500;
    private int defaultPasswordLength = 10;
    private String alternateEmail;
    private String companySuffix = "mycompany.com";
    
    public Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        
//        System.out.println("EMAIL CREATED: " + this.firstName + " " + this.lastName);
    
        //Now calling a method to ask for the department 
        this.department = setDepartment();
        System.out.println("Department: " + this.department);

        
        //Calling the method that generates the random password
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your Random generated Password is: " + this.password);
        
        //combine elements to generates an email
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
        System.out.println("Your email is: " + email);
        
    }
    
    
    
    //Setting the department which one belongs to
    private String setDepartment(){
        System.out.println("SELECT DEPARTMENT CODE\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none");
        System.out.print("Enter Department Code: ");
        Scanner sc = new Scanner(System.in);
        int depChoice = sc.nextInt();
        System.out.println();
        if (depChoice == 1 ){
            return "Sales";
        }else if (depChoice == 2 ){
            return "Dev";
        }
        else if (depChoice == 3){
            return "Acc";
        } else {
            return "";
        } 
    }
    
    //Generate a random password
    private String randomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789#@%";
        char[] password = new char [length];
        for (int i = 0; i < length; i++){
            int rand = (int) (Math.random() * passwordSet.length());
            password [i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }
    
    //setting the mailBox capacity
    public void setMailboxCapacity(int capacity){
        this.mailboxCapacity = capacity;    
    }
    
    //getters
    public int getMailboxCapacity(){
        return mailboxCapacity;
    }
    
    //setting the alternate email
    public void setAlternateEmail(String altEmail){
       this.alternateEmail = altEmail; 
    }
    
    public String getAlternateEmail(){
        return alternateEmail;
    }
    
    //changing the password
    public void changePassword(String password){
        this.password = password;
    }
        
    public String getPassword(){
        return password;
    }
    

    public String showInfo(){
        System.out.println();
        return "Full Details: " + "\n" +
                "NAME: " + firstName + " " + lastName + "\n" +
                "DEPARTMENT NAME: " + department + " " + "\n" +
                "MAILBOX CAPACITY: " + mailboxCapacity + "mb";
    }
}
