package com.brian.databinging2;

import android.databinding.ObservableDouble;
import android.databinding.ObservableField;

/**
 * Created by Brian_Chen on 11/07/2017.
 */
//ObservableFields example
public class Product {
  public final ObservableField<String> productName = new ObservableField<>();

  public final ObservableField<String> productDescription = new ObservableField<>();

  public final ObservableDouble productPrice = new ObservableDouble();

}
