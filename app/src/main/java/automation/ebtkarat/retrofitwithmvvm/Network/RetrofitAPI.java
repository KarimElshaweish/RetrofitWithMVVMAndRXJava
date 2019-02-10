package automation.ebtkarat.retrofitwithmvvm.Network;

import java.util.List;

import automation.ebtkarat.retrofitwithmvvm.Model.Hero;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Antnna on 08-Feb-19.
 */

public interface RetrofitAPI {
    String BASE_URL = "https://simplifiedcoding.net/demos/";
    @GET("marvel")
    Call<List<Hero>>getHeros();
}
