package com.example.beautifulworld;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity2 extends AppCompatActivity {

    MyCostumAdapter myCostumAdapter;
    RecyclerView recyclerView ;
    List<RowModelList> rowModelList;
    StaggeredGridLayoutManager manager;

    ImageView imageView;
    TextView textView;
    Button button;


    int[] images=new int[]{
            R.drawable.mountain,
            R.drawable.mountain1,
            R.drawable.hotel,
            R.drawable.adventure,


    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        imageView=findViewById(R.id.rightarrow);
        button=findViewById((R.id.search));


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(getApplicationContext(),MainActivity3.class);
            }
        });

        recyclerView = findViewById(R.id.recyclerview);
        rowModelList = new ArrayList<>();
        myCostumAdapter = new MyCostumAdapter(this, rowModelList);
        manager = new StaggeredGridLayoutManager(0,StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(manager);
        recyclerView.setAdapter(myCostumAdapter);
        InitializeData();

    }

    private void InitializeData(){

        RowModelList rowModel = new RowModelList(images[0],"Mountain","Nepal");
        rowModelList.add(rowModel);

        RowModelList rowModel1 = new RowModelList(images[1],"lake","hyd");
        rowModelList.add(rowModel1);

        RowModelList rowModel2 = new RowModelList(images[2],"Hotel","hyd");
        rowModelList.add(rowModel2);

        RowModelList rowModel3 = new RowModelList(images[3],"cauli","abc");
        rowModelList.add(rowModel3);

        myCostumAdapter.notifyDataSetChanged();


    }

}