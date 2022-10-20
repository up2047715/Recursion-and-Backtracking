public class fibonacciSequence {
    public static void main(String[] args) throws Exception {  
        fibonacci(45);
    }

 public static void fibonacci(int n) {

    int currentNumber = 1;
    int previousNumber = 0;
    int temp = 0;

    System.out.print(previousNumber + "\n" + currentNumber + "\n");

    for (int i = 0; i < n; i++){ 
        temp = previousNumber + currentNumber;
        previousNumber = currentNumber;
        currentNumber = temp;

        System.out.print(currentNumber + "\n");
    }

    }

}