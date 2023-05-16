package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.example.myapplication.databinding.ActivityMainBinding;

import org.imaginativeworld.whynotimagecarousel.model.CarouselItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        slideresAdd();

        binding.recyclerViewId.setLayoutManager(new LinearLayoutManager(this));
        ArrayList<Modal> list = new ArrayList<>();
        list.add(new Modal(R.drawable.productimg,"Blog Title"));
        list.add(new Modal(R.drawable.productimg,"Blog Title"));
        list.add(new Modal(R.drawable.productimg,"Blog Title"));
        list.add(new Modal(R.drawable.productimg,"Blog Title"));
        list.add(new Modal(R.drawable.productimg,"Blog Title"));
        list.add(new Modal(R.drawable.productimg,"Blog Title"));

        MyAdapter myAdapter = new MyAdapter(list);
        binding.recyclerViewId.setAdapter(myAdapter);

    }
    private void slideresAdd() {
        binding.sliderId.addData(new CarouselItem("https://jssors8.azureedge.net/demos/image-slider/img/px-beach-daylight-fun-1430675-image.jpg","caption here"));
        binding.sliderId.addData(new CarouselItem("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTdUmK6fRPfPQIMyOxUOjiTnR2VYizvkkW-UxLhGoVJNobm5Id3fpRhsIGtPj3H06ujPb4&usqp=CAU","caption here"));
        binding.sliderId.addData(new CarouselItem("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSMCrmxaENxz2260ZzCIAJ_UAyjTzXK8EnetYoa4jRK_9Hx49BdmIE7RmHv5F3i8M4RR_U&usqp=CAU","caption here"));
        binding.sliderId.addData(new CarouselItem("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRoHX4_cEgpm26cHWKMn6t__E_ruzVLr0x-vyl2OV3dmZLQjTjD3szpHqbPIgw01tlOQUc&usqp=CAU","caption here"));

    }
}