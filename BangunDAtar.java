//@author Abdul RAhman Jainun
public class BangunDAtar {
    int p, l, s;
    
    BangunDAtar(int s){
        this.s = s;
    }
    BangunDAtar (int p, int l){
        this.p = p;
        this.l = l;
        
    }
    void setPL(int p, int l){
        this.p = p;
        this.l = l;
        
    }
    void setSisi(int s){
        this.s = s;
       
    }
    
   int getP(){
       return p;
   }
   int getL(){
       return l;
       
   }
   int getS(){
       return s;
   }
            
}
