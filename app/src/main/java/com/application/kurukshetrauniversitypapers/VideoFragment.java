package com.application.kurukshetrauniversitypapers;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import Adapters.VideoListAdapter;

public class VideoFragment extends Fragment {
    ListView listView;
    List<Videoinfo> video_info;
    TextView subjectname;
    TextView teacher_name;





    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        
        View v= inflater.inflate(R.layout.fragment_videos, container, false);
        listView=v.findViewById(R.id.list);
        subjectname=v.findViewById(R.id.subjectname);
        teacher_name=v.findViewById(R.id.papercount);
        video_info = new ArrayList<>();
        video_info.add(new Videoinfo("Formal Language and Automata theory", "Dr. Shilpi Harnal","Jmit Radaur"));
        video_info.add(new Videoinfo("Design & analysis of algorithm", "Abdul Bari",""));
        video_info.add(new Videoinfo("toc", "neso",""));
        VideoListAdapter adapter = new VideoListAdapter(getActivity(), R.layout.videos_available_row, video_info);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                 if(position==0) {
                     Intent intent = new Intent(getActivity(), VideosListActivity.class);
                     intent.putExtra("Playlistid","PLUhzUGU9G_1tZiY0Ec7qMk2yt1CbCZjh6");
                     startActivity(intent);
                 }
                if(position==1) {
                    Intent intent = new Intent(getActivity(), VideosListActivity.class);
                    intent.putExtra("Playlistid","PLDN4rrl48XKpZkf03iYFl-O29szjTrs_O");
                    startActivity(intent);
                }
                if(position==2) {
                    Intent intent = new Intent(getActivity(), VideosListActivity.class);
                    intent.putExtra("Playlistid","PLBlnK6fEyqRgp46KUv4ZY69yXmpwKOIev");
                    startActivity(intent);
                }

            }
        });



        return v;


    }



}