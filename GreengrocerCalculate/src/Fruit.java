import java.util.Scanner;

public class Fruit {
    Scanner scanner = new Scanner(System.in);
    double kivifiyat = 3.75;
    double cilekfiyat = 5.25;
    double elmafiyat = 1.15;
    double armutfiyat = 2.00;
    double portakalfiyat = 3.25;
    double mandalinafiyat = 3.25;
    double kirazfiyat = 2.50;
    //---------------------------------------------------------------------------------
    double kivikilo;
    double cilekkilo;
    double elmakilo;
    double armutkilo;
    double portakalkilo;
    double mandalinakilo;
    double kirazkilo;
    double fiyat = 0;
    int secim;

    public void meyveHesaplayici() {

        System.out.println("Hangi Meyveden Kaç kilo almak istersiniz ? Lütfen Seçiniz...");
        System.out.println("(1)Elma --> "+elmafiyat+"\n(2)Armut --> "+armutfiyat+"\n(3)Çilek --> "+cilekfiyat+"\n(4)Kiraz --> "+kirazfiyat+"\n(5)Mandalina --> "+mandalinafiyat+"\n(6)Portakal --> "+portakalfiyat+"\n(7)Kivi --> "+kivifiyat);

        secim = scanner.nextInt();
        while (true) {

            switch (secim) {
                case 1:
                    System.out.println("Elma Kaç Kilo Olsun ?");
                    elmakilo = scanner.nextDouble();
                    fiyat = fiyat + (elmafiyat * elmakilo);
                    break;
                case 2:
                    System.out.println("Armut Kaç Kilo Olsun ?");
                    armutkilo = scanner.nextDouble();
                    fiyat = fiyat + (armutkilo * armutfiyat);
                    break;
                case 3:
                    System.out.println("Çilek Kaç Kilo Olsun ?");
                    cilekkilo = scanner.nextDouble();
                    fiyat = fiyat + (cilekkilo * cilekfiyat);
                    break;
                case 4:
                    System.out.println("Kiraz Kaç Kilo Olsun ?");
                    kirazkilo = scanner.nextDouble();
                    fiyat = fiyat + (kirazkilo * kirazfiyat);
                    break;
                case 5:
                    System.out.println("Mandalina Kaç Kilo Olsun ?");
                    mandalinakilo = scanner.nextDouble();
                    fiyat = fiyat + (mandalinakilo * mandalinafiyat);
                    break;
                case 6:
                    System.out.println("Portakal Kaç Kilo Olsun ?");
                    portakalkilo = scanner.nextDouble();
                    fiyat = fiyat + (portakalkilo * portakalfiyat);
                    break;

                case 7:
                    System.out.println("Kivi Kaç Kilo Olsun ?");
                    kivikilo = scanner.nextDouble();
                    fiyat = fiyat + (kivikilo * kivifiyat);
                    break;



            }
            System.out.println("Başka Bişi Almak İstermisiniz Evet ise 1 Hayır ise 2'ye Tuşlayınız...");
            int karar = scanner.nextInt();
            if (karar == 1) {
                System.out.println("Hangi Meyveden Kaç kilo almak istersiniz ? Lütfen Yukarıya Tekrar Bakarak Seçiniz...");
                secim = scanner.nextInt();
            } else if (karar == 2) {
                System.out.println("Meyve Borcunuz : "+fiyat);
                break;
            } else {
                System.out.println("Yanlış Tuşladınız...");
            }
        }
    }
}
