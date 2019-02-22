
/**
 * Write a description of class sumMultiplePowers here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class sumMultiplePowers
{
    public static double sumMultiplw(double x, int n){
        int a = 2;
        int sum = 0;
        int count = 1;
        int num = 1;
        while(a<=n){
            if(count<a){
                num*=x;
                count++;
            }else{
                num*=a;
                sum+=num;
                a+=2;
                count = 1;
                num = 1;
            }
        }
        return sum;
    }
}
