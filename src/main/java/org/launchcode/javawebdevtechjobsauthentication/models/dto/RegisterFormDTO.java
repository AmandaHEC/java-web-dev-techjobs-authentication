package org.launchcode.javawebdevtechjobsauthentication.models.dto;


public class RegisterFormDTO extends LoginFormDTO{

    private String verifyPassword;

    public RegisterFormDTO(String String) {
        this.verifyPassword = verifyPassword;
    }

    public RegisterFormDTO() {

    }

    public String getVerifyPassword() {
        return verifyPassword;
    }

    public void setVerifyPassword(String verifyPassword) {
        this.verifyPassword = verifyPassword;
    }
}
