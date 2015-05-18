package com.mvplzl.contacts.functions.child;

import com.mvplzl.contacts.R;
import com.mvplzl.contacts.functions.Add;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SetNumber extends Activity {
	
	private EditText mNameEditText;
	private EditText mNumberEditText;
	private EditText mSortEditText;
	private EditText mEmailEditText;
	private Button mSetButton;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.set_number);
		Intent intent = getIntent();
		String data = intent.getStringExtra("key");
		String name = data.split(",")[0];
		String number = data.split(",")[1];
		String sort = data.split(",")[2];
		String email = data.split(",")[3];
		String position = data.split(",")[4];
		final int p = Integer.parseInt(position);
		mNameEditText = (EditText) findViewById(R.id.editText1);
		mNumberEditText = (EditText) findViewById(R.id.editText2);
		mSortEditText = (EditText) findViewById(R.id.editText3);
		mEmailEditText = (EditText) findViewById(R.id.editText4);
		mNameEditText.setText(name);
		mNumberEditText.setText(number);
		mSortEditText.setText(sort);
		mEmailEditText.setText(email);
		mSetButton = (Button) findViewById(R.id.set_button);
		mSetButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Add.man[p].setName(mNameEditText.getText().toString());
				Add.man[p].setNumber(mNumberEditText.getText().toString());
				Add.man[p].setSort(mSortEditText.getText().toString());
				Add.man[p].setEmail(mEmailEditText.getText().toString());
				Toast.makeText(SetNumber.this, "修改完成！", Toast.LENGTH_SHORT).show();
			}
		});
	}
}
