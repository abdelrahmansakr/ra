package com.example.app;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends Activity {
	
	private Button loginpage;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		loginpage = (Button)findViewById(R.id.button3);
		
//		ActionBar actionBar = getActionBar();
//		actionBar.setTitle("Raسَّee");
	}
	
//	@Override
//	public boolean onCreateOptionsMenu(Menu menu) {
//	    // Inflate the menu items for use in the action bar
//	    MenuInflater inflater = getMenuInflater();
//	    inflater.inflate(R.menu.main_activity_actions, menu);
//	    return super.onCreateOptionsMenu(menu);
//	}
	
//	@Override
//	public boolean onOptionsItemSelected(MenuItem item) {
//	    // Handle presses on the action bar items
//	    switch (item.getItemId()) {
//	        case R.id.action_search:
//	           // openSearch();
//	            return true;
//	        case R.id.action_settings:
//	            //openSettings();
//	            return true;
//	        default:
//	            return super.onOptionsItemSelected(item);
//	    }
//	}
	
	public void goToLoginPage(View v) {
		Intent intent = new Intent(this, LoginActivity.class);
		startActivity(intent);
	}
	
	public void goToSignupPage(View v) {
		Intent intent = new Intent(this, SignupActivity.class);
		startActivity(intent);		
	}
}
