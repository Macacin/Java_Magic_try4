import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int num1 = new Random().nextInt();
        int num2 = new Random().nextInt();

        if ((num1 % 2 == 0) && (num2 % 2 == 0)) {
            num1 /= 2;
            num2 /= 2;
            System.out.println(num1 + num2);
        } else if ((num1 % 2 == 0) && (num2 % 2 != 0)) {
            num1 /= 2;
            System.out.println(num1 + num2);
        } else if ((num1 % 2 != 0) && (num2 % 2 == 0)) {
            num2 /= 2;
            System.out.println((num1 + num2));
        } else {
            System.out.println(num1 + num2);
        }

        Birdamen sorting_birdman = new Birdamen();
        sorting_birdman.sort();
    }
}