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

public class MycostumAdapter1 extends RecyclerView.Adapter<MycostumAdapter1.MyViewHolder> {
    Context context;
    List<RowModelList1> rowModelList;
    public MycostumAdapter1(Context context, List<RowModelList1> rowModelList) {
        this.context = context;
        this.rowModelList = rowModelList;
    }
    @NonNull
    @Override
    public MycostumAdapter1.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.itemlist2,parent,false);
        return new MycostumAdapter1.MyViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull MycostumAdapter1.MyViewHolder holder, int position) {
        Glide.with(context).load(rowModelList.get(position).getImageView()).into(holder.imageView);
        holder.textView.setText(rowModelList.get(position).getTickets());
        holder.textview1.setText(rowModelList.get(position).getTextContent());
    }
    @Override
    public int getItemCount() {
        return rowModelList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        ImageView imageView;
        TextView textView ,textview1;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.flite);
            textView= itemView.findViewById(R.id.tickets);
            textview1=itemView.findViewById(R.id.textcontent);
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
