package automation.ebtkarat.retrofitwithmvvm.ViewModel;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

import java.util.List;

import automation.ebtkarat.retrofitwithmvvm.Model.Hero;
import automation.ebtkarat.retrofitwithmvvm.Network.RetrofitAPI;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Antnna on 08-Feb-19.
 */

public class HerosViewModel extends ViewModel {
        private MutableLiveData<List<Hero>>heroList;
        public LiveData<List<Hero>>getHeros(){
            if(heroList==null){
                heroList=new MutableLiveData<>();
                loadHeros();
            }
            return heroList;
        }
        private void loadHeros(){
            Retrofit retrofit=new Retrofit.Builder()
                    .baseUrl(RetrofitAPI.BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
            RetrofitAPI api=retrofit.create(RetrofitAPI.class);
            Call<List<Hero>>listCall=api.getHeros();
            listCall.enqueue(new Callback<List<Hero>>() {
                @Override
                public void onResponse(Call<List<Hero>> call, Response<List<Hero>> response) {
                    heroList.setValue(response.body());
                }

                @Override
                public void onFailure(Call<List<Hero>> call, Throwable t) {

                }
            });
        }

}
