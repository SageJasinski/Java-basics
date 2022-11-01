# Restaurant and review inheritance

## Restaurant

here you have a restaurant class which can taken in a name, a price range. in this class you have a couple different methods at your disposal. First is the addPrice method which will allow you to convert the price response for the restaurant into a more UI friendly visual of dollar signs if the user enters an int over 5 then they are prompted to enter between 0 and 5 as their price for the restaurant.
The next is an addReview method which extends the review class. the Review class takes in a users star rating and review and will return a "comment" with their review.
the addReview will take this review and set it to this particular restaurant as well as update the restaurants overall star rating to the average of all stars in the comments.
last method we have is a ToString method. When this method is called it will give you a brief description containing the restaurants name, average star rating, and the price value of the restaurant.


## Tests

there are a couple test to test the methods. First test is to make sure the price UI method is working properly first by testing that when 4 is entered you get and equivalent number of dollar signs, the second test test the error response when a user enter a number higher than  5.
the next test will test that when you set up a restaurant the ToString method will return the correct string and information. 
the next test will test making reviews and checks that you can add a single review and multiple review to the restraint and that it will calculate the correct average number of stars.