package com.mhnt92.biswaranjan.testproj;

/**
 * Created by yatish on 23/2/17.
 */

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class OneFragment extends Fragment {

    private RecyclerView recyclerView;
    private MoviesAdapter mAdapter;
    private List<AdapterData> dataList = new ArrayList<>();

    public OneFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_one, container, false);
        Log.d("Fragment Life Cycle", "onCreateView()");

        this.initView(v);
        return v;
    }

    public void initView(View v) {

        recyclerView = (RecyclerView) v.findViewById(R.id.recycler_view);

        mAdapter = new MoviesAdapter(dataList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);

        prepareMovieData();
    }


    private void prepareMovieData() {
        AdapterData data = new AdapterData("EMPTINESS FT. JUSTIN TIBLEKAR", "18 HOURS AGO", "Lorem Ipsum is simply dummy text of the printing and typesetting industry.",R.drawable.thm_one);

        dataList.add(data);

        data = new AdapterData("I'M FALLING LOVE WITH YOU","20 HOURS AGO","Lorem Ipsum is simply dummy text of the printing and typesetting industry.",R.drawable.thm_two);
        dataList.add(data);

        data = new AdapterData("BABY FT. JUSTIN BABER", "22 HOURS AGO", "Lorem Ipsum is simply dummy text of the printing and typesetting industry.",R.drawable.thm_three);
        dataList.add(data);

        data = new AdapterData("EMPTINESS FT. JUSTIN TIBLEKAR", "25 HOURS AGO", "Lorem Ipsum is simply dummy text of the printing and typesetting industry.",R.drawable.thm_one);
        dataList.add(data);

        data = new AdapterData("I'M FALLING LOVE WITH YOU", "30 HOURS AGO", "Lorem Ipsum is simply dummy text of the printing and typesetting industry.",R.drawable.thm_two);
        dataList.add(data);

        data = new AdapterData("BABY FT. JUSTIN BABER", "35 HOURS AGO", "Lorem Ipsum is simply dummy text of the printing and typesetting industry.",R.drawable.thm_three);
        dataList.add(data);

    }


}