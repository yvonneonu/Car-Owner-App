 package com.example.carownersapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

 public class CarFilter extends AppCompatActivity {
     TextView first;
     TextView second;
     TextView third;
     TextView fourth;
     TextView fifth;
     TextView sixth;
     TextView seveth;
     TextView eith;
     TextView night;
     TextView tenth;
     RecyclerView view;
     ModelAdapter adapter;

     @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car_filter);

        //readCarOwners();

        first = findViewById(R.id.textFirstName);
        second = findViewById(R.id.textLastName);
        third = findViewById(R.id.email);
        fourth = findViewById(R.id.country);
        fifth = findViewById(R.id.carmake);
        sixth = findViewById(R.id.colour);
        seveth = findViewById(R.id.year);
        eith = findViewById(R.id.gender);
        night = findViewById(R.id.jobTitle);
        tenth = findViewById(R.id.bio);
        //view = findViewById(R.id.recycler);
    }
    private List<CarOwners> carOwners = new ArrayList<>();
    /*private void readCarOwnersDataByColumn(){
        InputStream is = getResources().openRawResource(R.raw.car_ownsers_data);
        BufferedReader br = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));

        List<CarOwners> owners = response.body();
       // adapter = new ModelAdapter(owners, CarFilter.this);

        view.setAdapter(adapter);

        String line = "";
        try {
            while ((line = br.readLine())!= null){
                String[] cols = line.split(",");


                System.out.println("Column 0 = '" + cols[0] + "', Column 1 = '" + cols[1] + "', Column 2 = '" + cols[2] + "', Column 3 = '" + cols[3] + "', Column 4 = '" + cols[4] + "', Column 5 = '" + cols[5] + "', Column 6 = '" + cols[6] + "', Column 7 = '" + cols[7] + "', Colour 8 = '" + cols[8] + "', Column 9: '" + cols[9] + "'");

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void readCarOwners(){
        InputStream is = getResources().openRawResource(R.raw.car_ownsers_data);
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(is, Charset.forName("UTF-8")));
        String line = "";
        try {
            reader.readLine();

            while ((line = reader.readLine()) != null){
                Log.d("MyActivity", "Line: " + line);

                String[] tokens = line.split(",");
                CarOwners owners = new CarOwners(0,"firstName", "lastName",
                        "email", "country", "carmodel", "year", "color", "gender", "title", "bio");

                owners.setFirstName(tokens[0]);
                owners.setLastName(tokens[1]);
                owners.setEmail(tokens[2]);
                owners.setCountry(tokens[3]);
                owners.setCarModel(tokens[4]);
                owners.setYear(tokens[5]);
                owners.setColor(tokens[6]);
                owners.setGender(tokens[7]);
                owners.setTitle(tokens[8]);
                owners.setBio(tokens[9]);


                carOwners.add(owners);


            }
        } catch (IOException e) {
            Log.wtf("MyActivity", "Error reading data file on line" + line, e);
            e.printStackTrace();
        }
    }*/
 }

