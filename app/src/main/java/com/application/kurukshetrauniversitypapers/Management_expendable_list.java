package com.application.kurukshetrauniversitypapers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.TextView;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Adapters.MyExListAdapter;

public class Management_expendable_list extends AppCompatActivity {

    ExpandableListView expandableListView;
    List<String> branch;
    Map<String, List<String>> semester;
    ExpandableListAdapter listAdapter;
    int total_bba,total_mba;
    int bba01,bba02,bba03,bba04,bba05,bba06,mb01,mb02,mb03,mb04;
    DatabaseReference ref1;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_management_expendable_list);
        textView=findViewById(R.id.refresh);
        expandableListView=findViewById(R.id.managementexpendablelist);
        ref1= FirebaseDatabase.getInstance().getReference("IN/KU/MB/01");
        ref1.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                if(dataSnapshot.getKey().equals("BE")) {
                    mb01=mb01+(int)dataSnapshot.getChildrenCount();

                }
                if(dataSnapshot.getKey().equals("BN")) {
                    mb01=mb01+(int)dataSnapshot.getChildrenCount();

                }
                if(dataSnapshot.getKey().equals("BS")) {
                    mb01=mb01+(int)dataSnapshot.getChildrenCount();

                }
                if(dataSnapshot.getKey().equals("CB")) {
                    mb01=mb01+(int)dataSnapshot.getChildrenCount();

                }
                if(dataSnapshot.getKey().equals("FA")) {
                    mb01=mb01+(int)dataSnapshot.getChildrenCount();

                }
                if(dataSnapshot.getKey().equals("FS")) {
                    mb01=mb01+(int)dataSnapshot.getChildrenCount();

                }
                if(dataSnapshot.getKey().equals("MN")) {
                    mb01=mb01+(int)dataSnapshot.getChildrenCount();

                }
                if(dataSnapshot.getKey().equals("MQ")) {
                    mb01=mb01+(int)dataSnapshot.getChildrenCount();

                }
                if(dataSnapshot.getKey().equals("PD")) {
                    mb01=mb01+(int)dataSnapshot.getChildrenCount();

                }
                if(dataSnapshot.getKey().equals("SY")) {
                    mb01=mb01+(int)dataSnapshot.getChildrenCount();

                }
                
                filldata();
                listAdapter=new MyExListAdapter(getBaseContext(),branch,semester);
                expandableListView.setAdapter(listAdapter);
            }

            @Override
            public void onChildChanged(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onChildRemoved(DataSnapshot dataSnapshot) {

            }

            @Override
            public void onChildMoved(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        ref1= FirebaseDatabase.getInstance().getReference("IN/KU/MB/02");
        ref1.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                if(dataSnapshot.getKey().equals("BE")) {
                    mb02=mb02+(int)dataSnapshot.getChildrenCount();

                }
                if(dataSnapshot.getKey().equals("BR")) {
                    mb02=mb02+(int)dataSnapshot.getChildrenCount();

                }
                if(dataSnapshot.getKey().equals("CR")) {
                    mb02=mb02+(int)dataSnapshot.getChildrenCount();

                }
                if(dataSnapshot.getKey().equals("FM")) {
                    mb02=mb02+(int)dataSnapshot.getChildrenCount();

                }
                if(dataSnapshot.getKey().equals("FX")) {
                    mb02=mb02+(int)dataSnapshot.getChildrenCount();

                }
                if(dataSnapshot.getKey().equals("HR")) {
                    mb02=mb02+(int)dataSnapshot.getChildrenCount();

                }
                if(dataSnapshot.getKey().equals("LE")) {
                    mb02=mb02+(int)dataSnapshot.getChildrenCount();

                }
                if(dataSnapshot.getKey().equals("MH")) {
                    mb02=mb02+(int)dataSnapshot.getChildrenCount();

                }
                if(dataSnapshot.getKey().equals("MK")) {
                    mb02=mb02+(int)dataSnapshot.getChildrenCount();

                }
                if(dataSnapshot.getKey().equals("OB")) {
                    mb02=mb02+(int)dataSnapshot.getChildrenCount();

                }
                if(dataSnapshot.getKey().equals("PI")) {
                    mb02=mb02+(int)dataSnapshot.getChildrenCount();

                }

                filldata();
                listAdapter=new MyExListAdapter(getBaseContext(),branch,semester);
                expandableListView.setAdapter(listAdapter);
            }

            @Override
            public void onChildChanged(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onChildRemoved(DataSnapshot dataSnapshot) {

            }

            @Override
            public void onChildMoved(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        ref1= FirebaseDatabase.getInstance().getReference("IN/KU/MB/03");
        ref1.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                if(dataSnapshot.getKey().equals("BL")) {
                    mb03=mb03+(int)dataSnapshot.getChildrenCount();

                }
                if(dataSnapshot.getKey().equals("LF")) {
                    mb03=mb03+(int)dataSnapshot.getChildrenCount();

                }
                if(dataSnapshot.getKey().equals("MJ")) {
                    mb03=mb03+(int)dataSnapshot.getChildrenCount();

                }
                if(dataSnapshot.getKey().equals("OI")) {
                    mb03=mb03+(int)dataSnapshot.getChildrenCount();

                }
                if(dataSnapshot.getKey().equals("SD")) {
                    mb03=mb03+(int)dataSnapshot.getChildrenCount();

                }
                if(dataSnapshot.getKey().equals("SR")) {
                    mb03=mb03+(int)dataSnapshot.getChildrenCount();

                }
                if(dataSnapshot.getKey().equals("WC")) {
                    mb03=mb03+(int)dataSnapshot.getChildrenCount();

                }

                filldata();
                listAdapter=new MyExListAdapter(getBaseContext(),branch,semester);
                expandableListView.setAdapter(listAdapter);
            }

            @Override
            public void onChildChanged(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onChildRemoved(DataSnapshot dataSnapshot) {

            }

            @Override
            public void onChildMoved(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        ref1= FirebaseDatabase.getInstance().getReference("IN/KU/MB/04");
        ref1.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                if(dataSnapshot.getKey().equals("CV")) {
                    mb04=mb04+(int)dataSnapshot.getChildrenCount();

                }
                if(dataSnapshot.getKey().equals("EL")) {
                    mb04=mb04+(int)dataSnapshot.getChildrenCount();

                }
                if(dataSnapshot.getKey().equals("FT")) {
                    mb04=mb04+(int)dataSnapshot.getChildrenCount();

                }
                if(dataSnapshot.getKey().equals("IA")) {
                    mb04=mb04+(int)dataSnapshot.getChildrenCount();

                }
                if(dataSnapshot.getKey().equals("IL")) {
                    mb04=mb04+(int)dataSnapshot.getChildrenCount();

                }
                if(dataSnapshot.getKey().equals("IT")) {
                    mb04=mb04+(int)dataSnapshot.getChildrenCount();

                }
                if(dataSnapshot.getKey().equals("MF")) {
                    mb04=mb04+(int)dataSnapshot.getChildrenCount();

                }
                if(dataSnapshot.getKey().equals("MO")) {
                    mb04=mb04+(int)dataSnapshot.getChildrenCount();

                }
                if(dataSnapshot.getKey().equals("MR")) {
                    mb04=mb04+(int)dataSnapshot.getChildrenCount();

                }
                if(dataSnapshot.getKey().equals("MX")) {
                    mb04=mb04+(int)dataSnapshot.getChildrenCount();

                }
                if(dataSnapshot.getKey().equals("PB")) {
                    mb04=mb04+(int)dataSnapshot.getChildrenCount();

                }
                if(dataSnapshot.getKey().equals("PJ")) {
                    mb04=mb04+(int)dataSnapshot.getChildrenCount();

                }
                if(dataSnapshot.getKey().equals("PT")) {
                    mb04=mb04+(int)dataSnapshot.getChildrenCount();

                }
                if(dataSnapshot.getKey().equals("SG")) {
                    mb04=mb04+(int)dataSnapshot.getChildrenCount();

                }
                if(dataSnapshot.getKey().equals("SI")) {
                    mb04=mb04+(int)dataSnapshot.getChildrenCount();

                }

                filldata();
                total_mba=mb01+mb02+mb03+mb04;
                listAdapter=new MyExListAdapter(getBaseContext(),branch,semester);
                expandableListView.setAdapter(listAdapter);
            }

            @Override
            public void onChildChanged(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onChildRemoved(DataSnapshot dataSnapshot) {

            }

            @Override
            public void onChildMoved(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
    }

    public void filldata(){
        branch=new ArrayList<>();
        semester=new HashMap<>();

        branch.add("Bachelor of Business Administration" +"("+total_bba+")");
        branch.add("Master of Business Administration "+"("+total_mba+")");
        
        List<String> first=new ArrayList<>();
        List<String> second=new ArrayList<>();
        
        first.add("First semester " +"("+bba01+")");
        first.add("Second semester "+"("+bba02+")");
        first.add("Third semester "+"("+bba03+")");
        first.add("Fourth semester "+"("+bba04+")");
        first.add("Fifth semester "+"("+bba05+")");
        first.add("Sixth semester "+"("+bba06+")");

        second.add("First semester "+"("+mb01+")");
        second.add("Second semester "+"("+mb02+")");
        second.add("Third semester "+"("+mb03+")");
        second.add("Fourth semester "+"("+mb04+")");
        
        semester.put(branch.get(0),first);
        semester.put(branch.get(1),second);
        
    }
    @Override
    public void onBackPressed()
    {
        super.onBackPressed();
        startActivity(new Intent(Management_expendable_list.this, MainActivity.class));
        finish();

    }
}
