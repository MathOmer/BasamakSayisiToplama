import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        int a=0,number,BasamakSayisi=0,TempNumber,result=0;
        System.out.print("Bir sayı giriniz: ");
        number = input.nextInt();
        TempNumber = number;

        while(TempNumber !=0){
            TempNumber /=10;
            BasamakSayisi++;
        }
        System.out.println("Basamak sayısı: "+ BasamakSayisi);

        TempNumber = number;
        while(TempNumber !=0){
            a =TempNumber %10;
            result +=a;
            TempNumber /=10;
        }
        System.out.println("Basamaklardaki sayıların toplamı: "+ result);

    }
}