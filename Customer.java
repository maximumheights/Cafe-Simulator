
//Max Hite
/*On my honor as a student I have not given nor recieved any unauthorized assitance on this assignment*/

public class Customer
{

   public final String[] namesArray = new String[] {"Jerry","Halle","Hope","Bob","Kaden"};
   public final String[] entreesArray = new String[] {"Ham & Swiss Sandwich","Tomato Soup","Steamed Buns","Fried Rice","Cobb Salad"};
   public final String[] drinksArray = new String[] {"Americano","Iced Coffee","Tea","Orange Juice","Soda"};
   
   
   String[] customer = new String[3];
   public Customer()
   {
   customer[0] = namesArray[(int) ((Math.random() * (5 - 1)) + 1)];
   customer[1] = entreesArray[(int)((Math.random() * (5 - 1)) + 1)];
   customer[2] = drinksArray[(int)((Math.random() * (5 - 1)) + 1)];
   }
   
   public String toString()
   {
      return "Customer name: " + customer[0] + ". They ordered: " + customer[1] + ". Their drink of choice: " + customer[2] + ".";
   }

   
   
   

}