package com.example.onetwosale;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.MotionEvent;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
	}

	@Override
	public boolean onTouchEvent(MotionEvent event) {
		// TODO Auto-generated method stub
		
		switch (event.getAction()) {
		case MotionEvent.ACTION_DOWN:
			Log.i("MainActivity", ""+"ACTION_DOWN");
			Intent in = new Intent();
			in.setClass(MainActivity.this, LoginActivity.class);
			startActivity(in);
			break;
		case MotionEvent.ACTION_OUTSIDE:
			Log.i("MainActivity", ""+"ACTION_OUTSIDE");
			
			break;
		case MotionEvent.ACTION_UP:
			Log.i("MainActivity", ""+"ACTION_UP");
			break;
		case MotionEvent.ACTION_SCROLL:
			Log.i("MainActivity", ""+"ACTION_SCROLL");
			break;

		default:
			break;
		}
		return super.onTouchEvent(event);
	}

	
	
}
