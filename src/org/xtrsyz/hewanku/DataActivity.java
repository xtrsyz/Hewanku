package org.xtrsyz.hewanku;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.ImageView;
import android.app.Activity;

public class DataActivity extends Activity {
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
	    setContentView(R.layout.activity_data);

	    Bundle b = getIntent().getExtras(); 
	    int resId = b.getInt("state", 0);
	    String name = b.getString("name");
	    //String gambar = b.getString("gambar");
	        
	    TextView vw1 = (TextView) findViewById(R.id.txtName);
	    ImageView vw3 = (ImageView) findViewById(R.id.imageView1);
	    TextView vw2 = (TextView) findViewById(R.id.txtState);
	        
	    vw1.setText("Name: " + name);
	    vw3.setImageResource(resId);
	    vw2.setText("State: " + String.valueOf(resId));
	}
}
