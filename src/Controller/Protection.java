/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.User;
import Controller.Encrypt;

public class Protection {
    
    private SQLite sqlite = new SQLite();
    
    public Protection() {

    }
    
    public boolean checkUsername(String username){
        if (username.length() > 10) {
            return false;
        }
      return true;
    }
    
    private boolean checkPasswordLength(String password){
        return password.length() < 8;
    }
    
    private boolean passwordHasDigit(String password){
        System.out.println("Contains Digit: " + password.matches(".*\\d.*"));
        return password.matches(".*\\d.*");
    }
    
    private boolean passwordHasUppercase(String password){
        boolean match = password.matches(".*[A-Z].*");
        System.out.println("Contains Uppercase: " + match);
        return match;
    }
    
    private boolean passwordHasLowercase(String password){
        boolean match = password.matches(".*[a-z].*");
        System.out.println("Contains Lowercase: " + match);
        return match;
    }
    
    private boolean passwordHasSpecialChar(String password){
        boolean match = password.matches(".*[`~!@#$%^&*()\\-_=+\\\\|\\[{\\]};:'\",<.>/?].*");
        System.out.println("Contains Special Char: " + match);
        return match;
    }
    
    public boolean checkPasswordStrength(String password, javax.swing.JLabel errorLabel, javax.swing.JTextField passwordFld, javax.swing.JTextField confpassFld) {
               
        if (checkPasswordLength(password)) {
            errorLabel.setText("Error: Password must at least be 8 characters long");
            return false;
        }
            
        if(!passwordHasUppercase(password)) {
            errorLabel.setText("Error: Password must at least have 1 uppercase");
            return false;
        } 
        
        if(!passwordHasLowercase(password)) {
            errorLabel.setText("Error: Password must at least have 1 lowercase");
            return false;
        } 
        
        if(!passwordHasDigit(password)) {
            errorLabel.setText("Error: Password must at least have 1 digit");
            return false;
        } 
        
        if(!passwordHasSpecialChar(password)) {
            errorLabel.setText("Error: Password must at least have 1 special character");       
            return false;
        } 
            
        errorLabel.setText("");
        
        return true;
    }
    
    public boolean checkUser(String username){
        try {
            User user = sqlite.getUser(username);
        
            if(user.getId() != 0 ){
                return true;
            } 
        } catch (NullPointerException e) {
            return false;
        }
        return false;
    }
    
    public boolean verifyUser(String username, String password){
        try {
            User user = sqlite.getUser(username);
        
            if(user.getId() == 0 ){
                return false;
            } 
            boolean match = Encrypt.verifyUserPassword(password, user.getPassword());
            return match;
        } catch (NullPointerException e) {
            return false;
        }
    }
    
    public boolean isUserLocked(String username){
        try {
            User user = sqlite.getUser(username);
        
            if(user.getId() == 0 ){
                return false;
            } 

            if(user.getLocked() != 0){
                return true;
            }
        } catch (NullPointerException e) {
            return false;
        }
        return false;
    }
    
    public void lockUser(String username){
        try {
            User user = sqlite.getUser(username);
        
            if(user.getId() != 0){
                user.setLocked(1);
                sqlite.updateUser(user);
            }
        } catch (NullPointerException e) {
            return;
        }
    }
}