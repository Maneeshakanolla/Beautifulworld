package com.example.beautifulworld;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class MyCostumAdapter extends RecyclerView.Adapter<MyCostumAdapter.MyViewHolder> {
    Context context;
    List<RowModelList> rowModelList;

    public MyCostumAdapter(Context context, List<RowModelList> rowModelList) {
        this.context = context;
        this.rowModelList = rowModelList;
    }
    @NonNull
    @Override
    public MyCostumAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_list,parent,false);
        return new MyViewHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull MyCostumAdapter.MyViewHolder holder, int position) {
        Glide.with(context).load(rowModelList.get(position).getImageView()).into(holder.imageView);
        holder.textView.setText(rowModelList.get(position).getPlaces());
        holder.textView1.setText(rowModelList.get(position).getCity());
    }
    @Override
    public int getItemCount() {
        return rowModelList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        ImageView imageView;
        TextView textView,textView1;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            textView= itemView.findViewById(R.id.places);
            textView1=itemView.findViewById(R.id.cityname);
            itemView.setOnClickListener(this);

        }
        @Override
        public void onClick(View v) {
            if(getLayoutPosition() == 0){
                Toast.makeText(context,"you clicked First item", Toast.LENGTH_SHORT).show();
            }
        }
    }

}
