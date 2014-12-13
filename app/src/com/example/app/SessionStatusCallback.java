package com.example.app;

import android.util.Log;

import com.facebook.Request;
import com.facebook.Response;
import com.facebook.Session;
import com.facebook.Session.StatusCallback;
import com.facebook.SessionState;
import com.facebook.model.GraphUser;

public class SessionStatusCallback implements StatusCallback {
	
	 String fbAccessToken;

//    @Override
//    public void call(Session session, SessionState state, Exception exception) {
//            // Respond to session state changes, ex: updating the view
//    }
	
    @SuppressWarnings("deprecation")
	@Override
    public void call(Session session, SessionState state, Exception exception) {
        updateView();
        if (session.isOpened()) {
            fbAccessToken = session.getAccessToken();
            // make request to get facebook user info
            Request.executeMeRequestAsync(session, new Request.GraphUserCallback() {
                @Override
                public void onCompleted(GraphUser user, Response response) {
                    Log.i("fb", "fb user: "+ user.toString());

                    String fbAccessToken = "";
                    String fbId = user.getId();
                    fbAccessToken = fbAccessToken;
                    String fbName = user.getName();
                    String gender = user.asMap().get("gender").toString();
                    String email = user.asMap().get("email").toString();

                    Object userProfile;
					//Log.i("fb", userProfile.getEmail());
                    
                    System.out.println("=======!!!!!!!!!!!!!!=========");
                    System.out.println("=======!!!!!!!!!!!!!!=========");
                    System.out.println("=======SessionStatusCallback=========");
                    System.out.println("=======!!!!!!!!!!!!!!=========");
                    System.out.println("=======!!!!!!!!!!!!!!=========");
                }
            });
        }
    }

	private void updateView() {
		// TODO Auto-generated method stub
		
	}

}
