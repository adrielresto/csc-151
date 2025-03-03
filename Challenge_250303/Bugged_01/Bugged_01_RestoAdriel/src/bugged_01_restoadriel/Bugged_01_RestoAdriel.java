package bugged_01_restoadriel;



import java.util.Scanner;
public class Bugged_01_RestoAdriel
{
   public static void main(String[] args)
   {
      final double GUEST_PRICE = 35.00;
      double price;
      int guests;
      Scanner input = new Scanner(System.in);
      System.out.print("Enter number of guests >> ");
      guests = input.nextInt();
      System.out.println("***************************************************");
      System.out.println("*                                                 *");
      System.out.println("*  Jim's food makes the party great.              *");
      System.out.println("*                                                 *");
      System.out.println("***************************************************");
      price = guests * GUEST_PRICE;
      System.out.println("The price for an event with " + guests);
      System.out.println(" guests at $" + GUEST_PRICE + " per guest is $" + price);

   }
}
























































































;