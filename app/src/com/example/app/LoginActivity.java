package com.example.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends Activity {
	
	private EditText email=null;
	private EditText password=null;
	private Button login;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
		
	      email = (EditText)findViewById(R.id.inputEmail);
	      password = (EditText)findViewById(R.id.inputPassword);
	      login = (Button)findViewById(R.id.button1);
	}
	
//	public boolean onCreateOptionsMenu(Menu menu) {
//	    // Inflate the menu items for use in the action bar
//	    MenuInflater inflater = getMenuInflater();
//	    inflater.inflate(R.menu.main_activity_actions, menu);
//	    return super.onCreateOptionsMenu(menu);
//	}
	
	public void goToHome(View v) {
		if(email.getText().toString().isEmpty() || password.getText().toString().isEmpty()) {
  		      Toast.makeText(getApplicationContext(), 
  		    		 "Please Enter your Email and Password to be able to login", 
  		    		 Toast.LENGTH_SHORT).show();
  		}	
  		else{
  			Intent intent = new Intent(this, HomeActivity.class);
  		    startActivity(intent);
  		}
	}
}
