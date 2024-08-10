package com.example.mvpdemo.ui;

import com.example.mvpdemo.pojo.MovieModel;

public class MoviePresenter {

    OnMovieView view;

    public MoviePresenter(OnMovieView view) {
        this.view = view;
    }

    public MovieModel getMovieFroDatabase (){
        return new MovieModel("Cast Away" , "21-10-1998" , "Very sad movie"  ,1);
    }

    public void getMoveName(){
        view.onGetMovieName(getMovieFroDatabase().getName());
    }
}

