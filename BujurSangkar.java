
public class BujurSangkar extends BangunDAtar {
    
   BujurSangkar(int s){
       super(s);
       
   }
   int hitungLuas(){
       int s = super.getS();
       return s * s;
       
   }
   int hitungKeliling(){
       int s = super.getS();
       return 4 * s;
   }
   
   public String toString(){
        String hasil = "Luas BujurSangkar :" + hitungLuas() + "\n" + 
        "Keliling Bujursangkar:" + hitungKeliling();
        
        return hasil;
   }
}