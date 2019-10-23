import java.util.Scanner;

public class PairProcess {

    public static void main(String[] args) {
        int num1, num2;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("First number? : ");
        num1 = keyboard.nextInt();

        System.out.print("Second number? : ");
        num2 = keyboard.nextInt();

        int sum = num1 + num2;  //sum of num1 and num2
        int product = num1 * num2; //product of num1 & num2
        int average = sum / 2; //average of sum1 & sum2

        if (sum > 200) {
            System.out.println(sum + "*");
        }
        else if (sum < 1000){
            System.out.println(sum + "~");
            System.out.println(product);
            System.out.println(average);

        }

    }

}