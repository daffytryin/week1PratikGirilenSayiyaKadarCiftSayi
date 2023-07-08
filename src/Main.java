import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int k, n=0;
        int sum=0;
        double av;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayıyı giriniz : ");
        k = input.nextInt(); //kulllanıcıdan değeri alıyoruz

        for(int i=1; i<=k; i++) {
            if(i%4==0 || i%3==0) {
                System.out.print(i + ",");
                sum+=i;
                n++;
            }
        }
        System.out.println("\n");
        /*for döngüsü ile 1'den 12ye kadar sayıyı arttırarak döndürdük
        if koşulu ile 3 ve 4e bölünen sayıları sum intergerında topladık
        n sayısını ortalama bulabilmek için kaç adet olduğunu öğrenene kadar
        arttırdık */
        av=sum/n;
        System.out.println("3 ve 4'e tam bölünen sayıların ortalaması :" +av);

        /*Pratik

        int sayi;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz :");
        sayi = input.nextInt();

        int i=1;
        do {
            i++;
            if(i%2 == 0) {
                System.out.println(i);
                i++;
            }
        } while (i<=sayi); */
    }
}