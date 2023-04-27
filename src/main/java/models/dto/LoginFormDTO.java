package models.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class LoginFormDTO {


    @Email(message = "Invalid email.Please try again!")
    @NotNull
    @NotBlank
    private Email email;

    @NotNull
    @NotBlank
    @Size(min = 5, max = 20, message = "Invalid password.Must be between 5 and 20 characters!")
    private String password;


    public Email getEmail() {
        return email;
    }

    public void setEmail(Email email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }





}
