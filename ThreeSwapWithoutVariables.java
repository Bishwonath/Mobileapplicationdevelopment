public class ThreeSwapWithoutVariables {

    public static void main(String[] args) {
        int a = 5, b = 10, c = 15;

        System.out.println("Before swap: a = " + a + ", b = " + b + ", c = " + c);

        // Swap values of a, b, and c without using temporary variables
        a = a + b + c; // Step 1: a holds the sum of all three variables
        b = a - (b + c); // Step 2: b now holds the original value of a
        c = a - (b + c); // Step 3: c now holds the original value of b
        a = a - (b + c); // Step 4: a now holds the original value of c

        System.out.println("After swap: a = " + a + ", b = " + b + ", c = " + c);
    }
}
