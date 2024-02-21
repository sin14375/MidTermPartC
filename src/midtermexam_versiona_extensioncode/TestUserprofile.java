/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;

import java.util.Scanner;

/**
 *
 * @author singh
 */
public class TestUserprofile {
         public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String userName = scanner.nextLine();

        System.out.println("Choose your favorite genre from the list:");
        displayGenres();

        System.out.print("Enter the number corresponding to your favorite genre: ");
        int genreChoice = scanner.nextInt();

        // Ensure the genreChoice is within a valid range
        if (genreChoice >= 1 && genreChoice <= 4) {
            String selectedGenre = getGenreByChoice(genreChoice);

            // Create a new UserProfile
            UserProfile userProfile = new UserProfile(userName, selectedGenre);

            // Display a message
            System.out.println("\nUser Profile Created:\n" +
                    "Name: " + userName + "\n" +
                    "Favorite Genre: " + selectedGenre);
        } else {
            System.out.println("Invalid genre choice. Please run the program again and choose a valid genre.");
        }
    }

    private static void displayGenres() {
        String[] genres = {"Comedy", "Drama", "Action", "Mystery"};

        for (int i = 0; i < genres.length; i++) {
            System.out.println((i + 1) + ". " + genres[i]);
        }
    }

    private static String getGenreByChoice(int choice) {
        String[] genres = {"Comedy", "Drama", "Action", "Mystery"};
        return genres[choice - 1];
    }
}
