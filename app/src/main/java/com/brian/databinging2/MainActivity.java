package com.brian.databinging2;

import android.databinding.DataBindingUtil;
import android.databinding.ObservableArrayMap;
import android.databinding.ObservableMap;
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

    final ObservableMap<String, Object> map = new ObservableArrayMap<>();
    map.put(Keys.name, "Brian");
    map.put(Keys.age, 22);
    activityMainBinding.setMap(map);

    activityMainBinding.button03.setOnClickListener(new android.view.View.OnClickListener() {
      @Override
      public void onClick(android.view.View v) {
        map.put(Keys.name,"hello");
        map.put(Keys.age,20);
      }
    });

  }
}
