package com.example.carownersapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.AllCarHolder> {
    List<UserModel> carOwners;
    Context context;
    MyCarAdapterListener myCarAdapterListener;

    public UserAdapter(List<UserModel> carOwner1, Context context1){
        carOwners = carOwner1;
        context = context1;
    }

    @NonNull
    @Override
    public AllCarHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.standardview,parent,false);
        return new AllCarHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AllCarHolder holder, int position) {
        UserModel car = carOwners.get(position);
        holder.date.setText(car.getFullName());
        //holder.color.setText(car.getColor());

        /*Glide.with(context)

                .asBitmap()
                .load(car.getAvatar())
                .placeholder(R.drawable.rampage)
                .into(holder.image);*/
    }

    @Override
    public int getItemCount() {
        return carOwners.size();
    }

    public class AllCarHolder extends RecyclerView.ViewHolder {
        TextView date;
        TextView color;
        TextView gender;
        TextView year;
        CardView cardView;

        public AllCarHolder(@NonNull View itemView) {
            super(itemView);
            date = itemView.findViewById(R.id.textDate);
            color = itemView.findViewById(R.id.textColor);
            gender = itemView.findViewById(R.id.textGender);
            year = itemView.findViewById(R.id.textYear);
            cardView = itemView.findViewById(R.id.myCardView);
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (myCarAdapterListener != null) {
                        int position = getAdapterPosition();
                        if (position != RecyclerView.NO_POSITION){
                            myCarAdapterListener.Car(position);
                        }
                    }
                }
            });
        }
    }
    public void junior(MyCarAdapterListener myCarAdapterListener){
        this.myCarAdapterListener = myCarAdapterListener;

    }
    public interface MyCarAdapterListener{
        void Car(int position);
    }
}
