package com.example.calculator;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Menu;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		DisplayMetrics metrics = new DisplayMetrics();
		getWindowManager().getDefaultDisplay().getMetrics(metrics);
		
		int width = metrics.widthPixels;
		int height = metrics.heightPixels;
		TextView display = (TextView) findViewById(R.id.display);
		Button d_button = (Button) findViewById(R.id.d_button);
		Button e_button = (Button) findViewById(R.id.e_button);
		Button f_button = (Button) findViewById(R.id.f_button);
		Button clear_button = (Button) findViewById(R.id.clear_button);
		Button a_button = (Button) findViewById(R.id.a_button);
		Button b_button = (Button) findViewById(R.id.b_button);
		Button c_button = (Button) findViewById(R.id.c_button);
		Button div_button = (Button) findViewById(R.id.div_button);
		Button button_7 = (Button) findViewById(R.id.button_7);
		Button button_8 = (Button) findViewById(R.id.button_8);
		Button button_9 = (Button) findViewById(R.id.button_9);
		Button mult_button = (Button) findViewById(R.id.mult_button);
		Button button_4 = (Button) findViewById(R.id.button_4);
		Button button_5 = (Button) findViewById(R.id.button_5);
		Button button_6 = (Button) findViewById(R.id.button_6);
		Button sub_button = (Button) findViewById(R.id.sub_button);
		Button button_1 = (Button) findViewById(R.id.button_1);
		Button button_2 = (Button) findViewById(R.id.button_2);
		Button button_3 = (Button) findViewById(R.id.button_3);
		Button add_button = (Button) findViewById(R.id.add_button);
		Button button_0 = (Button) findViewById(R.id.button_0);
		Button decimal_button = (Button) findViewById(R.id.decimal_button);
		Button plusminus_button = (Button) findViewById(R.id.plusminus_button);
		Button equal_button = (Button) findViewById(R.id.equal_button);
		//width formatting
		display.setWidth(width-16);
		d_button.setWidth((width/4)-16);
		e_button.setWidth((width/4)-16);
		f_button.setWidth((width/4)-16);
		clear_button.setWidth((width/4)-16);
		a_button.setWidth((width/4)-16);
		b_button.setWidth((width/4)-16);
		c_button.setWidth((width/4)-16);
		div_button.setWidth((width/4)-16);
		button_7.setWidth((width/4)-16);
		button_8.setWidth((width/4)-16);
		button_9.setWidth((width/4)-16);
		mult_button.setWidth((width/4)-16);
		button_4.setWidth((width/4)-16);
		button_5.setWidth((width/4)-16);
		button_6.setWidth((width/4)-16);
		sub_button.setWidth((width/4)-16);
		button_1.setWidth((width/4)-16);
		button_2.setWidth((width/4)-16);
		button_3.setWidth((width/4)-16);
		add_button.setWidth((width/4)-16);
		mult_button.setWidth((width/4)-16);
		button_0.setWidth((width/4)-16);
		decimal_button.setWidth((width/4)-16);
		plusminus_button.setWidth((width/4)-16);
		equal_button.setWidth((width/4)-16);
		//height formatting
		display.setHeight(((height*2)/9)-16);
		d_button.setHeight((height/9)-16);
		e_button.setHeight((height/9)-16);
		f_button.setHeight((height/9)-16);
		clear_button.setHeight((height/9)-16);
		a_button.setHeight((height/9)-16);
		b_button.setHeight((height/9)-16);
		c_button.setHeight((height/9)-16);
		div_button.setHeight((height/9)-16);
		button_7.setHeight((height/9)-16);
		button_8.setHeight((height/9)-16);
		button_9.setHeight((height/9)-16);
		mult_button.setHeight((height/9)-16);
		button_4.setHeight((height/9)-16);
		button_5.setHeight((height/9)-16);
		button_6.setHeight((height/9)-16);
		sub_button.setHeight((height/9)-16);
		button_1.setHeight((height/9)-16);
		button_2.setHeight((height/9)-16);
		button_3.setHeight((height/9)-16);
		add_button.setHeight((height/9)-16);
		mult_button.setHeight((height/9)-16);
		button_0.setHeight((height/9)-16);
		decimal_button.setHeight((height/9)-16);
		plusminus_button.setHeight((height/9)-16);
		equal_button.setHeight((height/9)-16);
		

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
