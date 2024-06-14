
package prolab2;
import java.util.*;
import java.util.Random;

public class oyun {

    
    public static void main(String[] args) {
        Random rast=new Random();
        Scanner scanner = new Scanner(System.in);
        List liste=new ArrayList();
        int menu=0;
        double oyun1=0,oyun2=0,oyun3=2;
        int menusec=0;
        int hamle=0;
        int kontrol2=0;
        int[] dizi = new int[5];
        int[] bilsec= new int[5];
        int[] bilsec2=new int[5];
        int secimsay=5,id=0;
        int eleman = 0,rastgele=0;
        int kontrol = 0;
        int bilgsyr=0,bilgsyr2=0;
        int secmkon=0;
        int hamsec=0;
        String isim;
        
        for(int ml=0;ml<5;ml++){
        dizi[ml]=0;
        }
        kagit kagit1=new kagit(2);
        tas tas1=new tas(1);
        makas makas1=new makas(3);
        agirtas agirtas1=new agirtas(4);
        ozelkagit ozelkagit1=new ozelkagit(5);
        ustamakas ustamakas1=new ustamakas(6);
        
        kagit kagit2=new kagit(2);
        tas tas2=new tas(1);
        makas makas2=new makas(3);
        agirtas agirtas2=new agirtas(4);
        ozelkagit ozelkagit2=new ozelkagit(5);
        ustamakas ustamakas2=new ustamakas(6);

    while(menu==0){
        
        System.out.println("Kullanici-Bilgisayar -1");
        System.out.println("Bilgisayar-Bilgisayar -2");
        menusec=scanner.nextInt();
        
        switch(menusec){
        case 1:
            bilgisayar oyuncu2=new bilgisayar(61,"Hayri");
            System.out.println("(Oyun elinizdeki elemanlar bitince ya da hamle sayisi tamamlaninca biter)");
            System.out.println("Isminizi giriniz:");
            isim=scanner.next();
            System.out.println("ID giriniz:");
            id=scanner.nextInt();
            kullanici oyuncu1= new kullanici(id,isim);
            
            System.out.println("Hamle sayisi giriniz");
            hamle=scanner.nextInt();

            for(int i=0;i<secimsay;i++){
                if(kontrol==1){
                    System.out.println("Lutfen ilk 5 elemaninizi farkli seciniz");
                    kontrol=0;
                }
                if(kontrol==2){
                    System.out.println("Lutfen belirtilen sayilardan birini giriniz");
                    kontrol=0;
                }

                System.out.println("Secim elemanlari");
                System.out.println("Tas          -1");
                System.out.println("Kagit        -2");
                System.out.println("Makas        -3");
                System.out.println("Agir tas     -4");
                System.out.println("Ozel kagit   -5");
                System.out.println("Usta makas   -6");
                System.out.println("Seciminiz:");
                eleman=scanner.nextInt();
                
                dizi[i]=eleman;
                if(i<=5){
                for(int j=0;j<i;j++){
                if(dizi[j]==eleman){
                    kontrol=1;
                    i--;
                    break;
                }
                }
                }
                if(eleman<0 || eleman>6){
                    kontrol=2;
                    i--; 
                }

            }
            for(int k=0;k<secimsay;k++){
                System.out.println(dizi[k]);
            }
            for(int n=0;n<5;n++){
                bilgsyr=rast.nextInt(6)+1;
                bilsec[n]=bilgsyr;
                for(int mat=0;mat<n;mat++){
                    if(bilsec[mat]==bilgsyr){
                        n=n-1;
                        break;
                    }
                    if(bilgsyr>6){
                        n=n-1;
                        break;
                    }
                }
                
            }
            System.out.println("---------------");
            for(int i=0;i<secimsay;i++){
                System.out.println(bilsec[i]);
            }
            for(int secm=0;secm<5;secm++){
                if(dizi[secm]==1){
                    liste.add("tas");
                }
                else if(dizi[secm]==2){
                    liste.add("kagit");
                }
                else if(dizi[secm]==3){
                    liste.add("makas");
                }
                else if(dizi[secm]==4){
                    liste.add("agirtas");     
                }
                else if(dizi[secm]==5){
                    liste.add("ozelkagit");
                }
                else if(dizi[secm]==6){
                    liste.add("ustamakas");
                }
                else{
                    System.out.println("secimlerde bir hata ile karsilasildi:OWRAYD");
                    break;
                }
                
            }
            kagit1.nesnepuani(1);
            for(int i=0;i<hamle;i++){
                System.out.println("Seciminizi yapiniz:");
                for(int n=0;n<liste.size();n++){
                    if(liste.get(n)=="tas"){
                        System.out.println("dayaniklik:"+tas1.dayaniklik);
                        if(tas1.dayaniklik<=0){
                            System.out.println("secilemez");
                        }
                        secmkon=1;
                    }
                    if(liste.get(n)=="kagit"){
                        System.out.println("dayaniklik:"+kagit1.dayaniklik);
                        if(kagit1.dayaniklik<=0){
                            System.out.println("secilemez");
                        }
                        secmkon=2;
                    }
                    if(liste.get(n)=="makas"){
                        System.out.println("dayaniklik:"+makas1.dayaniklik);
                        if(makas1.dayaniklik<=0){
                            System.out.println("secilemez");
                        }
                        secmkon=3;
                    }
                    if(liste.get(n)=="agirtas"){
                        System.out.println("dayaniklik:"+agirtas1.dayaniklik);
                        if(agirtas1.dayaniklik<=0){
                            System.out.println("secilemez");
                        }
                        secmkon=4;
                    }
                    if(liste.get(n)=="ozelkagit"){
                        System.out.println("dayaniklik:"+ozelkagit1.dayaniklik);
                        if(ozelkagit1.dayaniklik<=0){
                            System.out.println("secilemez");
                        }
                        secmkon=5;
                    }
                    if(liste.get(n)=="ustamakas"){
                        System.out.println("dayaniklik:"+ustamakas1.dayaniklik);
                        if(ustamakas1.dayaniklik<=0){
                            System.out.println("secilemez");
                        }
                        secmkon=6;
                    }
                    System.out.println(liste.get(n)+"----"+secmkon);
                    
                }
                hamsec=scanner.nextInt();
                    if(hamsec==1){
                        
                        for(int m=0;m<5;m++){
                            while(bilgsyr2==0){
                                bilgsyr=rast.nextInt(6)+1;
                                for(int n=0;n<5;n++){
                                if(bilgsyr==bilsec[n]){
                                    if(bilsec[n]==1){
                                        if(tas2.dayaniklik>0){
                                            bilgsyr2=1;

                                            break;
                                        }
                                    }
                                    if(bilsec[n]==2){
                                        if(kagit2.dayaniklik>0){
                                            bilgsyr2=1;
                                            break;
                                        }
                                    }
                                    if(bilsec[n]==3){
                                        if(makas2.dayaniklik>0){
                                            bilgsyr2=1;
                                            break;
                                        }
                                    }
                                    if(bilsec[n]==4){
                                        if(agirtas2.dayaniklik>0){
                                            bilgsyr2=1;
                                            break;
                                        }
                                    }
                                    if(bilsec[n]==5){
                                        if(ozelkagit2.dayaniklik>0){
                                            bilgsyr2=1;
                                            break;
                                        }
                                    }
                                    if(bilsec[n]==6){
                                        if(ustamakas2.dayaniklik>0){
                                            bilgsyr2=1;
                                            break;
                                        }
                                    }
                                }
                                }
                            }
                            if(bilsec[m]==bilgsyr){
                                if(bilsec[m]==1){
                                    oyun1=tas1.etkihes(1,1,tas1.dayaniklik,tas2.dayaniklik,0,0,2,0,0,0,1);
                                    oyun2=tas1.etkihes(1,1,tas1.dayaniklik,tas2.dayaniklik,0,0,2,0,0,0,2);
                                    oyun3=tas1.etkihes(1,1,tas1.dayaniklik,tas2.dayaniklik,0,0,2,0,0,0,3);
                                    tas2.durumgun(oyun3, oyun2);
                                    tas1.durumgun(oyun3, oyun1);
                                    if(oyun3==1){
                                                System.out.println("Puaniniz eklendi");
                                                oyuncu1.skor=oyuncu1.skor+3;
                                            }
                                            if(oyun3==0){
                                                System.out.println("Puan eklenmedi");
                                                oyuncu2.skor=oyuncu2.skor+3;
                                            }
                                            if(oyun3==2){
                                                System.out.println("Berabere puani eklendi");
                                                oyuncu1.skor=oyuncu1.skor+1;
                                                oyuncu2.skor=oyuncu2.skor+1;
                                            }
                                }
                                if(bilsec[m]==2){
                                            oyun1=tas1.etkihes(1,2,tas1.dayaniklik,kagit2.dayaniklik,0,2,2,0,0,0,1);
                                            oyun2=tas1.etkihes(1,2,tas1.dayaniklik,kagit2.dayaniklik,0,2,2,0,0,0,2);
                                            oyun3=tas1.etkihes(1,2,tas1.dayaniklik,kagit2.dayaniklik,0,2,2,0,0,0,3);
                                            tas1.durumgun(oyun3, oyun1);
                                            kagit2.durumgun(oyun3, oyun2);
                                            if(oyun3==1){
                                                System.out.println("Puaniniz eklendi");
                                                oyuncu1.skor=oyuncu1.skor+3;
                                            }
                                            if(oyun3==0){
                                                System.out.println("Puan eklenmedi");
                                                oyuncu2.skor=oyuncu2.skor+3;
                                            }
                                            if(oyun3==2){
                                                System.out.println("Berabere puani eklendi");
                                                oyuncu1.skor=oyuncu1.skor+1;
                                                oyuncu2.skor=oyuncu2.skor+1;
                                            }
                                }
                                if(bilsec[m]==3){
                                            oyun1=tas1.etkihes(1,3,tas1.dayaniklik,makas2.dayaniklik,2,0,2,0,0,0,1);
                                            oyun2=tas1.etkihes(1,3,tas1.dayaniklik,makas2.dayaniklik,2,0,2,0,0,0,2);
                                            oyun3=tas1.etkihes(1,3,tas1.dayaniklik,makas2.dayaniklik,2,0,2,0,0,0,3);
                                            tas1.durumgun(oyun3, oyun1);
                                            makas2.durumgun(oyun3, oyun2);
                                            if(oyun3==1){
                                                System.out.println("Puaniniz eklendi");
                                                oyuncu1.skor=oyuncu1.skor+3;
                                            }
                                            if(oyun3==0){
                                                System.out.println("Puan eklenmedi");
                                                oyuncu2.skor=oyuncu2.skor+3;
                                            }
                                            if(oyun3==2){
                                                System.out.println("Berabere puani eklendi");
                                                oyuncu1.skor=oyuncu1.skor+1;
                                                oyuncu2.skor=oyuncu2.skor+1;
                                            }
                                }
                                if(bilsec[m]==4){
                                            oyun1=tas1.etkihes(1,4,tas1.dayaniklik,agirtas2.dayaniklik,0,0,2,0,0,2,1);
                                            oyun2=tas1.etkihes(1,4,tas1.dayaniklik,agirtas2.dayaniklik,0,0,2,0,0,2,2);
                                            oyun3=tas1.etkihes(1,4,tas1.dayaniklik,agirtas2.dayaniklik,0,0,2,0,0,2,3);
                                            tas1.durumgun(oyun3, oyun1);
                                            agirtas2.durumgun(oyun3, oyun2);
                                            if(oyun3==1){
                                                System.out.println("Puaniniz eklendi");
                                                oyuncu1.skor=oyuncu1.skor+3;
                                            }
                                            if(oyun3==0){
                                                System.out.println("Puan eklenmedi");
                                                oyuncu2.skor=oyuncu2.skor+3;
                                            }
                                            if(oyun3==2){
                                                System.out.println("Berabere puani eklendi");
                                                oyuncu1.skor=oyuncu1.skor+1;
                                                oyuncu2.skor=oyuncu2.skor+1;
                                            }
                                    
                                }
                                if(bilsec[m]==5){
                                            oyun1=tas1.etkihes(1,5,tas1.dayaniklik,ozelkagit2.dayaniklik,0,2,2,0,2,0,1);
                                            oyun2=tas1.etkihes(1,5,tas1.dayaniklik,ozelkagit2.dayaniklik,0,2,2,0,2,0,2);
                                            oyun3=tas1.etkihes(1,5,tas1.dayaniklik,ozelkagit2.dayaniklik,0,2,2,0,2,0,3);
                                            tas1.durumgun(oyun3, oyun1);
                                            ozelkagit2.durumgun(oyun3, oyun2);
                                            if(oyun3==1){
                                                System.out.println("Puaniniz eklendi");
                                                oyuncu1.skor=oyuncu1.skor+3;
                                            }
                                            if(oyun3==0){
                                                System.out.println("Puan eklenmedi");
                                                oyuncu2.skor=oyuncu2.skor+3;
                                            }
                                            if(oyun3==2){
                                                System.out.println("Berabere puani eklendi");
                                                oyuncu1.skor=oyuncu1.skor+1;
                                                oyuncu2.skor=oyuncu2.skor+1;
                                            }
                                    
                                }
                                if(bilsec[m]==6){
                                            oyun1=tas1.etkihes(1,6,tas1.dayaniklik,ustamakas2.dayaniklik,2,0,2,2,0,0,1);
                                            oyun2=tas1.etkihes(1,6,tas1.dayaniklik,ustamakas2.dayaniklik,2,0,2,2,0,0,2);
                                            oyun3=tas1.etkihes(1,6,tas1.dayaniklik,ustamakas2.dayaniklik,2,0,2,2,0,0,3);
                                            tas1.durumgun(oyun3, oyun1);
                                            ustamakas2.durumgun(oyun3, oyun2);
                                            if(oyun3==1){
                                                System.out.println("Puaniniz eklendi");
                                                oyuncu1.skor=oyuncu1.skor+3;
                                            }
                                            if(oyun3==0){
                                                System.out.println("Puan eklenmedi");
                                                oyuncu2.skor=oyuncu2.skor+3;
                                            }
                                            if(oyun3==2){
                                                System.out.println("Berabere puani eklendi");
                                                oyuncu1.skor=oyuncu1.skor+1;
                                                oyuncu2.skor=oyuncu2.skor+1;
                                            }
                                }
                                break;
                            }
                        }
                    }
                    if(hamsec==2){
                        
                        for(int m=0;m<5;m++){        
                            while(bilgsyr2==0){
                                bilgsyr=rast.nextInt(6)+1;
                                for(int n=0;n<5;n++){
                                if(bilgsyr==bilsec[n]){
                                    if(bilsec[n]==1){
                                        if(tas2.dayaniklik>0){
                                            bilgsyr2=1;
                                            break;
                                        }
                                    }
                                    if(bilsec[n]==2){
                                        if(kagit2.dayaniklik>0){
                                            bilgsyr2=1;
                                            break;
                                        }
                                    }
                                    if(bilsec[n]==3){
                                        if(makas2.dayaniklik>0){
                                            bilgsyr2=1;
                                            break;
                                        }
                                    }
                                    if(bilsec[n]==4){
                                        if(agirtas2.dayaniklik>0){
                                            bilgsyr2=1;
                                            break;
                                        }
                                    }
                                    if(bilsec[n]==5){
                                        if(ozelkagit2.dayaniklik>0){
                                            bilgsyr2=1;
                                            break;
                                        }
                                    }
                                    if(bilsec[n]==6){
                                        if(ustamakas2.dayaniklik>0){
                                            bilgsyr2=1;
                                            break;
                                        }
                                    }
                                }
                                }
                            }
                            if(bilsec[m]==bilgsyr){
                                System.out.println(bilsec[m]);
                                if(bilsec[m]==1){
                                    oyun1=kagit1.etkihes(2,1,kagit1.dayaniklik,tas2.dayaniklik,0,2,2,0,0,0,1);
                                    oyun2=kagit1.etkihes(2,1,kagit1.dayaniklik,tas2.dayaniklik,0,2,2,0,0,0,2);
                                    oyun3=kagit1.etkihes(2,1,kagit1.dayaniklik,tas2.dayaniklik,0,2,2,0,0,0,3);
                                    tas2.durumgun(oyun3, oyun2);
                                    kagit1.durumgun(oyun3, oyun1);
                                    if(oyun3==1){
                                                System.out.println("Puaniniz eklendi");
                                                oyuncu1.skor=oyuncu1.skor+3;
                                            }
                                            if(oyun3==0){
                                                System.out.println("Puan eklenmedi");
                                                oyuncu2.skor=oyuncu2.skor+3;
                                            }
                                            if(oyun3==2){
                                                System.out.println("Berabere puani eklendi");
                                                oyuncu1.skor=oyuncu1.skor+1;
                                                oyuncu2.skor=oyuncu2.skor+1;
                                            }
                                    break;
                                }
                                if(bilsec[m]==2){
                                            oyun1=kagit1.etkihes(2,2,kagit1.dayaniklik,kagit2.dayaniklik,0,2,0,0,0,0,1);
                                            oyun2=kagit1.etkihes(2,2,kagit1.dayaniklik,kagit2.dayaniklik,0,2,0,0,0,0,2);
                                            oyun3=kagit1.etkihes(2,2,kagit1.dayaniklik,kagit2.dayaniklik,0,2,0,0,0,0,3);
                                            kagit1.durumgun(oyun3, oyun1);
                                            kagit2.durumgun(oyun3, oyun2);
                                            if(oyun3==1){
                                                System.out.println("Puaniniz eklendi");
                                                oyuncu1.skor=oyuncu1.skor+3;
                                            }
                                            if(oyun3==0){
                                                System.out.println("Puan eklenmedi");
                                                oyuncu2.skor=oyuncu2.skor+3;
                                            }
                                            if(oyun3==2){
                                                System.out.println("Berabere puani eklendi");
                                                oyuncu1.skor=oyuncu1.skor+1;
                                                oyuncu2.skor=oyuncu2.skor+1;
                                            }
                                            break;
                                }
                                if(bilsec[m]==3){
                                            oyun1=kagit1.etkihes(2,3,kagit1.dayaniklik,makas2.dayaniklik,2,2,0,0,0,0,1);
                                            oyun2=kagit1.etkihes(2,3,kagit1.dayaniklik,makas2.dayaniklik,2,2,0,0,0,0,2);
                                            oyun3=kagit1.etkihes(2,3,kagit1.dayaniklik,makas2.dayaniklik,2,2,0,0,0,0,3);
                                            kagit1.durumgun(oyun3, oyun1);
                                            makas2.durumgun(oyun3, oyun2);
                                            if(oyun3==1){
                                                System.out.println("Puaniniz eklendi");
                                                oyuncu1.skor=oyuncu1.skor+3;
                                            }
                                            if(oyun3==0){
                                                System.out.println("Puan eklenmedi");
                                                oyuncu2.skor=oyuncu2.skor+3;
                                            }
                                            if(oyun3==2){
                                                System.out.println("Berabere puani eklendi");
                                                oyuncu1.skor=oyuncu1.skor+1;
                                                oyuncu2.skor=oyuncu2.skor+1;
                                            }
                                    
                                }
                                if(bilsec[m]==4){
                                            oyun1=kagit1.etkihes(2,4,kagit1.dayaniklik,agirtas2.dayaniklik,0,2,2,0,0,2,1);
                                            oyun2=kagit1.etkihes(2,4,kagit1.dayaniklik,agirtas2.dayaniklik,0,2,2,0,0,2,2);
                                            oyun3=kagit1.etkihes(2,4,kagit1.dayaniklik,agirtas2.dayaniklik,0,2,2,0,0,2,3);
                                            kagit1.durumgun(oyun3, oyun1);
                                            agirtas2.durumgun(oyun3, oyun2);
                                            if(oyun3==1){
                                                System.out.println("Puaniniz eklendi");
                                                oyuncu1.skor=oyuncu1.skor+3;
                                            }
                                            if(oyun3==0){
                                                System.out.println("Puan eklenmedi");
                                                oyuncu2.skor=oyuncu2.skor+3;
                                            }
                                            if(oyun3==2){
                                                System.out.println("Berabere puani eklendi");
                                                oyuncu1.skor=oyuncu1.skor+1;
                                                oyuncu2.skor=oyuncu2.skor+1;
                                            }
                                    
                                }
                                if(bilsec[m]==5){
                                            oyun1=kagit1.etkihes(2,5,kagit1.dayaniklik,ozelkagit2.dayaniklik,0,2,0,0,2,0,1);
                                            oyun2=kagit1.etkihes(2,5,kagit1.dayaniklik,ozelkagit2.dayaniklik,0,2,0,0,2,0,2);
                                            oyun3=kagit1.etkihes(2,5,kagit1.dayaniklik,ozelkagit2.dayaniklik,0,2,0,0,2,0,3);
                                            kagit1.durumgun(oyun3, oyun1);
                                            ozelkagit2.durumgun(oyun3, oyun2);
                                            if(oyun3==1){
                                                System.out.println("Puaniniz eklendi");
                                                oyuncu1.skor=oyuncu1.skor+3;
                                            }
                                            if(oyun3==0){
                                                System.out.println("Puan eklenmedi");
                                                oyuncu2.skor=oyuncu2.skor+3;
                                            }
                                            if(oyun3==2){
                                                System.out.println("Berabere puani eklendi");
                                                oyuncu1.skor=oyuncu1.skor+1;
                                                oyuncu2.skor=oyuncu2.skor+1;
                                            }
                                    
                                }
                                if(bilsec[m]==6){
                                            oyun1=kagit1.etkihes(2,6,kagit1.dayaniklik,ustamakas2.dayaniklik,2,2,0,2,0,0,1);
                                            oyun2=kagit1.etkihes(2,6,kagit1.dayaniklik,ustamakas2.dayaniklik,2,2,0,2,0,0,2);
                                            oyun3=kagit1.etkihes(2,6,kagit1.dayaniklik,ustamakas2.dayaniklik,2,2,0,2,0,0,3);
                                            kagit1.durumgun(oyun3, oyun1);
                                            ustamakas2.durumgun(oyun3, oyun2);
                                            if(oyun3==1){
                                                System.out.println("Puaniniz eklendi");
                                                oyuncu1.skor=oyuncu1.skor+3;
                                            }
                                            if(oyun3==0){
                                                System.out.println("Puan eklenmedi");
                                                oyuncu2.skor=oyuncu2.skor+3;
                                            }
                                            if(oyun3==2){
                                                System.out.println("Berabere puani eklendi");
                                                oyuncu1.skor=oyuncu1.skor+1;
                                                oyuncu2.skor=oyuncu2.skor+1;
                                            }
                                }
                                
                                break;
                            }
                            
                        }
                        
                        
                    }
                    if(hamsec==3){
                        
                        for(int m=0;m<5;m++){     
                            while(bilgsyr2==0){
                                bilgsyr=rast.nextInt(6)+1;
                                for(int n=0;n<5;n++){
                                if(bilgsyr==bilsec[n]){
                                    if(bilsec[n]==1){
                                        if(tas2.dayaniklik>0){
                                            bilgsyr2=1;
                                            break;
                                        }
                                    }
                                    if(bilsec[n]==2){
                                        if(kagit2.dayaniklik>0){
                                            bilgsyr2=1;
                                            break;
                                        }
                                    }
                                    if(bilsec[n]==3){
                                        if(makas2.dayaniklik>0){
                                            bilgsyr2=1;
                                            break;
                                        }
                                    }
                                    if(bilsec[n]==4){
                                        if(agirtas2.dayaniklik>0){
                                            bilgsyr2=1;
                                            break;
                                        }
                                    }
                                    if(bilsec[n]==5){
                                        if(ozelkagit2.dayaniklik>0){
                                            bilgsyr2=1;
                                            break;
                                        }
                                    }
                                    if(bilsec[n]==6){
                                        if(ustamakas2.dayaniklik>0){
                                            bilgsyr2=1;
                                            break;
                                        }
                                    }
                                }
                                }
                            }
                            if(bilsec[m]==bilgsyr){
                                kontrol2=1;//gereksiz
                                if(bilsec[m]==1){
                                    oyun1=makas1.etkihes(3,1,makas1.dayaniklik,tas2.dayaniklik,2,0,2,0,0,0,1);
                                    oyun2=makas1.etkihes(3,1,makas1.dayaniklik,tas2.dayaniklik,2,0,2,0,0,0,2);
                                    oyun3=makas1.etkihes(3,1,makas1.dayaniklik,tas2.dayaniklik,2,0,2,0,0,0,3);
                                    tas2.durumgun(oyun3, oyun2);
                                    makas1.durumgun(oyun3, oyun1);
                                    if(oyun3==1){
                                                System.out.println("Puaniniz eklendi");
                                                oyuncu1.skor=oyuncu1.skor+3;
                                            }
                                            if(oyun3==0){
                                                System.out.println("Puan eklenmedi");
                                                oyuncu2.skor=oyuncu2.skor+3;
                                            }
                                            if(oyun3==2){
                                                System.out.println("Berabere puani eklendi");
                                                oyuncu1.skor=oyuncu1.skor+1;
                                                oyuncu2.skor=oyuncu2.skor+1;
                                            }
                                }
                                if(bilsec[m]==2){
                                            oyun1=makas1.etkihes(3,2,makas1.dayaniklik,kagit2.dayaniklik,2,2,0,0,0,0,1);
                                            oyun2=makas1.etkihes(3,2,makas1.dayaniklik,kagit2.dayaniklik,2,2,0,0,0,0,2);
                                            oyun3=makas1.etkihes(3,2,makas1.dayaniklik,kagit2.dayaniklik,2,2,0,0,0,0,3);
                                            makas1.durumgun(oyun3, oyun1);
                                            kagit2.durumgun(oyun3, oyun2);
                                            if(oyun3==1){
                                                System.out.println("Puaniniz eklendi");
                                                oyuncu1.skor=oyuncu1.skor+3;
                                            }
                                            if(oyun3==0){
                                                System.out.println("Puan eklenmedi");
                                                oyuncu2.skor=oyuncu2.skor+3;
                                            }
                                            if(oyun3==2){
                                                System.out.println("Berabere puani eklendi");
                                                oyuncu1.skor=oyuncu1.skor+1;
                                                oyuncu2.skor=oyuncu2.skor+1;
                                            }
                                }
                                if(bilsec[m]==3){
                                            oyun1=makas1.etkihes(3,3,makas1.dayaniklik,makas2.dayaniklik,2,0,0,0,0,0,1);
                                            oyun2=makas1.etkihes(3,3,makas1.dayaniklik,makas2.dayaniklik,2,0,0,0,0,0,2);
                                            oyun3=makas1.etkihes(3,3,makas1.dayaniklik,makas2.dayaniklik,2,0,0,0,0,0,3);
                                            makas1.durumgun(oyun3, oyun1);
                                            makas2.durumgun(oyun3, oyun2);
                                            if(oyun3==1){
                                                System.out.println("Puaniniz eklendi");
                                                oyuncu1.skor=oyuncu1.skor+3;
                                            }
                                            if(oyun3==0){
                                                System.out.println("Puan eklenmedi");
                                                oyuncu2.skor=oyuncu2.skor+3;
                                            }
                                            if(oyun3==2){
                                                System.out.println("Berabere puani eklendi");
                                                oyuncu1.skor=oyuncu1.skor+1;
                                                oyuncu2.skor=oyuncu2.skor+1;
                                            }
                                    
                                }
                                if(bilsec[m]==4){
                                            oyun1=makas1.etkihes(3,4,makas1.dayaniklik,agirtas2.dayaniklik,2,0,2,0,0,2,1);
                                            oyun2=makas1.etkihes(3,4,makas1.dayaniklik,agirtas2.dayaniklik,2,0,2,0,0,2,2);
                                            oyun3=makas1.etkihes(3,4,makas1.dayaniklik,agirtas2.dayaniklik,2,0,2,0,0,2,3);
                                            makas1.durumgun(oyun3, oyun1);
                                            agirtas2.durumgun(oyun3, oyun2);
                                            if(oyun3==1){
                                                System.out.println("Puaniniz eklendi");
                                                oyuncu1.skor=oyuncu1.skor+3;
                                            }
                                            if(oyun3==0){
                                                System.out.println("Puan eklenmedi");
                                                oyuncu2.skor=oyuncu2.skor+3;
                                            }
                                            if(oyun3==2){
                                                System.out.println("Berabere puani eklendi");
                                                oyuncu1.skor=oyuncu1.skor+1;
                                                oyuncu2.skor=oyuncu2.skor+1;
                                            }
                                    
                                }
                                if(bilsec[m]==5){
                                            oyun1=makas1.etkihes(3,5,makas1.dayaniklik,ozelkagit2.dayaniklik,2,2,0,0,2,0,1);
                                            oyun2=makas1.etkihes(3,5,makas1.dayaniklik,ozelkagit2.dayaniklik,2,2,0,0,2,0,2);
                                            oyun3=makas1.etkihes(3,5,makas1.dayaniklik,ozelkagit2.dayaniklik,2,2,0,0,2,0,3);
                                            makas1.durumgun(oyun3, oyun1);
                                            ozelkagit2.durumgun(oyun3, oyun2);
                                            if(oyun3==1){
                                                System.out.println("Puaniniz eklendi");
                                                oyuncu1.skor=oyuncu1.skor+3;
                                            }
                                            if(oyun3==0){
                                                System.out.println("Puan eklenmedi");
                                                oyuncu2.skor=oyuncu2.skor+3;
                                            }
                                            if(oyun3==2){
                                                System.out.println("Berabere puani eklendi");
                                                oyuncu1.skor=oyuncu1.skor+1;
                                                oyuncu2.skor=oyuncu2.skor+1;
                                            }
                                    
                                }
                                if(bilsec[m]==6){
                                            oyun1=makas1.etkihes(3,6,makas1.dayaniklik,ustamakas2.dayaniklik,2,0,0,2,0,0,1);
                                            oyun2=makas1.etkihes(3,6,makas1.dayaniklik,ustamakas2.dayaniklik,2,0,0,2,0,0,2);
                                            oyun3=makas1.etkihes(3,6,makas1.dayaniklik,ustamakas2.dayaniklik,2,0,0,2,0,0,3);
                                            makas1.durumgun(oyun3, oyun1);
                                            ustamakas2.durumgun(oyun3, oyun2);
                                            if(oyun3==1){
                                                System.out.println("Puaniniz eklendi");
                                                oyuncu1.skor=oyuncu1.skor+3;
                                            }
                                            if(oyun3==0){
                                                System.out.println("Puan eklenmedi");
                                                oyuncu2.skor=oyuncu2.skor+3;
                                            }
                                            if(oyun3==2){
                                                System.out.println("Berabere puani eklendi");
                                                oyuncu1.skor=oyuncu1.skor+1;
                                                oyuncu2.skor=oyuncu2.skor+1;
                                            }
                                }
                                
                                break;
                            }
                            
                        }
                        
                        
                        
                    }
                    if(hamsec==4){
                        
                        for(int m=0;m<5;m++){     
                            while(bilgsyr2==0){
                                bilgsyr=rast.nextInt(6)+1;
                                for(int n=0;n<5;n++){
                                if(bilgsyr==bilsec[n]){
                                    if(bilsec[n]==1){
                                        if(tas2.dayaniklik>0){
                                            bilgsyr2=1;
                                            break;
                                        }
                                    }
                                    if(bilsec[n]==2){
                                        if(kagit2.dayaniklik>0){
                                            bilgsyr2=1;
                                            break;
                                        }
                                    }
                                    if(bilsec[n]==3){
                                        if(makas2.dayaniklik>0){
                                            bilgsyr2=1;
                                            break;
                                        }
                                    }
                                    if(bilsec[n]==4){
                                        if(agirtas2.dayaniklik>0){
                                            bilgsyr2=1;
                                            break;
                                        }
                                    }
                                    if(bilsec[n]==5){
                                        if(ozelkagit2.dayaniklik>0){
                                            bilgsyr2=1;
                                            break;
                                        }
                                    }
                                    if(bilsec[n]==6){
                                        if(ustamakas2.dayaniklik>0){
                                            bilgsyr2=1;
                                            break;
                                        }
                                    }
                                }
                                }
                            }
                            if(bilsec[m]==bilgsyr){
                                if(bilsec[m]==1){
                                    oyun1=agirtas1.etkihes(4,1,agirtas1.dayaniklik,tas2.dayaniklik,0,0,2,0,0,2,1);
                                    oyun2=agirtas1.etkihes(4,1,agirtas1.dayaniklik,tas2.dayaniklik,0,0,2,0,0,2,2);
                                    oyun3=agirtas1.etkihes(4,1,agirtas1.dayaniklik,tas2.dayaniklik,0,0,2,0,0,2,3);
                                    tas2.durumgun(oyun3, oyun2);
                                    agirtas1.durumgun(oyun3, oyun1);
                                    if(oyun3==1){
                                                System.out.println("Puaniniz eklendi");
                                                oyuncu1.skor=oyuncu1.skor+3;
                                            }
                                            if(oyun3==0){
                                                System.out.println("Puan eklenmedi");
                                                oyuncu2.skor=oyuncu2.skor+3;
                                            }
                                            if(oyun3==2){
                                                System.out.println("Berabere puani eklendi");
                                                oyuncu1.skor=oyuncu1.skor+1;
                                                oyuncu2.skor=oyuncu2.skor+1;
                                            }
                                }
                                if(bilsec[m]==2){
                                            oyun1=agirtas1.etkihes(4,2,agirtas1.dayaniklik,kagit2.dayaniklik,0,2,2,0,0,2,1);
                                            oyun2=agirtas1.etkihes(4,2,agirtas1.dayaniklik,kagit2.dayaniklik,0,2,2,0,0,2,2);
                                            oyun3=agirtas1.etkihes(4,2,agirtas1.dayaniklik,kagit2.dayaniklik,0,2,2,0,0,2,3);
                                            agirtas1.durumgun(oyun3, oyun1);
                                            kagit2.durumgun(oyun3, oyun2);
                                            if(oyun3==1){
                                                System.out.println("Puaniniz eklendi");
                                                oyuncu1.skor=oyuncu1.skor+3;
                                            }
                                            if(oyun3==0){
                                                System.out.println("Puan eklenmedi");
                                                oyuncu2.skor=oyuncu2.skor+3;
                                            }
                                            if(oyun3==2){
                                                System.out.println("Berabere puani eklendi");
                                                oyuncu1.skor=oyuncu1.skor+1;
                                                oyuncu2.skor=oyuncu2.skor+1;
                                            }
                                }
                                if(bilsec[m]==3){
                                            oyun1=agirtas1.etkihes(4,3,agirtas1.dayaniklik,makas2.dayaniklik,2,0,2,0,0,2,1);
                                            oyun2=agirtas1.etkihes(4,3,agirtas1.dayaniklik,makas2.dayaniklik,2,0,2,0,0,2,2);
                                            oyun3=agirtas1.etkihes(4,3,agirtas1.dayaniklik,makas2.dayaniklik,2,0,2,0,0,2,3);
                                            agirtas1.durumgun(oyun3, oyun1);
                                            makas2.durumgun(oyun3, oyun2);
                                            if(oyun3==1){
                                                System.out.println("Puaniniz eklendi");
                                                oyuncu1.skor=oyuncu1.skor+3;
                                            }
                                            if(oyun3==0){
                                                System.out.println("Puan eklenmedi");
                                                oyuncu2.skor=oyuncu2.skor+3;
                                            }
                                            if(oyun3==2){
                                                System.out.println("Berabere puani eklendi");
                                                oyuncu1.skor=oyuncu1.skor+1;
                                                oyuncu2.skor=oyuncu2.skor+1;
                                            }
                                    
                                }
                                if(bilsec[m]==4){
                                            oyun1=agirtas1.etkihes(4,4,agirtas1.dayaniklik,agirtas2.dayaniklik,0,0,2,0,0,2,1);
                                            oyun2=agirtas1.etkihes(4,4,agirtas1.dayaniklik,agirtas2.dayaniklik,0,0,2,0,0,2,2);
                                            oyun3=agirtas1.etkihes(4,4,agirtas1.dayaniklik,agirtas2.dayaniklik,0,0,2,0,0,2,3);
                                            agirtas1.durumgun(oyun3, oyun1);
                                            agirtas2.durumgun(oyun3, oyun2);
                                            if(oyun3==1){
                                                System.out.println("Puaniniz eklendi");
                                                oyuncu1.skor=oyuncu1.skor+3;
                                            }
                                            if(oyun3==0){
                                                System.out.println("Puan eklenmedi");
                                                oyuncu2.skor=oyuncu2.skor+3;
                                            }
                                            if(oyun3==2){
                                                System.out.println("Berabere puani eklendi");
                                                oyuncu1.skor=oyuncu1.skor+1;
                                                oyuncu2.skor=oyuncu2.skor+1;
                                            }
                                    
                                }
                                if(bilsec[m]==5){
                                            oyun1=agirtas1.etkihes(4,5,agirtas1.dayaniklik,ozelkagit2.dayaniklik,0,2,2,0,2,2,1);
                                            oyun2=agirtas1.etkihes(4,5,agirtas1.dayaniklik,ozelkagit2.dayaniklik,0,2,2,0,2,2,2);
                                            oyun3=agirtas1.etkihes(4,5,agirtas1.dayaniklik,ozelkagit2.dayaniklik,0,2,2,0,2,2,3);
                                            agirtas1.durumgun(oyun3, oyun1);
                                            ozelkagit2.durumgun(oyun3, oyun2);
                                            if(oyun3==1){
                                                System.out.println("Puaniniz eklendi");
                                                oyuncu1.skor=oyuncu1.skor+3;
                                            }
                                            if(oyun3==0){
                                                System.out.println("Puan eklenmedi");
                                                oyuncu2.skor=oyuncu2.skor+3;
                                            }
                                            if(oyun3==2){
                                                System.out.println("Berabere puani eklendi");
                                                oyuncu1.skor=oyuncu1.skor+1;
                                                oyuncu2.skor=oyuncu2.skor+1;
                                            }
                                }
                                if(bilsec[m]==6){
                                            oyun1=agirtas1.etkihes(4,6,agirtas1.dayaniklik,ustamakas2.dayaniklik,2,0,2,2,0,2,1);
                                            oyun2=agirtas1.etkihes(4,6,agirtas1.dayaniklik,ustamakas2.dayaniklik,2,0,2,2,0,2,2);
                                            oyun3=agirtas1.etkihes(4,6,agirtas1.dayaniklik,ustamakas2.dayaniklik,2,0,2,2,0,2,3);
                                            agirtas1.durumgun(oyun3, oyun1);
                                            ustamakas2.durumgun(oyun3, oyun2);
                                            if(oyun3==1){
                                                System.out.println("Puaniniz eklendi");
                                                oyuncu1.skor=oyuncu1.skor+3;
                                            }
                                            if(oyun3==0){
                                                System.out.println("Puan eklenmedi");
                                                oyuncu2.skor=oyuncu2.skor+3;
                                            }
                                            if(oyun3==2){
                                                System.out.println("Berabere puani eklendi");
                                                oyuncu1.skor=oyuncu1.skor+1;
                                                oyuncu2.skor=oyuncu2.skor+1;
                                            }
                                }
                                break;
                            }
                        }        
                    }
                    if(hamsec==5){
                        
                        for(int m=0;m<5;m++){        
                            while(bilgsyr2==0){
                                bilgsyr=rast.nextInt(6)+1;
                                for(int n=0;n<5;n++){
                                if(bilgsyr==bilsec[n]){
                                    if(bilsec[n]==1){
                                        if(tas2.dayaniklik>0){
                                            bilgsyr2=1;
                                            break;
                                        }
                                    }
                                    if(bilsec[n]==2){
                                        if(kagit2.dayaniklik>0){
                                            bilgsyr2=1;
                                            break;
                                        }
                                    }
                                    if(bilsec[n]==3){
                                        if(makas2.dayaniklik>0){
                                            bilgsyr2=1;
                                            break;
                                        }
                                    }
                                    if(bilsec[n]==4){
                                        if(agirtas2.dayaniklik>0){
                                            bilgsyr2=1;
                                            break;
                                        }
                                    }
                                    if(bilsec[n]==5){
                                        if(ozelkagit2.dayaniklik>0){
                                            bilgsyr2=1;
                                            break;
                                        }
                                    }
                                    if(bilsec[n]==6){
                                        if(ustamakas2.dayaniklik>0){
                                            bilgsyr2=1;
                                            break;
                                        }
                                    }
                                }
                                }
                            }
                            if(bilsec[m]==bilgsyr){
                                kontrol2=1;//gereksiz
                                if(bilsec[m]==1){
                                    oyun1=ozelkagit1.etkihes(5,1,ozelkagit1.dayaniklik,tas2.dayaniklik,0,2,2,0,2,0,1);
                                    oyun2=ozelkagit1.etkihes(5,1,ozelkagit1.dayaniklik,tas2.dayaniklik,0,2,2,0,2,0,2);
                                    oyun3=ozelkagit1.etkihes(5,1,ozelkagit1.dayaniklik,tas2.dayaniklik,0,2,2,0,2,0,3);
                                    tas2.durumgun(oyun3, oyun1);
                                    ozelkagit1.durumgun(oyun3, oyun2);
                                    if(oyun3==1){
                                                System.out.println("Puaniniz eklendi");
                                                oyuncu1.skor=oyuncu1.skor+3;
                                            }
                                            if(oyun3==0){
                                                System.out.println("Puan eklenmedi");
                                                oyuncu2.skor=oyuncu2.skor+3;
                                            }
                                            if(oyun3==2){
                                                System.out.println("Berabere puani eklendi");
                                                oyuncu1.skor=oyuncu1.skor+1;
                                                oyuncu2.skor=oyuncu2.skor+1;
                                            }
                                }
                                if(bilsec[m]==2){
                                            oyun1=ozelkagit1.etkihes(5,2,ozelkagit1.dayaniklik,kagit2.dayaniklik,0,2,0,0,2,0,1);
                                            oyun2=ozelkagit1.etkihes(5,2,ozelkagit1.dayaniklik,kagit2.dayaniklik,0,2,0,0,2,0,2);
                                            oyun3=ozelkagit1.etkihes(5,2,ozelkagit1.dayaniklik,kagit2.dayaniklik,0,2,0,0,2,0,3);
                                            ozelkagit1.durumgun(oyun3, oyun1);
                                            kagit2.durumgun(oyun3, oyun2);
                                            if(oyun3==1){
                                                System.out.println("Puaniniz eklendi");
                                                oyuncu1.skor=oyuncu1.skor+3;
                                            }
                                            if(oyun3==0){
                                                System.out.println("Puan eklenmedi");
                                                oyuncu2.skor=oyuncu2.skor+3;
                                            }
                                            if(oyun3==2){
                                                System.out.println("Berabere puani eklendi");
                                                oyuncu1.skor=oyuncu1.skor+1;
                                                oyuncu2.skor=oyuncu2.skor+1;
                                            }
                                }
                                if(bilsec[m]==3){
                                            oyun1=ozelkagit1.etkihes(5,3,ozelkagit1.dayaniklik,makas2.dayaniklik,2,2,0,0,2,0,1);
                                            oyun2=ozelkagit1.etkihes(5,3,ozelkagit1.dayaniklik,makas2.dayaniklik,2,2,0,0,2,0,2);
                                            oyun3=ozelkagit1.etkihes(5,3,ozelkagit1.dayaniklik,makas2.dayaniklik,2,2,0,0,2,0,3);
                                            ozelkagit1.durumgun(oyun3, oyun1);
                                            makas2.durumgun(oyun3, oyun2);
                                            if(oyun3==1){
                                                System.out.println("Puaniniz eklendi");
                                                oyuncu1.skor=oyuncu1.skor+3;
                                            }
                                            if(oyun3==0){
                                                System.out.println("Puan eklenmedi");
                                                oyuncu2.skor=oyuncu2.skor+3;
                                            }
                                            if(oyun3==2){
                                                System.out.println("Berabere puani eklendi");
                                                oyuncu1.skor=oyuncu1.skor+1;
                                                oyuncu2.skor=oyuncu2.skor+1;
                                            }
                                    
                                }
                                if(bilsec[m]==4){
                                            oyun1=ozelkagit1.etkihes(5,4,ozelkagit1.dayaniklik,agirtas2.dayaniklik,0,2,2,0,2,2,1);
                                            oyun2=ozelkagit1.etkihes(5,4,ozelkagit1.dayaniklik,agirtas2.dayaniklik,0,2,2,0,2,2,2);
                                            oyun3=ozelkagit1.etkihes(5,4,ozelkagit1.dayaniklik,agirtas2.dayaniklik,0,2,2,0,2,2,3);
                                            ozelkagit1.durumgun(oyun3, oyun1);
                                            agirtas2.durumgun(oyun3, oyun2);
                                            if(oyun3==1){
                                                System.out.println("Puaniniz eklendi");
                                                oyuncu1.skor=oyuncu1.skor+3;
                                            }
                                            if(oyun3==0){
                                                System.out.println("Puan eklenmedi");
                                                oyuncu2.skor=oyuncu2.skor+3;
                                            }
                                            if(oyun3==2){
                                                System.out.println("Berabere puani eklendi");
                                                oyuncu1.skor=oyuncu1.skor+1;
                                                oyuncu2.skor=oyuncu2.skor+1;
                                            }
                                    
                                }
                                if(bilsec[m]==5){
                                            oyun1=ozelkagit1.etkihes(5,5,ozelkagit1.dayaniklik,ozelkagit2.dayaniklik,0,2,0,0,2,0,1);
                                            oyun2=ozelkagit1.etkihes(5,5,ozelkagit1.dayaniklik,ozelkagit2.dayaniklik,0,2,0,0,2,0,2);
                                            oyun3=ozelkagit1.etkihes(5,5,ozelkagit1.dayaniklik,ozelkagit2.dayaniklik,0,2,0,0,2,0,3);
                                            ozelkagit1.durumgun(oyun3, oyun1);
                                            ozelkagit2.durumgun(oyun3, oyun2);
                                            if(oyun3==1){
                                                System.out.println("Puaniniz eklendi");
                                                oyuncu1.skor=oyuncu1.skor+3;
                                            }
                                            if(oyun3==0){
                                                System.out.println("Puan eklenmedi");
                                                oyuncu2.skor=oyuncu2.skor+3;
                                            }
                                            if(oyun3==2){
                                                System.out.println("Berabere puani eklendi");
                                                oyuncu1.skor=oyuncu1.skor+1;
                                                oyuncu2.skor=oyuncu2.skor+1;
                                            }
                                    
                                }
                                if(bilsec[m]==6){
                                            oyun1=ozelkagit1.etkihes(5,6,ozelkagit1.dayaniklik,ustamakas2.dayaniklik,2,2,0,2,2,0,1);
                                            oyun2=ozelkagit1.etkihes(5,6,ozelkagit1.dayaniklik,ustamakas2.dayaniklik,2,2,0,2,2,0,2);
                                            oyun3=ozelkagit1.etkihes(5,6,ozelkagit1.dayaniklik,ustamakas2.dayaniklik,2,2,0,2,2,0,3);
                                            ozelkagit1.durumgun(oyun3, oyun1);
                                            ustamakas2.durumgun(oyun3, oyun2);
                                            if(oyun3==1){
                                                System.out.println("Puaniniz eklendi");
                                                oyuncu1.skor=oyuncu1.skor+3;
                                            }
                                            if(oyun3==0){
                                                System.out.println("Puan eklenmedi");
                                                oyuncu2.skor=oyuncu2.skor+3;
                                            }
                                            if(oyun3==2){
                                                System.out.println("Berabere puani eklendi");
                                                oyuncu1.skor=oyuncu1.skor+1;
                                                oyuncu2.skor=oyuncu2.skor+1;
                                            }
                                }
                                break;
                            }     
                        }
                    }
                    if(hamsec==6){
                        for(int m=0;m<5;m++){       
                            while(bilgsyr2==0){
                                bilgsyr=rast.nextInt(6)+1;
                                for(int n=0;n<5;n++){
                                if(bilgsyr==bilsec[n]){
                                    if(bilsec[n]==1){
                                        if(tas2.dayaniklik>0){
                                            bilgsyr2=1;
                                            break;
                                        }
                                    }
                                    if(bilsec[n]==2){
                                        if(kagit2.dayaniklik>0){
                                            bilgsyr2=1;
                                            break;
                                        }
                                    }
                                    if(bilsec[n]==3){
                                        if(makas2.dayaniklik>0){
                                            bilgsyr2=1;
                                            break;
                                        }
                                    }
                                    if(bilsec[n]==4){
                                        if(agirtas2.dayaniklik>0){
                                            bilgsyr2=1;
                                            break;
                                        }
                                    }
                                    if(bilsec[n]==5){
                                        if(ozelkagit2.dayaniklik>0){
                                            bilgsyr2=1;
                                            break;
                                        }
                                    }
                                    if(bilsec[n]==6){
                                        if(ustamakas2.dayaniklik>0){
                                            bilgsyr2=1;
                                            break;
                                        }
                                    }
                                }
                                }
                            }
                            if(bilsec[m]==bilgsyr){
                                kontrol2=1;//gereksiz
                                if(bilsec[m]==1){
                                    oyun1=ustamakas1.etkihes(6,1,ustamakas1.dayaniklik,tas2.dayaniklik,2,0,2,2,0,0,1);
                                    oyun2=ustamakas1.etkihes(6,1,ustamakas1.dayaniklik,tas2.dayaniklik,2,0,2,2,0,0,2);
                                    oyun3=ustamakas1.etkihes(6,1,ustamakas1.dayaniklik,tas2.dayaniklik,2,0,2,2,0,0,3);
                                    tas2.durumgun(oyun3, oyun1);
                                    ustamakas1.durumgun(oyun3, oyun2);
                                    if(oyun3==1){
                                                System.out.println("Puaniniz eklendi");
                                                oyuncu1.skor=oyuncu1.skor+3;
                                            }
                                            if(oyun3==0){
                                                System.out.println("Puan eklenmedi");
                                                oyuncu2.skor=oyuncu2.skor+3;
                                            }
                                            if(oyun3==2){
                                                System.out.println("Berabere puani eklendi");
                                                oyuncu1.skor=oyuncu1.skor+1;
                                                oyuncu2.skor=oyuncu2.skor+1;
                                            }
                                }
                                if(bilsec[m]==2){
                                            oyun1=ustamakas1.etkihes(6,2,ustamakas1.dayaniklik,kagit2.dayaniklik,2,2,0,2,0,0,1);
                                            oyun2=ustamakas1.etkihes(6,2,ustamakas1.dayaniklik,kagit2.dayaniklik,2,2,0,2,0,0,2);
                                            oyun3=ustamakas1.etkihes(6,2,ustamakas1.dayaniklik,kagit2.dayaniklik,2,2,0,2,0,0,3);
                                            ustamakas1.durumgun(oyun3, oyun1);
                                            kagit2.durumgun(oyun3, oyun2);
                                            if(oyun3==1){
                                                System.out.println("Puaniniz eklendi");
                                                oyuncu1.skor=oyuncu1.skor+3;
                                            }
                                            if(oyun3==0){
                                                System.out.println("Puan eklenmedi");
                                                oyuncu2.skor=oyuncu2.skor+3;
                                            }
                                            if(oyun3==2){
                                                System.out.println("Berabere puani eklendi");
                                                oyuncu1.skor=oyuncu1.skor+1;
                                                oyuncu2.skor=oyuncu2.skor+1;
                                            }
                                }
                                if(bilsec[m]==3){
                                            oyun1=ustamakas1.etkihes(6,3,ustamakas1.dayaniklik,makas2.dayaniklik,2,0,0,2,0,0,1);
                                            oyun2=ustamakas1.etkihes(6,3,ustamakas1.dayaniklik,makas2.dayaniklik,2,0,0,2,0,0,2);
                                            oyun3=ustamakas1.etkihes(6,3,ustamakas1.dayaniklik,makas2.dayaniklik,2,0,0,2,0,0,3);
                                            ustamakas1.durumgun(oyun3, oyun1);
                                            makas2.durumgun(oyun3, oyun2);
                                            if(oyun3==1){
                                                System.out.println("Puaniniz eklendi");
                                                oyuncu1.skor=oyuncu1.skor+3;
                                            }
                                            if(oyun3==0){
                                                System.out.println("Puan eklenmedi");
                                                oyuncu2.skor=oyuncu2.skor+3;
                                            }
                                            if(oyun3==2){
                                                System.out.println("Berabere puani eklendi");
                                                oyuncu1.skor=oyuncu1.skor+1;
                                                oyuncu2.skor=oyuncu2.skor+1;
                                            }
                                    
                                }
                                if(bilsec[m]==4){
                                            oyun1=ustamakas1.etkihes(6,4,ustamakas1.dayaniklik,agirtas2.dayaniklik,2,0,2,2,0,2,1);
                                            oyun2=ustamakas1.etkihes(6,4,ustamakas1.dayaniklik,agirtas2.dayaniklik,2,0,2,2,0,2,2);
                                            oyun3=ustamakas1.etkihes(6,4,ustamakas1.dayaniklik,agirtas2.dayaniklik,2,0,2,2,0,2,3);
                                            ustamakas1.durumgun(oyun3, oyun1);
                                            agirtas2.durumgun(oyun3, oyun2);
                                            if(oyun3==1){
                                                System.out.println("Puaniniz eklendi");
                                                oyuncu1.skor=oyuncu1.skor+3;
                                            }
                                            if(oyun3==0){
                                                System.out.println("Puan eklenmedi");
                                                oyuncu2.skor=oyuncu2.skor+3;
                                            }
                                            if(oyun3==2){
                                                System.out.println("Berabere puani eklendi");
                                                oyuncu1.skor=oyuncu1.skor+1;
                                                oyuncu2.skor=oyuncu2.skor+1;
                                            }
                                    
                                }
                                if(bilsec[m]==5){
                                            oyun1=ustamakas1.etkihes(6,5,ustamakas1.dayaniklik,ozelkagit2.dayaniklik,2,2,0,2,2,0,1);
                                            oyun2=ustamakas1.etkihes(6,5,ustamakas1.dayaniklik,ozelkagit2.dayaniklik,2,2,0,2,2,0,2);
                                            oyun3=ustamakas1.etkihes(6,5,ustamakas1.dayaniklik,ozelkagit2.dayaniklik,2,2,0,2,2,0,3);
                                            ustamakas1.durumgun(oyun3, oyun1);
                                            ozelkagit2.durumgun(oyun3, oyun2);
                                            if(oyun3==1){
                                                System.out.println("Puaniniz eklendi");
                                                oyuncu1.skor=oyuncu1.skor+3;
                                            }
                                            if(oyun3==0){
                                                System.out.println("Puan eklenmedi");
                                                oyuncu2.skor=oyuncu2.skor+3;
                                            }
                                            if(oyun3==2){
                                                System.out.println("Berabere puani eklendi");
                                                oyuncu1.skor=oyuncu1.skor+1;
                                                oyuncu2.skor=oyuncu2.skor+1;
                                            }
                                    
                                }
                                if(bilsec[m]==6){
                                            oyun1=ustamakas1.etkihes(6,6,ustamakas1.dayaniklik,ustamakas2.dayaniklik,2,0,0,2,0,0,1);
                                            oyun2=ustamakas1.etkihes(6,6,ustamakas1.dayaniklik,ustamakas2.dayaniklik,2,0,0,2,0,0,2);
                                            oyun3=ustamakas1.etkihes(6,6,ustamakas1.dayaniklik,ustamakas2.dayaniklik,2,0,0,2,0,0,3);
                                            ustamakas1.durumgun(oyun3, oyun1);
                                            ustamakas2.durumgun(oyun3, oyun2);
                                            if(oyun3==1){
                                                System.out.println("Puaniniz eklendi");
                                                oyuncu1.skor=oyuncu1.skor+3;
                                            }
                                            if(oyun3==0){
                                                System.out.println("Puan eklenmedi");
                                                oyuncu2.skor=oyuncu2.skor+3;
                                            }
                                            if(oyun3==2){
                                                System.out.println("Berabere puani eklendi");
                                                oyuncu1.skor=oyuncu1.skor+1;
                                                oyuncu2.skor=oyuncu2.skor+1;
                                            }
                                }
                                
                                break;
                            }
                            
                        }
      
                    }
                        
                    }
                    
                  System.out.println("Bilgisayar skoru:  "+oyuncu2.skor);
                  System.out.println("Kullanici skoru:   "+oyuncu1.skor);
                  if(oyuncu1.skor>oyuncu2.skor){
                      System.out.println("Bay / Bayan "+oyuncu1.oyuncuAdi);
                      System.out.println("Tebrikler Kazandinizzzzzzzzzzzzz................");
                  }
                  if(oyuncu1.skor<oyuncu2.skor){
                      System.out.println("Bay / Bayan "+oyuncu1.oyuncuAdi);
                      System.out.println("Malesef Yenildinizzzzzzzzzzzzzzzz..........");
                  }
                  if(oyuncu1.skor==oyuncu2.skor){
                      System.out.println("Bay / Bayan "+oyuncu1.oyuncuAdi);
                      System.out.println("Iyi denemene Berabere Bitti...............");
                  }
                  
                    
                
            menu=1;
            break;
        case 2:
            System.out.println("Hamle sayisi giriniz");
            hamle=scanner.nextInt();
            bilgisayar oyuncu4=new bilgisayar(34,"Beko");
            bilgisayar oyuncu3=new bilgisayar(41,"Feradow");
            for(int n=0;n<5;n++){
                bilgsyr=rast.nextInt(6)+1;
                bilsec[n]=bilgsyr;
                for(int mat=0;mat<n;mat++){
                    if(bilsec[mat]==bilgsyr){
                        n=n-1;
                        break;
                    }
                    if(bilgsyr>6){
                        n=n-1;
                        break;
                    }
                }
                
            }
            for(int n=0;n<5;n++){
                bilgsyr=rast.nextInt(6)+1;
                bilsec2[n]=bilgsyr;
                for(int mat=0;mat<n;mat++){
                    if(bilsec2[mat]==bilgsyr){
                        n=n-1;
                        break;
                    }
                    if(bilgsyr>6){
                        n=n-1;
                        break;
                    }
                }
                
            }
            for(int m=0;m<hamle;m++){
                bilgsyr2=0;
                                while(bilgsyr2==0){
                                bilgsyr=rast.nextInt(6)+1;
                                for(int n=0;n<5;n++){
                                if(bilgsyr==bilsec2[n]){
                                    if(bilsec2[n]==1){
                                        if(tas1.dayaniklik>0){
                                            bilgsyr2=1;
                                            break;
                                        }
                                    }
                                    if(bilsec2[n]==2){
                                        if(kagit1.dayaniklik>0){
                                            bilgsyr2=1;
                                            break;
                                        }
                                    }
                                    if(bilsec2[n]==3){
                                        if(makas1.dayaniklik>0){
                                            bilgsyr2=1;
                                            break;
                                        }
                                    }
                                    if(bilsec2[n]==4){
                                        if(agirtas1.dayaniklik>0){
                                            bilgsyr2=1;
                                            break;
                                        }
                                    }
                                    if(bilsec2[n]==5){
                                        if(ozelkagit1.dayaniklik>0){
                                            bilgsyr2=1;
                                            break;
                                        }
                                    }
                                    if(bilsec2[n]==6){
                                        if(ustamakas1.dayaniklik>0){
                                            bilgsyr2=1;
                                            break;
                                        }
                                    }
                                    rastgele=bilgsyr;
                                }
                                }
                            }
                hamsec=bilgsyr;
                if(hamsec==1){
                        
                        for(int mk=0;mk<5;mk++){
                            bilgsyr2=0;
                            while(bilgsyr2==0){
                                bilgsyr=rast.nextInt(6)+1;
                                for(int n=0;n<5;n++){
                                if(bilgsyr==bilsec[n]){
                                    if(bilsec[n]==1){
                                        if(tas2.dayaniklik>0){
                                            bilgsyr2=1;
                                            break;
                                        }
                                    }
                                    if(bilsec[n]==2){
                                        if(kagit2.dayaniklik>0){
                                            bilgsyr2=1;
                                            break;
                                        }
                                    }
                                    if(bilsec[n]==3){
                                        if(makas2.dayaniklik>0){
                                            bilgsyr2=1;
                                            break;
                                        }
                                    }
                                    if(bilsec[n]==4){
                                        if(agirtas2.dayaniklik>0){
                                            bilgsyr2=1;
                                            break;
                                        }
                                    }
                                    if(bilsec[n]==5){
                                        if(ozelkagit2.dayaniklik>0){
                                            bilgsyr2=1;
                                            break;
                                        }
                                    }
                                    if(bilsec[n]==6){
                                        if(ustamakas2.dayaniklik>0){
                                            bilgsyr2=1;
                                            break;
                                        }
                                    }
                                }
                                }
                            }
                            if(bilsec[mk]==bilgsyr){
                                kontrol2=1;//gereksiz
                                if(bilsec[mk]==1){
                                    oyun1=tas1.etkihes(1,1,tas1.dayaniklik,tas2.dayaniklik,0,0,2,0,0,0,1);
                                    oyun2=tas1.etkihes(1,1,tas1.dayaniklik,tas2.dayaniklik,0,0,2,0,0,0,2);
                                    oyun3=tas1.etkihes(1,1,tas1.dayaniklik,tas2.dayaniklik,0,0,2,0,0,0,3);
                                    tas2.durumgun(oyun3, oyun2);
                                    tas1.durumgun(oyun3, oyun1);
                                    if(oyun3==1){
                                                System.out.println("Puaniniz eklendi");
                                                oyuncu3.skor=oyuncu3.skor+3;
                                            }
                                            if(oyun3==0){
                                                System.out.println("Puan eklenmedi");
                                                oyuncu4.skor=oyuncu4.skor+3;
                                            }
                                            if(oyun3==2){
                                                System.out.println("Berabere puani eklendi");
                                                oyuncu3.skor=oyuncu3.skor+1;
                                                oyuncu4.skor=oyuncu4.skor+1;
                                            }
                                }
                                if(bilsec[mk]==2){
                                            oyun1=tas1.etkihes(1,2,tas1.dayaniklik,kagit2.dayaniklik,0,2,2,0,0,0,1);
                                            oyun2=tas1.etkihes(1,2,tas1.dayaniklik,kagit2.dayaniklik,0,2,2,0,0,0,2);
                                            oyun3=tas1.etkihes(1,2,tas1.dayaniklik,kagit2.dayaniklik,0,2,2,0,0,0,3);
                                            tas1.durumgun(oyun3, oyun1);
                                            kagit2.durumgun(oyun3, oyun2);
                                            if(oyun3==1){
                                                System.out.println("Puaniniz eklendi");
                                                oyuncu3.skor=oyuncu3.skor+3;
                                            }
                                            if(oyun3==0){
                                                System.out.println("Puan eklenmedi");
                                                oyuncu4.skor=oyuncu4.skor+3;
                                            }
                                            if(oyun3==2){
                                                System.out.println("Berabere puani eklendi");
                                                oyuncu3.skor=oyuncu3.skor+1;
                                                oyuncu4.skor=oyuncu4.skor+1;
                                            }
                                }
                                if(bilsec[mk]==3){
                                            oyun1=tas1.etkihes(1,3,tas1.dayaniklik,makas2.dayaniklik,2,0,2,0,0,0,1);
                                            oyun2=tas1.etkihes(1,3,tas1.dayaniklik,makas2.dayaniklik,2,0,2,0,0,0,2);
                                            oyun3=tas1.etkihes(1,3,tas1.dayaniklik,makas2.dayaniklik,2,0,2,0,0,0,3);
                                            tas1.durumgun(oyun3, oyun1);
                                            makas2.durumgun(oyun3, oyun2);
                                            if(oyun3==1){
                                                System.out.println("Puaniniz eklendi");
                                                oyuncu4.skor=oyuncu4.skor+3;
                                            }
                                            if(oyun3==0){
                                                System.out.println("Puan eklenmedi");
                                                oyuncu4.skor=oyuncu4.skor+3;
                                            }
                                            if(oyun3==2){
                                                System.out.println("Berabere puani eklendi");
                                                oyuncu3.skor=oyuncu3.skor+1;
                                                oyuncu4.skor=oyuncu4.skor+1;
                                            }
                                    
                                }
                                if(bilsec[mk]==4){
                                            oyun1=tas1.etkihes(1,4,tas1.dayaniklik,agirtas2.dayaniklik,0,0,2,0,0,2,1);
                                            oyun2=tas1.etkihes(1,4,tas1.dayaniklik,agirtas2.dayaniklik,0,0,2,0,0,2,2);
                                            oyun3=tas1.etkihes(1,4,tas1.dayaniklik,agirtas2.dayaniklik,0,0,2,0,0,2,3);
                                            tas1.durumgun(oyun3, oyun1);
                                            agirtas2.durumgun(oyun3, oyun2);
                                            if(oyun3==1){
                                                System.out.println("Puaniniz eklendi");
                                                oyuncu3.skor=oyuncu3.skor+3;
                                            }
                                            if(oyun3==0){
                                                System.out.println("Puan eklenmedi");
                                                oyuncu4.skor=oyuncu4.skor+3;
                                            }
                                            if(oyun3==2){
                                                System.out.println("Berabere puani eklendi");
                                                oyuncu3.skor=oyuncu3.skor+1;
                                                oyuncu4.skor=oyuncu4.skor+1;
                                            }
                                    
                                }
                                if(bilsec[mk]==5){
                                            oyun1=tas1.etkihes(1,5,tas1.dayaniklik,ozelkagit2.dayaniklik,0,2,2,0,2,0,1);
                                            oyun2=tas1.etkihes(1,5,tas1.dayaniklik,ozelkagit2.dayaniklik,0,2,2,0,2,0,2);
                                            oyun3=tas1.etkihes(1,5,tas1.dayaniklik,ozelkagit2.dayaniklik,0,2,2,0,2,0,3);
                                            tas1.durumgun(oyun3, oyun1);
                                            ozelkagit2.durumgun(oyun3, oyun2);
                                            if(oyun3==1){
                                                System.out.println("Puaniniz eklendi");
                                                oyuncu3.skor=oyuncu3.skor+3;
                                            }
                                            if(oyun3==0){
                                                System.out.println("Puan eklenmedi");
                                                oyuncu4.skor=oyuncu4.skor+3;
                                            }
                                            if(oyun3==2){
                                                System.out.println("Berabere puani eklendi");
                                                oyuncu3.skor=oyuncu3.skor+1;
                                                oyuncu4.skor=oyuncu4.skor+1;
                                            }
                                    
                                }
                                if(bilsec[mk]==6){
                                            oyun1=tas1.etkihes(1,6,tas1.dayaniklik,ustamakas2.dayaniklik,2,0,2,2,0,0,1);
                                            oyun2=tas1.etkihes(1,6,tas1.dayaniklik,ustamakas2.dayaniklik,2,0,2,2,0,0,2);
                                            oyun3=tas1.etkihes(1,6,tas1.dayaniklik,ustamakas2.dayaniklik,2,0,2,2,0,0,3);
                                            tas1.durumgun(oyun3, oyun1);
                                            ustamakas2.durumgun(oyun3, oyun2);
                                            if(oyun3==1){
                                                System.out.println("Puaniniz eklendi");
                                                oyuncu3.skor=oyuncu3.skor+3;
                                            }
                                            if(oyun3==0){
                                                System.out.println("Puan eklenmedi");
                                                oyuncu4.skor=oyuncu4.skor+3;
                                            }
                                            if(oyun3==2){
                                                System.out.println("Berabere puani eklendi");
                                                oyuncu3.skor=oyuncu3.skor+1;
                                                oyuncu4.skor=oyuncu4.skor+1;
                                            }
                                }
                                
                                break;
                            }
                            
                        }
                        
                    }
                    if(hamsec==2){  
                        for(int mk=0;mk<5;mk++){  
                            bilgsyr2=0;
                            while(bilgsyr2==0){
                                bilgsyr=rast.nextInt(6)+1;
                                for(int n=0;n<5;n++){
                                if(bilgsyr==bilsec[n]){
                                    if(bilsec[n]==1){
                                        if(tas2.dayaniklik>0){
                                            bilgsyr2=1;
                                            break;
                                        }
                                    }
                                    if(bilsec[n]==2){
                                        if(kagit2.dayaniklik>0){
                                            bilgsyr2=1;
                                            break;
                                        }
                                    }
                                    if(bilsec[n]==3){
                                        if(makas2.dayaniklik>0){
                                            bilgsyr2=1;
                                            break;
                                        }
                                    }
                                    if(bilsec[n]==4){
                                        if(agirtas2.dayaniklik>0){
                                            bilgsyr2=1;
                                            break;
                                        }
                                    }
                                    if(bilsec[n]==5){
                                        if(ozelkagit2.dayaniklik>0){
                                            bilgsyr2=1;
                                            break;
                                        }
                                    }
                                    if(bilsec[n]==6){
                                        if(ustamakas2.dayaniklik>0){
                                            bilgsyr2=1;
                                            break;
                                        }
                                    }
                                }
                                }
                            }
                            if(bilsec[mk]==bilgsyr){
                                System.out.println(bilsec[mk]);
                                if(bilsec[mk]==1){
                                    oyun1=kagit1.etkihes(2,1,kagit1.dayaniklik,tas2.dayaniklik,0,2,2,0,0,0,1);
                                    oyun2=kagit1.etkihes(2,1,kagit1.dayaniklik,tas2.dayaniklik,0,2,2,0,0,0,2);
                                    oyun3=kagit1.etkihes(2,1,kagit1.dayaniklik,tas2.dayaniklik,0,2,2,0,0,0,3);
                                    tas2.durumgun(oyun3, oyun2);
                                    kagit1.durumgun(oyun3, oyun1);
                                    if(oyun3==1){
                                                System.out.println("Puaniniz eklendi");
                                                oyuncu3.skor=oyuncu3.skor+3;
                                            }
                                            if(oyun3==0){
                                                System.out.println("Puan eklenmedi");
                                                oyuncu4.skor=oyuncu4.skor+3;
                                            }
                                            if(oyun3==2){
                                                System.out.println("Berabere puani eklendi");
                                                oyuncu3.skor=oyuncu3.skor+1;
                                                oyuncu4.skor=oyuncu4.skor+1;
                                            }
                                    break;
                                }
                                if(bilsec[mk]==2){
                                            oyun1=kagit1.etkihes(2,2,kagit1.dayaniklik,kagit2.dayaniklik,0,2,0,0,0,0,1);
                                            oyun2=kagit1.etkihes(2,2,kagit1.dayaniklik,kagit2.dayaniklik,0,2,0,0,0,0,2);
                                            oyun3=kagit1.etkihes(2,2,kagit1.dayaniklik,kagit2.dayaniklik,0,2,0,0,0,0,3);
                                            kagit1.durumgun(oyun3, oyun1);
                                            kagit2.durumgun(oyun3, oyun2);
                                            if(oyun3==1){
                                                System.out.println("Puaniniz eklendi");
                                                oyuncu3.skor=oyuncu3.skor+3;
                                            }
                                            if(oyun3==0){
                                                System.out.println("Puan eklenmedi");
                                                oyuncu4.skor=oyuncu4.skor+3;
                                            }
                                            if(oyun3==2){
                                                System.out.println("Berabere puani eklendi");
                                                oyuncu3.skor=oyuncu3.skor+1;
                                                oyuncu4.skor=oyuncu4.skor+1;
                                            }
                                            break;
                                }
                                if(bilsec[mk]==3){
                                            oyun1=kagit1.etkihes(2,3,kagit1.dayaniklik,makas2.dayaniklik,2,2,0,0,0,0,1);
                                            oyun2=kagit1.etkihes(2,3,kagit1.dayaniklik,makas2.dayaniklik,2,2,0,0,0,0,2);
                                            oyun3=kagit1.etkihes(2,3,kagit1.dayaniklik,makas2.dayaniklik,2,2,0,0,0,0,3);
                                            kagit1.durumgun(oyun3, oyun1);
                                            makas2.durumgun(oyun3, oyun2);
                                            if(oyun3==1){
                                                System.out.println("Puaniniz eklendi");
                                                oyuncu3.skor=oyuncu3.skor+3;
                                            }
                                            if(oyun3==0){
                                                System.out.println("Puan eklenmedi");
                                                oyuncu4.skor=oyuncu4.skor+3;
                                            }
                                            if(oyun3==2){
                                                System.out.println("Berabere puani eklendi");
                                                oyuncu3.skor=oyuncu3.skor+1;
                                                oyuncu4.skor=oyuncu4.skor+1;
                                            }
                                    
                                }
                                if(bilsec[mk]==4){
                                            oyun1=kagit1.etkihes(2,4,kagit1.dayaniklik,agirtas2.dayaniklik,0,2,2,0,0,2,1);
                                            oyun2=kagit1.etkihes(2,4,kagit1.dayaniklik,agirtas2.dayaniklik,0,2,2,0,0,2,2);
                                            oyun3=kagit1.etkihes(2,4,kagit1.dayaniklik,agirtas2.dayaniklik,0,2,2,0,0,2,3);
                                            kagit1.durumgun(oyun3, oyun1);
                                            agirtas2.durumgun(oyun3, oyun2);
                                            if(oyun3==1){
                                                System.out.println("Puaniniz eklendi");
                                                oyuncu3.skor=oyuncu3.skor+3;
                                            }
                                            if(oyun3==0){
                                                System.out.println("Puan eklenmedi");
                                                oyuncu4.skor=oyuncu4.skor+3;
                                            }
                                            if(oyun3==2){
                                                System.out.println("Berabere puani eklendi");
                                                oyuncu3.skor=oyuncu3.skor+1;
                                                oyuncu4.skor=oyuncu4.skor+1;
                                            }
                                    
                                }
                                if(bilsec[mk]==5){
                                            oyun1=kagit1.etkihes(2,5,kagit1.dayaniklik,ozelkagit2.dayaniklik,0,2,0,0,2,0,1);
                                            oyun2=kagit1.etkihes(2,5,kagit1.dayaniklik,ozelkagit2.dayaniklik,0,2,0,0,2,0,2);
                                            oyun3=kagit1.etkihes(2,5,kagit1.dayaniklik,ozelkagit2.dayaniklik,0,2,0,0,2,0,3);
                                            kagit1.durumgun(oyun3, oyun1);
                                            ozelkagit2.durumgun(oyun3, oyun2);
                                            if(oyun3==1){
                                                System.out.println("Puaniniz eklendi");
                                                oyuncu3.skor=oyuncu3.skor+3;
                                            }
                                            if(oyun3==0){
                                                System.out.println("Puan eklenmedi");
                                                oyuncu4.skor=oyuncu4.skor+3;
                                            }
                                            if(oyun3==2){
                                                System.out.println("Berabere puani eklendi");
                                                oyuncu3.skor=oyuncu3.skor+1;
                                                oyuncu4.skor=oyuncu4.skor+1;
                                            }
                                    
                                }
                                if(bilsec[mk]==6){
                                            oyun1=kagit1.etkihes(2,6,kagit1.dayaniklik,ustamakas2.dayaniklik,2,2,0,2,0,0,1);
                                            oyun2=kagit1.etkihes(2,6,kagit1.dayaniklik,ustamakas2.dayaniklik,2,2,0,2,0,0,2);
                                            oyun3=kagit1.etkihes(2,6,kagit1.dayaniklik,ustamakas2.dayaniklik,2,2,0,2,0,0,3);
                                            kagit1.durumgun(oyun3, oyun1);
                                            ustamakas2.durumgun(oyun3, oyun2);
                                            if(oyun3==1){
                                                System.out.println("Puaniniz eklendi");
                                                oyuncu3.skor=oyuncu3.skor+3;
                                            }
                                            if(oyun3==0){
                                                System.out.println("Puan eklenmedi");
                                                oyuncu4.skor=oyuncu4.skor+3;
                                            }
                                            if(oyun3==2){
                                                System.out.println("Berabere puani eklendi");
                                                oyuncu3.skor=oyuncu3.skor+1;
                                                oyuncu4.skor=oyuncu4.skor+1;
                                            }
                                }
                                
                                break;
                            }
                            
                        }
                        
                        
                    }
                    if(hamsec==3){
                        
                        for(int mk=0;mk<5;mk++){ 
                            bilgsyr2=0;         
                            while(bilgsyr2==0){
                                bilgsyr=rast.nextInt(6)+1;
                                for(int n=0;n<5;n++){
                                if(bilgsyr==bilsec[n]){
                                    if(bilsec[n]==1){
                                        if(tas2.dayaniklik>0){
                                            bilgsyr2=1;
                                            break;
                                        }
                                    }
                                    if(bilsec[n]==2){
                                        if(kagit2.dayaniklik>0){
                                            bilgsyr2=1;
                                            break;
                                        }
                                    }
                                    if(bilsec[n]==3){
                                        if(makas2.dayaniklik>0){
                                            bilgsyr2=1;
                                            break;
                                        }
                                    }
                                    if(bilsec[n]==4){
                                        if(agirtas2.dayaniklik>0){
                                            bilgsyr2=1;
                                            break;
                                        }
                                    }
                                    if(bilsec[n]==5){
                                        if(ozelkagit2.dayaniklik>0){
                                            bilgsyr2=1;
                                            break;
                                        }
                                    }
                                    if(bilsec[n]==6){
                                        if(ustamakas2.dayaniklik>0){
                                            bilgsyr2=1;
                                            break;
                                        }
                                    }
                                }
                                }
                            }
                            if(bilsec[mk]==bilgsyr){
                                kontrol2=1;//gereksiz
                                if(bilsec[mk]==1){
                                    oyun1=makas1.etkihes(3,1,makas1.dayaniklik,tas2.dayaniklik,2,0,2,0,0,0,1);
                                    oyun2=makas1.etkihes(3,1,makas1.dayaniklik,tas2.dayaniklik,2,0,2,0,0,0,2);
                                    oyun3=makas1.etkihes(3,1,makas1.dayaniklik,tas2.dayaniklik,2,0,2,0,0,0,3);
                                    tas2.durumgun(oyun3, oyun2);
                                    makas1.durumgun(oyun3, oyun1);
                                    if(oyun3==1){
                                                System.out.println("Puaniniz eklendi");
                                                oyuncu3.skor=oyuncu3.skor+3;
                                            }
                                            if(oyun3==0){
                                                System.out.println("Puan eklenmedi");
                                                oyuncu4.skor=oyuncu4.skor+3;
                                            }
                                            if(oyun3==2){
                                                System.out.println("Berabere puani eklendi");
                                                oyuncu3.skor=oyuncu3.skor+1;
                                                oyuncu4.skor=oyuncu4.skor+1;
                                            }
                                }
                                if(bilsec[mk]==2){
                                            oyun1=makas1.etkihes(3,2,makas1.dayaniklik,kagit2.dayaniklik,2,2,0,0,0,0,1);
                                            oyun2=makas1.etkihes(3,2,makas1.dayaniklik,kagit2.dayaniklik,2,2,0,0,0,0,2);
                                            oyun3=makas1.etkihes(3,2,makas1.dayaniklik,kagit2.dayaniklik,2,2,0,0,0,0,3);
                                            makas1.durumgun(oyun3, oyun1);
                                            kagit2.durumgun(oyun3, oyun2);
                                            if(oyun3==1){
                                                System.out.println("Puaniniz eklendi");
                                                oyuncu3.skor=oyuncu3.skor+3;
                                            }
                                            if(oyun3==0){
                                                System.out.println("Puan eklenmedi");
                                                oyuncu4.skor=oyuncu4.skor+3;
                                            }
                                            if(oyun3==2){
                                                System.out.println("Berabere puani eklendi");
                                                oyuncu3.skor=oyuncu3.skor+1;
                                                oyuncu4.skor=oyuncu4.skor+1;
                                            }
                                }
                                if(bilsec[mk]==3){
                                            oyun1=makas1.etkihes(3,3,makas1.dayaniklik,makas2.dayaniklik,2,0,0,0,0,0,1);
                                            oyun2=makas1.etkihes(3,3,makas1.dayaniklik,makas2.dayaniklik,2,0,0,0,0,0,2);
                                            oyun3=makas1.etkihes(3,3,makas1.dayaniklik,makas2.dayaniklik,2,0,0,0,0,0,3);
                                            makas1.durumgun(oyun3, oyun1);
                                            makas2.durumgun(oyun3, oyun2);
                                            if(oyun3==1){
                                                System.out.println("Puaniniz eklendi");
                                                oyuncu3.skor=oyuncu3.skor+3;
                                            }
                                            if(oyun3==0){
                                                System.out.println("Puan eklenmedi");
                                                oyuncu4.skor=oyuncu4.skor+3;
                                            }
                                            if(oyun3==2){
                                                System.out.println("Berabere puani eklendi");
                                                oyuncu3.skor=oyuncu3.skor+1;
                                                oyuncu4.skor=oyuncu4.skor+1;
                                            }
                                    
                                }
                                if(bilsec[mk]==4){
                                            oyun1=makas1.etkihes(3,4,makas1.dayaniklik,agirtas2.dayaniklik,2,0,2,0,0,2,1);
                                            oyun2=makas1.etkihes(3,4,makas1.dayaniklik,agirtas2.dayaniklik,2,0,2,0,0,2,2);
                                            oyun3=makas1.etkihes(3,4,makas1.dayaniklik,agirtas2.dayaniklik,2,0,2,0,0,2,3);
                                            makas1.durumgun(oyun3, oyun1);
                                            agirtas2.durumgun(oyun3, oyun2);
                                            if(oyun3==1){
                                                System.out.println("Puaniniz eklendi");
                                                oyuncu3.skor=oyuncu3.skor+3;
                                            }
                                            if(oyun3==0){
                                                System.out.println("Puan eklenmedi");
                                                oyuncu4.skor=oyuncu4.skor+3;
                                            }
                                            if(oyun3==2){
                                                System.out.println("Berabere puani eklendi");
                                                oyuncu3.skor=oyuncu3.skor+1;
                                                oyuncu4.skor=oyuncu4.skor+1;
                                            }
                                    
                                }
                                if(bilsec[mk]==5){
                                            oyun1=makas1.etkihes(3,5,makas1.dayaniklik,ozelkagit2.dayaniklik,2,2,0,0,2,0,1);
                                            oyun2=makas1.etkihes(3,5,makas1.dayaniklik,ozelkagit2.dayaniklik,2,2,0,0,2,0,2);
                                            oyun3=makas1.etkihes(3,5,makas1.dayaniklik,ozelkagit2.dayaniklik,2,2,0,0,2,0,3);
                                            makas1.durumgun(oyun3, oyun1);
                                            ozelkagit2.durumgun(oyun3, oyun2);
                                            if(oyun3==1){
                                                System.out.println("Puaniniz eklendi");
                                                oyuncu3.skor=oyuncu3.skor+3;
                                            }
                                            if(oyun3==0){
                                                System.out.println("Puan eklenmedi");
                                                oyuncu4.skor=oyuncu4.skor+3;
                                            }
                                            if(oyun3==2){
                                                System.out.println("Berabere puani eklendi");
                                                oyuncu3.skor=oyuncu3.skor+1;
                                                oyuncu4.skor=oyuncu4.skor+1;
                                            }
                                    
                                }
                                if(bilsec[mk]==6){
                                            oyun1=makas1.etkihes(3,6,makas1.dayaniklik,ustamakas2.dayaniklik,2,0,0,2,0,0,1);
                                            oyun2=makas1.etkihes(3,6,makas1.dayaniklik,ustamakas2.dayaniklik,2,0,0,2,0,0,2);
                                            oyun3=makas1.etkihes(3,6,makas1.dayaniklik,ustamakas2.dayaniklik,2,0,0,2,0,0,3);
                                            makas1.durumgun(oyun3, oyun1);
                                            ustamakas2.durumgun(oyun3, oyun2);
                                            if(oyun3==1){
                                                System.out.println("Puaniniz eklendi");
                                                oyuncu3.skor=oyuncu3.skor+3;
                                            }
                                            if(oyun3==0){
                                                System.out.println("Puan eklenmedi");
                                                oyuncu4.skor=oyuncu4.skor+3;
                                            }
                                            if(oyun3==2){
                                                System.out.println("Berabere puani eklendi");
                                                oyuncu3.skor=oyuncu3.skor+1;
                                                oyuncu4.skor=oyuncu4.skor+1;
                                            }
                                }
                                
                                break;
                            }
                            
                        }
                        
                        
                        
                    }
                    if(hamsec==4){
                        
                        for(int mk=0;mk<5;mk++){
                            bilgsyr2=0;
                            while(bilgsyr2==0){
                                bilgsyr=rast.nextInt(6)+1;
                                for(int n=0;n<5;n++){
                                if(bilgsyr==bilsec[n]){
                                    if(bilsec[n]==1){
                                        if(tas2.dayaniklik>0){
                                            bilgsyr2=1;
                                            break;
                                        }
                                    }
                                    if(bilsec[n]==2){
                                        if(kagit2.dayaniklik>0){
                                            bilgsyr2=1;
                                            break;
                                        }
                                    }
                                    if(bilsec[n]==3){
                                        if(makas2.dayaniklik>0){
                                            bilgsyr2=1;
                                            break;
                                        }
                                    }
                                    if(bilsec[n]==4){
                                        if(agirtas2.dayaniklik>0){
                                            bilgsyr2=1;
                                            break;
                                        }
                                    }
                                    if(bilsec[n]==5){
                                        if(ozelkagit2.dayaniklik>0){
                                            bilgsyr2=1;
                                            break;
                                        }
                                    }
                                    if(bilsec[n]==6){
                                        if(ustamakas2.dayaniklik>0){
                                            bilgsyr2=1;
                                            break;
                                        }
                                    }
                                }
                                }
                            }
                            if(bilsec[mk]==bilgsyr){
                                kontrol2=1;//gereksiz
                                if(bilsec[mk]==1){
                                    oyun1=agirtas1.etkihes(4,1,agirtas1.dayaniklik,tas2.dayaniklik,0,0,2,0,0,2,1);
                                    oyun2=agirtas1.etkihes(4,1,agirtas1.dayaniklik,tas2.dayaniklik,0,0,2,0,0,2,2);
                                    oyun3=agirtas1.etkihes(4,1,agirtas1.dayaniklik,tas2.dayaniklik,0,0,2,0,0,2,3);
                                    tas2.durumgun(oyun3, oyun2);
                                    agirtas1.durumgun(oyun3, oyun1);
                                    if(oyun3==1){
                                                System.out.println("Puaniniz eklendi");
                                                oyuncu3.skor=oyuncu3.skor+3;
                                            }
                                            if(oyun3==0){
                                                System.out.println("Puan eklenmedi");
                                                oyuncu4.skor=oyuncu4.skor+3;
                                            }
                                            if(oyun3==2){
                                                System.out.println("Berabere puani eklendi");
                                                oyuncu3.skor=oyuncu3.skor+1;
                                                oyuncu4.skor=oyuncu4.skor+1;
                                            }
                                }
                                if(bilsec[mk]==2){
                                            oyun1=agirtas1.etkihes(4,2,agirtas1.dayaniklik,kagit2.dayaniklik,0,2,2,0,0,2,1);
                                            oyun2=agirtas1.etkihes(4,2,agirtas1.dayaniklik,kagit2.dayaniklik,0,2,2,0,0,2,2);
                                            oyun3=agirtas1.etkihes(4,2,agirtas1.dayaniklik,kagit2.dayaniklik,0,2,2,0,0,2,3);
                                            agirtas1.durumgun(oyun3, oyun1);
                                            kagit2.durumgun(oyun3, oyun2);
                                            if(oyun3==1){
                                                System.out.println("Puaniniz eklendi");
                                                oyuncu3.skor=oyuncu3.skor+3;
                                            }
                                            if(oyun3==0){
                                                System.out.println("Puan eklenmedi");
                                                oyuncu4.skor=oyuncu4.skor+3;
                                            }
                                            if(oyun3==2){
                                                System.out.println("Berabere puani eklendi");
                                                oyuncu3.skor=oyuncu3.skor+1;
                                                oyuncu4.skor=oyuncu4.skor+1;
                                            }
                                }
                                if(bilsec[mk]==3){
                                            oyun1=agirtas1.etkihes(4,3,agirtas1.dayaniklik,makas2.dayaniklik,2,0,2,0,0,2,1);
                                            oyun2=agirtas1.etkihes(4,3,agirtas1.dayaniklik,makas2.dayaniklik,2,0,2,0,0,2,2);
                                            oyun3=agirtas1.etkihes(4,3,agirtas1.dayaniklik,makas2.dayaniklik,2,0,2,0,0,2,3);
                                            agirtas1.durumgun(oyun3, oyun1);
                                            makas2.durumgun(oyun3, oyun2);
                                            if(oyun3==1){
                                                System.out.println("Puaniniz eklendi");
                                                oyuncu3.skor=oyuncu3.skor+3;
                                            }
                                            if(oyun3==0){
                                                System.out.println("Puan eklenmedi");
                                                oyuncu4.skor=oyuncu4.skor+3;
                                            }
                                            if(oyun3==2){
                                                System.out.println("Berabere puani eklendi");
                                                oyuncu3.skor=oyuncu3.skor+1;
                                                oyuncu4.skor=oyuncu4.skor+1;
                                            }
                                    
                                }
                                if(bilsec[mk]==4){
                                            oyun1=agirtas1.etkihes(4,4,agirtas1.dayaniklik,agirtas2.dayaniklik,0,0,2,0,0,2,1);
                                            oyun2=agirtas1.etkihes(4,4,agirtas1.dayaniklik,agirtas2.dayaniklik,0,0,2,0,0,2,2);
                                            oyun3=agirtas1.etkihes(4,4,agirtas1.dayaniklik,agirtas2.dayaniklik,0,0,2,0,0,2,3);
                                            agirtas1.durumgun(oyun3, oyun1);
                                            agirtas2.durumgun(oyun3, oyun2);
                                            if(oyun3==1){
                                                System.out.println("Puaniniz eklendi");
                                                oyuncu3.skor=oyuncu3.skor+3;
                                            }
                                            if(oyun3==0){
                                                System.out.println("Puan eklenmedi");
                                                oyuncu4.skor=oyuncu4.skor+3;
                                            }
                                            if(oyun3==2){
                                                System.out.println("Berabere puani eklendi");
                                                oyuncu3.skor=oyuncu3.skor+1;
                                                oyuncu4.skor=oyuncu4.skor+1;
                                            }
                                    
                                }
                                if(bilsec[mk]==5){
                                            oyun1=agirtas1.etkihes(4,5,agirtas1.dayaniklik,ozelkagit2.dayaniklik,0,2,2,0,2,2,1);
                                            oyun2=agirtas1.etkihes(4,5,agirtas1.dayaniklik,ozelkagit2.dayaniklik,0,2,2,0,2,2,2);
                                            oyun3=agirtas1.etkihes(4,5,agirtas1.dayaniklik,ozelkagit2.dayaniklik,0,2,2,0,2,2,3);
                                            agirtas1.durumgun(oyun3, oyun1);
                                            ozelkagit2.durumgun(oyun3, oyun2);
                                            if(oyun3==1){
                                                System.out.println("Puaniniz eklendi");
                                                oyuncu3.skor=oyuncu3.skor+3;
                                            }
                                            if(oyun3==0){
                                                System.out.println("Puan eklenmedi");
                                                oyuncu4.skor=oyuncu4.skor+3;
                                            }
                                            if(oyun3==2){
                                                System.out.println("Berabere puani eklendi");
                                                oyuncu3.skor=oyuncu3.skor+1;
                                                oyuncu4.skor=oyuncu4.skor+1;
                                            }
                                    
                                }
                                if(bilsec[mk]==6){
                                            oyun1=agirtas1.etkihes(4,6,agirtas1.dayaniklik,ustamakas2.dayaniklik,2,0,2,2,0,2,1);
                                            oyun2=agirtas1.etkihes(4,6,agirtas1.dayaniklik,ustamakas2.dayaniklik,2,0,2,2,0,2,2);
                                            oyun3=agirtas1.etkihes(4,6,agirtas1.dayaniklik,ustamakas2.dayaniklik,2,0,2,2,0,2,3);
                                            agirtas1.durumgun(oyun3, oyun1);
                                            ustamakas2.durumgun(oyun3, oyun2);
                                            if(oyun3==1){
                                                System.out.println("Puaniniz eklendi");
                                                oyuncu3.skor=oyuncu3.skor+3;
                                            }
                                            if(oyun3==0){
                                                System.out.println("Puan eklenmedi");
                                                oyuncu4.skor=oyuncu4.skor+3;
                                            }
                                            if(oyun3==2){
                                                System.out.println("Berabere puani eklendi");
                                                oyuncu3.skor=oyuncu3.skor+1;
                                                oyuncu4.skor=oyuncu4.skor+1;
                                            }
                                }
                                break;
                            }
                        }        
                    }
                    if(hamsec==5){
                        for(int mk=0;mk<5;mk++){ 
                            bilgsyr2=0;
                            while(bilgsyr2==0){
                                bilgsyr=rast.nextInt(6)+1;
                                for(int n=0;n<5;n++){
                                if(bilgsyr==bilsec[n]){
                                    if(bilsec[n]==1){
                                        if(tas2.dayaniklik>0){
                                            bilgsyr2=1;
                                            break;
                                        }
                                    }
                                    if(bilsec[n]==2){
                                        if(kagit2.dayaniklik>0){
                                            bilgsyr2=1;
                                            break;
                                        }
                                    }
                                    if(bilsec[n]==3){
                                        if(makas2.dayaniklik>0){
                                            bilgsyr2=1;
                                            break;
                                        }
                                    }
                                    if(bilsec[n]==4){
                                        if(agirtas2.dayaniklik>0){
                                            bilgsyr2=1;
                                            break;
                                        }
                                    }
                                    if(bilsec[n]==5){
                                        if(ozelkagit2.dayaniklik>0){
                                            bilgsyr2=1;
                                            break;
                                        }
                                    }
                                    if(bilsec[n]==6){
                                        if(ustamakas2.dayaniklik>0){
                                            bilgsyr2=1;
                                            break;
                                        }
                                    }
                                }
                                }
                            }
                            if(bilsec[mk]==bilgsyr){
                                kontrol2=1;//gereksiz
                                if(bilsec[mk]==1){
                                    oyun1=ozelkagit1.etkihes(5,1,ozelkagit1.dayaniklik,tas2.dayaniklik,0,2,2,0,2,0,1);
                                    oyun2=ozelkagit1.etkihes(5,1,ozelkagit1.dayaniklik,tas2.dayaniklik,0,2,2,0,2,0,2);
                                    oyun3=ozelkagit1.etkihes(5,1,ozelkagit1.dayaniklik,tas2.dayaniklik,0,2,2,0,2,0,3);
                                    tas2.durumgun(oyun3, oyun1);
                                    ozelkagit1.durumgun(oyun3, oyun2);
                                    if(oyun3==1){
                                                System.out.println("Puaniniz eklendi");
                                                oyuncu3.skor=oyuncu3.skor+3;
                                            }
                                            if(oyun3==0){
                                                System.out.println("Puan eklenmedi");
                                                oyuncu4.skor=oyuncu4.skor+3;
                                            }
                                            if(oyun3==2){
                                                System.out.println("Berabere puani eklendi");
                                                oyuncu3.skor=oyuncu3.skor+1;
                                                oyuncu4.skor=oyuncu4.skor+1;
                                            }
                                }
                                if(bilsec[mk]==2){
                                            oyun1=ozelkagit1.etkihes(5,2,ozelkagit1.dayaniklik,kagit2.dayaniklik,0,2,0,0,2,0,1);
                                            oyun2=ozelkagit1.etkihes(5,2,ozelkagit1.dayaniklik,kagit2.dayaniklik,0,2,0,0,2,0,2);
                                            oyun3=ozelkagit1.etkihes(5,2,ozelkagit1.dayaniklik,kagit2.dayaniklik,0,2,0,0,2,0,3);
                                            ozelkagit1.durumgun(oyun3, oyun1);
                                            kagit2.durumgun(oyun3, oyun2);
                                            if(oyun3==1){
                                                System.out.println("Puaniniz eklendi");
                                                oyuncu3.skor=oyuncu3.skor+3;
                                            }
                                            if(oyun3==0){
                                                System.out.println("Puan eklenmedi");
                                                oyuncu4.skor=oyuncu4.skor+3;
                                            }
                                            if(oyun3==2){
                                                System.out.println("Berabere puani eklendi");
                                                oyuncu3.skor=oyuncu3.skor+1;
                                                oyuncu4.skor=oyuncu4.skor+1;
                                            }
                                }
                                if(bilsec[mk]==3){
                                            oyun1=ozelkagit1.etkihes(5,3,ozelkagit1.dayaniklik,makas2.dayaniklik,2,2,0,0,2,0,1);
                                            oyun2=ozelkagit1.etkihes(5,3,ozelkagit1.dayaniklik,makas2.dayaniklik,2,2,0,0,2,0,2);
                                            oyun3=ozelkagit1.etkihes(5,3,ozelkagit1.dayaniklik,makas2.dayaniklik,2,2,0,0,2,0,3);
                                            ozelkagit1.durumgun(oyun3, oyun1);
                                            makas2.durumgun(oyun3, oyun2);
                                            if(oyun3==1){
                                                System.out.println("Puaniniz eklendi");
                                                oyuncu3.skor=oyuncu3.skor+3;
                                            }
                                            if(oyun3==0){
                                                System.out.println("Puan eklenmedi");
                                                oyuncu4.skor=oyuncu4.skor+3;
                                            }
                                            if(oyun3==2){
                                                System.out.println("Berabere puani eklendi");
                                                oyuncu3.skor=oyuncu3.skor+1;
                                                oyuncu4.skor=oyuncu4.skor+1;
                                            }
                                    
                                }
                                if(bilsec[mk]==4){
                                            oyun1=ozelkagit1.etkihes(5,4,ozelkagit1.dayaniklik,agirtas2.dayaniklik,0,2,2,0,2,2,1);
                                            oyun2=ozelkagit1.etkihes(5,4,ozelkagit1.dayaniklik,agirtas2.dayaniklik,0,2,2,0,2,2,2);
                                            oyun3=ozelkagit1.etkihes(5,4,ozelkagit1.dayaniklik,agirtas2.dayaniklik,0,2,2,0,2,2,3);
                                            ozelkagit1.durumgun(oyun3, oyun1);
                                            agirtas2.durumgun(oyun3, oyun2);
                                            if(oyun3==1){
                                                System.out.println("Puaniniz eklendi");
                                                oyuncu3.skor=oyuncu3.skor+3;
                                            }
                                            if(oyun3==0){
                                                System.out.println("Puan eklenmedi");
                                                oyuncu4.skor=oyuncu4.skor+3;
                                            }
                                            if(oyun3==2){
                                                System.out.println("Berabere puani eklendi");
                                                oyuncu3.skor=oyuncu3.skor+1;
                                                oyuncu4.skor=oyuncu4.skor+1;
                                            }
                                    
                                }
                                if(bilsec[mk]==5){
                                            oyun1=ozelkagit1.etkihes(5,5,ozelkagit1.dayaniklik,ozelkagit2.dayaniklik,0,2,0,0,2,0,1);
                                            oyun2=ozelkagit1.etkihes(5,5,ozelkagit1.dayaniklik,ozelkagit2.dayaniklik,0,2,0,0,2,0,2);
                                            oyun3=ozelkagit1.etkihes(5,5,ozelkagit1.dayaniklik,ozelkagit2.dayaniklik,0,2,0,0,2,0,3);
                                            ozelkagit1.durumgun(oyun3, oyun1);
                                            ozelkagit2.durumgun(oyun3, oyun2);
                                            if(oyun3==1){
                                                System.out.println("Puaniniz eklendi");
                                                oyuncu3.skor=oyuncu3.skor+3;
                                            }
                                            if(oyun3==0){
                                                System.out.println("Puan eklenmedi");
                                                oyuncu4.skor=oyuncu4.skor+3;
                                            }
                                            if(oyun3==2){
                                                System.out.println("Berabere puani eklendi");
                                                oyuncu3.skor=oyuncu3.skor+1;
                                                oyuncu4.skor=oyuncu4.skor+1;
                                            }
                                    
                                }
                                if(bilsec[mk]==6){
                                            oyun1=ozelkagit1.etkihes(5,6,ozelkagit1.dayaniklik,ustamakas2.dayaniklik,2,2,0,2,2,0,1);
                                            oyun2=ozelkagit1.etkihes(5,6,ozelkagit1.dayaniklik,ustamakas2.dayaniklik,2,2,0,2,2,0,2);
                                            oyun3=ozelkagit1.etkihes(5,6,ozelkagit1.dayaniklik,ustamakas2.dayaniklik,2,2,0,2,2,0,3);
                                            ozelkagit1.durumgun(oyun3, oyun1);
                                            ustamakas2.durumgun(oyun3, oyun2);
                                            if(oyun3==1){
                                                System.out.println("Puaniniz eklendi");
                                                oyuncu3.skor=oyuncu3.skor+3;
                                            }
                                            if(oyun3==0){
                                                System.out.println("Puan eklenmedi");
                                                oyuncu4.skor=oyuncu4.skor+3;
                                            }
                                            if(oyun3==2){
                                                System.out.println("Berabere puani eklendi");
                                                oyuncu3.skor=oyuncu3.skor+1;
                                                oyuncu4.skor=oyuncu4.skor+1;
                                            }
                                }
                                break;
                            }     
                        }
                    }
                    if(hamsec==6){
                        for(int mk=0;mk<5;mk++){
                            bilgsyr2=0;
                            while(bilgsyr2==0){
                                bilgsyr=rast.nextInt(6)+1;
                                for(int n=0;n<5;n++){
                                if(bilgsyr==bilsec[n]){
                                    if(bilsec[n]==1){
                                        if(tas2.dayaniklik>0){
                                            bilgsyr2=1;
                                            break;
                                        }
                                    }
                                    if(bilsec[n]==2){
                                        if(kagit2.dayaniklik>0){
                                            bilgsyr2=1;
                                            break;
                                        }
                                    }
                                    if(bilsec[n]==3){
                                        if(makas2.dayaniklik>0){
                                            bilgsyr2=1;
                                            break;
                                        }
                                    }
                                    if(bilsec[n]==4){
                                        if(agirtas2.dayaniklik>0){
                                            bilgsyr2=1;
                                            break;
                                        }
                                    }
                                    if(bilsec[n]==5){
                                        if(ozelkagit2.dayaniklik>0){
                                            bilgsyr2=1;
                                            break;
                                        }
                                    }
                                    if(bilsec[n]==6){
                                        if(ustamakas2.dayaniklik>0){
                                            bilgsyr2=1;
                                            break;
                                        }
                                    }
                                }
                                }
                            }
                            if(bilsec[mk]==bilgsyr){
                                kontrol2=1;//gereksiz
                                if(bilsec[mk]==1){
                                    oyun1=ustamakas1.etkihes(6,1,ustamakas1.dayaniklik,tas2.dayaniklik,2,0,2,2,0,0,1);
                                    oyun2=ustamakas1.etkihes(6,1,ustamakas1.dayaniklik,tas2.dayaniklik,2,0,2,2,0,0,2);
                                    oyun3=ustamakas1.etkihes(6,1,ustamakas1.dayaniklik,tas2.dayaniklik,2,0,2,2,0,0,3);
                                    tas2.durumgun(oyun3, oyun1);
                                    ustamakas1.durumgun(oyun3, oyun2);
                                    if(oyun3==1){
                                                System.out.println("Puaniniz eklendi");
                                                oyuncu3.skor=oyuncu3.skor+3;
                                            }
                                            if(oyun3==0){
                                                System.out.println("Puan eklenmedi");
                                                oyuncu4.skor=oyuncu4.skor+3;
                                            }
                                            if(oyun3==2){
                                                System.out.println("Berabere puani eklendi");
                                                oyuncu3.skor=oyuncu3.skor+1;
                                                oyuncu4.skor=oyuncu4.skor+1;
                                            }
                                }
                                if(bilsec[mk]==2){
                                            oyun1=ustamakas1.etkihes(6,2,ustamakas1.dayaniklik,kagit2.dayaniklik,2,2,0,2,0,0,1);
                                            oyun2=ustamakas1.etkihes(6,2,ustamakas1.dayaniklik,kagit2.dayaniklik,2,2,0,2,0,0,2);
                                            oyun3=ustamakas1.etkihes(6,2,ustamakas1.dayaniklik,kagit2.dayaniklik,2,2,0,2,0,0,3);
                                            ustamakas1.durumgun(oyun3, oyun1);
                                            kagit2.durumgun(oyun3, oyun2);
                                            if(oyun3==1){
                                                System.out.println("Puaniniz eklendi");
                                                oyuncu3.skor=oyuncu3.skor+3;
                                            }
                                            if(oyun3==0){
                                                System.out.println("Puan eklenmedi");
                                                oyuncu4.skor=oyuncu4.skor+3;
                                            }
                                            if(oyun3==2){
                                                System.out.println("Berabere puani eklendi");
                                                oyuncu3.skor=oyuncu3.skor+1;
                                                oyuncu4.skor=oyuncu4.skor+1;
                                            }
                                }
                                if(bilsec[mk]==3){
                                            oyun1=ustamakas1.etkihes(6,3,ustamakas1.dayaniklik,makas2.dayaniklik,2,0,0,2,0,0,1);
                                            oyun2=ustamakas1.etkihes(6,3,ustamakas1.dayaniklik,makas2.dayaniklik,2,0,0,2,0,0,2);
                                            oyun3=ustamakas1.etkihes(6,3,ustamakas1.dayaniklik,makas2.dayaniklik,2,0,0,2,0,0,3);
                                            ustamakas1.durumgun(oyun3, oyun1);
                                            makas2.durumgun(oyun3, oyun2);
                                            if(oyun3==1){
                                                System.out.println("Puaniniz eklendi");
                                                oyuncu3.skor=oyuncu3.skor+3;
                                            }
                                            if(oyun3==0){
                                                System.out.println("Puan eklenmedi");
                                                oyuncu4.skor=oyuncu4.skor+3;
                                            }
                                            if(oyun3==2){
                                                System.out.println("Berabere puani eklendi");
                                                oyuncu3.skor=oyuncu3.skor+1;
                                                oyuncu4.skor=oyuncu4.skor+1;
                                            }
                                    
                                }
                                if(bilsec[mk]==4){
                                            oyun1=ustamakas1.etkihes(6,4,ustamakas1.dayaniklik,agirtas2.dayaniklik,2,0,2,2,0,2,1);
                                            oyun2=ustamakas1.etkihes(6,4,ustamakas1.dayaniklik,agirtas2.dayaniklik,2,0,2,2,0,2,2);
                                            oyun3=ustamakas1.etkihes(6,4,ustamakas1.dayaniklik,agirtas2.dayaniklik,2,0,2,2,0,2,3);
                                            ustamakas1.durumgun(oyun3, oyun1);
                                            agirtas2.durumgun(oyun3, oyun2);
                                            if(oyun3==1){
                                                System.out.println("Puaniniz eklendi");
                                                oyuncu3.skor=oyuncu3.skor+3;
                                            }
                                            if(oyun3==0){
                                                System.out.println("Puan eklenmedi");
                                                oyuncu4.skor=oyuncu4.skor+3;
                                            }
                                            if(oyun3==2){
                                                System.out.println("Berabere puani eklendi");
                                                oyuncu3.skor=oyuncu3.skor+1;
                                                oyuncu4.skor=oyuncu4.skor+1;
                                            }
                                    
                                }
                                if(bilsec[mk]==5){
                                            oyun1=ustamakas1.etkihes(6,5,ustamakas1.dayaniklik,ozelkagit2.dayaniklik,2,2,0,2,2,0,1);
                                            oyun2=ustamakas1.etkihes(6,5,ustamakas1.dayaniklik,ozelkagit2.dayaniklik,2,2,0,2,2,0,2);
                                            oyun3=ustamakas1.etkihes(6,5,ustamakas1.dayaniklik,ozelkagit2.dayaniklik,2,2,0,2,2,0,3);
                                            ustamakas1.durumgun(oyun3, oyun1);
                                            ozelkagit2.durumgun(oyun3, oyun2);
                                            if(oyun3==1){
                                                System.out.println("Puaniniz eklendi");
                                                oyuncu3.skor=oyuncu3.skor+3;
                                            }
                                            if(oyun3==0){
                                                System.out.println("Puan eklenmedi");
                                                oyuncu4.skor=oyuncu4.skor+3;
                                            }
                                            if(oyun3==2){
                                                System.out.println("Berabere puani eklendi");
                                                oyuncu3.skor=oyuncu3.skor+1;
                                                oyuncu4.skor=oyuncu4.skor+1;
                                            }
                                    
                                }
                                if(bilsec[mk]==6){
                                            oyun1=ustamakas1.etkihes(6,6,ustamakas1.dayaniklik,ustamakas2.dayaniklik,2,0,0,2,0,0,1);
                                            oyun2=ustamakas1.etkihes(6,6,ustamakas1.dayaniklik,ustamakas2.dayaniklik,2,0,0,2,0,0,2);
                                            oyun3=ustamakas1.etkihes(6,6,ustamakas1.dayaniklik,ustamakas2.dayaniklik,2,0,0,2,0,0,3);
                                            ustamakas1.durumgun(oyun3, oyun1);
                                            ustamakas2.durumgun(oyun3, oyun2);
                                            if(oyun3==1){
                                                System.out.println("Puaniniz eklendi");
                                                oyuncu3.skor=oyuncu3.skor+3;
                                            }
                                            if(oyun3==0){
                                                System.out.println("Puan eklenmedi");
                                                oyuncu4.skor=oyuncu4.skor+3;
                                            }
                                            if(oyun3==2){
                                                System.out.println("Berabere puani eklendi");
                                                oyuncu3.skor=oyuncu3.skor+1;
                                                oyuncu4.skor=oyuncu4.skor+1;
                                            }
                                }
                                
                                break;
                            }
                            
                        }
      
                    }
            }
            if(oyuncu3.skor<oyuncu4.skor){
                System.out.println("Bilgisayar-1 Kazandi..........");
            }
            if(oyuncu3.skor>oyuncu4.skor){
                System.out.println("Bilgisayar-2 Kazandi...........");
            }
            if(oyuncu3.skor==oyuncu4.skor){
                System.out.println("Bilgisayarlar berabere kaldı.......");
            }
            break;
        case 3:
            break;
        }
    }
    }
}
