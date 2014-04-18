package tn.rnu.isi.ISIapp;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		ArrayAdapterClass adapter ; 
		
		
		String [] values = new String[] {"Note" , "Emploi" , "News" , "Evenements", "Favorie","Tunisie"};
		
		adapter = new ArrayAdapterClass(this, values); 
		ListView listview = (ListView) findViewById(R.id.listView1); 
		listview.setAdapter(adapter); 
		listview.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view, int position,
					long id) {
				 String item2 = (String) parent.getItemAtPosition(position);
				 //Toast.makeText(getApplicationContext(), item2, Toast.LENGTH_LONG).show(); 
				if(item2=="Note"){
					
					try
					{
					     Intent k = new Intent(MainActivity.this, NoteActivity.class);
					     startActivity(k);
					}catch(Exception e){

					}
				}
				 
				 
				 
						}
		});
			
			
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	
	
}
