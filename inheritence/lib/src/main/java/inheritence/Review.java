package inheritence;

public class Review {
    int star;


    public Review(int star) {
        this.star = star;
    }


    public Review() {

    }

    public String reviewBody(int stars, String review){
        star = stars;
        return(stars + " stars " + "- " + review);
    }

    public String reviewMovie(int stars, String review, String movie){
        star = stars;
        return(stars + " stars " +  "- " + movie +  " - " + review);
    }

    public String reviewMovie(int stars, String review){
        star = stars;
        return(stars + " stars " + "- " + review);
    }
}
