package com.example.androidinfo.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.androidinfo.R;
import com.example.androidinfo.adapter.FeatureAdapter;
import com.example.androidinfo.modal.FeatureItemModel;

import java.util.ArrayList;


public class HomeFragment extends Fragment {

    RecyclerView recyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);




    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {

        super.onViewCreated(view, savedInstanceState);

        recyclerView = view.findViewById(R.id.recycler_view);
        FeatureAdapter featureAdapter = new FeatureAdapter(requireContext(), generateFeatureItemList());
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
        recyclerView.setAdapter(featureAdapter);

    }


    private ArrayList<FeatureItemModel> generateFeatureItemList() {
        ArrayList<FeatureItemModel> featureArrayList = new ArrayList<>();

        featureArrayList.add(new FeatureItemModel(R.drawable.memory, "Memory"));
        featureArrayList.add(new FeatureItemModel(R.drawable.wifi,   "Internet Speed"));
        featureArrayList.add(new FeatureItemModel(R.drawable.memory, "Android Version"));
        featureArrayList.add(new FeatureItemModel(R.drawable.memory, "My Phone Apps"));
        featureArrayList.add(new FeatureItemModel(R.drawable.camera, "Camera Info"));
        featureArrayList.add(new FeatureItemModel(R.drawable.memory, "Screenshot"));
        featureArrayList.add(new FeatureItemModel(R.drawable.memory, "Screen Size"));
        featureArrayList.add(new FeatureItemModel(R.drawable.memory, "Screen Density"));
        featureArrayList.add(new FeatureItemModel(R.drawable.memory, "Ram"));
        featureArrayList.add(new FeatureItemModel(R.drawable.memory, "Manufacture and Model"));
        featureArrayList.add(new FeatureItemModel(R.drawable.memory, "Android Tips"));

        return featureArrayList;

    }
}