/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package emailapp;

/**
 *
 * @author mercy
 */
public class EmailApp {
    
    public static void main(String[] args) {
        Email em1 = new Email("Mercy", "Wainaina");
        
//        em1.setAlternateEmail("mimi@gmail.com");
//        System.out.println("Your alternate email is: " + em1.getAlternateEmail());
//        
//        em1.changePassword("herpet1234");
//        System.out.println("Your password has changed to: "+ em1.getPassword());

          System.out.println(em1.showInfo());
    }
}
