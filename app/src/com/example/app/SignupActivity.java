package com.example.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class SignupActivity extends Activity {
	
	private EditText email=null;
	private EditText password=null;
	private EditText confirmedPassword=null;
	private EditText username=null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_signup);
		
	      email = (EditText)findViewById(R.id.inputMail);
	      password = (EditText)findViewById(R.id.inputPassword);
	      confirmedPassword = (EditText)findViewById(R.id.inputConfirmedPassword);
	      username = (EditText)findViewById(R.id.inputUsername);
	}
	
	public void goToHome(View v) {
		if(email.getText().toString().isEmpty() || password.getText().toString().isEmpty() || 
				confirmedPassword.getText().toString().isEmpty() || 
				username.getText().toString().isEmpty()) {
  		      Toast.makeText(getApplicationContext(), 
  		    		 "Username, Email, Password and confrim Password fields can not be Empty !!", 
  		    		 Toast.LENGTH_SHORT).show();
  		}	
  		else{
  			Intent intent = new Intent(this, HomeActivity.class);
  		    startActivity(intent);
  		}
	}
}
