/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package restoadriel_hello_goodbye_250203_v2;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.Dimension;
import java.util.Random;

public class RestoAdriel_Hello_Goodbye_250203_V2 {

    public static void main(String[] args) {

        String name = askName();
        String age = askAge();
        String favoriteGame = askFavoriteGame(); // Method call for favorite video game
        String mainChampion = askMainChampion();   // Method call for League of Legends main

        String welcomeMessage = createWelcomeMessage(name, age, favoriteGame, mainChampion);
        JOptionPane.showMessageDialog(null, welcomeMessage);

        // Generate and display random alphanumeric class codes
        generateClassNumbers();

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

    // Method to ask for the user's main champion in League of Legends
    public static String askMainChampion() {
        return JOptionPane.showInputDialog("What is your main champion in League of Legends?");
    }

    // Method to create a welcome message
    public static String createWelcomeMessage(String name, String age, String favoriteGame, String mainChampion) {
        return "Welcome, " + name + "! You are " + age + " years old, your favorite video game is " 
                + favoriteGame + ", and your main champion in League of Legends is " + mainChampion 
                + ". We're glad to have you here.";
    }
    
    // Modified method to generate random alphanumeric class codes
    public static void generateClassNumbers() {
        String input = JOptionPane.showInputDialog("Enter the number of class number combinations to generate:");
        int count;
        try {
            count = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid input. Generating 5 combinations by default.");
            count = 5;
        }
        
        // Define a pool of alphanumeric characters (0-9 and A-Z)
        String pool = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int codeLength = 4;  // Set the length of each class code (adjust as needed)
        
        Random rand = new Random();
        StringBuilder output = new StringBuilder("Generated Class Numbers:\n");
        
        for (int i = 0; i < count; i++) {
            StringBuilder code = new StringBuilder();
            for (int j = 0; j < codeLength; j++) {
                code.append(pool.charAt(rand.nextInt(pool.length())));
            }
            output.append(code.toString()).append("\n");
        }
        
        // Use a JTextArea inside a JScrollPane to display the output, which is handy for many class codes.
        JTextArea textArea = new JTextArea(output.toString());
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setPreferredSize(new Dimension(500, 400));
        
        JOptionPane.showMessageDialog(null, scrollPane, "Class Number Combinations", JOptionPane.INFORMATION_MESSAGE);
    }

    // Method to show a goodbye message
    public static void showGoodbyeMessage(String name) {
        JOptionPane.showMessageDialog(null, "Thank you, " + name + ". Goodbye!");
    }
}

