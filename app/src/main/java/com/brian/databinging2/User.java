package com.brian.databinging2;

/**
 * Created by Brian_Chen on 04/07/2017.
 */
public class User {
  public final Boolean isShow;
  public final String firstName;
  public final String lastName;
  public User(String firstName, String lastName) {
    this.isShow = true;
    this.firstName = firstName;
    this.lastName = lastName;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

}
