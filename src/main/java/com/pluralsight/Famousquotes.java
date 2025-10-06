package com.pluralsight;

import java.util.Scanner;

public class Famousquotes {
    public static void main(String[] args) {
       boolean famousQuotes = true;
        while(famousQuotes){
            try {
                Scanner sc = new Scanner(System.in);

                String [] quotes = {"Be the change that you wish to see in the world.— Mahatma Gandhi", "In the middle of difficulty lies opportunity.-Albert Einstein", "The only thing we have to fear is fear itself.— Franklin D. Roosevelt",
                 "I think, therefore I am.— René Descartes", "That which does not kill us makes us stronger.— Friedrich Nietzsche", "You miss 100% of the shots you don't take.— Wayne Gretzky",
                "The unexamined life is not worth living.— Socrates", "Less is more.— Ludwig Mies van der Rohe", "Seize the day.— Horace", "Stay hungry. Stay foolish.— Steve Jobs"};

                System.out.print("\nSelect from (0-9) To Get The Top 10 Famous Quotes OAT: ");
                int choice = sc.nextInt();

                System.out.print(quotes[choice]);



            }catch (Exception e){
                System.out.println(e.getMessage());
                System.out.print("Please enter a number between 0 and 9\n");
            }
        }
    }
}
