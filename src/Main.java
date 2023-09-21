import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //This creates a new scanner system.
        Scanner sc = new Scanner(System.in);
        //This asks the user to input the number of bottles they would like.
        System.out.println("How many bottles would you like to start with?");
        //This defines the integer "bottles" as their input.
        int bottles = sc.nextInt();
        //This adds a secondary variable that is equal to "bottles" to be used later to restate the original number of bottles on the wall.
        int originalBottles = bottles;
        //This starts an "if" statement, giving instructions if the input number of bottles is one.
        if (bottles == 1) {
            //This prints out the first line of the song if the above is true.
            System.out.println(bottles + " bottle of beer on the wall, " + bottles + " bottle of beer.");
            //This prints out the last line of the song if the above is true.
            System.out.println("Go to the store and buy some more, " + bottles + " bottle of beer on the wall.");
            //This ends the program if the "if" statement above is true.
            return;
        }
        //This begins the loop statement, saying to execute the following commands if the number of bottles is over two.
            while (bottles > 2) {
                //This outputs the first line of the song if the condition is true.
                System.out.println(bottles + " bottles of beer on the wall, " + bottles + " bottles of beer.");
                //This outputs the second line of the song if the condition is true.
                System.out.println("Take one down, pass it around, " + (bottles - 1) + " bottles of beer on the wall.");
                //This redefines "bottles" as the amount of bottles after one has been removed from the wall.
                bottles = bottles - 1;
            }
                //This begins an "if" statment, giving alternate instructions if the starting number of bottles is two.
                if (bottles == 2) {
                    //This prints out the first line of this verse if the condition is true.
                    System.out.println(bottles + " bottles of beer on the wall, " + bottles + " bottles of beer.");
                    //This prints out the second line of this verse if the condition is true.
                    System.out.println("Take one down, pass it around, " + (bottles - 1) + " bottle of beer on the wall.");
                    //This redefines "bottles" as the amount of bottles after one has been removed from the wall.
                    bottles = bottles - 1;
                }
                //This begins a second "if" statement, giving alternate instructions if there is only one bottle left.
                if (bottles == 1) {
                    //This outputs the penultimate line of the song if the above is true.
                    System.out.println(bottles + " bottle of beer on the wall, " + bottles + " bottle of beer.");
                    //This prints out the final line of the song if the above is true.
                    System.out.println("Go to the store and buy some more, " + originalBottles + " bottles of beer on the wall.");
                }
        }
    }