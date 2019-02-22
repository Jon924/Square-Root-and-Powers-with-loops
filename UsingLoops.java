
/**
 * Write a description of class UsingLoops here.
 *
 * @author Jon Grey
 * @version 1.0
 */
public class UsingLoops
{
    /**
     *  Calculate the year when the population reaches a certain number.
     *
     * @param  initYear initial year - type: int
     * @param  initPop population in the initial year, in million - type: double
     * @param  futurePop population in a future year - type: double
     * @param  growth growth rate per year - type: double
     * 
     * @return   the “future” year (of type int) when the population reaches the given number
     */
    public static int popGrowth(int initYear, double initPop, double futurePop, double growth)
    {
        int year = initYear;
        double pop = initPop;
        while(pop <futurePop){
            pop*= (1.0 + growth);
            year++;
        }   
        return year;
    }
    
    /**
     * Add the integers that are multiple of 3, within 1 to n
     * 
     * @param n n
     * 
     * @return the sum
     */
    public static int addMultOf3(int n){
        int sum = 0;
        for(int i = 3; i <= n; i+=3){
            sum+=i;
        }
        return sum;
    }
    
    /**
     *  The number of chairs in a row in a theater is k more than the number of chairs in the
row before it. Given the number of chairs in certain row, calculate the number of chairs in another
row (before or after that row).
     * 
     * @param rowNum1  row number, with count1 chairs 
     * @param count1  number of chairs in rowNum1
     * @param k  difference in number of chairs between 2 consecutive rows
     * @param rowNum2  row number where the number of chairs is to be calculated
     * 
     * @return number of chairs in rowNum2
     */
    public static int calcChairs(int rowNum1, int count1, int k, int rowNum2){
        int row = rowNum1;
        int numC = count1;
        if(rowNum1>rowNum2){
            while(row>rowNum2){
                numC-=k;
                row--;
            }    
        }else{
            while(row<rowNum2){
                numC+=k;
                row++;
            }
        }
        return numC;
    }
    
    /**
     *  Calculate the number of months when a student achieves certain percentage of the
knowledge from studying certain material.
     * 
     * @param r rate (of type double) of knowledge gained after one month; e.g., 0.1 for 10% 
     * @param percentWanted desired % of knowledge of material (of type double); e.g., 0.85 for 85% 
     * 
     * @return number of months (of type double) to obtain the desired % of knowledge of material 
     */
    public static double knowledgeGrowth(double r, double percentWanted){
        double month = 0;
        double left = 1;
        double knowledge = 0.0;
        while(knowledge < percentWanted){
            knowledge+= (r*left);
            left -= (r*left);
            month++;
        }
        return month;
    }
    
    /**
     * Estimate the value of pi, based on the Gregory Series
     * 
     * @param n (of type int): the number of terms to estimate pi 
     * 
     * @return estimated pi value (of type double)
     */
    public static double estPi(int n){
        double sum = 0;
        int count = 1;
        for(int i = 1; i<=((n*2)-1);i+=2){
            double frac = 1.0/i;
            if(count%2==1){
                sum+=frac;
            }else{
                 sum-=frac;
            }    
            count++;
        }
        return sum*4;
    }
    
    /**
     * Display, in the Terminal/Console Window, a triangle where the
first line has one “X” and the last has (2n-1) “X”s
     * 
     * @param n (of type int) 
     * 
     */
    public static void starTriangle(int n){
        for(int i = 1; i<=((n*2)-1);i+=2){
            for(int k = 1; k<=i; k++){
                System.out.print("X");
            }
            System.out.println("");
        }
    }
    
    /**
     * Display, in the Terminal/Console Window, an n n  identity matrix, where the diagonal
is 1s and the rest is 0s
     * 
     * @param n (of type int): number of rows or columns 
     * 
     */
    public static void identMatrix(int n){
        for(int i = 1; i<=n; i++){
            for(int k = 1; k<=n; k++){
                if(i==k){
                    System.out.print("1 ");
                }else{
                    System.out.print("0 ");
                }
            }
            System.out.println("");
        }
    }
    
    /**
     * Main method to test other methods
     */
    public static void main(String[] args){
        System.out.println(popGrowth(2010, 10000, 50000, 0.02));
        
        System.out.println(addMultOf3(10));
        
        System.out.println(calcChairs(4, 7, 2, 6));
        
        System.out.println(knowledgeGrowth(.10, .90));
        
        System.out.println(estPi(3));
        
        starTriangle(4);
        
        identMatrix(4);
    }
}


