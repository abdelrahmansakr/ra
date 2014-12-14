package com.example.app;

import android.app.TabActivity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;
import android.widget.TabWidget;

public class SettingsActivity extends TabActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tab_layout);
		
        TabHost tabHost = getTabHost();
        
        // Tab for Profile Settings
        TabSpec profileSettingsSpec = tabHost.newTabSpec("Profile");
        // setting Title and Icon for the Tab
        profileSettingsSpec.setIndicator("Profile");
        //photospec.setIndicator("Photos", getResources().getDrawable(R.drawable.icon_photos_tab));
        Intent photosIntent = new Intent(this, ProfileSettingsActivity.class);
        profileSettingsSpec.setContent(photosIntent);
         
        // Tab for Account Settings
        TabSpec accountSettingsSpec = tabHost.newTabSpec("Account");   
        accountSettingsSpec.setIndicator("Account");
        //songspec.setIndicator("Songs", getResources().getDrawable(R.drawable.icon_songs_tab));
        Intent songsIntent = new Intent(this, AccountSettingsActivity.class);
        accountSettingsSpec.setContent(songsIntent);
        
        // Adding all TabSpec to TabHost
        tabHost.addTab(profileSettingsSpec); // Adding photos tab
        tabHost.addTab(accountSettingsSpec); // Adding songs tab
        
        TabWidget tw = getTabWidget(); 

        for (int i = 0; i < tw.getChildCount(); i++) { 
                    View v = tw.getChildAt(i); 
                    v.setBackgroundDrawable(getResources().getDrawable (R.drawable.tabindicator)); 
        }

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
	        case R.id.action_profile:
	            openProfile();
	            return true;
	         
	        case R.id.action_social_notifications:
	        	openNotifications();
	        	return true;
	        	
	        case R.id.action_homepage:
	        	openHomePage();
	        	return true;
	        	
	        default:
	            return super.onOptionsItemSelected(item);
	    }
	}

	private void openHomePage() {
		Intent intent = new Intent(this, HomeActivity.class);
  		startActivity(intent);		
	}

	private void openNotifications() {
		Intent intent = new Intent(this, NotificationsActivity.class);
  		startActivity(intent);		
	}

	private void openProfile() {
		Intent intent = new Intent(this, ProfileActivity.class);
  		startActivity(intent);
	}
	
}
