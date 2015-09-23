package com.example.abdulaziz.firstfragments.control;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.abdulaziz.firstfragments.R;
import com.example.abdulaziz.firstfragments.control.Video;

import java.util.List;

/**
 * Created by Abdulaziz on 9/19/2015.
 */
public class VideoList extends BaseAdapter {

    Context context;
    List<Video> rowItem;

    public VideoList(Context context, List<Video> rowItem) {
        this.context = context;
        this.rowItem = rowItem;

    }
    @Override
    public int getCount() {

        return rowItem.size();
    }
    @Override
    public Object getItem(int position) {

        return rowItem.get(position);
    }
    @Override
    public long getItemId(int position) {

        return rowItem.indexOf(getItem(position));
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            LayoutInflater mInflater = (LayoutInflater) context
                    .getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
            convertView = mInflater.inflate(R.layout.list_item, null);
        }

        ImageView picture = (ImageView) convertView.findViewById(R.id.icon);
        TextView name = (TextView) convertView.findViewById(R.id.video_name);
        TextView description = (TextView) convertView.findViewById(R.id.video_description);

        Video row_pos = rowItem.get(position);
        // setting the image resource and title
        picture.setImageResource(row_pos.getVideoPicture());
        name.setText(row_pos.getVideoName());
        description.setText(row_pos.getVideoDescription());

        return convertView;

    }
}
