package com.example.rebound_v1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import java.util.ArrayList;

public class DriverListingAdapter extends RecyclerView.Adapter<DriverListingAdapter.viewHolder> {
    Context mcontext;
    private ArrayList<UserUploads>driverUploads;
    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.driver_listing_layout,parent,false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        holder.closingDate.setText(driverUploads.get(position).);


    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        TextView from,to,mostSignificantTime,LeastSignificantTime,openingDate,closingDate;
        Button contactDriver,addToFollowup;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
            from=itemView.findViewById(R.id.originTextView);
            to=itemView.findViewById(R.id.destinationTextView);
            mostSignificantTime=itemView.findViewById(R.id.openingTimeTextView);
            LeastSignificantTime=itemView.findViewById(R.id.closingTimeTextView);
            openingDate=itemView.findViewById(R.id.openingDateTextView);
            closingDate=itemView.findViewById(R.id.closingDateTextView);

        }
    }
}
