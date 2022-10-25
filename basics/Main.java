import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void pluralize (String pet, int count) {
        if(count > 1 || count == 0){
            System.out.println("I own " + count + " " + pet + "s");
        }else {
            System.out.println("I own " + count + " " + pet);
        }
    }

    public static void flipNHeads(int headTimes){
        Random flip = new Random();

        int headsFound = 0;
        int flips = 0;

        while(headsFound < headTimes){
            flips++;
            double f = flip.nextDouble();

            if(f < .5){
                System.out.println("Tails");
                headsFound = 0;
            } else if (f > .5) {
                System.out.println("Heads");
                headsFound++;
            }
        }

        System.out.println("It took " + flips + " flips to flip " + headTimes + " in a row.");
    }

    public static void clock() throws InterruptedException {

        while(true) {
            LocalTime now = LocalTime.now();
            String time = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));

            System.out.println(time);
            TimeUnit.SECONDS.sleep(1);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        int dogCount = 1;
        int catCount = 2;
        int turtleCount = 0;
        int n = 2;

        pluralize("dog", dogCount);
        pluralize("cat", catCount);
        pluralize("turtle", turtleCount);

        flipNHeads(n);

        clock();
    }
}
