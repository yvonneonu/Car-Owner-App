package com.example.carownersapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ModelAdapter extends RecyclerView.Adapter<ModelAdapter.AllModelHolder>{
    List<CarOwners> carOwnersList;
    Context context;
    ShowModelListener showModelListener;

    public ModelAdapter(List<CarOwners> moremodel, Context context1){
        carOwnersList = moremodel;
        context = context1;
    }

    @NonNull
    @Override
    public AllModelHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_second, parent, false);
        return new AllModelHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AllModelHolder holder, int position) {
        CarOwners mymodel = carOwnersList.get(position);
        holder.firstName.setText(mymodel.getFirstName());
        holder.lastName.setText(mymodel.getLastName());
        holder.emailAddress.setText(mymodel.getEmail());
        holder.countryAddress.setText(mymodel.getCountry());
        holder.makeOfCar.setText(mymodel.getCarModel());
        holder.colorOfCar.setText(mymodel.getColor());
        holder.yearOfCar.setText(mymodel.getYear());
        holder.genderList.setText(mymodel.getGender());
        holder.jobListTitle.setText(mymodel.getTitle());
        holder.bioAddress.setText(mymodel.getBio());
    }

    @Override
    public int getItemCount() {
        return carOwnersList.size();
    }

    public class AllModelHolder extends RecyclerView.ViewHolder {
        TextView firstName;
        TextView lastName;
        TextView emailAddress;
        TextView countryAddress;
        TextView makeOfCar;
        TextView colorOfCar;
        TextView yearOfCar;
        TextView genderList;
        TextView jobListTitle;
        TextView bioAddress;
        CardView cardView;

        public AllModelHolder(@NonNull View itemView) {
            super(itemView);
            firstName = itemView.findViewById(R.id.textFirstName);
            lastName = itemView.findViewById(R.id.textLastName);
            emailAddress = itemView.findViewById(R.id.email);
            countryAddress = itemView.findViewById(R.id.country);
            makeOfCar = itemView.findViewById(R.id.carmake);
            colorOfCar = itemView.findViewById(R.id.colour);
            yearOfCar = itemView.findViewById(R.id.year);
            genderList = itemView.findViewById(R.id.gender);
            jobListTitle = itemView.findViewById(R.id.jobTitle);
            bioAddress = itemView.findViewById(R.id.bio);
            cardView = itemView.findViewById(R.id.myCardView);
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (showModelListener != null){
                        int position = getAdapterPosition();
                        if (position != RecyclerView.NO_POSITION);
                        showModelListener.viewModel(position);
                    }
                }
            });

        }
    }
    public void fun(ShowModelListener showModelListener){
        this.showModelListener = showModelListener;
    }
    public interface ShowModelListener{
        void viewModel(int position);
    }
}
