package automation.ebtkarat.retrofitwithmvvm.View;

import android.arch.lifecycle.Observer;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.List;

import automation.ebtkarat.retrofitwithmvvm.Adapter.RVAdapter;
import automation.ebtkarat.retrofitwithmvvm.Model.Hero;
import automation.ebtkarat.retrofitwithmvvm.R;
import automation.ebtkarat.retrofitwithmvvm.ViewModel.HerosViewModel;

public class MainActivity extends AppCompatActivity {

    RecyclerView rv;
    RVAdapter rvAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        __init__();
    }
    private void __init__(){
        rv=findViewById(R.id.rv);
        rv.setHasFixedSize(true);
        rv.setLayoutManager(new LinearLayoutManager(this));
        loadData();
    }

    private void loadData() {
        HerosViewModel herosViewModel=new HerosViewModel();
        herosViewModel.getHeros().observe(this, new Observer<List<Hero>>() {
            @Override
            public void onChanged(@Nullable List<Hero> heroes) {
                rvAdapter=new RVAdapter(MainActivity.this,heroes);
                rv.setAdapter(rvAdapter);
            }
        });
    }
}
