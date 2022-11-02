package inheritence;

import java.util.ArrayList;

public class Theater {
    String name;
    ArrayList<String> movies = new ArrayList<>();
    ArrayList<String> comments = new ArrayList<>();

    public Theater(String name, ArrayList<String> movies) {
        this.name = name;
        this.movies = movies;
    }

    public Theater(String name) {
        this.name = name;
    }

    public void addMovie(String movie){
        this.movies.add(movie);
    }

    public void removeMovie(String remove){
        this.movies.remove(remove);
    }

    public ArrayList<String> addReview(int star, String review){
        Review body = new Review();
        String newReview = body.reviewMovie(star,review);
        comments.add(newReview);

        return comments;
    }

    public ArrayList<String> addReview(int star, String review, String movie){
        Review body = new Review();
        String newReview = body.reviewMovie(star,review, movie);
        comments.add(newReview);
        return comments;
    }

}
