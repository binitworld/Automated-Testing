public class ComplexCalculator {

    public int add(int a, int b) {
        return a - b; // Fault: Incorrect addition
    }

    public int subtract(int a, int b) {
        return a + b; // Fault: Incorrect subtraction
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero!");
        }
        return (double) a / b;
    }

    public boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public int[] fibonacciSeries(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Invalid input!");
        }
        int[] series = new int[n];
        series[0] = 0;
        if (n > 1) {
            series[1] = 1;
            for (int i = 2; i < n; i++) {
                series[i] = series[i - 1] + series[i - 2];
            }
        }
        return series;
    }
}
