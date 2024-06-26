package com.example.recycler;

import android.os.Bundle;
import android.provider.Contacts;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
 public static ArrayList <ContactModel> arraycontacts = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclercontact);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        arraycontacts.add(new ContactModel(R.drawable.img_2,"A","9725254844"));
        arraycontacts.add(new ContactModel(R.drawable.img_15,"B","9725254844"));
        arraycontacts.add(new ContactModel(R.drawable.img_5,"C","9725254844"));
        arraycontacts.add(new ContactModel(R.drawable.img_6,"D","9725254844"));
        arraycontacts.add(new ContactModel(R.drawable.img_7,"E","9725254844"));
        arraycontacts.add(new ContactModel(R.drawable.img_8,"F","9725254844"));
        arraycontacts.add(new ContactModel(R.drawable.img_9,"G","9725254844"));
        arraycontacts.add(new ContactModel(R.drawable.img_10,"H","9725254844"));
        arraycontacts.add(new ContactModel(R.drawable.img_11,"I","9725254844"));
        arraycontacts.add(new ContactModel(R.drawable.img_12,"J","9725254844"));

        RecyclerContactAdapter adapter = new RecyclerContactAdapter(this,arraycontacts);

        Log.e("recycleview", "onCreate:arraycontacts "+arraycontacts.size());
        recyclerView.setAdapter(adapter);

    }
}