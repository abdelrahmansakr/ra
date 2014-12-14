package com.example.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class ProfileActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_profile);
	}
	
	public boolean onCreateOptionsMenu(Menu menu) {
	    // Inflate the menu items for use in the action bar
	    MenuInflater inflater = getMenuInflater();
	    inflater.inflate(R.menu.main_activity_actions, menu);
	    return super.onCreateOptionsMenu(menu);
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
	    // Handle presses on the action bar items
	    switch (item.getItemId()) {
	        case R.id.action_homepage:
	            openHomePage();
	            return true;
	            
	        case R.id.action_social_notifications:
	        	openNotifications();
	        	return true;
	        	
	        case R.id.action_settings:
	        	openSettings();
	        	return true;	        	
	            
	        default:
	            return super.onOptionsItemSelected(item);
	    }
	}

	private void openHomePage() {
		Intent intent = new Intent(this, HomeActivity.class);
  		startActivity(intent);		
	}
	
	private void openSettings() {
		Intent intent = new Intent(this, SettingsActivity.class);
  		startActivity(intent);		
	}	
	
	private void openNotifications() {
		Intent intent = new Intent(this, NotificationsActivity.class);
  		startActivity(intent);		
	}	
}
