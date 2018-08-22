package com.akash.sky.dropdownmenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.akash.sky.dropdownmenu.R;

public class MainActivity extends AppCompatActivity {
    //EditText first;
//    EditText sec;
//    TextView answer;
    ImageView chapters1;
    ImageView chapters2;
    ImageView chapters3;
    ImageView chapters4;
    ImageView chapters5;
    Boolean upd=false;
    ImageView sigs1;
    ImageView sigs2;
    ImageView sigs3;
    ImageView sigs4;
    ImageView sigs5;
    ImageView sigs6;
    ImageView sigs7;
    Boolean upd2=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        chapters1 = (ImageView) findViewById(R.id.chapters1);
        chapters2 = (ImageView) findViewById(R.id.chapters2);
        chapters3 = (ImageView) findViewById(R.id.chapters3);
        chapters4 =(ImageView) findViewById(R.id.chapters4);
        chapters5 =(ImageView) findViewById(R.id.chapters5);
        sigs1 = (ImageView) findViewById(R.id.sigs1);
        sigs2 = (ImageView) findViewById(R.id.sigs2);
        sigs3 = (ImageView) findViewById(R.id.sigs3);
        sigs4 = (ImageView) findViewById(R.id.sigs4);
        sigs5 =(ImageView ) findViewById(R.id.sigs5);
        sigs6 =(ImageView ) findViewById(R.id.sigs6);
        sigs7 =(ImageView ) findViewById(R.id.sigs7);
//        first=(EditText) findViewById(R.id.op1);
//        sec= (EditText) findViewById(R.id.op2);
//        answer = (TextView) findViewById(R.id.answer);

        //Button b = (Button) findViewById(R.id.addButton);
//        b.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                int a = Integer.parseInt(first.getText().toString());
//                int b = Integer.parseInt(sec.getText().toString());
//                int c = a + b;
//                answer.setText(""+c);
//            }
//        });
    }
    public void clicked(View view){
        if(upd==false){
            //Toast.makeText(this,"In false",Toast.LENGTH_LONG).show();
            chapters1.setVisibility(View.VISIBLE);
            chapters2.setVisibility(View.VISIBLE);
            chapters3.setVisibility(View.VISIBLE);
            chapters4.setVisibility(View.VISIBLE);
            chapters5.setVisibility(View.VISIBLE);
            upd=true;
        }
        else{
           // Toast.makeText(this,"In true",Toast.LENGTH_LONG).show();
            chapters1.setVisibility(View.GONE);
            chapters2.setVisibility(View.GONE);
            chapters3.setVisibility(View.GONE);
            chapters4.setVisibility(View.GONE);
            chapters5.setVisibility(View.GONE);
            upd =false;
        }
    }
    public void clicked2(View view){
        if(upd2==false){
           // Toast.makeText(this,"In false",Toast.LENGTH_LONG).show();
            sigs1.setVisibility(View.VISIBLE);
            sigs2.setVisibility(View.VISIBLE);
            sigs3.setVisibility(View.VISIBLE);
            sigs4.setVisibility(View.VISIBLE);
            sigs5.setVisibility(View.VISIBLE);
            sigs6.setVisibility(View.VISIBLE);
            sigs7.setVisibility(View.VISIBLE);
            upd2=true;
        }
        else{
         //   Toast.makeText(this,"In true",Toast.LENGTH_LONG).show();
            sigs1.setVisibility(View.GONE);
            sigs2.setVisibility(View.GONE);
            sigs3.setVisibility(View.GONE);
            sigs4.setVisibility(View.GONE);
            sigs5.setVisibility(View.GONE);
            sigs6.setVisibility(View.GONE);
            sigs7.setVisibility(View.GONE);
            upd2 =false;
        }
    }
}