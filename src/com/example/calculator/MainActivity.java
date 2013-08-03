package com.example.calculator;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Menu;
import android.widget.Button;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		DisplayMetrics metrics = new DisplayMetrics();
		getWindowManager().getDefaultDisplay().getMetrics(metrics);
		
		int width = metrics.widthPixels;
		Button d_button = (Button) findViewById(R.id.d_button);
		Button e_button = (Button) findViewById(R.id.e_button);
		Button f_button = (Button) findViewById(R.id.f_button);
		Button div_button = (Button) findViewById(R.id.div_button);
		d_button.setWidth((width/4)-8);
		e_button.setWidth((width/4)-8);
		f_button.setWidth((width/4)-8);
		div_button.setWidth((width/4)-8);
		

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
