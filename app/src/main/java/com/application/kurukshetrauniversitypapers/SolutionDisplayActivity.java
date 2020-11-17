package com.application.kurukshetrauniversitypapers;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

import Adapters.Pdflistadapter;
import Adapters.SolutionDisplayActivityAdapter;
import utils.Listdata;
import utils.SingleDownloadClass;
import utils.uploadPDF;

public class SolutionDisplayActivity extends AppCompatActivity {
    ListView listView;
    DatabaseReference databaseReference;
    List<uploadPDF> uploadPDFS;
    TextView textViewName;
    Button download_single;
    FirebaseAuth mAuth;

    String key;
    String board,branch,semester,subjectcode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solution_display);
        mAuth=FirebaseAuth.getInstance();
        listView=findViewById(R.id.pdflist);
        textViewName=findViewById(R.id.pdfname);
        download_single=findViewById(R.id.download_single);
        uploadPDFS= new ArrayList<>();

        Intent intent1=getIntent();
        key=intent1.getStringExtra("subject");
        board=key.substring(3,5);
        branch=key.substring(6,8);
        semester=key.substring(9,11);
        subjectcode=key.substring(12);

        SingleDownloadClass singleDownloadClass = new SingleDownloadClass();
        singleDownloadClass.setBoard(board);
        singleDownloadClass.setBranch(branch);
        singleDownloadClass.setSemester(semester);
        singleDownloadClass.setCode(subjectcode);

    }


    @Override
    protected void onStart() {
        super.onStart();
        Intent intent=getIntent();
        key=intent.getStringExtra("subject");
        databaseReference= FirebaseDatabase.getInstance().getReference(key);
        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                uploadPDFS.clear();
                for(DataSnapshot pdfSnapshot: dataSnapshot.getChildren()){
                    uploadPDF uploadPDF=pdfSnapshot.getValue(uploadPDF.class);
                    uploadPDFS.add(uploadPDF);
                }

                SolutionDisplayActivityAdapter adapter= new SolutionDisplayActivityAdapter(SolutionDisplayActivity.this,uploadPDFS);
                listView.setAdapter(adapter);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

    }


}
