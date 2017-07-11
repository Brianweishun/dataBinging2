package com.brian.databinging2;

import android.util.Log;
import android.view.View;

/**
 * Created by Brian_Chen on 06/07/2017.
 */
public class Presenter {
  public void onSaveClick(View view, User user){
    //Listener Bindings
    Log.d("brian", "presenter onSaveClick " + user.getLastName() + view.hasOnClickListeners());
  }
  public void onChange(View view, User user) {
    user.setFirstName("Marie");
    user.setLastName("Li");
  }

  public void changeProduct(View view, Product product) {
    product.productName.set("iphone");
    product.productPrice.set(99);
  }
}
