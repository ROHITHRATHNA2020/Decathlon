package com.example.decathlon;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView recyclerView2;
    private ArrayList<Model> modelList = new ArrayList<>();
    private ArrayList<Model> modelList1 = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        initViewandListeners();
        buildRecyclerData();
        setRecyclerData();

    }

    private void setRecyclerData() {
        Adapter adapter = new Adapter(modelList);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(linearLayoutManager);
        Adapter adapter1 = new Adapter(modelList1);
        recyclerView2.setAdapter(adapter1);
        recyclerView2.setLayoutManager(linearLayoutManager);


    }

    private void buildRecyclerData() {
        modelList.add(new Model("Lowest Price", R.drawable.shoe, 599, 899, "PW 100 Walking Shoes for Men", 4.5 / 5));
        modelList.add(new Model("Lowest Price", R.drawable.pant, 799, 899, "PW 100 Walking Shoes for Men", 4.4 / 5));
        modelList.add(new Model("Lowest Price", R.drawable.racket, 699, 199, "PW 100 Walking Shoes for Men", 4.1 / 5));
        modelList.add(new Model("Lowest Price", R.drawable.shoe, 699, 999, "PW 100 Walking Shoes for Men", 4.3 / 5));
        modelList.add(new Model("Lowest Price", R.drawable.shoe, 599, 899, "PW 100 Walking Shoes for Men", 4.5 / 5));
        modelList.add(new Model("Lowest Price", R.drawable.pant, 799, 899, "PW 100 Walking Shoes for Men", 4.4 / 5));
        modelList.add(new Model("Lowest Price", R.drawable.racket, 699, 199, "PW 100 Walking Shoes for Men", 4.1 / 5));
        modelList.add(new Model("Lowest Price", R.drawable.shoe, 699, 999, "PW 100 Walking Shoes for Men", 4.3 / 5));
        modelList.add(new Model("Lowest Price", R.drawable.shoe, 599, 899, "PW 100 Walking Shoes for Men", 4.5 / 5));
        modelList.add(new Model("Lowest Price", R.drawable.pant, 799, 899, "PW 100 Walking Shoes for Men", 4.4 / 5));
        modelList.add(new Model("Lowest Price", R.drawable.racket, 699, 199, "PW 100 Walking Shoes for Men", 4.1 / 5));
        modelList.add(new Model("Lowest Price", R.drawable.shoe, 699, 999, "PW 100 Walking Shoes for Men", 4.3 / 5));
        modelList.add(new Model("Lowest Price", R.drawable.shoe, 599, 899, "PW 100 Walking Shoes for Men", 4.5 / 5));
        modelList.add(new Model("Lowest Price", R.drawable.pant, 799, 899, "PW 100 Walking Shoes for Men", 4.4 / 5));
        modelList.add(new Model("Lowest Price", R.drawable.racket, 699, 199, "PW 100 Walking Shoes for Men", 4.1 / 5));
        modelList.add(new Model("Lowest Price", R.drawable.shoe, 699, 999, "PW 100 Walking Shoes for Men", 4.3 / 5));
        modelList1.add(new Model("Lowest Price", R.drawable.shoe, 699, 999, "PW 100 Walking Shoes for Men", 4.3 / 5));
        modelList1.add(new Model("Lowest Price", R.drawable.shoe, 599, 899, "PW 100 Walking Shoes for Men", 4.5 / 5));
        modelList1.add(new Model("Lowest Price", R.drawable.pant, 799, 899, "PW 100 Walking Shoes for Men", 4.4 / 5));
        modelList1.add(new Model("Lowest Price", R.drawable.racket, 699, 199, "PW 100 Walking Shoes for Men", 4.1 / 5));
        modelList1.add(new Model("Lowest Price", R.drawable.shoe, 699, 999, "PW 100 Walking Shoes for Men", 4.3 / 5));


    }

    private void initViewandListeners() {
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView2 = findViewById(R.id.recyclerView2);
    }


}