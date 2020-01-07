package com.xymid.testfotos;

import android.os.Bundle;

public class MainActivity extends Activity {

 @Override
 protected void onCreate(Bundle savedInstanceState){
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main);
 }
 
 @Override
 public boolean onCreateOptionsMenu(Menu menu){
 
      getMenuInflater().inflate(R.menu.main, menu);
      return true;
 }
} 
