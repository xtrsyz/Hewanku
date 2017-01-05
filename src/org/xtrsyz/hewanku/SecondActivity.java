package org.xtrsyz.hewanku;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
//import android.widget.Toast;
//import android.widget.TextView;


public class SecondActivity extends MainActivity {
	
	static final String[]hewanair = new String[] { "Anjing Laut", "Gurita", "Ikan Badut", "Ikan Pari", "Ikan Paus", "Kepiting", "Lumba-lumba", "Singa Luat" };
	static final String[]hewandarat = new String[] { "Ayam", "Badak", "Domba", "Gajah", "Kucing", "Kuda Nil", "Singa", "Ular" };
	static final String[]hewanudara = new String[] { "Burung Pipit", "Capung", "Elang", "Gagak", "Kumbang", "Kupu-kupu", "Lebah", "Merpati" };
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        
        //untuk shared activity BEGIN
		final Intent intent = new Intent( getBaseContext(), HabitatActivity.class);  
        final Bundle b = new Bundle();  
        //untuk shared activity END
        
        
        ImageButton tombolair = (ImageButton) findViewById(R.id.imageButton1);
        tombolair.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				//startActivity(new Intent("android.intent.action.water"));
				//Toast.makeText(getApplicationContext(), "air", Toast.LENGTH_SHORT).show();
				
				b.putStringArray("listhewan", hewanair);           
		        //Add the set of extended data to the intent and start it
		        intent.putExtras(b);
		        startActivity(intent);
			}
		});

        ImageButton tomboludara = (ImageButton) findViewById(R.id.imageButton3);
        tomboludara.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				//startActivity(new Intent("android.intent.action.air"));
				//Toast.makeText(getApplicationContext(), "udara", Toast.LENGTH_SHORT).show();
				b.putStringArray("listhewan", hewanudara);           
		        //Add the set of extended data to the intent and start it
		        intent.putExtras(b);
		        startActivity(intent);
			}
		});
        
        ImageButton tomboldarat = (ImageButton) findViewById(R.id.imageButton2);
        tomboldarat.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				//startActivity(new Intent("android.intent.action.earth"));
				//Toast.makeText(getApplicationContext(), "darat", Toast.LENGTH_SHORT).show();
				b.putStringArray("listhewan", hewandarat);           
		        //Add the set of extended data to the intent and start it
		        intent.putExtras(b);
		        startActivity(intent);
			}
		});
        
        //ImageButton tombolback = (ImageButton) findViewById(R.id.imageButton4);
        //tombolback.setOnClickListener(new View.OnClickListener() {
		//	
		//	@Override
		//	public void onClick(View arg0) {
		//		// TODO Auto-generated method stub
		//		finish();
		//	}
		//});
        
        //ImageButton tombolexit = (ImageButton) findViewById(R.id.imageButton5);
        //tombolexit.setOnClickListener(new View.OnClickListener() {
		//	
		//	@Override
		//	public void onClick(View arg0) {
		//		// TODO Auto-generated method stub
		//		finish();
		//	}
		//});
        
	}

}
