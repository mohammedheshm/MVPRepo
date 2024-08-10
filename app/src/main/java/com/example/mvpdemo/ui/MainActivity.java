package com.example.mvpdemo.ui;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.example.mvpdemo.R;
import com.example.mvpdemo.pojo.MovieModel;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener {

    TextView movieNameTv;
    Button getMoviebtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        movieNameTv = findViewById(R.id.textView);
        getMoviebtn = findViewById(R.id.button);
        getMoviebtn.setOnClickListener(this);
    }

    public MovieModel getMovieFroDatabase (){
        return new MovieModel("Cast Away" , "21-10-1998" , "Very sad movie"  ,1);
    }

    public void getMovie() {
        movieNameTv.setText(getMovieFroDatabase().getName());

    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.button){
            getMovie();
        }
    }
}