package com.example.app;

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

public class ProfileActivity extends TabActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_profile);
		
		TabHost tabHost = getTabHost();
        
        // Tab for NewsFeed
        TabSpec newsfeedspec = tabHost.newTabSpec("NewsFeed");
        // setting Title and Icon for the Tab
        newsfeedspec.setIndicator("NewsFeed", getResources().getDrawable(R.drawable.orange_grey));
        Intent newsFeedIntent = new Intent(this, NewsFeedActivity.class);
        newsfeedspec.setContent(newsFeedIntent);
         
        // Tab for Friends
        TabSpec friendsspec = tabHost.newTabSpec("Friends");        
        friendsspec.setIndicator("Friends", getResources().getDrawable(R.drawable.orange_grey));
        Intent friendsIntent = new Intent(this, FriendsActivity.class);
        friendsspec.setContent(friendsIntent);
         
        // Tab for Favourites
        TabSpec favouritesspec = tabHost.newTabSpec("Favourites");
        favouritesspec.setIndicator("Favourites", getResources().getDrawable(R.drawable.orange_grey));
        Intent favouritesIntent = new Intent(this, FavouritesActivity.class);
        favouritesspec.setContent(favouritesIntent);
         
        // Adding all TabSpec to TabHost
        tabHost.addTab(newsfeedspec); // Adding NewsFeed tab
        tabHost.addTab(friendsspec); // Adding Friends tab
        tabHost.addTab(favouritesspec); // Adding Favourites tab
        
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
}
