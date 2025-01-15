/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package first_project.restoadriel;
import javax.swing.JOptionPane;
/**
 *
 * @author restoa1637
 */
public class First_projectRestoAdriel{
    /**
     * @param args the command line arguments
     */
     

    
    public static void main(String[] args) {
        // Get width from user
        String widthInput = JOptionPane.showInputDialog("Enter the width of the rectangle:");
        double width = Double.parseDouble(widthInput);

        // Get height from user
        String heightInput = JOptionPane.showInputDialog("Enter the height of the rectangle:");
        double height = Double.parseDouble(heightInput);

        // Calculate area and perimeter
        double area = width * height;
        double perimeter = 2 * (width + height);

        // Prepare the result message
        String resultMessage = String.format("Area: %.2f\nPerimeter: %.2f", area, perimeter);

        // Show results in a dialog box
        JOptionPane.showMessageDialog(null, resultMessage, "Rectangle Calculation", JOptionPane.INFORMATION_MESSAGE);
    }
}


        

        
