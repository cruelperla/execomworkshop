package com.example.perla.workshop1app.model;

/**
 * Created by Perla on 29.4.2017.
 */

public class User {
    public User(String firstName, String lastName, String iconUrl) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.iconUrl = iconUrl;
    }

    private String firstName;

    private String lastName;

    private String iconUrl;

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

    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("User{");
        sb.append("firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", iconUrl='").append(iconUrl).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
