import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many bottles would you like to start with?");

        int bottles = sc.nextInt();

        int originalBottles = bottles;

            while (bottles > 2) {
                System.out.println(bottles + " bottles of beer on the wall, " + bottles + " bottles of beer.");
                System.out.println("Take one down, pass it around, " + (bottles - 1) + " bottles of beer on the wall.");
                bottles = bottles - 1;

                if (bottles == 2) {
                    System.out.println(bottles + " bottles of beer on the wall, " + bottles + " bottles of beer.");
                    System.out.println("Take one down, pass it around, " + (bottles - 1) + " bottle of beer on the wall.");
                    bottles = bottles - 1;
                }

                if (bottles == 1) {
                    System.out.println(bottles + " bottle of beer on the wall, " + bottles + " bottle of beer.");
                    System.out.println("Go to the store and buy some more, " + originalBottles + " bottles of beer on the wall.");
                }
            }
        }
    }