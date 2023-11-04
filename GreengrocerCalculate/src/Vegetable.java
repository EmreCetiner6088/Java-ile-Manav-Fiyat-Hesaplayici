import java.util.Scanner;

public class Vegetable {

    Scanner scanner = new Scanner(System.in);

    int secim;
    double lahanafiyat = 2.50;
    double domatesfiyat = 1.25;
    double salatalikfiyat = 1;
    double soganfiyat = 0.75;
    double marulfiyat = 3;
    double limonfiyat = 3.50;
    double patatesfiyat = 0.75;
    //------------------------------------------------------------------
    double lahanakilo;
    double domateskilo;
    double salatalikkilo;
    double sogankilo;
    double marulkilo;
    double limonkilo;
    double patateskilo;
    double fiyat = 0;

    public void sebzeHesaplayici() {
        System.out.println("Hangi Sebzeden Kaç kilo almak istersiniz ? Lütfen Seçiniz...");
        System.out.println("(1)Patates\n(2)Domates\n(3)Lahana\n(4)Marul\n(5)Soğan\n(6)Salatalık\n(7)Limon");

        secim = scanner.nextInt();
        while (true) {

            switch (secim) {
                case 1:
                    System.out.println("Patates Kaç Kilo Olsun ?");
                    patateskilo = scanner.nextDouble();
                    fiyat = fiyat + (patatesfiyat * patateskilo);
                    break;
                case 2:
                    System.out.println("Domates Kaç Kilo Olsun ?");
                    domateskilo = scanner.nextDouble();
                    fiyat = fiyat + (domatesfiyat * domateskilo);
                    break;
                case 3:
                    System.out.println("Lahana Kaç Kilo Olsun ?");
                    lahanakilo = scanner.nextDouble();
                    fiyat = fiyat + (lahanafiyat * lahanakilo);
                    break;
                case 4:
                    System.out.println("Marul Kaç Kilo Olsun ?");
                    marulkilo = scanner.nextDouble();
                    fiyat = fiyat + (marulfiyat * marulfiyat);
                    break;
                case 5:
                    System.out.println("Mandalina Kaç Kilo Olsun ?");
                    sogankilo = scanner.nextDouble();
                    fiyat = fiyat + (soganfiyat * sogankilo);
                    break;
                case 6:
                    System.out.println("Salatalık Kaç Kilo Olsun ?");
                    salatalikkilo = scanner.nextDouble();
                    fiyat = fiyat + (salatalikfiyat * salatalikkilo);
                    break;

                case 7:
                    System.out.println("Limon Kaç Kilo Olsun ?");
                    limonkilo = scanner.nextDouble();
                    fiyat = fiyat + (limonfiyat * limonkilo);
                    break;
                default:
                    System.out.println("Meyve Borcunuz : " + fiyat);
                    break;


            }
            System.out.println("Başka Bişi Almak İstermisiniz Evet ise 1 Hayır ise 2'ye Tuşlayınız...");
            int karar = scanner.nextInt();
            if (karar == 1) {
                System.out.println("Hangi Meyveden Kaç kilo almak istersiniz ? Lütfen Yukarıya Tekrar Bakarak Seçiniz...");
                secim = scanner.nextInt();
            } else if (karar == 2) {
                System.out.println("Sebze Borcunuz : " + fiyat);
                break;
            } else {
                System.out.println("Yanlış Tuşladınız...");
            }
        }

    }
}
