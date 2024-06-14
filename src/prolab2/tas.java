
package prolab2;

public class tas extends Nesne{
    int katilik;
    tas(){
        
    }
    public tas(int num){
        super(num);
        this.katilik=2;
    }
    public void nesnepuani(int m){
        super.nesnepuani(m);
         this.seviyepuani+=20;
    }
    @Override
    public double etkihes(int m,int m1,double m2,double m3,int m4,int m5,int m6,int m7,int m8,int m9,int m10){
        super.etkihes(m, m1, m2, m3, m4, m5, m6, m7, m8, m9, m10);
        return this.sonuk;
    }
    @Override
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
