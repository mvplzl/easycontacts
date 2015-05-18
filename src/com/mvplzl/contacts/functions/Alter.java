package com.mvplzl.contacts.functions;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.mvplzl.contacts.R;
import com.mvplzl.contacts.functions.child.SetNumber;

public class Alter extends Activity {
	
	private String[] mans = new String[]{"","","","","","","","","","","","","","",""};
	private ListView dialListView;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fun_alter);
		for (int i = 0; i < Add.id; i++) {
			mans[i] = Add.man[i].getName();
		}
		
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(Alter.this, 
				android.R.layout.simple_list_item_1,mans);
		dialListView = (ListView) findViewById(R.id.alter_list_view);
		dialListView.setAdapter(adapter);
		dialListView.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				String name = Add.man[position].getName();
				String number = Add.man[position].getNumber();
				String sort = Add.man[position].getSort();
				String email = Add.man[position].getEmail();
				Intent intent = new Intent(Alter.this, SetNumber.class);
				intent.putExtra("key", name + "," + number + "," + sort + "," + email + "," + position);
				startActivity(intent);
			}
		});
	}
}
