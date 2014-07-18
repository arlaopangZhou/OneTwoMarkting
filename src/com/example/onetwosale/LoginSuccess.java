package com.example.onetwosale;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.provider.ContactsContract.CommonDataKinds.Event;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.WindowManager.LayoutParams;
import android.widget.Button;
import android.widget.PopupWindow;

public class LoginSuccess extends Activity implements OnClickListener{

	View view;
	View view1;
	View view2;
	Button bu1;
	Button bu2;
	Button bu3;
	Button bu4;
	Button bu5;
	Button bu6;
	PopupWindow popupWindow;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.login_success);
		bu1 = (Button) findViewById(R.id.button1);
		bu2 = (Button) findViewById(R.id.button2);
		bu3 = (Button) findViewById(R.id.button3);
		bu4 = (Button) findViewById(R.id.button4);
		bu5 = (Button) findViewById(R.id.button5);
		bu6 = (Button) findViewById(R.id.button6);
		bu1.setOnClickListener(this);
		bu2.setOnClickListener(this);
		bu3.setOnClickListener(this);
		bu4.setOnClickListener(this);
		bu5.setOnClickListener(this);
		bu6.setOnClickListener(this);
		LayoutInflater inflater = LayoutInflater.from(this);
		view = inflater.inflate(R.layout.detail_info, null);
		view1 = inflater.inflate(R.layout.tese, null);
		view2 = inflater.inflate(R.layout.jieshao, null);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.button1:
//			Intent intent = new Intent();
//			intent.setClass(LoginSuccess.this, DetailInfo.class);
//			startActivity(intent);
			popupWindow = new PopupWindow(view, 500, 700, false);
			popupWindow.setBackgroundDrawable(new BitmapDrawable());
			popupWindow.setOutsideTouchable(true);
			popupWindow.showAtLocation(v, Gravity.CENTER, 0, 20);
			break;
		case R.id.button2:
			popupWindow = new PopupWindow(view1, 500, 700, false);
			popupWindow.setBackgroundDrawable(new BitmapDrawable());
			popupWindow.setOutsideTouchable(true);
			popupWindow.showAtLocation(v, Gravity.CENTER, 0, 20);
			break;
		case R.id.button3:
			popupWindow = new PopupWindow(view2, 500, 700, false);
			popupWindow.setBackgroundDrawable(new BitmapDrawable());
			popupWindow.setOutsideTouchable(true);
			popupWindow.showAtLocation(v, Gravity.CENTER, 0, 20);
			break;
		case R.id.button4:
			
			break;
		case R.id.button5:
			
			break;
		case R.id.button6:
			
			break;

		default:
			break;
		}
	}
	
	
	
}
