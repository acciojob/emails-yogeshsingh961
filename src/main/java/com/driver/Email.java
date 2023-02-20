package com.driver;

public class Email {

    private String emailId;
    private String password;

    public Email(String emailId){
        this.emailId = emailId;
        this.password = "Accio@123";
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void changePassword(String oldPassword, String newPassword){
        //Change password only if the oldPassword is equal to current password and the new password meets all of the following:
        // 1. It contains at least 8 characters
        // 2. It contains at least one uppercase letter
        // 3. It contains at least one lowercase letter
        // 4. It contains at least one digit
        // 5. It contains at least one special character. Any character apart from alphabets and digits is a special character

       if(oldPassword.equals(password)){
              if(isValid(newPassword)){
                  this.password=newPassword;
                  System.out.printf("passwrod has been changed successfully");
              }else
                  System.out.printf("The new passwrod is not valid");
            
        }else
         System.out.printf("Please Enter your password correctly");

    }
    static boolean isValid(String newPassword){
        boolean upperLetter=false;
        boolean lowerLetter=false;
        boolean digit=false;
        boolean spcecialCharacter=false;
        if(newPassword.length()<8) return false;
        for(int i=0; i<newPassword.length(); i++){
            char ch=newPassword.charAt(i);
            if(ch>='A' && ch<='Z'){
                upperLetter=true;

            }else if(ch>='a' && ch<='z') lowerLetter=true;
            else if(ch>='0' && ch<='9') digit=true;
            else spcecialCharacter=true;

        }
        if(upperLetter && lowerLetter && digit && spcecialCharacter)
            return true;
        return false;
    }
}
