import java.util.Scanner;

public class Vegetable {
    double patatesfiyat = 1.40;
    double havucfiyat = 2.20;
    Scanner scanner;
    double patateskilo;
    double havuckilo;
    double fiyat;
    public void sebzeHesaplayici() {
        scanner = new Scanner(System.in);
        System.out.println("Patates Kaç Kilo Olsun ?");
        patateskilo = scanner.nextDouble();
        System.out.println("Havuç Kaç Kilo Olsun ?");
        havuckilo = scanner.nextDouble();
        fiyat = (havucfiyat*havuckilo) + (patateskilo*patatesfiyat);
        System.out.println("Sebze Borcunuz : "+fiyat+"TL");
    }

}
