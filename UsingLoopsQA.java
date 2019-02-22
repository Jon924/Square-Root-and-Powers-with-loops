
/**
 * Write a description of class UsingLoopsQA here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class UsingLoopsQA
{
    public static void main(String[] args) {
        double targetPop = 31;
        System.out.println("\npopGrowth: target pop = " 
                            + UsingLoops.popGrowth(
                            2001, 29, targetPop, 0.03));
        targetPop = 47.32;
        System.out.println("popGrowth: target pop = " 
                            + UsingLoops.popGrowth(
                            2001, 29, targetPop, 0.03));
        targetPop = 58;
        System.out.println("popGrowth: target pop = " 
                            + UsingLoops.popGrowth(
                            2001, 29, targetPop, 0.03));

        int n = 3;
        System.out.println("\naddMultOf3: sum = " 
                            + UsingLoops.addMultOf3(n));
        n = 11;
        System.out.println("addMultOf3: sum = " 
                            + UsingLoops.addMultOf3(n));
        n = 326;
        System.out.println("addMultOf3: sum = " 
                            + UsingLoops.addMultOf3(n));
                            
        int rowNum1 = 4;
        int count1 = 26;
        int k= 9;
        int rowNum2 = 7;
        System.out.println("\ncalcChairs: #chairs = " 
                            + UsingLoops.calcChairs(rowNum1, count1, k, rowNum2));
        rowNum1 = 7;
        count1 = 38;
        k= 5;
        rowNum2 = 12;
        System.out.println("calcChairs: #chairs = " 
                            + UsingLoops.calcChairs(rowNum1, count1, k, rowNum2));
        rowNum1 = 27;
        count1 = 141;
        k= 3;
        rowNum2 = 5;
        System.out.println("calcChairs: #chairs = " 
                            + UsingLoops.calcChairs(rowNum1, count1, k, rowNum2));
             
        
        double rate = 1.0;
        double targetPercent = 1.0;
        System.out.println("\nknowledgGrowth: #months = " 
                            + UsingLoops.knowledgeGrowth(rate, targetPercent));
        rate = 0.1;
        targetPercent = 0.85;
        System.out.println("knowledgGrowth: #months = " 
                            + UsingLoops.knowledgeGrowth(rate, targetPercent));
        rate = 0.08;
        targetPercent = 0.95;
        System.out.println("knowledgGrowth: #months = " 
                            + UsingLoops.knowledgeGrowth(rate, targetPercent));
        
                            
        int repeats = 1300;
        System.out.printf("\nestPi: pi = %7.4f\n" , 
                            UsingLoops.estPi(repeats));
        repeats = 11632;
        System.out.printf("estPi: pi = %7.4f\n" ,
                            UsingLoops.estPi(repeats));
        repeats = 89345;
        System.out.printf("estPi: pi = %7.4f\n" ,
                            UsingLoops.estPi(repeats));
   
   }
}
