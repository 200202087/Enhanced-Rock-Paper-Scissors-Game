
package prolab2;


public class kullanici extends Oyuncu{
    kullanici(){
       
    }
    public kullanici(int id,String isim){
        super(id,isim);
    }
    @Override
    public int skorgos(){
        return this.skor;
    }
}
