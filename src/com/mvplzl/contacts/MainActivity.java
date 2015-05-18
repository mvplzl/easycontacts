package com.mvplzl.contacts;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.mvplzl.contacts.functions.Add;
import com.mvplzl.contacts.functions.Alter;
import com.mvplzl.contacts.functions.Check;
import com.mvplzl.contacts.functions.Delete;
import com.mvplzl.contacts.functions.Dial;


public class MainActivity extends Activity {
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void check(View view){
    	Intent intent = new Intent(MainActivity.this, Check.class);
    	startActivity(intent);
    }
    public void add(View view){
    	Intent intent = new Intent(MainActivity.this, Add.class);
    	startActivity(intent);
    }
    public void dial(View view){
    	Intent intent = new Intent(MainActivity.this, Dial.class);
    	startActivity(intent);
    }
    public void alter(View view){
    	Intent intent = new Intent(MainActivity.this, Alter.class);
    	startActivity(intent);
    }
    public void delete(View view){
    	Intent intent = new Intent(MainActivity.this, Delete.class);
    	startActivity(intent);
    }
}
