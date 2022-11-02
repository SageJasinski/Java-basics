package inheritence;

import java.util.ArrayList;
public class Shop {
    String name;
    String description;
    int price;

    ArrayList<String> comments = new ArrayList<>();

    public Shop(String name, String description, int price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public String ToString(){
        if(name != null && description != null && price != 0){
            return (name + " is " + description + " This shop has a price range of " + addPrice(price));
        }else{
            return "Please enter a valid shop!";
        }
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
//        starCalculation.add(star);
//        averageRating();

        return comments;
    }

}
