import java.util.*;

public class Sum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter start num:");
        int start = scan.nextInt();

        System.out.println("Enter end num:");
        int end = scan.nextInt();

        int sum = (end - start + 1) * (start + end) / 2;

        System.out.println("The sum is: " + sum);
    }
}
