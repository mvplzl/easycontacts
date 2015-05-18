package com.mvplzl.contacts.functions.child;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.mvplzl.contacts.R;
import com.mvplzl.contacts.functions.Add;
import com.mvplzl.contacts.functions.Dial;

public class CheckNumber extends Activity {
	
	private String[] mans = new String[]{"","","","","","","","","","","","","","",""};
	private TextView mCheckTextView;
	private ListView mCheckListView;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.check_number);
		
		Intent intent = getIntent();
		String sort = intent.getStringExtra("checkKey");
		mCheckTextView = (TextView) findViewById(R.id.check_text_view);
		mCheckListView = (ListView) findViewById(R.id.check_list_view);
		if(sort.equals("work")){
			mCheckTextView.setText("办公类");
			int j = 0;
			for (int i = 0; i < Add.id; i++) {
				if(Add.man[i].getSort().equals("办公类")){
					mans[j] = Add.man[i].getName() + "\n" + Add.man[i].getNumber();
					j++;
				}
			}
		}
		if(sort.equals("personal")){
			mCheckTextView.setText("个人类");
			int j = 0;
			for (int i = 0; i < Add.id; i++) {
				if(Add.man[i].getSort().equals("个人类")){
					mans[j] = Add.man[i].getName() + "\n" + Add.man[i].getNumber();
					j++;
				}
			}
		}
		if(sort.equals("business")){
			mCheckTextView.setText("商务类");
			int j = 0;
			for (int i = 0; i < Add.id; i++) {
				if(Add.man[i].getSort().equals("商务类")){
					mans[j] = Add.man[i].getName() + "\n" + Add.man[i].getNumber();
					j++;
				}
			}
		}
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(CheckNumber.this, 
				android.R.layout.simple_list_item_1,mans);
		mCheckListView = (ListView) findViewById(R.id.check_list_view);
		mCheckListView.setAdapter(adapter);
	}
}
