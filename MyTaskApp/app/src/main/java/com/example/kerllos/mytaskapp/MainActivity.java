package com.example.kerllos.mytaskapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    /* my project items defenation*/
    TextView textname;
    TextView textAge;
    TextView result_text;
    TextView Name_text;
    TextView age_text;
    EditText editName;
    EditText editAge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         /* connect between java and xml */
        textname = (TextView) findViewById(R.id.textname);
        textAge = (TextView) findViewById(R.id.textAge);
        result_text = (TextView) findViewById(R.id.result_text);
        Name_text = (TextView) findViewById(R.id.Name_text);
        age_text = (TextView) findViewById(R.id.age_text);
        editName = (EditText) findViewById(R.id.editName);
        editAge = (EditText) findViewById(R.id.editAge);

        Toast.makeText(getApplicationContext(),"Welcome to My Task App!", Toast.LENGTH_SHORT).show();

    }

     /* public void ageClick (View view)
    {
        editAge.setText("");
        //editAge.selectAll();

    }

    public void nameClick (View view)
    {
       /Editable ss = editName.getText();
        String s = ss.toString();
        if (s.equals("Enter Your Name"))
        editName.setText("");
       editName.selectAll();
    }*/

    //the action of progect while clekc on putton reult
    public void Give_result (View v)
    {
        Editable name,age;
        name=editName.getText();
        age=editAge.getText();
        result_text.setText("Result");
        Name_text.setText("My Name is : "+name);
        age_text.setText("My Age : "+age+ " Years");
    }
}
