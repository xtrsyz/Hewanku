package org.xtrsyz.hewanku;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AboutActivity extends MainActivity {
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        
        Button tombol = (Button) findViewById(R.id.button1);
        tombol.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				balikKeMenu();
			}
		});
    }
}
