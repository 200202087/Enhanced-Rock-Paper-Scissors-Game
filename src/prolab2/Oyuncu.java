
package prolab2;


public abstract class Oyuncu {
    int oyuncuID;
    String oyuncuAdi;
    int skor=0;
    Oyuncu(){
        
    }
    public Oyuncu(int id,String ad){
        this.oyuncuID=id;
        this.oyuncuAdi=ad;
        this.skor=0;
        
    }
    public int skorgos(){
        return skor;
    }
    public String nesnesec(){
        return "nesne sec";
    }
    
}
