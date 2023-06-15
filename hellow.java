import java.util.Random;
import java.util.Scanner;

public class hellow{
    public static void main(String [] args){
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        int number1 = rand.nextInt(6) + 1;
        int number2 = rand.nextInt(6) + 1;
        int sum = number1 + number2;

        System.out.println("What is your name?");
        String name = sc.nextLine();
        System.out.println("hello," + name);

        System.out.println("Rolling dice...");
        System.out.println("Die 1:" + number1 );
        System.out.println("Die 2:" + number2);
        System.out.println("total value;" + sum);
	if(sum < 7) System.out.println("You lost");
	else System.out.println("You won");

    }
}
