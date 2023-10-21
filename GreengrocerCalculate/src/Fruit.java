import java.util.Scanner;

public class Fruit {
    Scanner scanner;
    double kivifiyat = 3.75;
    double cilekfiyat = 5.25;
    double kivikilo;
    double cilekkilo;
    double fiyat;
    public void meyveHesaplayici() {
        scanner = new Scanner(System.in);
        System.out.println("Çilek Kaç Kilo Olsun ?");
        cilekkilo = scanner.nextDouble();
        System.out.println("Kivi Kaç Kilo Olsun ?");
        kivikilo = scanner.nextDouble();
        fiyat = (cilekkilo*cilekfiyat) + (kivifiyat*kivikilo);
        System.out.println("Meyve Borcunuz : "+fiyat+"TL");

    }
}
