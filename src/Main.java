import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
  Scanner inp = new Scanner(System.in);
  int number,enKucuk,enBuyuk;

        System.out.print("Kaç tane sayı gireceksiniz:");
        number = inp.nextInt();
        System.out.print(  "1. sayıyı giriniz:");
        enKucuk = inp.nextInt();
        enBuyuk = enKucuk;
        for(int i =2;i<=number;i++){
            int b;
            System.out.print(i + ". sayıyı giriniz:");
            b = inp.nextInt();

            if(b < enKucuk ){
                enKucuk = b;
            }
            if(b > enBuyuk){
                enBuyuk = b;
            }


        }
        System.out.println("En küçük sayı:" +enKucuk);
        System.out.println("En büyük sayı:" +enBuyuk);
    }
}