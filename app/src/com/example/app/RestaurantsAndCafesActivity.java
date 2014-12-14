package com.example.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class RestaurantsAndCafesActivity extends Activity {
	
	GridView grid;
	  String[] web = {
	        "Chilis",
	      "Crave",
	      "Spectra",
	      "Starbucks",
	      "Beanos",
	      "Costa",
	      "Chilis",
	      "Crave",
	      "Spectra",
	      "Starbucks",
	      "Beanos",
	      "Costa"};
	  int[] imageId = {
		      R.drawable.chilis,
		      R.drawable.crave,
		      R.drawable.spectra,
		      R.drawable.starbucks,
		      R.drawable.beanos,
		      R.drawable.costa,
		      R.drawable.image1,
		      R.drawable.image1,
		      R.drawable.image1,
		      R.drawable.image1,
		      R.drawable.image1,
		      R.drawable.image1};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_restaurants_and_cafes);
		
		MyCustomGrid adapter = new MyCustomGrid(RestaurantsAndCafesActivity.this, web, imageId);
	    grid=(GridView)findViewById(R.id.gridView1);
	    grid.setAdapter(adapter);
	    grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
	        @Override
	        public void onItemClick(AdapterView<?> parent, View view,
	                int position, long id) {
	            if(web[+ position].equals("Chilis")){
	            	Intent intent = new Intent(RestaurantsAndCafesActivity.this, SubcategoryActivity.class);
	              	startActivity(intent);
	            } 
	            else {
	            Toast.makeText(RestaurantsAndCafesActivity.this, "You Clicked at " +web[+ position], Toast.LENGTH_SHORT).show();
	            }
	        }
	    });
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

	private void openNotifications() {
		Intent intent = new Intent(this, NotificationsActivity.class);
		startActivity(intent);
	}

	private void openProfile() {
		Intent intent = new Intent(this, ProfileActivity.class);
  		startActivity(intent);
	}
	
	private void openHomePage() {
		Intent intent = new Intent(this, HomeActivity.class);
  		startActivity(intent);		
	}
}
