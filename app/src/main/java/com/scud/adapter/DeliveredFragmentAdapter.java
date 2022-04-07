package com.scud.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;

import com.scud.scudgo.R;

public class DeliveredFragmentAdapter extends RecyclerView.Adapter<DeliveredFragmentAdapter.ViewHolder> {
    Context context;
    FragmentManager parentFragmentManager;

    public DeliveredFragmentAdapter(Context mcontext) {
        context = mcontext;
//        parentFragmentManager = parentFragmentManagerm;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem = layoutInflater.inflate(R.layout.delivery_fragmentadapter, parent, false);
        ViewHolder viewHolder = new ViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.name.setCompoundDrawablePadding(20);
        holder.vehicleNumber.setCompoundDrawablePadding(20);
        holder.from_location.setCompoundDrawablePadding(20);
        holder.date_time.setCompoundDrawablePadding(20);
    }

    @Override
    public int getItemCount() {
        return 1;
//        return details.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView name, vehicleNumber, from_location, date_time;


        public ViewHolder(View itemView) {
            super(itemView);
            //Initialize ID's
            this.name = itemView.findViewById(R.id.name);
            this.vehicleNumber = itemView.findViewById(R.id.vehicleNumber);
            this.from_location = itemView.findViewById(R.id.fromLocation);
            this.date_time = itemView.findViewById(R.id.dateTime);

        }
    }
}

