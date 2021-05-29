
/**
 * learn how to use and print 2d arrays
 * 3/25/2021
 * Ryan Wagner
 * PMR
 */
public class CatapultTester
{
   public static void main(String[] args){
        int[] speeds = {20, 25, 30, 35, 40, 45, 50};
        int[] degrees = {25, 30, 35, 40, 45, 50};
        Catapult catapult = new Catapult("Apple", "mph", speeds, degrees);
        Catapult catapult2 = new Catapult("Orange", "kph", speeds, degrees);
        
        printResults(catapult, doMath(speeds, degrees, catapult.getUnit()));
        printResults(catapult2, doMath(speeds, degrees, catapult2.getUnit()));
   }
   
   public static void printResults(Catapult catapult, double[][] data){
       String unit = "", unitPerHour = "";
       if(catapult.getUnit().equals("mph")){
           unit = "(feet)";
           unitPerHour = "MPH";
       }
       if(catapult.getUnit().equals("kph")){
           unit = "(meters)";
           unitPerHour = "KPH";
       }
       
       System.out.printf("\n%50s %s \n\n%s", "Projectile Distance ", unit, unitPerHour);
       for(int i: catapult.getSpeeds()){
           System.out.printf("%7s %s", i, "deg");
       }
       System.out.printf("\n %s", "=================================================================================");
       for(int i = 0; i < catapult.getDegrees().length; i++){
           System.out.printf("\n%s", catapult.getSpeeds()[i]);
           for(int j = 0; j < catapult.getSpeeds().length; j++){
               System.out.printf("%11s", data[i][j]);
           }
       }
   }
   
   public static double[][] doMath(int[] speeds, int[] degrees, String units){
       double[][] output = new double[degrees.length][speeds.length];
       for(int i = 0; i < degrees.length; i++){
           for(int j = 0; j < speeds.length; j++){
               int index = 0;
               if(units.equals("mph")){
                   output[i][j] = Math.round((Math.pow(speeds[j], 2) * Math.sin(Math.toRadians(2.0 * degrees[i]))) / (9.8) * (3.2808));
               }
               if(units.equals("kph")){
                   output[i][j] = Math.round((Math.pow(speeds[j], 2) * Math.sin(Math.toRadians(2.0 * degrees[i]))) / (9.8));
               }
           }
       }
       return output;
   }
}
