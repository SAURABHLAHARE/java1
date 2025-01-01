public class EvenNumbers {
    public static void main(String[] args) {
        for (int i = 2; i <= 20; i += 2) {
            System.out.println(i);
        }
    }
}

import java.util.Scanner;

public class FlightChoice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int flightChoice = -1;

        while (flightChoice < 1 || flightChoice > 3) {
            System.out.println("Please enter your flight choice (1, 2, or 3): ");
            flightChoice = scanner.nextInt();
        }
        
        System.out.println("You selected flight choice: " + flightChoice);
        scanner.close();
    }
}

3
public class Fibonacci {
    public static void main(String[] args) {
        int num1 = 0, num2 = 1;
        
        System.out.println("First 10 Fibonacci numbers:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num1);
            int nextNum = num1 + num2;
            num1 = num2;
            num2 = nextNum;
        }
    }
}
4
public class SumIntegers {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        
        while (i <= 100) {
            sum += i;
            i++;
        }
        
        System.out.println("Sum of integers from 1 to 100: " + sum);
    }
}

5
public class SumNaturalNumbers {
    public static void main(String[] args) {
        int sum = 0;
        
        for (int i = 1; i <= 5; i++) {
            sum += i;
        }
        
        System.out.println("Sum of the first 5 natural numbers: " + sum);
    }
}

