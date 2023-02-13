//Max Hite
/*On my honor as a student I have not given nor recieved any unauthorized assitance on this assignment*/

public class Table
{

   private Customer [] customers;
   private final int maxSeating;
   
   public Table(){
      customers = new Customer[0];
      maxSeating = (int)((Math.random() * 9) + 2);
   }
   
   public void clear(){
      customers = new Customer[0];
   }
   
   public void seat(int group){
      if (group <= maxSeating && customers.length == 0){
         customers = new Customer[group];
         for (int i = 0; i <customers.length; i++)
         {
            customers[i] = new Customer();
         }
      }
      
      else
      {
         System.out.println("This table is unavailable");  
      }
   } 
   
   public String toString(){
      String returnVal = maxSeating  + " seats\n" + customers.length + " people sat\n";
      
      for(int i = 0; i < customers.length; i++){
      returnVal += "\n" + customers[i].toString();
      }
      return returnVal;
   } 
}