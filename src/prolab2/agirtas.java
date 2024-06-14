
package prolab2;

public class agirtas extends tas{
    int sicaklik;
    agirtas(){
        
    }
    public agirtas(int num){
        super(num);
        this.sicaklik=2;
    }
   @Override
    public void nesnepuani(int m){
        super.nesnepuani(m);
        
    }
    @Override
    public double etkihes(int m,int m1,double m2,double m3,int m4,int m5,int m6,int m7,int m8,int m9,int m10){
        return super.etkihes(m, m1, m2, m3, m4, m5, m6, m7, m8, m9, m10);
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
