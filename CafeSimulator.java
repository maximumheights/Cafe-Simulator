/**
 * The CafeSimulator class works with a small array of tables to test the ability to seat and clear tables with
 * varying party sizes, as well as the ability to block seating of an unavailable or undersized table.
 * @author Kimberly A. Baram kabaram@fcps.edu
 * @version 1.0
 */
public class CafeSimulator{
   /**
    * The available tables in the cafe
    */
   private Table[] tables;
   
   /**
    * Instantiates an array of 4 empty tables
    */
   public CafeSimulator(){
      tables = new Table[4];
      for (int i = 0; i < tables.length; i++){
         tables[i] = new Table();
      }
   }
   
   /**
    * Prints the current status of all tables in the cafe
    */
   public void printTables(){
      int num = 1;
      for (Table t : tables){
         System.out.println("Table " + num + ":\n" + t + "\n");
         num++;
      }
   }
   
   /**
    * Simulates 10 "rounds," alternating between attempting to seat a table
    * and clearing a table in each round.
    */
   public void run(){     
     for (int i = 1; i <= 10; i++){
           System.out.println("\n\nTHE GEN WHY PIT");
           System.out.println("Current Status, Round  " + i);
           printTables();
           if (i % 2 == 1){
            int group = (int)(Math.random() * 4) + 2;
            int tableNum = (int)(Math.random() * tables.length);
            System.out.println("Attempting to seat a party of " + group + " at Table " + (tableNum + 1));
            tables[tableNum].seat(group);
           }
           else{
            int tableNum = (int)(Math.random() * tables.length);
            System.out.println("Clearing Table " + (tableNum + 1));
            tables[tableNum].clear();
           }
     }
     System.out.println("\n\nFINAL STATUS:");
     printTables();
   }
   
   /**
    * Creates the simulator object and runs it.
    * @param args not used
    */
   public static void main(String[] args){
      CafeSimulator sim = new CafeSimulator();
      sim.run();
   }
}