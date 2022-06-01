public class Main {
    public static void main(String[] args) {
        byte byteValue = 8;
        short shortValue = 300;
        int intValue = 64000;

        long longTotal = 50000L + 10L * (byteValue + shortValue + intValue);

        System.out.println(longTotal);
    }
}