import java.util.Scanner;

public class Calculate {
    Vegetable vegetable;
    Fruit fruit;
    Scanner scanner;
    public void calculateGreengrocer() {

        vegetable = new Vegetable();
        fruit = new Fruit();

        scanner = new Scanner(System.in);
        System.out.println("Meyve mi almak istersiniz yoksa Sebze almak mı ya da her ikisi mi...");
        System.out.println("Eğer Meyve ise 1'i Eğer Sebze ise 2'yi Her ikisi ise 3'ü tuşlayınız...");
        int sayi = scanner.nextInt();
        if (sayi == 2) {
            vegetable.sebzeHesaplayici();
        } else if (sayi == 1) {
            fruit.meyveHesaplayici();
        } else if (sayi == 3) {
            fruit.meyveHesaplayici();
            vegetable.sebzeHesaplayici();
            double sonfiyat = fruit.fiyat + vegetable.fiyat;
            System.out.println("Toplam Borcunuz : "+sonfiyat);
        }
    }

}
