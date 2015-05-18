package com.mvplzl.contacts.functions;

import com.mvplzl.contacts.MainActivity;
import com.mvplzl.contacts.Man;
import com.mvplzl.contacts.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Add extends Activity {
	
	private EditText mNameEditText;
	private EditText mNumberEditText;
	private EditText mSortEditText;
	private EditText mEmailEditText;
	private Button mAddButton;
	
	public static Man[] man = new Man[15];
	public static int id = 0;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fun_add);
		initViews();
		
		mAddButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				String name = mNameEditText.getText().toString();
				String number = mNumberEditText.getText().toString();
				String sort = mSortEditText.getText().toString();
				String email = mEmailEditText.getText().toString();
				if(id <= 15){
					if(!repeat(name, number)){
						man[id] = new Man(id+1, name, number, sort, email);
						++id;
						Toast.makeText(Add.this, "添加成功!", Toast.LENGTH_SHORT).show();
					}else{
						Toast.makeText(Add.this, "数据录入重复", Toast.LENGTH_SHORT).show();
					}
				}else{
					Toast.makeText(Add.this, "存储空间已满，不能再录入新数据", Toast.LENGTH_LONG).show();
				}
			}
		});
	}
	private void initViews(){
		mNameEditText = (EditText) findViewById(R.id.editText1);
		mNumberEditText = (EditText) findViewById(R.id.editText2);
		mSortEditText = (EditText) findViewById(R.id.editText3);
		mEmailEditText = (EditText) findViewById(R.id.editText4);
		mAddButton = (Button) findViewById(R.id.add_button);
	}
	private boolean repeat(String name, String number){//判断是否重复
		for (int i = 0; i < id; i++) {
			if(man[i].getName().equals(name) && man[i].getNumber().equals(number)){
				return true;
			}
		}
		return false;
	}
}
