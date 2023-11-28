package com.example.beautifulworld;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity4 extends AppCompatActivity {

    MyCostumAdapter myCostumAdapter;
    RecyclerView recyclerView;
    List<RowModelList> rowModelList;
    StaggeredGridLayoutManager manager;

    int[] images=new int[]{
            R.drawable.flite1,
            R.drawable.hotel,
            R.drawable.mountain1,
            R.drawable.lakes,


    };
    private void InitializeData(){

        RowModelList rowModel = new RowModelList(images[0],"AirPort","Begum-pet");
        rowModelList.add(rowModel);

        RowModelList rowModel1 = new RowModelList(images[1],"Hotel","Hyderabad");
        rowModelList.add(rowModel1);

        RowModelList rowModel2 = new RowModelList(images[2],"Mountain1","Nepal");
        rowModelList.add(rowModel2);

        RowModelList rowModel3 = new RowModelList(images[3],"lake","Vijayawada");
        rowModelList.add(rowModel3);

        myCostumAdapter.notifyDataSetChanged();


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        recyclerView = findViewById(R.id.recyclerview);
        rowModelList= new ArrayList<>();
        myCostumAdapter= new MyCostumAdapter(this, rowModelList);
        manager = new StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.HORIZONTAL);
        //manager1=new GridLayoutManager(this,2);
        recyclerView.setLayoutManager(manager);
        recyclerView.setAdapter(myCostumAdapter);
        InitializeData();
    }
}