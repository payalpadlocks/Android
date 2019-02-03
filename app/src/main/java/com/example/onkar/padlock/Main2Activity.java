package com.example.onkar.padlock;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    private EditText Name;
    private EditText Passwd;
    private int count=5;
    private Button button ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Name = (EditText)findViewById(R.id.etText1);
        Passwd = (EditText)findViewById(R.id.etText2);

        button = (Button) findViewById(R.id.button3) ;
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valid(Name.getText().toString(),Passwd.getText().toString());

            }
        });
    }

    private void valid(String uname, String pass){
        if(uname.equals("payal") && pass.equals("padlock")){
            Intent intent = new Intent(this,Main3Activity.class);
            startActivity(intent);

        }
        else{
            count--;
            Toast.makeText(Main2Activity.this, "Please enter valid Details",Toast.LENGTH_SHORT ).show();

            if (count== 0){
                button.setEnabled(false);
            }
        }

    }

    //public void openActivity3(){

    //}
}
