package com.brian.databinging2;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

/**
 * Created by Brian_Chen on 04/07/2017.
 */
public class User extends BaseObservable {
  public Boolean isShow;
  public String firstName;
  public String lastName;
  public User(String firstName, String lastName) {
    this.isShow = true;
    this.firstName = firstName;
    this.lastName = lastName;
  }
  @Bindable
  public String getFirstName() {
    return firstName;
  }
  @Bindable
  public String getLastName() {
    return lastName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
    notifyPropertyChanged(BR.firstName);
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
    notifyPropertyChanged(BR.lastName);
  }
}
