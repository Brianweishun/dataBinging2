package com.brian.databinging2;

import android.util.Log;

/**
 * Created by Brian_Chen on 06/07/2017.
 */
public class Presenter {
  public void onSaveClick(User user){
    //Listener Bindings
    Log.d("brian", "presenter onSaveClick" + user.getFirstName());
  }
}
