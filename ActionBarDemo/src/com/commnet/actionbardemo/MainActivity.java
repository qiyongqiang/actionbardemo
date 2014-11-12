package com.commnet.actionbardemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends Activity {

	TextView textview1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		String name="dd";
		textview1 = (TextView)findViewById(android.R.id.text1);
		textview1.setText("dd");
	}
}
