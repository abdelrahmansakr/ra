package com.example.app;

import android.app.ActionBar;
import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;
import android.widget.TabWidget;

public class SubcategoryActivity extends TabActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_subcategory);
		
		ActionBar actionBar = getActionBar();
		actionBar.setTitle("Chili's");
		
TabHost tabHost = getTabHost();
        
        // Tab for Reviews
        TabSpec Reviewsspec = tabHost.newTabSpec("Reviews");
        // setting Title and Icon for the Tab
        Reviewsspec.setIndicator("Reviews", getResources().getDrawable(R.drawable.orange_grey));
        Intent ReviewsIntent = new Intent(this, ReviewsActivity.class);
        Reviewsspec.setContent(ReviewsIntent);
         
        // Tab for Likers
        TabSpec Likersspec = tabHost.newTabSpec("Likers");        
        Likersspec.setIndicator("Likers", getResources().getDrawable(R.drawable.orange_grey));
        Intent LikersIntent = new Intent(this, LikersActivity.class);
        Likersspec.setContent(LikersIntent);
         
        // Tab for Events
        TabSpec Eventsspec = tabHost.newTabSpec("Events");
        Eventsspec.setIndicator("Events", getResources().getDrawable(R.drawable.orange_grey));
        Intent EventsIntent = new Intent(this, EventsActivity.class);
        Eventsspec.setContent(EventsIntent);
         
        // Adding all TabSpec to TabHost
        tabHost.addTab(Reviewsspec); // Adding Reviews tab
        tabHost.addTab(Likersspec); // Adding Likers tab
        tabHost.addTab(Eventsspec); // Adding Events tab
        
        TabWidget tw = getTabWidget();
        
        for (int i = 0; i < tw.getChildCount(); i++) {
			View v = tw.getChildAt(i);
			v.setBackgroundDrawable(getResources().getDrawable(R.drawable.orange_grey));
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
	        case R.id.action_homepage:
	            openHomePage();
	            return true;
	            
	        case R.id.action_social_notifications:
	        	openNotifications();
	        	return true;
	        	
	        case R.id.action_profile:
	        	openProfile();
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
	
	private void openNotifications() {
		Intent intent = new Intent(this, NotificationsActivity.class);
  		startActivity(intent);		
	}
	
	private void openProfile() {
		Intent intent = new Intent(this, ProfileActivity.class);
  		startActivity(intent);		
	}
	
	
	private void openSettings() {
//		Intent intent = new Intent(this, SettingsActivity.class);
//  		startActivity(intent);		
	}
}
