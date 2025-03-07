public class MultiAdd {
    public static double multiAdd(double a, double b, double c) {
        return a * b + c;
    }

    public static double expSum(double x) {
        return  (x*Math.exp(-x) + Math.sqrt(1-Math.exp(-x)));
    }
    
    public static void main(String[] args) {
         double ans = multiAdd(1.0, 2.0, 3.0);
        System.out.println(ans);

       double result = (Math.sin(ans/4) + (Math.cos(ans/4)/2));
        System.out.println(result);

        double result2 = expSum(ans);
        System.out.println(result2);

    }
}


