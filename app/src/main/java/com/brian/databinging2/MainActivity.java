package com.brian.databinging2;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.brian.databinging2.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
  private ActivityMainBinding activityMainBinding;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);



    activityMainBinding = DataBindingUtil
        .setContentView(this, R.layout.activity_main);

    User user = new User("Brian", "Chen");
    activityMainBinding.setUser(user);

    Handler handler = new Handler();
    activityMainBinding.setHandler(handler);

    activityMainBinding.setPresenter(new Presenter());

    Product product = new Product();

    activityMainBinding.setProduct(product);

    product.productName.set("xbox");
    product.productPrice.set(120);

//    activityMainBinding.textView
//        .setText("Android Data Binding");

//    activityMainBinding.button01
  }
}
