package com.example.lab8_and103_ph35175.View;
import com.example.lab8_and103_ph35175.databinding.ActivityMainBinding;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;

import com.example.lab8_and103_ph35175.Adapter.product_Adapter;
import com.example.lab8_and103_ph35175.Models.Product;
import com.example.lab8_and103_ph35175.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private ArrayList<Product> list = new ArrayList<>();
    private product_Adapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        list.add(new Product("1", "fruit", "Apple", "Fresh and juicy apple", 4.5, 2.99, R.drawable.anh));
        list.add(new Product("2", "fruit", "Banana", "Ripe banana", 4.2, 1.99, R.drawable.anh));
        list.add(new Product("3", "fruit", "Orange", "Sweet and tangy orange", 4.0, 3.49, R.drawable.anh));
        list.add(new Product("4", "fruit", "Grape", "Delicious grapes", 4.3, 4.99, R.drawable.anh));
        adapter = new product_Adapter(list, this);
        binding.rcvProduct.setLayoutManager(new GridLayoutManager(this, 2));
        binding.rcvProduct.setAdapter(adapter);
    }
}