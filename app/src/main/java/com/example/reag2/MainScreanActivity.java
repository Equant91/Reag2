package com.example.reag2;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import com.example.reag2.web.MyWebActvity;

import java.util.ArrayList;
import java.util.Map;


public class MainScreanActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {


    private static final String ATTRIBUTE_NAME_IMAGE = "image";
    ArrayList<Map<String, Object>> data;
    SimpleAdapter simpleAdapter;
    ListView listView;
    Animation animation;
    ImageView iLogo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screan);
        listView = findViewById(R.id.myList);
        iLogo = findViewById(R.id.iLogo);



        data = ArrayOfImageProviser.getArrayList();
        String[] from = {ATTRIBUTE_NAME_IMAGE};
        int[] to = {R.id.imageViewItem};
        simpleAdapter = new SimpleAdapter(this, data, R.layout.simple_list_item, from, to);
        listView.setAdapter(simpleAdapter);
        listView.setOnItemClickListener(this);

        animation = AnimationUtils.loadAnimation(this, R.anim.animation);
        iLogo.startAnimation(animation);




    }

    public void onClick(View view) {

        switch (view.getId()) {
            case (R.id.twSite):


                ArrayOfImageProviser.numberOfArrey = ArrayOfImageProviser.SITE_CONST;
                data = ArrayOfImageProviser.getArrayList();

                simpleAdapter.notifyDataSetChanged();
                break;

            case (R.id.twAdvertisement):


                ArrayOfImageProviser.numberOfArrey =ArrayOfImageProviser.ADVERTISEMENT_CONST;
                data = ArrayOfImageProviser.getArrayList();

                simpleAdapter.notifyDataSetChanged();
                break;

            case (R.id.twSEO):

                ArrayOfImageProviser.numberOfArrey = ArrayOfImageProviser.SEO_CONST;
                data = ArrayOfImageProviser.getArrayList();

                simpleAdapter.notifyDataSetChanged();
                break;

            case (R.id.twContact):

                ArrayOfImageProviser.numberOfArrey = ArrayOfImageProviser.CONTACT_CONST;
                data = ArrayOfImageProviser.getArrayList();

                simpleAdapter.notifyDataSetChanged();


                break;
        }
        }





    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(this, "" + position, Toast.LENGTH_SHORT).show();
        if(position == 0) {
            Intent intent = new Intent(MainScreanActivity.this, MyWebActvity.class);
            startActivity(intent);
        }
        else {
            Intent intent = new Intent(MainScreanActivity.this, DesriptionActivity.class);
            startActivity(intent);
        }
    }
}