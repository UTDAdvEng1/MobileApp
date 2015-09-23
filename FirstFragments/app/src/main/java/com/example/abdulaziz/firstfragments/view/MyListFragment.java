package com.example.abdulaziz.firstfragments.view;

import android.app.ListFragment;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import android.widget.AdapterView.OnItemClickListener;

import com.example.abdulaziz.firstfragments.R;
import com.example.abdulaziz.firstfragments.control.VideoList;
import com.example.abdulaziz.firstfragments.control.Video;

/**
 * Created by Abdulaziz on 9/17/2015.
 */
public class MyListFragment extends ListFragment implements OnItemClickListener{

    private String[] names;
    private String[] descriptions;
    private TypedArray pictures;
    private VideoList adapter;
    private List<Video> rowItems;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.list_layout, container,false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        names = getResources().getStringArray(R.array.videoList);
        descriptions = getResources().getStringArray(R.array.descriptionList);
        pictures = getResources().obtainTypedArray(R.array.pictureList);

        rowItems = new ArrayList<Video>();

        for (int i = 0; i < names.length; i++) {
            Video items = new Video(names[i],descriptions[i], pictures.getResourceId(i, -1));
            rowItems.add(items);
        }

        adapter = new VideoList(getActivity(), rowItems);
        setListAdapter(adapter);
        getListView().setOnItemClickListener(this);
    }
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position,
                            long id) {

        Toast.makeText(getActivity(), names[position], Toast.LENGTH_SHORT)
                .show();

    }
}
