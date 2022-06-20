import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kg = new Scanner(System.in);
        double armutPrice = 2.14;
        double elmaPrice = 3.67;
        double domatesPrice = 1.11;
        double muzPrice = 0.95;
        double patlicanPrice = 5.0;

        System.out.println("Armut kac kilo: ");
        double armut = kg.nextDouble();
        System.out.println("Elma kac kilo: ");
        double elma = kg.nextDouble();
        System.out.println("Domates kac kilo: ");
        double domates = kg.nextDouble();
        System.out.println("Muz kac kilo: ");
        double muz = kg.nextDouble();
        System.out.println("Patlican kac kilo: ");
        double patlican = kg.nextDouble();

        double total = armut * armutPrice + elma * elmaPrice + domates * domatesPrice + muz * muzPrice + patlican * patlicanPrice;

        System.out.println("Toplam ödenecek Tutar : " + total + " TL'dir.");


        System.out.println("Teşekkür Ederiz");
    }
}