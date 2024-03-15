import java.util.Scanner;

public class HitungBangunDAtar {
    public static void main(String []args){
   
        Scanner sc = new Scanner(System.in);
   System.out.println("1.Bujursangkar");
   System.out.println("2.Persegi Panjang");
   System.out.println("----Isikan Pilihan----");
   
   int pilihan = sc.nextInt();
   if(pilihan==1){
       BujurSangkar bs = new BujurSangkar(10);
       
        System.out.println(bs);
       
       }
    }
    
}
   