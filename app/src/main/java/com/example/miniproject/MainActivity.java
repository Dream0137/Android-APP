package com.example.miniproject;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import Adapter.ProductAdapter;
import Model.Product;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ProductAdapter productAdapter;
    List<Product> productList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Initialize the product list
        productList = new ArrayList<>();
        productList.add(new Product("iPhone 16 Pro Max", "Gadgets", 43900, "https://phonetechx.com/wp-content/uploads/2022/09/iPhone-16-Pro-Max.jpg"));
        productList.add(new Product("Samsung Galaxy S24 FE", "Gadgets", 22900, "https://phonetechx.com/wp-content/uploads/2022/07/Samsung-Galaxy-S24-FE.jpg"));

        productAdapter = new ProductAdapter(this, productList);
        recyclerView.setAdapter(productAdapter);
    }
}
