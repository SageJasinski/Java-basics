package inheritence;

public class Review {
    int star;
    public String reviewBody(int stars, String review){
        star = stars;
        return(stars + " stars " + "- " + review);
    }


}
