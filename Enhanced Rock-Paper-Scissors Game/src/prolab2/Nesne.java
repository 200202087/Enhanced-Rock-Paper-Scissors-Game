
package prolab2;
import java.util.*;

public abstract class Nesne {
    int seviyepuani,sonuc;
    double carpan=0.2,sonuc1,son,dayaniklik,sonuk=2;
    Nesne(){
        
    }
    public Nesne(int num){
        this.dayaniklik=20;
        this.seviyepuani=0;
    }
    
    
    public void nesnepuani(int m){
        System.out.println("Dayaniklik:"+this.dayaniklik);
        System.out.println("Seviye Puani:"+this.seviyepuani);
}
    public double etkihes(int kullan,int pc,double kullanday,double pcday,int keskin,int nufuz,int katilik,int direnc,int kalinlik,int sicaklik,int kontrol){
        if(kullan==1 && pc==1){
            if(kullanday>pcday){
                System.out.println("Kazandiniz");
                sonuk=1;
            }
            else if(kullanday<pcday){
                System.out.println("Kaybettiniz");
                sonuk=0;
            }
            else{
                System.out.println("Berabere");
            }
        }
        if(kullan==1 && pc==2){
            sonuc=katilik;
            sonuc1=sonuc/((1-carpan)*(nufuz));
            sonuc=nufuz;
            son=sonuc/((carpan)*(katilik));
            if(kontrol==1){
                sonuk=son;
            }
            if(kontrol==2){
                sonuk=sonuc1;
            }
            if(kontrol==3){
            if(sonuc1>son){
                System.out.println("Kazandiniz");
                sonuk=1;
            }
            if(sonuc1<son){
                System.out.println("Kaybettiniz");
                sonuk=0;
            }
            if(sonuc1==son){
                System.out.println("Berabere");
            }
            }
        }
        if(kullan==1 && pc==3){
            sonuc=katilik;
            sonuc1=sonuc/((carpan)*(keskin));
            sonuc=keskin;
            son=sonuc/((1-carpan)*(katilik));
            if(kontrol==1){
                sonuk=son;
            }
            if(kontrol==2){
                sonuk=sonuc1;
            }
            if(kontrol==3){
            if(sonuc1>son){
                System.out.println("Kazandiniz");
                sonuk=1;
            }
            if(sonuc1<son){
                System.out.println("Kaybettiniz");
                sonuk=0;
            }
            if(sonuc1==son){
                System.out.println("Berabere");
            }
            }
        }
        if(kullan==1 && pc==4){
            if(kullanday>pcday){
                System.out.println("Kazandiniz");
                sonuk=1;
            }
            else if(kullanday<pcday){
                System.out.println("Kaybettiniz");
                sonuk=0;
            }
            else{
                System.out.println("Berabere");
            }
        }
        if(kullan==1 && pc==5){
            sonuc=katilik;
            sonuc1=sonuc/((1-carpan)*(nufuz)*(kalinlik));
            sonuc=nufuz*kalinlik;
            son=sonuc/((carpan)*(katilik));
            if(kontrol==1){
                sonuk=son;
            }
            if(kontrol==2){
                sonuk=sonuc1;
            }
            if(kontrol==3){
            if(sonuc1>son){
                System.out.println("Kazandiniz");
                sonuk=1;
            }
            if(sonuc1<son){
                System.out.println("Kaybettiniz");
                sonuk=0;
            }
            if(sonuc1==son){
                System.out.println("Berabere");
            }
            }
        }
        if(kullan==1 && pc==6){
            sonuc=katilik;
            sonuc1=sonuc/((carpan)*(keskin)*(direnc));
            sonuc=keskin*direnc;
            son=sonuc/((1-carpan)*(katilik));
            if(kontrol==1){
                sonuk=son;
            }
            if(kontrol==2){
                sonuk=sonuc1;
            }
            if(kontrol==3){
            if(sonuc1>son){
                System.out.println("Kazandiniz");
                sonuk=1;
            }
            if(sonuc1<son){
                System.out.println("Kaybettiniz");
                sonuk=0;
            }
            if(sonuc1==son){
                System.out.println("Berabere");
            }
            }
        }
        if(kullan==2 && pc==1){
            sonuc=nufuz;
            sonuc1=sonuc/(carpan*katilik);
            sonuc=katilik;
            son=sonuc/((1-carpan)*nufuz);
            if(kontrol==1){
                sonuk=son;
            }
            if(kontrol==2){
                sonuk=sonuc1;
            }
            if(kontrol==3){
            if(sonuc1>son){
                System.out.println("Kazandiniz");
                sonuk=1;
            }
            if(sonuc1<son){
                System.out.println("Kaybettiniz");
                sonuk=0;
            }
            if(sonuc1==son){
                System.out.println("Berabere");
            }
            }
        }
        if(kullan==2 && pc==2){
            if(kullanday>pcday){
                System.out.println("Kazandiniz");
                sonuk=1;
            }
            else if(kullanday<pcday){
                System.out.println("Kaybettiniz");
                sonuk=0;
            }
            else{
                System.out.println("Berabere");
            }
        }
        if(kullan==2 && pc==3){
            sonuc=nufuz;
            sonuc1=sonuc/((1-carpan)*keskin);
            sonuc=keskin;
            son=sonuc/(carpan*nufuz);
            if(kontrol==1){
                sonuk=son;
            }
            if(kontrol==2){
                sonuk=sonuc1;
            }
            if(kontrol==3){
            if(sonuc1>son){
                System.out.println("Kazandiniz");
                sonuk=1;
            }
            if(sonuc1<son){
                System.out.println("Kaybettiniz");
                sonuk=0;
            }
            if(sonuc1==son){
                System.out.println("Berabere");
            }
            }
        }
        if(kullan==2 && pc==4){
            sonuc=nufuz;
            sonuc1=sonuc/(carpan*katilik*sicaklik);
            sonuc=katilik*sicaklik;
            son=sonuc/((1-carpan)*nufuz);
            if(kontrol==1){
                sonuk=son;
            }
            if(kontrol==2){
                sonuk=sonuc1;
            }
            if(kontrol==3){
            if(sonuc1>son){
                System.out.println("Kazandiniz");
                sonuk=1;
            }
            if(sonuc1<son){
                System.out.println("Kaybettiniz");
                sonuk=0;
            }
            if(sonuc1==son){
                System.out.println("Berabere");
            }
            }
        }
        if(kullan==2 && pc==5){
            if(kullanday>pcday){
                System.out.println("Kazandiniz");
                sonuk=1;
            }
            else if(kullanday<pcday){
                System.out.println("Kaybettiniz");
                sonuk=0;
            }
            else{
                System.out.println("Berabere");
            }
        }
        if(kullan==2 && pc==6){
            sonuc=nufuz;
            sonuc1=sonuc/((1-carpan)*keskin*direnc);
            sonuc=keskin*direnc;
            son=sonuc/(carpan*nufuz);
            if(kontrol==1){
                sonuk=son;
            }
            if(kontrol==2){
                sonuk=sonuc1;
            }
            if(kontrol==3){
            if(sonuc1>son){
                System.out.println("Kazandiniz");
                sonuk=1;
            }
            if(sonuc1<son){
                System.out.println("Kaybettiniz");
                sonuk=0;
            }
            if(sonuc1==son){
                System.out.println("Berabere");
            }
            }
        }
        if(kullan==3 && pc==1){
            sonuc=keskin;
            sonuc1=sonuc/((1-carpan)*(katilik));
            sonuc=katilik;
            son=sonuc/(carpan*keskin);
            if(kontrol==1){
                sonuk=son;
            }
            if(kontrol==2){
                sonuk=sonuc1;
            }
            if(kontrol==3){
            if(sonuc1>son){
                System.out.println("Kazandiniz");
                sonuk=1;
            }
            if(sonuc1<son){
                System.out.println("Kaybettiniz");
                sonuk=0;
            }
            if(sonuc1==son){
                System.out.println("Berabere");
            }
            }
        }
        if(kullan==3 && pc==2){
            sonuc=keskin;
            sonuc1=sonuc/(carpan*nufuz);
            sonuc=nufuz;
            son=sonuc/((1-carpan)*keskin);
            if(kontrol==1){
                sonuk=son;
            }
            if(kontrol==2){
                sonuk=sonuc1;
            }
            if(kontrol==3){
            if(sonuc1>son){
                System.out.println("Kazandiniz");
                sonuk=1;
            }
            if(sonuc1<son){
                System.out.println("Kaybettiniz");
                sonuk=0;
            }
            if(sonuc1==son){
                System.out.println("Berabere");
            }
            }
        }
        if(kullan==3 && pc==3){
            if(kullanday>pcday){
                System.out.println("Kazandiniz");
                sonuk=1;
            }
            else if(kullanday<pcday){
                System.out.println("Kaybettiniz");
                sonuk=0;
            }
            else{
                System.out.println("Berabere");
            }
        }
        if(kullan==3 && pc==4){
            sonuc=keskin;
            sonuc1=sonuc/((1-carpan)*katilik*sicaklik);
            sonuc=katilik*sicaklik;
            son=sonuc/(carpan*keskin);
            if(kontrol==1){
                sonuk=son;
            }
            if(kontrol==2){
                sonuk=sonuc1;
            }
            if(kontrol==3){
            if(sonuc1>son){
                System.out.println("Kazandiniz");
                sonuk=1;
            }
            if(sonuc1<son){
                System.out.println("Kaybettiniz");
                sonuk=0;
            }
            if(sonuc1==son){
                System.out.println("Berabere");
            }
            }
        }
        if(kullan==3 && pc==5){
            sonuc=keskin;
            sonuc1=sonuc/(carpan*nufuz*kalinlik);
            sonuc=nufuz*kalinlik;
            son=sonuc/((1-carpan)*keskin);
            if(kontrol==1){
                sonuk=son;
            }
            if(kontrol==2){
                sonuk=sonuc1;
            }
            if(kontrol==3){
            if(sonuc1>son){
                System.out.println("Kazandiniz");
                sonuk=1;
            }
            if(sonuc1<son){
                System.out.println("Kaybettiniz");
                sonuk=0;
            }
            if(sonuc1==son){
                System.out.println("Berabere");
            }
            }
        }
        if(kullan==3 && pc==6){
            if(kullanday>pcday){
                System.out.println("Kazandiniz");
                sonuk=1;
            }
            else if(kullanday<pcday){
                System.out.println("Kaybettiniz");
                sonuk=0;
            }
            else{
                System.out.println("Berabere");
            }
        }
        if(kullan==4 && pc==1){
            if(kullanday>pcday){
                System.out.println("Kazandiniz");
                sonuk=1;
            }
            else if(kullanday<pcday){
                System.out.println("Kaybettiniz");
                sonuk=0;
            }
            else{
                System.out.println("Berabere");
            }
        }
        if(kullan==4 && pc==2){
            sonuc=katilik*sicaklik;
            sonuc1=sonuc/((1-carpan)*nufuz);
            sonuc=nufuz;
            son=sonuc/(carpan*katilik*sicaklik);
            if(kontrol==1){
                sonuk=son;
            }
            if(kontrol==2){
                sonuk=sonuc1;
            }
            if(kontrol==3){
            if(sonuc1>son){
                System.out.println("Kazandiniz");
                sonuk=1;
            }
            if(sonuc1<son){
                System.out.println("Kaybettiniz");
                sonuk=0;
            }
            if(sonuc1==son){
                System.out.println("Berabere");
            }
            }
        }
        if(kullan==4 && pc==3){
            sonuc=katilik*sicaklik;
            sonuc1=sonuc/(carpan*keskin);
            sonuc=keskin;
            son=sonuc/((1-carpan)*katilik*sicaklik);
            if(kontrol==1){
                sonuk=son;
            }
            if(kontrol==2){
                sonuk=sonuc1;
            }
            if(kontrol==3){
            if(sonuc1>son){
                System.out.println("Kazandiniz");
                sonuk=1;
            }
            if(sonuc1<son){
                System.out.println("Kaybettiniz");
                sonuk=0;
            }
            if(sonuc1==son){
                System.out.println("Berabere");
            }
            }
        }
        if(kullan==4 && pc==4){
            if(kullanday>pcday){
                System.out.println("Kazandiniz");
                sonuk=1;
            }
            else if(kullanday<pcday){
                System.out.println("Kaybettiniz");
                sonuk=0;
            }
            else{
                System.out.println("Berabere");
            }
        }
        if(kullan==4 && pc==5){
            sonuc=katilik*sicaklik;
            sonuc1=sonuc/((1-carpan)*nufuz*kalinlik);
            sonuc=nufuz*kalinlik;
            son=sonuc/(carpan*katilik*sicaklik);
            if(kontrol==1){
                sonuk=son;
            }
            if(kontrol==2){
                sonuk=sonuc1;
            }
            if(kontrol==3){
            if(sonuc1>son){
                System.out.println("Kazandiniz");
                sonuk=1;
            }
            if(sonuc1<son){
                System.out.println("Kaybettiniz");
                sonuk=0;
            }
            if(sonuc1==son){
                System.out.println("Berabere");
            }
            }
        }
        if(kullan==4 && pc==6){
            sonuc=katilik*sicaklik;
            sonuc1=sonuc/(carpan*keskin*direnc);
            sonuc=keskin*direnc;
            son=sonuc/((1-carpan)*katilik*sicaklik);
            if(kontrol==1){
                sonuk=son;
            }
            if(kontrol==2){
                sonuk=sonuc1;
            }
            if(kontrol==3){
            if(sonuc1>son){
                System.out.println("Kazandiniz");
                sonuk=1;
            }
            if(sonuc1<son){
                System.out.println("Kaybettiniz");
                sonuk=0;
            }
            if(sonuc1==son){
                System.out.println("Berabere");
            }
            }
        }
        if(kullan==5 && pc==1){
            sonuc=nufuz*kalinlik;
            sonuc1=sonuc/(carpan/katilik);
            sonuc=katilik;
            son=sonuc/((1-carpan)*(nufuz)*(kalinlik));
            if(kontrol==1){
                sonuk=son;
            }
            if(kontrol==2){
                sonuk=sonuc1;
            }
            if(kontrol==3){
            if(sonuc1>son){
                System.out.println("Kazandiniz");
                sonuk=1;
            }
            if(sonuc1<son){
                System.out.println("Kaybettiniz");
                sonuk=0;
            }
            if(sonuc1==son){
                System.out.println("Berabere");
            }
            }
        }
        if(kullan==5 && pc==2){
            if(kullanday>pcday){
                System.out.println("Kazandiniz");
                sonuk=1;
            }
            else if(kullanday<pcday){
                System.out.println("Kaybettiniz");
                sonuk=0;
            }
            else{
                System.out.println("Berabere");
            }
        }
        if(kullan==5 && pc==3){
            sonuc=nufuz*kalinlik;
            sonuc1=sonuc/((1-carpan)*keskin);
            sonuc=keskin;
            son=sonuc/(carpan*nufuz*kalinlik);
            if(kontrol==1){
                sonuk=son;
            }
            if(kontrol==2){
                sonuk=sonuc1;
            }
            if(kontrol==3){
            if(sonuc1>son){
                System.out.println("Kazandiniz");
                sonuk=1;
            }
            if(sonuc1<son){
                System.out.println("Kaybettiniz");
                sonuk=0;
            }
            if(sonuc1==son){
                System.out.println("Berabere");
            }
            }
        }
        if(kullan==5 && pc==4){
            sonuc=nufuz*kalinlik;
            sonuc1=sonuc/(carpan*katilik*sicaklik);
            sonuc=katilik/sicaklik;
            son=sonuc/((1-carpan)*nufuz*kalinlik);
            if(kontrol==1){
                sonuk=son;
            }
            if(kontrol==2){
                sonuk=sonuc1;
            }
            if(kontrol==3){
            if(sonuc1>son){
                System.out.println("Kazandiniz");
                sonuk=1;
            }
            if(sonuc1<son){
                System.out.println("Kaybettiniz");
                sonuk=0;
            }
            if(sonuc1==son){
                System.out.println("Berabere");
            }
            }
        }
        if(kullan==5 && pc==5){
            if(kullanday>pcday){
                System.out.println("Kazandiniz");
                sonuk=1;
            }
            else if(kullanday<pcday){
                System.out.println("Kaybettiniz");
                sonuk=0;
            }
            else{
                System.out.println("Berabere");
            }
        }
        if(kullan==5 && pc==6){
            sonuc=nufuz*kalinlik;
            sonuc1=sonuc/((1-carpan)*keskin*direnc);
            sonuc=keskin*direnc;
            son=sonuc/(carpan*nufuz*kalinlik);
            if(kontrol==1){
                sonuk=son;
            }
            if(kontrol==2){
                sonuk=sonuc1;
            }
            if(kontrol==3){
            if(sonuc1>son){
                System.out.println("Kazandiniz");
                sonuk=1;
            }
            if(sonuc1<son){
                System.out.println("Kaybettiniz");
                sonuk=0;
            }
            if(sonuc1==son){
                System.out.println("Berabere");
            }
            }
        }
        if(kullan==6 && pc==1){
            sonuc=keskin*direnc;
            sonuc1=sonuc/((1-carpan)*katilik);
            sonuc=katilik;
            son=sonuc/((carpan)*(keskin)*(direnc));
            if(kontrol==1){
                sonuk=son;
            }
            if(kontrol==2){
                sonuk=sonuc1;
            }
            if(kontrol==3){
            if(sonuc1>son){
                System.out.println("Kazandiniz");
                sonuk=1;
            }
            if(sonuc1<son){
                System.out.println("Kaybettiniz");
                sonuk=0;
            }
            if(sonuc1==son){
                System.out.println("Berabere");
            }
            }
        }
        if(kullan==6 && pc==2){
            sonuc=keskin*direnc;
            sonuc1=sonuc/(carpan*nufuz);
            sonuc=nufuz;
            son=sonuc/((1-carpan)*keskin*direnc);
            if(kontrol==1){
                sonuk=son;
            }
            if(kontrol==2){
                sonuk=sonuc1;
            }
            if(kontrol==3){
            if(sonuc1>son){
                System.out.println("Kazandiniz");
                sonuk=1;
            }
            if(sonuc1<son){
                System.out.println("Kaybettiniz");
                sonuk=0;
            }
            if(sonuc1==son){
                System.out.println("Berabere");
            }
            }
        }
        if(kullan==6 && pc==3){
            if(kullanday>pcday){
                System.out.println("Kazandiniz");
                sonuk=1;
            }
            else if(kullanday<pcday){
                System.out.println("Kaybettiniz");
                sonuk=0;
            }
            else{
                System.out.println("Berabere");
            }
        }
        if(kullan==6 && pc==4){
            sonuc=keskin*direnc;
            sonuc1=sonuc/((1-carpan)*katilik*sicaklik);
            sonuc=katilik*sicaklik;
            son=sonuc/(carpan*keskin*direnc);
            if(kontrol==1){
                sonuk=son;
            }
            if(kontrol==2){
                sonuk=sonuc1;
            }
            if(kontrol==3){
            if(sonuc1>son){
                System.out.println("Kazandiniz");
                sonuk=1;
            }
            if(sonuc1<son){
                System.out.println("Kaybettiniz");
                sonuk=0;
            }
            if(sonuc1==son){
                System.out.println("Berabere");
            }
            }
        }
        if(kullan==6 && pc==5){
            sonuc=keskin*direnc;
            sonuc1=sonuc/(carpan*nufuz*kalinlik);
            sonuc=nufuz*kalinlik;
            son=sonuc/((1-carpan)*keskin*direnc);
            if(kontrol==1){
                sonuk=son;
            }
            if(kontrol==2){
                sonuk=sonuc1;
            }
            if(kontrol==3){
            if(sonuc1>son){
                System.out.println("Kazandiniz");
                sonuk=1;
            }
            if(sonuc1<son){
                System.out.println("Kaybettiniz");
                sonuk=0;
            }
            if(sonuc1==son){
                System.out.println("Berabere");
            }
            }
        }
        if(kullan==6 && pc==6){
            if(kullanday>pcday){
                System.out.println("Kazandiniz");
                sonuk=1;
            }
            else if(kullanday<pcday){
                System.out.println("Kaybettiniz");
                sonuk=0;
            }
            else{
                System.out.println("Berabere");
            }
        }
        
        return sonuk;
    }
    public void durumgun(double m,double m2){
        if(m==0.0 || m==2.0){
            this.dayaniklik=this.dayaniklik-m2;
        }
        else if(m==1.0){
            this.seviyepuani=this.seviyepuani+20;
            this.dayaniklik=this.dayaniklik-m2;
        }
        
        
    }
    
    
}