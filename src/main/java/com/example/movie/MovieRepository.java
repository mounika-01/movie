// Write your code here
package com.example.movie;

import java.util.*;

import com.example.movie.Movie;

public interface MovieRepository {
    
    ArrayList<Movie> getMovies();
    
    Movie getMovieById(int moiveId); 
    
    Movie addMovie(Movie movie);
    
    Movie updateMovie(int movieId, Movie movie);
    
    void deleteMovie(int movieId);

}