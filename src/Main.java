import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 1;)
        {
            String not1 = "(1) Toplama \n (2) Çıkarma \n (3) Çarpma \n (4) Bölme \n";
            String not2 = "Yapmak istediğiniz işlemin numarasını girin";
            System.out.println(not1 + not2);
            int sc1 = scanner.nextInt();

            if (sc1 == 1)
            {
                System.out.println("Toplama İşlemi");
                System.out.println("İlk sayıyı giriniz");
                int sc2 = scanner.nextInt();
                System.out.println("İkinci sayıyı giriniz");
                int sc3 = scanner.nextInt();
                System.out.println("Toplama İşleminizin Sonucu");
                System.out.println(sc2 + sc3);
            }
            else if (sc1 == 2)
            {
                System.out.println("Çıkarma İşlemi");
                System.out.println("İlk sayıyı giriniz");
                int sc2 = scanner.nextInt();
                System.out.println("İkinci sayıyı giriniz");
                int sc3 = scanner.nextInt();
                System.out.println("Çıkarma İşleminizin Sonucu");
                System.out.println(sc2 - sc3);
            }
            else if (sc1 == 3)
            {
                System.out.println("Çarpma İşlemi");
                System.out.println("İlk sayıyı giriniz");
                int sc2 = scanner.nextInt();
                System.out.println("İkinci sayıyı giriniz");
                int sc3 = scanner.nextInt();
                System.out.println("Çarpma İşleminizin Sonucu");
                System.out.println(sc2 * sc3);
            }
            else if (sc1 == 4)
            {
                System.out.println("Bölme İşlemi");
                System.out.println("İlk sayıyı giriniz");
                int sc2 = scanner.nextInt();
                System.out.println("İkinci sayıyı giriniz");
                int sc3 = scanner.nextInt();
                System.out.println("Bölme İşleminizin Sonucu");
                System.out.println(sc2 / sc3);
            }
            else
            {
                System.out.println("Hatalı İşlem");
            }

            System.out.println("Devam etmek istiyorsanız (1)'e basın!");
            System.out.println("Çıkış yapmak için (0)'a basın!");
            int sc2 = scanner.nextInt();

            if (sc2 == 1)
            {
                System.out.println("Devam Ediliyor");
            }
            else
            {
                System.out.println("Çıkış Yapıldı");
                break;
            }
        }
    }
}
