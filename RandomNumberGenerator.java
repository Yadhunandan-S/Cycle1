// Generate a random number without using random class
public class RandomNumberGenerator {
    private static long seed = System.currentTimeMillis(); // Initial seed based on current time

    // LCG parameters (adjust as needed)
    private static final long multiplier = 1664525;
    private static final long increment = 1013904223;
    private static final long modulus = (long) Math.pow(2, 32);

    public static int nextInt() {
        seed = (multiplier * seed + increment) % modulus;
        return (int) seed;
    }

    public static void main(String[] args) {
        // Generate and print 10 random numbers
        for (int i = 0; i < 10; i++) {
            System.out.println(nextInt());
        }
    }
}
