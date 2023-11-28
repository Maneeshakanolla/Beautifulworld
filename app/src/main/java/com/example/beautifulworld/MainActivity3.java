package com.example.beautifulworld;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity3 extends AppCompatActivity {
    TextView textView;

    MycostumAdapter1 mycostumAdapter1;
    RecyclerView recyclerView1;

    List<RowModelList1>  rowModelList1;
    StaggeredGridLayoutManager manager;

    int[] images=new int[]{
            R.drawable.flite1,
            R.drawable.hotel,
            R.drawable.adventure,
            R.drawable.flite1



    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        textView=findViewById(R.id.startTour);

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity4.class);
                startActivity(intent);

            }
        });


        recyclerView1 = findViewById(R.id.recyclerview1);
        rowModelList1 = new ArrayList<>();
        mycostumAdapter1 = new MycostumAdapter1(this, rowModelList1);
        manager = new StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.VERTICAL);
        //manager1=new GridLayoutManager(this,2);
        recyclerView1.setLayoutManager(manager);
        recyclerView1.setAdapter(mycostumAdapter1);
        InitializeData();


    }

    private void InitializeData(){

        RowModelList1 rowModel = new RowModelList1(images[0],"Tickets","Make your Booking");
        rowModelList1.add(rowModel);

        RowModelList1 rowModel1 = new RowModelList1(images[1],"Hotel","The ideal hotel at a Great Price ");
        rowModelList1.add(rowModel1);

        RowModelList1 rowModel2 = new RowModelList1(images[2],"Adventure","Find books tours, adventures,Activities");
        rowModelList1.add(rowModel2);

        RowModelList1 rowModel3 = new RowModelList1(images[3],"Tickets","Make your Booking");
        rowModelList1.add(rowModel3);



        mycostumAdapter1.notifyDataSetChanged();
    }



}