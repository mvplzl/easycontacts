package com.mvplzl.contacts.functions;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.mvplzl.contacts.R;

public class Delete extends Activity {

	private String[] mans = new String[] { "", "", "", "", "", "", "", "", "",
			"", "", "", "", "", "" };
	private ListView deleteListView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fun_delete);
		for (int i = 0; i < Add.id; i++) {
			mans[i] = Add.man[i].getId() + " " + Add.man[i].getName();
		}
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(Delete.this,
				android.R.layout.simple_list_item_1, mans);
		deleteListView = (ListView) findViewById(R.id.delete_list_view);
		deleteListView.setAdapter(adapter);
		deleteListView
				.setOnItemLongClickListener(new OnItemLongClickListener() {

					@Override
					public boolean onItemLongClick(AdapterView<?> parent,
							View view, final int position, long id) {//position从0开始
						AlertDialog.Builder dialog = new AlertDialog.Builder(
								Delete.this);
						dialog.setTitle("删除");
						dialog.setMessage("删除此项？");
						dialog.setPositiveButton("确定",
								new DialogInterface.OnClickListener() {

									@Override
									public void onClick(DialogInterface dialog,
											int which) {
										for(int i=position; i<Add.id-1 ; i++){
											Add.man[i].setName(Add.man[i+1].getName());
											Add.man[i].setNumber(Add.man[i+1].getNumber());
											Add.man[i].setSort(Add.man[i+1].getSort());
											Add.man[i].setEmail(Add.man[i+1].getEmail());
										}
										Add.id--;
										Toast.makeText(Delete.this, "删除成功", Toast.LENGTH_SHORT).show();
										Intent intent = new Intent(Delete.this, Delete.class);
										startActivity(intent);
										onBackPressed();
									}
								});
						dialog.setNegativeButton("取消",
								new DialogInterface.OnClickListener() {

									@Override
									public void onClick(DialogInterface dialog,
											int which) {

									}
								});
						dialog.show();
						return false;
					}
				});
		
	}
}
