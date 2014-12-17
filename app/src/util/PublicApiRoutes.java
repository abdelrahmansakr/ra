package util;

import java.util.List;

import model.User;
import retrofit.Callback;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.GET;
import retrofit.http.POST;
import retrofit.http.Path;

public interface PublicApiRoutes {
	
	@GET("/users/{user_id}")
	void getUser(@Path("user_id") long user_id, Callback<User> callback);

}