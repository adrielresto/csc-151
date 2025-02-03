/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package restoadriel_hello_goodbye_250203;

import javax.swing.JOptionPane;

/**
 *
 * @author restoa1637
 */
public class RestoAdriel_Hello_Goodbye_250203 {

        public static void main(String[] args) {

        String name = askName();

        String age = askAge();

        String favoriteGame = askFavoriteGame(); // Method call for favorite video game

        String mainChampion = askMainChampion(); // New method call for League of Legends main

        String welcomeMessage = createWelcomeMessage(name, age, favoriteGame, mainChampion); // Modified to include main champion

        JOptionPane.showMessageDialog(null, welcomeMessage);

        showGoodbyeMessage(name);

    }

    // Method to ask for the user's name

    public static String askName() {

        return JOptionPane.showInputDialog("What is your name?");

    }

    // Method to ask for the user's age

    public static String askAge() {

        return JOptionPane.showInputDialog("How old are you?");

    }

    // Method to ask for the user's favorite video game

    public static String askFavoriteGame() {

        return JOptionPane.showInputDialog("What is your favorite video game?");

    }

    // New method to ask for the user's main champion in League of Legends

    public static String askMainChampion() {

        return JOptionPane.showInputDialog("What is your main champion in League of Legends?");

    }

    // Method to create a welcome message

    public static String createWelcomeMessage(String name, String age, String favoriteGame, String mainChampion) {

        return "Welcome, " + name + "! You are " + age + " years old, your favorite video game is " + favoriteGame + 

               ", and your main champion in League of Legends is " + mainChampion + ". We're glad to have you here.";

    }

    // Method to show a goodbye message

    public static void showGoodbyeMessage(String name) {

        JOptionPane.showMessageDialog(null, "Thank you, " + name + ". Goodbye!");

    }

}
