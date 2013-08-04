package com.example.calculator;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends Activity {

	String operand1;
	String operation;
	String operand2;
	String displayValue;
	double solutionDouble = 0.0;
	String solutionString;
	boolean operationFlag = false;
	String curRadioButton = "bin_button";
	
	//start of main code
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		DisplayMetrics metrics = new DisplayMetrics();
		getWindowManager().getDefaultDisplay().getMetrics(metrics);
		
		int width = metrics.widthPixels;
		int height = metrics.heightPixels;
		TextView display = (TextView) findViewById(R.id.display);
		RadioButton bin_radio = (RadioButton) findViewById(R.id.bin_radio);
		RadioButton oct_radio = (RadioButton) findViewById(R.id.oct_radio);
		RadioButton dec_radio = (RadioButton) findViewById(R.id.dec_radio);
		RadioButton hex_radio = (RadioButton) findViewById(R.id.hex_radio);
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
		Button plusminus_button = (Button) findViewById(R.id.plusminus_button);
		Button equal_button = (Button) findViewById(R.id.equal_button);
		//width formatting
		display.setWidth(width-16);
		bin_radio.setWidth((width/4)-16);
		oct_radio.setWidth((width/4)-16);
		dec_radio.setWidth((width/4)-16);
		hex_radio.setWidth((width/4)-16);
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
		plusminus_button.setWidth((width/4)-16);
		equal_button.setWidth(((width*2)/4)-16);
		//height formatting
		display.setHeight(((height*2)/9)-16);
		bin_radio.setHeight((height/9)-16);
		oct_radio.setHeight((height/9)-16);
		dec_radio.setHeight((height/9)-16);
		hex_radio.setHeight((height/9)-16);
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
		plusminus_button.setHeight((height/9)-16);
		equal_button.setHeight((height/9)-16);
		//set defaults for radio buttons
		bin_radio.setChecked(true);
		oct_radio.setChecked(false);
		dec_radio.setChecked(false);
		hex_radio.setChecked(false);
		//required assignment for leading zero at onCreate()
		displayValue = "0";

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	

	public void onRadioButtonClicked(View view) {
	    // Is the button now checked?
	    boolean checked = ((RadioButton) view).isChecked();
	    
		Button d_button = (Button) findViewById(R.id.d_button);
		Button e_button = (Button) findViewById(R.id.e_button);
		Button f_button = (Button) findViewById(R.id.f_button);
		Button a_button = (Button) findViewById(R.id.a_button);
		Button b_button = (Button) findViewById(R.id.b_button);
		Button c_button = (Button) findViewById(R.id.c_button);
		Button button_7 = (Button) findViewById(R.id.button_7);
		Button button_8 = (Button) findViewById(R.id.button_8);
		Button button_9 = (Button) findViewById(R.id.button_9);
		Button button_4 = (Button) findViewById(R.id.button_4);
		Button button_5 = (Button) findViewById(R.id.button_5);
		Button button_6 = (Button) findViewById(R.id.button_6);
		Button button_1 = (Button) findViewById(R.id.button_1);
		Button button_2 = (Button) findViewById(R.id.button_2);
		Button button_3 = (Button) findViewById(R.id.button_3);
		Button button_0 = (Button) findViewById(R.id.button_0);
		
	    // Check which radio button was clicked
	    switch(view.getId()) {
	        case R.id.bin_radio:
	            if (checked)
	                // TODO: add logic for binary calculations and conversions
	            	f_button.setEnabled(false);
	            	e_button.setEnabled(false);
	            	d_button.setEnabled(false);
	            	c_button.setEnabled(false);
	            	b_button.setEnabled(false);
	            	a_button.setEnabled(false);
	            	button_9.setEnabled(false);
	            	button_8.setEnabled(false);
	            	button_7.setEnabled(false);
	            	button_6.setEnabled(false);
	            	button_5.setEnabled(false);
	            	button_4.setEnabled(false);
	            	button_3.setEnabled(false);
	            	button_2.setEnabled(false);
	            	button_1.setEnabled(true);
	            	button_0.setEnabled(true);
	            break;
	        case R.id.oct_radio:
	            if (checked)
	                // TODO: add logic for octal calculations and conversions
	            	f_button.setEnabled(false);
	            	e_button.setEnabled(false);
	            	d_button.setEnabled(false);
	            	c_button.setEnabled(false);
	            	b_button.setEnabled(false);
	            	a_button.setEnabled(false);
	            	button_9.setEnabled(false);
	            	button_8.setEnabled(false);
	            	button_7.setEnabled(true);
	            	button_6.setEnabled(true);
	            	button_5.setEnabled(true);
	            	button_4.setEnabled(true);
	            	button_3.setEnabled(true);
	            	button_2.setEnabled(true);
	            	button_1.setEnabled(true);
	            	button_0.setEnabled(true);
	            break;
	        case R.id.dec_radio:
	        	if (checked)
	        		// TODO: add logic for decimal calculations and conversions
	            	f_button.setEnabled(false);
	            	e_button.setEnabled(false);
	            	d_button.setEnabled(false);
	            	c_button.setEnabled(false);
	            	b_button.setEnabled(false);
	            	a_button.setEnabled(false);
	            	button_9.setEnabled(true);
	            	button_8.setEnabled(true);
	            	button_7.setEnabled(true);
	            	button_6.setEnabled(true);
	            	button_5.setEnabled(true);
	            	button_4.setEnabled(true);
	            	button_3.setEnabled(true);
	            	button_2.setEnabled(true);
	            	button_1.setEnabled(true);
	            	button_0.setEnabled(true);
	        	break;
	        case R.id.hex_radio:
	        	if(checked)
	        		// TODO: add logic for hexadecimal calculations and conversions
	            	f_button.setEnabled(true);
	            	e_button.setEnabled(true);
	            	d_button.setEnabled(true);
	            	c_button.setEnabled(true);
	            	b_button.setEnabled(true);
	            	a_button.setEnabled(true);
	            	button_9.setEnabled(true);
	            	button_8.setEnabled(true);
	            	button_7.setEnabled(true);
	            	button_6.setEnabled(true);
	            	button_5.setEnabled(true);
	            	button_4.setEnabled(true);
	            	button_3.setEnabled(true);
	            	button_2.setEnabled(true);
	            	button_1.setEnabled(true);
	            	button_0.setEnabled(true);

	        	break;
	    }
	}
	
	//first row of buttons
	public void send_d(View view) {
		TextView display = (TextView) findViewById(R.id.display);
		if(displayValue == "0")
			displayValue = "D";
		else {
			displayValue = display.getText().toString();
			displayValue += "D";
		}
		display.setText(displayValue);
	}
	public void send_e(View view) {
		TextView display = (TextView) findViewById(R.id.display);
		if(displayValue == "0")
			displayValue = "E";
		else {
			displayValue = display.getText().toString();
			displayValue += "E";
		}
		display.setText(displayValue);
	}
	public void send_f(View view) {
		TextView display = (TextView) findViewById(R.id.display);
		if(displayValue == "0")
			displayValue = "F";
		else {
			displayValue = display.getText().toString();
			displayValue += "F";
		}
		display.setText(displayValue);
	}
	public void send_clear(View view) {
		TextView display = (TextView) findViewById(R.id.display);
		displayValue = display.getText().toString();
		displayValue = "0";
		operand1 = "0";
		operand2 = "0";
		solutionDouble = 0.0;
		solutionString = "0";
		display.setText(displayValue);
	}
	
	//second row of buttons
	public void send_a(View view) {
		TextView display = (TextView) findViewById(R.id.display);
		displayValue = display.getText().toString();
		displayValue += "A";
		display.setText(displayValue);
	}
	public void send_b(View view) {
		TextView display = (TextView) findViewById(R.id.display);
		displayValue = display.getText().toString();
		displayValue += "B";
		display.setText(displayValue);
	}
	public void send_c(View view) {
		TextView display = (TextView) findViewById(R.id.display);
		displayValue = display.getText().toString();
		displayValue += "C";
		display.setText(displayValue);
	}
	public void send_div(View view) {
		TextView display = (TextView) findViewById(R.id.display);
		operand1 = display.getText().toString();
		operation = "/";
		displayValue = "0";
	}
	
	//third row of buttons
	public void send_7(View view) {
		TextView display = (TextView) findViewById(R.id.display);
		if(displayValue == "0")
			displayValue = "7";
		else {
			displayValue = display.getText().toString();
			displayValue += "7";
		}
		display.setText(displayValue);
	}
	public void send_8(View view) {
		TextView display = (TextView) findViewById(R.id.display);
		if(displayValue == "0")
			displayValue = "8";
		else {
			displayValue = display.getText().toString();
			displayValue += "8";
		}
		display.setText(displayValue);
	}
	public void send_9(View view) {
		TextView display = (TextView) findViewById(R.id.display);
		if(displayValue == "0")
			displayValue = "9";
		else {
			displayValue = display.getText().toString();
			displayValue += "9";
		}
		display.setText(displayValue);
	}
	public void send_mult(View view) {
		TextView display = (TextView) findViewById(R.id.display);
		operand1 = display.getText().toString();
		operation = "*";
		displayValue = "0";
	}
	
	//fourth row of buttons
	public void send_4(View view) {
		TextView display = (TextView) findViewById(R.id.display);
		if(displayValue == "0")
			displayValue = "4";
		else {
			displayValue = display.getText().toString();
			displayValue += "4";
		}
		display.setText(displayValue);
	}
	public void send_5(View view) {
		TextView display = (TextView) findViewById(R.id.display);
		if(displayValue == "0")
			displayValue = "5";
		else {
			displayValue = display.getText().toString();
			displayValue += "5";
		}
		display.setText(displayValue);
	}
	public void send_6(View view) {
		TextView display = (TextView) findViewById(R.id.display);
		if(displayValue == "0")
			displayValue = "6";
		else {
			displayValue = display.getText().toString();
			displayValue += "6";
		}
		display.setText(displayValue);
	}
	public void send_sub(View view) {
		TextView display = (TextView) findViewById(R.id.display);
		operand1 = display.getText().toString();
		operation = "-";
		displayValue = "0";
	}
	
	//fifth row of buttons
	public void send_1(View view) {
		TextView display = (TextView) findViewById(R.id.display);
		if(displayValue == "0")
			displayValue = "1";
		else {
			displayValue = display.getText().toString();
			displayValue += "1";
		}
		display.setText(displayValue);
	}
	public void send_2(View view) {
		TextView display = (TextView) findViewById(R.id.display);
		if(displayValue == "0")
			displayValue = "2";
		else {
			displayValue = display.getText().toString();
			displayValue += "2";
		}
		display.setText(displayValue);
	}
	public void send_3(View view) {
		TextView display = (TextView) findViewById(R.id.display);
		if(displayValue == "0")
			displayValue = "3";
		else {
			displayValue = display.getText().toString();
			displayValue += "3";
		}
		display.setText(displayValue);
	}
	public void send_add(View view) {
		TextView display = (TextView) findViewById(R.id.display);
		operand1 = display.getText().toString();
		operation = "+";
		displayValue = "0";
	}
	
	//sixth row of buttons
	public void send_0(View view) {
		TextView display = (TextView) findViewById(R.id.display);
		displayValue = display.getText().toString();
		displayValue += "0";
		display.setText(displayValue);
	}
	public void send_decimal(View view) {
		TextView display = (TextView) findViewById(R.id.display);
		displayValue = display.getText().toString();
		displayValue += ".";
		display.setText(displayValue);
	}
	public void send_plusminus(View view) {
		TextView display = (TextView) findViewById(R.id.display);
		displayValue = display.getText().toString();
		displayValue += "+/-";
		display.setText(displayValue);
	}
	public void send_equal(View view) {
		TextView display = (TextView) findViewById(R.id.display);
		operand2 = display.getText().toString();
		if(operation == "+") {
			solutionDouble = Double.parseDouble(operand1) + Double.parseDouble(operand2);
		}
		else if(operation == "-") {
			solutionDouble = Double.parseDouble(operand1) - Double.parseDouble(operand2);
		}
		else if(operation == "*") {
			solutionDouble = Double.parseDouble(operand1) * Double.parseDouble(operand2);
		}
		else if(operation == "/") {
			solutionDouble = Double.parseDouble(operand1) / Double.parseDouble(operand2);
		}
		solutionString = String.valueOf(solutionDouble);
		display.setText(solutionString);
		operand1 = solutionString;
		displayValue = "0";
	}
	

}





/*
if(curRadioButton == "bin_button") {
	//convert do decimal and back
	int binValue1 = 0;
	int binValue2 = 0;
	int binSolution = 0;
	for(int i = 0; i < operand1.length(); i ++) {
		binValue1 += (int)Math.pow((Double.parseDouble(Character.toString(operand1.charAt(operand1.length()-1-i)))*2), i);
	}
	for(int i = 0; i < operand2.length(); i ++) {
		binValue1 += (int)Math.pow((Double.parseDouble(Character.toString(operand2.charAt(operand2.length()-1-i)))*2), i);
	}
	binSolution = binValue1 + binValue2;
	
	for(int i = 0; i < 16; i++){
		
	}
	
}
else if(curRadioButton == "oct_button") {
	
}
else if(curRadioButton == "dec_button") {
	
}
else if(curRadioButton == "hex_button") {
	
}*/
