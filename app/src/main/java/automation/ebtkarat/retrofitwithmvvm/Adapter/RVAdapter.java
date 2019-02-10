package automation.ebtkarat.retrofitwithmvvm.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

import automation.ebtkarat.retrofitwithmvvm.Model.Hero;
import automation.ebtkarat.retrofitwithmvvm.R;

/**
 * Created by Antnna on 08-Feb-19.
 */

public class RVAdapter extends RecyclerView.Adapter<RVAdapter.RVGroup> {
    Context _ctx;
    List<Hero>heroList;

    public RVAdapter(Context _ctx, List<Hero> heroList) {
        this._ctx = _ctx;
        this.heroList = heroList;
    }

    @NonNull
    @Override
    public RVGroup onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view= LayoutInflater.from(_ctx).inflate(R.layout.rv_item,viewGroup,false);
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RVGroup rvGroup, int i) {
            Hero hero=heroList.get(i);
            rvGroup.textView.setText(hero.getName());
        Glide.with(_ctx).load(hero.getImageURL()).into(rvGroup.imageView);
    }

    @Override
    public int getItemCount() {
        return heroList.size();
    }

    public class RVGroup extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView;
        public RVGroup(View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.image);
            textView=itemView.findViewById(R.id.text);
        }
    }
}
