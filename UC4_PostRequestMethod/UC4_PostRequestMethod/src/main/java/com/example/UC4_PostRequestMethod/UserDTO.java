package com.example.UC4_PostRequestMethod;

public class UserDTO {
    String firstName;
    String lastName;

    // Constructor
    public UserDTO() {
    }

    public UserDTO(String firstName, String lastName) {
        this.firstName = "kritika";
        this.lastName = "Das";
    }

    // Getters and Setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
