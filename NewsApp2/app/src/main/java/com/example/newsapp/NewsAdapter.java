package com.example.newsapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class NewsAdapter extends ArrayAdapter<News> {

    private Context mContext;

    // Public constructor for the adapter
    public NewsAdapter(Context context, ArrayList<News> news) {
        super(context, 0, news);
        mContext = context;
    }


    // Populating the ListView with the data using getView method.
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        News currentNewsItem = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(mContext).inflate(R.layout.news_item, parent, false);
        }

        // In the next few lines we are going to write the information(section, web address, date and time) in their relevant TextViews
        TextView sectionTextView = convertView.findViewById(R.id.section_name);
        sectionTextView.setText(currentNewsItem.getSectionName());

        TextView titleTextView = convertView.findViewById(R.id.title_text);
        titleTextView.setText(currentNewsItem.getWebTitle());

        String dateAndTime = currentNewsItem.getDate();
        String[] dateAndTimeSplit = dateAndTime.split("T");

        TextView dateTextView = convertView.findViewById(R.id.date_txt);
        dateTextView.setText(dateAndTimeSplit[0]);

        TextView timeTextView = convertView.findViewById(R.id.time_txt);
        String timeString = dateAndTimeSplit[1].replace('Z', ' ');
        timeTextView.setText(timeString);


        return convertView;
    }

}
