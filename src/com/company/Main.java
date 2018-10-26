package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int min = 0;
        int max = 49;
        int guesses = 1;

        String names[] = {
                "Todd", "Felipe", "Winston", "Brian", "Jake",
                "Sean", "Anika", "Claudia", "Corey", "Rishi",
                "Emma", "Emillia", "Tanner", "Bennett", "Frank",
                "Billy", "Monta", "Lance", "Carley", "Tyrone",
                "Elmer", "Ashley", "Cohen", "Ted", "Ivan",
                "Seth", "Rhys", "Eugene", "Calum", "Harold",
                "Eddie", "Gianna", "Joey", "Kim", "Josiah",
                "Luca", "Hassan", "Leonard", "Rafe", "Eesa",
                "Miley", "Ian", "Ernie", "Kira", "Ayub",
                "Albert", "Mika", "Cain", "Tia", "Garrett"};

        Arrays.sort(names);

        for (String name : names)
        {
            System.out.println(name);
        }

        System.out.println("Pick a name from above and I will try to guess it. Type \"ready\" when you have you name.");
        if (scan.nextLine().equalsIgnoreCase("ready"))
        {
            while (true) {
                int num = (max + min) / 2;
                System.out.println("Is the name you're thinking of " + names[num]);
                System.out.println(max);
                System.out.println(min);
                System.out.println(num);
                String yesno = scan.nextLine();
                if (yesno.equalsIgnoreCase("no")) {
                    System.out.println("Is the name you're thinking of closer to a or z?");
                    String input = scan.nextLine();
                    if (input.equalsIgnoreCase("a"))
                        max = num;
                    else if (input.equalsIgnoreCase("z"))
                        min = num;
                    guesses++;
                }
                else if (yesno.equalsIgnoreCase("yes"))
                    break;
            }
            System.out.println("I win! I guessed the name you're thinking of in " + guesses + " tries.");
        }
    }
}
