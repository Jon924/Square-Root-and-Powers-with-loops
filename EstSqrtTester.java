public class EstSqrtTester {

    public static double estSqrt(double a){
        double sqrt = a/2;
        int count = 0;
        while(count<20){
            count++;
            sqrt = (sqrt +(a/sqrt))/2;
        }
        return sqrt;
    }

    public static void main(String[] args) {

        double num;

        for (int i = 0; i < 3; i++) {

            num = Math.random()*Math.pow(10,(Math.random()*4));

            System.out.printf("Square root of %7.2f is %7.2f\n", num, estSqrt(num));

        }

    }

}