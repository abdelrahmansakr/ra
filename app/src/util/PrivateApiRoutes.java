package util;

import retrofit.Callback;
import retrofit.http.PATCH;
import retrofit.http.Path;

import com.squareup.okhttp.Response;


public interface PrivateApiRoutes {
	@PATCH("/products/{product_id}/buy")
	void patchProductBuy(@Path("product_id") long productId,
			Callback<retrofit.client.Response> callback);
}
