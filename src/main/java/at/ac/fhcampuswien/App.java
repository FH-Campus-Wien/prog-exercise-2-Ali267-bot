package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void largestNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number 1: ");
        double eingabe = scanner.nextDouble();

        int counter = 1;
        double number = eingabe;

        if (eingabe <= 0 && counter == 1){
            System.out.println("No number entered.");
        }else {
            while(eingabe > 0){
                counter++;
                System.out.println("Number" + counter + ": ");
                eingabe = scanner.nextDouble();

                if (eingabe > number)
                    number = eingabe;
            }
            System.out.print("The largest number is " + String.format("%.2f", number));

        }


        }




    //todo Task 2
    public void stairs() {
        Scanner scanner2 = new Scanner(System.in);
        int n = scanner2.nextInt();
        System.out.print("n: ");
        int i, j, number = 1;

        if (n < 0) {
            System.out.println("Invalid number!");
        }

        for (i = 1; i <= n; i = i + 1) {
            for (j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number = number + 1;
            }
            System.out.println();
        }
    }



    //todo Task 3
    public void printPyramid(){
        int i;
        int j;
         int rowsNum = 6;

        for (i = 0; i <= rowsNum; i++){
            for (j = rowsNum - i - 1; j > 0;j--) {
                System.out.print(" ");
            }
            for (j = 0; j < i * 2 +1;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //todo Task 4
    public void printRhombus(){
        // input your solution here
    }

    //todo Task 5
    public void marks(){
        // input your solution here
    }

    //todo Task 6
    public int happyNumbers() {
        Scanner scanner3 = new Scanner(System.in);
        System.out.print("n: ");
        int n = scanner3.nextInt();
        int happy = n;
        int sum = 0;
        int digit;


        while (n != 1 & n != 4) {
            while (n != 0) {
                digit = n % 10;
                sum += Math.pow(digit, 2);
                n = n / 10;
            }
            n = sum;
            sum = 0;
        }
        if (n == 1) {
            System.out.println("Happy number!");
        } else
            System.out.println("Sad number!");
        return sum;
    }







    public static void main(String[] args){
        App exercise2 = new App();

        System.out.println("Task 1: Largest Number");
        exercise2.largestNumber();

        System.out.println("\nTask 2: Stairs");
        exercise2.stairs();

        System.out.println("\nTask 3: Pyramide");
        exercise2.printPyramid();

        System.out.println("\nTask 4: Raute");
        exercise2.printRhombus();

        System.out.println("\nTask 5: Notendurchschnitt");
        exercise2.marks();

        System.out.println("\nTask 6: Fröhliche Zahlen");
        exercise2.happyNumbers();
    }
}