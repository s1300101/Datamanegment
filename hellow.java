import java.util.Random;

public class hellow{
    public static void main(String [] args){
        Random rand = new Random();

        int number1 = rand.nextInt(6) + 1;
        int number2 = rand.nextInt(6) + 1;
        int sum = number1 + number2;


        System.out.println("Rolling dice...");
        System.out.println("Die 1:" + number1 );
        System.out.println("Die 2:" + number2);
        System.out.println("total value;" + sum);
    }
}