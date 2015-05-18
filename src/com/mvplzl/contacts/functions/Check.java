package com.mvplzl.contacts.functions;

import com.mvplzl.contacts.R;
import com.mvplzl.contacts.functions.child.CheckNumber;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Check extends Activity {

	private Button workButton;
	private Button personalButton;
	private Button businessButton;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fun_check);
		workButton = (Button) findViewById(R.id.work);
		personalButton = (Button) findViewById(R.id.personal);
		businessButton = (Button) findViewById(R.id.business);
		workButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(Check.this, CheckNumber.class);
				intent.putExtra("checkKey", "work");
				startActivity(intent);
			}
		});
		personalButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(Check.this, CheckNumber.class);
				intent.putExtra("checkKey", "personal");
				startActivity(intent);
			}
		});
		businessButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(Check.this, CheckNumber.class);
				intent.putExtra("checkKey", "business");
				startActivity(intent);
			}
		});
	}
}
