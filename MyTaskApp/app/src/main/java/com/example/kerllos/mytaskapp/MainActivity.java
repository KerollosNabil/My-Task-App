package com.example.kerllos.mytaskapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    /* my project items definition*/
    TextView result_text;   //definition Textview for the word "result"
    TextView Name_text; //definition Textview for output the name
    TextView age_text;  //definition Textview for output the age
    EditText editName;  //definition EditText for input the name
    EditText editAge;   //definition EditText for input the age

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         /* connect between java and xml */
        result_text = (TextView) findViewById(R.id.result_text);    //connect between java and Textview of the word "result"
        Name_text = (TextView) findViewById(R.id.Name_text);    //connect between java and Textview for output the name
        age_text = (TextView) findViewById(R.id.age_text);  //connect between java and Textview for output the age
        editName = (EditText) findViewById(R.id.editName);  //connect between java and EditText for input the name
        editAge = (EditText) findViewById(R.id.editAge);    //connect between java and EditText for input the age

        Toast.makeText(getApplicationContext(),"Welcome to My Task App!", Toast.LENGTH_SHORT).show(); //message to welcome the user while the app start

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
        Editable name,age;  //variable to carry the age and name input
        name=editName.getText();    //taking name input
        age=editAge.getText();  //taking age input
        result_text.setText("Result");  //write result word
        Name_text.setText("My Name is : "+name);    //output the name
        age_text.setText("My Age : "+age+ " Years");    //output the ag
    }
}
