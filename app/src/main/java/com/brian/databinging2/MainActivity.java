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

    activityMainBinding.textView
        .setText("Android Data Binding");
  }
}