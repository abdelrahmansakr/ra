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

public class HomeActivity extends Activity {
	
	GridView grid;
	  String[] web = {
	        "Restaurants & Cafes",
	      "Education",
	      "Books",
	      "Furniture"};
	  int[] imageId = {
		      R.drawable.image1,
		      R.drawable.image2,
		      R.drawable.image3,
		      R.drawable.image4,};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home);
		
		CustomGrid adapter = new CustomGrid(HomeActivity.this, web, imageId);
	    grid=(GridView)findViewById(R.id.gridView1);
	    grid.setAdapter(adapter);
	    grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
	        @Override
	        public void onItemClick(AdapterView<?> parent, View view,
	                int position, long id) {
	            if(web[+ position].equals("Restaurants & Cafes")){
	            	Intent intent = new Intent(HomeActivity.this, RestaurantsAndCafesActivity.class);
	              	startActivity(intent);
	            } 
	            else {
	            Toast.makeText(HomeActivity.this, "You Clicked at " +web[+ position], Toast.LENGTH_SHORT).show();
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

}
