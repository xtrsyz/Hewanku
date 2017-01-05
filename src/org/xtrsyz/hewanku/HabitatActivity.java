package org.xtrsyz.hewanku;


import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


public class HabitatActivity extends ListActivity {
	//static final String[]menuaktivitybanyak = new String[] { "Anjing Laut", "Gurita", "Ikan Badut", "Ikan Pari", "Ikan Paus", "Kepiting", "Lumba-lumba", "Singa Luat" };
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//setContentView(R.layout.activity_second);
		
		Bundle b = getIntent().getExtras(); 
	    String[]menuaktivitybanyak = b.getStringArray("listhewan");
	    
		setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_water,menuaktivitybanyak));
		ListView listView = getListView();
		listView.setTextFilterEnabled(true);

		listView.setOnItemClickListener(new OnItemClickListener() {
			public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
				// When clicked, show a toast with the TextView text
				Toast.makeText(getApplicationContext(),	((TextView) view).getText(), Toast.LENGTH_SHORT).show();
				
				//untuk shared activity BEGIN
				Intent intent = new Intent( getBaseContext(), DataActivity.class);  
	            Bundle b = new Bundle();
	            
	            int idimg = getResources().getIdentifier(getPackageName() + ":drawable/" + ((TextView) view).getText().toString().replace(" ", "_").toLowerCase(), null, null);
				b.putString("name", ((TextView) view).getText().toString() );
				b.putInt("state", idimg );
	               
	            //Add the set of extended data to the intent and start it
	            intent.putExtras(b);
	            startActivity(intent);  
	            //untuk shared activity END
			}
		});
	}
}
