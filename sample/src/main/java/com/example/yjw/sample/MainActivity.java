package com.example.yjw.sample;

import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        PagerAdapter pagerAdapter = new PagerAdapter() {
            @Override
            public int getCount() {
                return 4;
            }

            @Override
            public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
                return view == o;
            }

            @NonNull
            @Override
            public Object instantiateItem(@NonNull ViewGroup container, int position) {
                ImageView imageView = new ImageView(MainActivity.this);
                imageView.setImageResource(R.drawable.new_comer_guide_fg_1);
                imageView.setImageResource(R.drawable.new_comer_guide_fg_2);
                imageView.setImageResource(R.drawable.new_comer_guide_fg_3);
                imageView.setImageResource(R.drawable.new_comer_guide_fg_4);
                container.addView(imageView);
                return imageView;
            }
        };
        ViewPager viewPager = findViewById(R.id.vp_main);
        viewPager.setAdapter(pagerAdapter);
    }
}
