package com.example.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class ProfileSettingsActivity extends Activity {
	
	private EditText oldPassword=null;
	private EditText confirmedPassword=null;
	private EditText newPassword=null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_profile_settings);
		
	    oldPassword = (EditText)findViewById(R.id.editText8);
	    newPassword = (EditText)findViewById(R.id.editText9);
	    confirmedPassword = (EditText)findViewById(R.id.editText10);
	}
	
	public void goToProfile(View v) {
		Intent intent = new Intent(this, ProfileActivity.class);
  		startActivity(intent);
	}
	
	public void goToLogin(View v) {
		if(oldPassword.getText().toString().isEmpty() || newPassword.getText().toString().isEmpty() || 
				confirmedPassword.getText().toString().isEmpty()) {
  		      Toast.makeText(getApplicationContext(), 
  		    		 "You must enter your old password as well as your new one and confirm it !!", 
  		    		 Toast.LENGTH_SHORT).show();
  		}
		else {
  			Intent intent = new Intent(this, LoginActivity.class);
  		    startActivity(intent);
		}
	}
}
