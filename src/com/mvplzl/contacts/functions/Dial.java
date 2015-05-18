package com.mvplzl.contacts.functions;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.mvplzl.contacts.R;

public class Dial extends Activity {
	
	private String[] mans = new String[]{"","","","","","","","","","","","","","",""};
	private ListView dialListView;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fun_dial);
		for (int i = 0; i < Add.id; i++) {
			mans[i] = Add.man[i].getName();
		}
		
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(Dial.this, 
				android.R.layout.simple_list_item_1,mans);
		dialListView = (ListView) findViewById(R.id.dial_list_view);
		dialListView.setAdapter(adapter);
		dialListView.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				String number = Add.man[position].getNumber();
				Intent intent = new Intent(Intent.ACTION_DIAL);
				intent.setData(Uri.parse("tel:" + number));
				startActivity(intent);
			}
		});
	}
}
