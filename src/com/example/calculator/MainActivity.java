package com.example.calculator;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

	String operand1;
	String operation;
	String operand2;
	String displayValue;
	int solutionInt = 0;
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
		TextView display_main = (TextView) findViewById(R.id.display_main);
		TextView display_secondary = (TextView) findViewById(R.id.display_secondary);
		Button bin_select = (Button) findViewById(R.id.bin_select);
		Button oct_select = (Button) findViewById(R.id.oct_select);
		Button dec_select = (Button) findViewById(R.id.dec_select);
		Button hex_select = (Button) findViewById(R.id.hex_select);
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
		Button mod_button = (Button) findViewById(R.id.mod_button);
		//width formatting
		display_secondary.setWidth(width-16);
		display_main.setWidth(width-16);
		bin_select.setWidth((width/4)-16);
		oct_select.setWidth((width/4)-16);
		dec_select.setWidth((width/4)-16);
		hex_select.setWidth((width/4)-16);
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
		equal_button.setWidth((width/4)-16);
		mod_button.setWidth((width/4)-16);
		//height formatting
		display_secondary.setHeight(((height)/9)-16);
		display_main.setHeight(((height)/9)-16);
		bin_select.setHeight((height/9)-16);
		oct_select.setHeight((height/9)-16);
		dec_select.setHeight((height/9)-16);
		hex_select.setHeight((height/9)-16);
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
		mod_button.setHeight((height/9)-16);
		//set defaults for radio buttons

		//required assignment for leading zero at onCreate()
		displayValue = "0";

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void bin_select(View view){
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
    	
    	
    	Resources res = getResources();
    	Drawable shape = res.getDrawable(R.drawable.button_background);

    	Button bin_select = (Button) findViewById(R.id.bin_select);
    	Button oct_select = (Button) findViewById(R.id.oct_select);
    	Button dec_select = (Button) findViewById(R.id.dec_select);
    	Button hex_select = (Button) findViewById(R.id.hex_select);
    	bin_select.setBackground(shape);
    	oct_select.setBackground(null);
    	dec_select.setBackground(null);
    	hex_select.setBackground(null);
	}
	public void oct_select(View view){
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
    	
    	Resources res = getResources();
    	Drawable shape = res.getDrawable(R.drawable.button_background);

    	Button bin_select = (Button) findViewById(R.id.bin_select);
    	Button oct_select = (Button) findViewById(R.id.oct_select);
    	Button dec_select = (Button) findViewById(R.id.dec_select);
    	Button hex_select = (Button) findViewById(R.id.hex_select);
    	bin_select.setBackground(null);
    	oct_select.setBackground(shape);
    	dec_select.setBackground(null);
    	hex_select.setBackground(null);
	}
	public void dec_select(View view){
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
    	
    	Resources res = getResources();
    	Drawable shape = res.getDrawable(R.drawable.button_background);

    	Button bin_select = (Button) findViewById(R.id.bin_select);
    	Button oct_select = (Button) findViewById(R.id.oct_select);
    	Button dec_select = (Button) findViewById(R.id.dec_select);
    	Button hex_select = (Button) findViewById(R.id.hex_select);
    	bin_select.setBackground(null);
    	oct_select.setBackground(null);
    	dec_select.setBackground(shape);
    	hex_select.setBackground(null);
	}
	public void hex_select(View view){
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
    	
    	Resources res = getResources();
    	Drawable shape = res.getDrawable(R.drawable.button_background);

    	Button bin_select = (Button) findViewById(R.id.bin_select);
    	Button oct_select = (Button) findViewById(R.id.oct_select);
    	Button dec_select = (Button) findViewById(R.id.dec_select);
    	Button hex_select = (Button) findViewById(R.id.hex_select);
    	bin_select.setBackground(null);
    	oct_select.setBackground(null);
    	dec_select.setBackground(null);
    	hex_select.setBackground(shape);
	}
	
		
	//first row of buttons
	public void send_d(View view) {
		TextView display_main = (TextView) findViewById(R.id.display_main);
		if(displayValue == "0")
			displayValue = "D";
		else {
			displayValue = display_main.getText().toString();
			displayValue += "D";
		}
		display_main.setText(displayValue);
	}
	public void send_e(View view) {
		TextView display_main = (TextView) findViewById(R.id.display_main);
		if(displayValue == "0")
			displayValue = "E";
		else {
			displayValue = display_main.getText().toString();
			displayValue += "E";
		}
		display_main.setText(displayValue);
	}
	public void send_f(View view) {
		TextView display_main = (TextView) findViewById(R.id.display_main);
		if(displayValue == "0")
			displayValue = "F";
		else {
			displayValue = display_main.getText().toString();
			displayValue += "F";
		}
		display_main.setText(displayValue);
	}
	public void send_clear(View view) {
		TextView display_main = (TextView) findViewById(R.id.display_main);
		displayValue = display_main.getText().toString();
		// TODO: fix to only adjust required values
		displayValue = "0";
		operand1 = "0";
		operand2 = "0";
		solutionInt = 0;
		solutionString = "0";
		display_main.setText(displayValue);
	}
	
	//second row of buttons
	public void send_a(View view) {
		TextView display_main = (TextView) findViewById(R.id.display_main);
		displayValue = display_main.getText().toString();
		displayValue += "A";
		display_main.setText(displayValue);
	}
	public void send_b(View view) {
		TextView display_main = (TextView) findViewById(R.id.display_main);
		displayValue = display_main.getText().toString();
		displayValue += "B";
		display_main.setText(displayValue);
	}
	public void send_c(View view) {
		TextView display_main = (TextView) findViewById(R.id.display_main);
		displayValue = display_main.getText().toString();
		displayValue += "C";
		display_main.setText(displayValue);
	}
	public void send_div(View view) {
		TextView display_main = (TextView) findViewById(R.id.display_main);
		operand1 = display_main.getText().toString();
		operation = "/";
		displayValue = "0";
	}
	
	//third row of buttons
	public void send_7(View view) {
		TextView display_main = (TextView) findViewById(R.id.display_main);
		if(displayValue == "0")
			displayValue = "7";
		else {
			displayValue = display_main.getText().toString();
			displayValue += "7";
		}
		display_main.setText(displayValue);
	}
	public void send_8(View view) {
		TextView display_main = (TextView) findViewById(R.id.display_main);
		if(displayValue == "0")
			displayValue = "8";
		else {
			displayValue = display_main.getText().toString();
			displayValue += "8";
		}
		display_main.setText(displayValue);
	}
	public void send_9(View view) {
		TextView display_main = (TextView) findViewById(R.id.display_main);
		if(displayValue == "0")
			displayValue = "9";
		else {
			displayValue = display_main.getText().toString();
			displayValue += "9";
		}
		display_main.setText(displayValue);
	}
	public void send_mult(View view) {
		TextView display_main = (TextView) findViewById(R.id.display_main);
		operand1 = display_main.getText().toString();
		operation = "*";
		displayValue = "0";
	}
	
	//fourth row of buttons
	public void send_4(View view) {
		TextView display_main = (TextView) findViewById(R.id.display_main);
		if(displayValue == "0")
			displayValue = "4";
		else {
			displayValue = display_main.getText().toString();
			displayValue += "4";
		}
		display_main.setText(displayValue);
	}
	public void send_5(View view) {
		TextView display_main = (TextView) findViewById(R.id.display_main);
		if(displayValue == "0")
			displayValue = "5";
		else {
			displayValue = display_main.getText().toString();
			displayValue += "5";
		}
		display_main.setText(displayValue);
	}
	public void send_6(View view) {
		TextView display_main = (TextView) findViewById(R.id.display_main);
		if(displayValue == "0")
			displayValue = "6";
		else {
			displayValue = display_main.getText().toString();
			displayValue += "6";
		}
		display_main.setText(displayValue);
	}
	public void send_sub(View view) {
		TextView display_main = (TextView) findViewById(R.id.display_main);
		operand1 = display_main.getText().toString();
		operation = "-";
		displayValue = "0";
	}
	
	//fifth row of buttons
	public void send_1(View view) {
		TextView display_main = (TextView) findViewById(R.id.display_main);
		if(displayValue == "0")
			displayValue = "1";
		else {
			displayValue = display_main.getText().toString();
			displayValue += "1";
		}
		display_main.setText(displayValue);
	}
	public void send_2(View view) {
		TextView display_main = (TextView) findViewById(R.id.display_main);
		if(displayValue == "0")
			displayValue = "2";
		else {
			displayValue = display_main.getText().toString();
			displayValue += "2";
		}
		display_main.setText(displayValue);
	}
	public void send_3(View view) {
		TextView display_main = (TextView) findViewById(R.id.display_main);
		if(displayValue == "0")
			displayValue = "3";
		else {
			displayValue = display_main.getText().toString();
			displayValue += "3";
		}
		display_main.setText(displayValue);
	}
	public void send_add(View view) {
		TextView display_main = (TextView) findViewById(R.id.display_main);
		operand1 = display_main.getText().toString();
		operation = "+";
		displayValue = "0";
	}
	
	//sixth row of buttons
	public void send_0(View view) {
		TextView display_main = (TextView) findViewById(R.id.display_main);
		displayValue = display_main.getText().toString();
		displayValue += "0";
		display_main.setText(displayValue);
	}
	public void send_plusminus(View view) {
		TextView display_main = (TextView) findViewById(R.id.display_main);
		displayValue = display_main.getText().toString();
		displayValue += "+/-";
		display_main.setText(displayValue);
	}
	public void send_equal(View view) {
		TextView display_main = (TextView) findViewById(R.id.display_main);
		operand2 = display_main.getText().toString();
		if(operation == "+") {
			solutionInt = Integer.parseInt(operand1) + Integer.parseInt(operand2);
		}
		else if(operation == "-") {
			solutionInt = Integer.parseInt(operand1) - Integer.parseInt(operand2);
		}
		else if(operation == "*") {
			solutionInt = Integer.parseInt(operand1) * Integer.parseInt(operand2);
		}
		else if(operation == "/") {
			solutionInt = Integer.parseInt(operand1) / Integer.parseInt(operand2);
		}
		else if(operation == "%") {
			solutionInt = Integer.parseInt(operand1) % Integer.parseInt(operand2);
		}
		solutionString = String.valueOf(solutionInt);
		display_main.setText(solutionString);
		operand1 = solutionString;
		displayValue = "0";
	}
	
	public void send_mod(View view) {
		TextView display_main = (TextView) findViewById(R.id.display_main);
		operand1 = display_main.getText().toString();
		operation = "%";
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
