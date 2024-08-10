package com.example.mvpdemo.ui;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.example.mvpdemo.R;
import com.example.mvpdemo.pojo.MovieModel;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener ,OnMovieView {

    TextView movieNameTv;
    Button getMoviebtn;
    MoviePresenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        movieNameTv = findViewById(R.id.textView);
        getMoviebtn = findViewById(R.id.button);
        getMoviebtn.setOnClickListener(this);

         presenter = new MoviePresenter(this);
    }




    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.button){
            presenter.getMoveName();
        }
    }

    @Override
    public void onGetMovieName(String movieName) {
        movieNameTv.setText(movieName);
    }
}