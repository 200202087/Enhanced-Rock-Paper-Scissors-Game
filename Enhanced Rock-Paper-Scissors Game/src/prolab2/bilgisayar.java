
package prolab2;

public class bilgisayar extends Oyuncu{
    
    bilgisayar(){
        
    }
    public bilgisayar(int id,String isim){
        super(id,isim);
    }
    @Override
    public int skorgos(){
        return this.skor;
    }
}
