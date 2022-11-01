package inheritence;

import java.util.ArrayList;

public class Restraunt {
    String name;
    double stars;
    int price;
    ArrayList<String> comments = new ArrayList<>();
    private final ArrayList<Integer> starCalculation = new ArrayList<>();

    public String ToString(){
        return (name + " Has a rating of " + stars + " stars, and has a price rating of " + addPrice(price));
    }

    public String addPrice(int prices){
        if(prices > 5 || prices < 0){
         return "Please enter a number between 0 and 5";
        }

        return switch (prices) {
            case 1 -> "$";
            case 2 -> "$$";
            case 3 -> "$$$";
            case 4 -> "$$$$";
            case 5 -> "$$$$$";
            default -> "";
        };
    }

    public ArrayList<String> addReview(int star, String review){
        Review body = new Review();
        String newReview = body.reviewBody(star, review);
        comments.add(newReview);
        starCalculation.add(star);
        averageRating();

        return comments;
    }

    public void averageRating(){
        double total = 0;
        for(int i = 0; i < starCalculation.size(); i++){
            total += starCalculation.get(i);
        }
        stars = (total / starCalculation.size());
    }
}
