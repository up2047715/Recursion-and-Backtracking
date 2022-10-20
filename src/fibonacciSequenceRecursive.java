public class fibonacciSequenceRecursive {
    public static void main(String[] args) throws Exception {  
        System.out.print(fibonacci(10));
    }

    public static int fibonacci(int n)  {
        if (n < 2) return n;
    
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

}
