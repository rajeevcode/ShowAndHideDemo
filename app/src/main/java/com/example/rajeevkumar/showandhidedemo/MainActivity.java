package com.example.rajeevkumar.showandhidedemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
	
	TextView textView;
	
	public void Show(View view){
	
		textView.setVisibility(View.VISIBLE);
		Log.i("Press Button", "Show");
		
	}
	
	public void Hide(View view){
		
		textView.setVisibility(View.GONE);
		Log.i("Press Button", "Hide");
	}

@Override
protected void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	setContentView(R.layout.activity_main);
	
	textView = findViewById(R.id.textView);
	
}
}
