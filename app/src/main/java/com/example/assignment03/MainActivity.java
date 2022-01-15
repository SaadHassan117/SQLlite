package com.example.assignment03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button add, show;
    EditText name, id;
    Switch actives;
    ListView list;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=findViewById(R.id.editTextTextPersonName);
        id=findViewById(R.id.editTextTextPersonName2);
        add=findViewById(R.id.button);
        show=findViewById(R.id.button2);
        actives=findViewById(R.id.switch1);
        list=findViewById(R.id.liste);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Student obj =new Student(name.getText().toString(),Integer.parseInt(id.getText().toString()),actives.isChecked());
                         Toast.makeText(MainActivity.this,obj.toString(),Toast.LENGTH_SHORT).show();

                }
                catch(Exception obj)
                {
                    Toast.makeText(MainActivity.this,"error",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }




}