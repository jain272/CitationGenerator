/**
 *
 * Citation Generator
 *
 * Takes input from user and then displays the collected information
 * in one of the two citation formats
 *
 * @author Jatin Jain, Lab Sec LC4
 *
 * @version September 2, 2018
 */

import java.util.Scanner;

public class CitationGenerator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String FName;
        String LName;
        String Book;
        String Publisher;
        String PCity;
        String PYear;

        System.out.println("Enter Author First Name:");
        FName = input.nextLine();
        System.out.println("Enter Author Last Name:");
        LName = input.nextLine();
        System.out.println("Enter Book Title:");
        Book = input.nextLine();
        System.out.println("Enter Publisher:");
        Publisher = input.nextLine();
        System.out.println("Enter Publisher City:");
        PCity = input.nextLine();
        System.out.println("Enter Publishing Year:");
        PYear = input.nextLine();

        String MLA = LName + ", " + FName + ". " + Book + ". " + Publisher + ", " + PYear + ".";
        String APA = LName + ", " + FName.substring(0,1) + ". " + "(" + PYear + "). " + Book + ". " + PCity + ": " + Publisher + ".";
        System.out.println("MLA: " + MLA);
        System.out.println("APA: " + APA);
    }
}
