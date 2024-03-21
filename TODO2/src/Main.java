import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        BigInteger num1 = new BigInteger("5468451211");
        BigInteger num2 = new BigInteger("6548115465");

        // Penambahan
        BigInteger sum = num1.add(num2);
        System.out.println(num1 +" + " + num2 + " = "+ sum);

        // Pengurangan
        BigInteger difference = num1.subtract(num2);
        System.out.println(num1 +" - " + num2 + " = " + difference);

        // Perkalian
        BigInteger product = num1.multiply(num2);
        System.out.println(num1 +" x " + num2 + " = " + product);

        // Pembagian
        BigInteger quotient = num2.divide(num1);
        System.out.println(num2 +" : " + num1 + " = " + quotient);
    }
}
