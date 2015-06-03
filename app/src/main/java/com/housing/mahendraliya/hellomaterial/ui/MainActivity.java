package com.housing.mahendraliya.hellomaterial.ui;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.housing.mahendraliya.hellomaterial.R;
import com.housing.mahendraliya.hellomaterial.adapters.ProductsAdapter;

import java.util.ArrayList;


public class MainActivity extends Activity {

    private RecyclerView rvProductList;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setupLayout();
    }

    private void setupLayout() {
        setContentView(R.layout.activity_main);

        rvProductList = (RecyclerView) findViewById(R.id.rvProductList);
        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        rvProductList.setHasFixedSize(true);

        // The LayoutManager is responsible for positioning items on the screen.
        // There are other layout managers to layout in a grid, or a staggered grid.
        mLayoutManager = new LinearLayoutManager(this);
        rvProductList.setLayoutManager(mLayoutManager);

        mAdapter = new ProductsAdapter(MainActivity.this, getDataSource());
        rvProductList.setAdapter(mAdapter);
    }

    private ArrayList<String> getDataSource() {
        ArrayList<String> arrProducts = new ArrayList<String>();

        arrProducts.add("Apple iPhone 6");
        arrProducts.add("Apple iPhone 6 Plus");
        arrProducts.add("MacBook Pro Retina 13\"");
        arrProducts.add("Nexus 5");
        arrProducts.add("Nexus Tablet (2012)");
        arrProducts.add("Motorola Android Watch");
        arrProducts.add("Samsung Galaxy Tab");
        arrProducts.add("iPad Air");
        arrProducts.add("Honda City Diesel");
        arrProducts.add("Microsoft Lumia");
        arrProducts.add("Pulsar 180 CC");
        arrProducts.add("Motorola Zoom");
        arrProducts.add("iPhone 5S (Gold)");

        return arrProducts;
    }

}
