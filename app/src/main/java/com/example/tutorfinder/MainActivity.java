package com.example.tutorfinder;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.example.tutorfinder.adapter.CarouselAdapter;
import com.example.tutorfinder.models.Carousel;
import com.example.tutorfinder.adapter.TeacherAdapter;
import com.example.tutorfinder.models.Teacher;
import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    public DrawerLayout drawerLayout;
    public ActionBarDrawerToggle actionBarDrawerToggle;
    NavigationView navigationView;
    RecyclerView recyclerView,recyclerViewCarousel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recyclerView);
        recyclerViewCarousel=findViewById(R.id.recyclerViewCarousel);
        navigationView=findViewById(R.id.navigationView);
        recyclerView.setAdapter(new TeacherAdapter(fetchTeacher()));
        recyclerViewCarousel.setAdapter(new CarouselAdapter(fetchCarousel()));

        drawerLayout = findViewById(R.id.my_drawer_layout);

        actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, R.string.nav_open, R.string.nav_close);
        actionBarDrawerToggle.setToolbarNavigationClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawerLayout.openDrawer(GravityCompat.START);
            }
        });

        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Intent intent;
                Toast.makeText(getApplicationContext(), ""+item.getItemId(), Toast.LENGTH_SHORT).show();
                if(item.getItemId()==R.id.item_account){
                    intent=new Intent(MainActivity.this,AccountActivity.class);
                    startActivity(intent);
                    return true;
                }else if(item.getItemId()==R.id.item_aboutUs){

                }
                return true;
            }
        });


    }

    public List<Teacher> fetchTeacher(){
        List<Teacher> teachers=new ArrayList<>();
        teachers.add(new Teacher(getDrawable(R.drawable.prince),"Abdur Rafay","BE","5+","3","10"));
        teachers.add(new Teacher(getDrawable(R.drawable.prince),"Abdur Rafay","BE","5+","3","10"));
        teachers.add(new Teacher(getDrawable(R.drawable.prince),"Abdur Rafay","BE","5+","3","10"));
        teachers.add(new Teacher(getDrawable(R.drawable.prince),"Abdur Rafay","BE","5+","3","10"));
        teachers.add(new Teacher(getDrawable(R.drawable.prince),"Abdur Rafay","BE","5+","3","10"));
        return teachers;
    }

    public List<Carousel> fetchCarousel(){
        List<Carousel> carousels=new ArrayList<>();
        carousels.add(new Carousel(getDrawable(R.drawable.prince)));
        carousels.add(new Carousel(getDrawable(R.drawable.prince)));
        carousels.add(new Carousel(getDrawable(R.drawable.prince)));
        carousels.add(new Carousel(getDrawable(R.drawable.prince)));
        carousels.add(new Carousel(getDrawable(R.drawable.prince)));
        carousels.add(new Carousel(getDrawable(R.drawable.prince)));
        return carousels;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(actionBarDrawerToggle.onOptionsItemSelected(item)) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


}