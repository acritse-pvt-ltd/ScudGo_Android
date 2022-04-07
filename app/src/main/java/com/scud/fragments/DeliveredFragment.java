package com.scud.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.scud.adapter.DeliveredFragmentAdapter;
import com.scud.scudgo.R;

public class DeliveredFragment extends Fragment {

    DeliveredFragmentAdapter adapter;
    RecyclerView recyclerView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.delivery_fragment, container, false);

//        recyclerView=view.findViewById(R.id.recyclerview);
//        adapter = new DeliveredFragmentAdapter(getContext());
//        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
//        recyclerView.setAdapter(adapter);
        return view;
    }
}
