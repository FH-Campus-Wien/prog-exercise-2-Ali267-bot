package at.ac.fhcampuswien;

import com.sun.tools.jdeprscan.scan.Scan;
import org.graalvm.compiler.virtual.phases.ea.PartialEscapeClosure;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void largestNumber(){

        int counter = 1;
        float number, largestNum = 0;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Number " + counter + ": ");
            number = scanner.nextFloat();

            if (counter == 1 && number <= 0){
                System.out.println("No number entered.");
                return;
            }
            if (number > largestNum){
                largestNum = number;
            }
            counter++;
            if (number <= 0){
                System.out.println("The largest number is " + String.format("%.2f", largestNum));
                return;
            }

        }while (true);


        }




    //todo Task 2
    public void stairs() {
        Scanner scanner = new Scanner(System.in);
        int input = 1;

        System.out.print("n: ");
        int n = scanner.nextInt();

        if (n <= 0){
            System.out.println("Invalid number!");
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(input++ + " ");
            }
            System.out.println();
        }

    }



    //todo Task 3
    public void printPyramid(){
        final int rows = 6;

        for (int i = 1; i <= 6; i++) {
            for (int j = 0; j < rows - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //todo Task 4
    public void printRhombus(){
        // input your solution here
        System.out.print("h: ");
        int h = new java.util.Scanner(System.in).nextInt();

        System.out.print("c: ");
        char c = new java.util.Scanner(System.in).next().charAt(0);

        int colsVar = h - 1, charIteratorUpper = 0, charIteratorLower= 0;

        if (h % 2 == 0){
            System.out.println("Invalid number!");
            return;
        }

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < Math.abs((h-1)/2 - i); j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < h - Math.abs(colsVar); j++) {
                if (i < ((h + 1) / 2)){
                    System.out.print((char) (c - Math.abs(charIteratorUpper + j)));
                }else System.out.print((char) (c - Math.abs((h-1)/2 - 1 - charIteratorLower - j)));
            }
            colsVar = colsVar - 2; //for the printing of the characters
            System.out.println();
            if ((i < ((h + 1) / 2))) {
                charIteratorUpper--;
            } else {
                charIteratorLower++;
            }
        }
    }

    //todo Task 5
    public void marks(){
        // input your solution here
        Scanner scanner = new Scanner(System.in);

        int mark = 1, negativeMarks = 0, input;
        double average = 0, sum=0;

        do {
            System.out.print("Mark " + mark + ": ");
            input = scanner.nextInt();

            while (input < 0 || input > 5){
                System.out.println("Invalid mark!");
                System.out.print("Mark " + mark + ": ");
                input = scanner.nextInt();
            }

            sum += input;

            if (input == 0){
                if (mark == 1){
                    average = sum / mark;
                }else average = sum / (mark - 1);
            }

            if (input == 5){
                negativeMarks++;
            }

            mark++;

            if (input == 0){
                System.out.println("Average: " + String.format("%.2f",average));
                System.out.println("Negative marks: " + negativeMarks);
            }

        }while (input != 0);

    }

    //todo Task 6
    public int happyNumbers() {
        int n, digit, sum = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("n: ");
        n = scanner.nextInt();

        if (n <= 0){
            System.out.println("Number invalid");
            return 0;
        }

        while (true) {
            while (n > 0) {
                digit = n % 10;
                sum = sum + digit * digit;
                n /= 10;
            }
            n = sum;
            sum = 0;
            if (n == 1) {
                System.out.println("Happy number!");
                break;
            } else if (n == 4) {
                System.out.println("Sad number!");
                break;
            }
        }
        return 0;
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