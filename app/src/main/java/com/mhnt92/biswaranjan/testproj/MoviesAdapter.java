package com.mhnt92.biswaranjan.testproj;

import android.graphics.Movie;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by MAUTO0C243 on 17-07-2017.
 */

class MoviesAdapter extends RecyclerView.Adapter<MoviesAdapter.MyViewHolder> {

    private List<AdapterData> dataList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title, time, description;
        public ImageView thumbnail;

        public MyViewHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.title);
            time = (TextView) view.findViewById(R.id.time);
            description = (TextView) view.findViewById(R.id.description);
            thumbnail=(ImageView) view.findViewById(R.id.thumbnail);
        }
    }


    public MoviesAdapter(List<AdapterData> dataList) {
        this.dataList = dataList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        AdapterData data = dataList.get(position);
        holder.title.setText(data.getTitle());
        holder.time.setText(data.getTime());
        holder.description.setText(data.getDescription());
        holder.thumbnail.setImageResource(data.getThumbnail());
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }
}