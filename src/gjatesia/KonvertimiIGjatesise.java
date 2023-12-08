package gjatesia;

public class KonvertimiIGjatesise {
    public double mtokm(double a){
        a=a/1000;
        System.out.println("Gjatesia ne km eshte:"+ a);
        return a;
    }
    public double kmtom(double a){
        a=a*1000;
        System.out.println("Gjatesia ne m eshte:"+a);
        return a;
    }
    public double mtocm(double a){
        a=a*100;
        System.out.println("Gjatesia ne cm eshte:"+ a);
        return a;
    }
    public double cmtom(double a){
        a=a/100;
        System.out.println("Gjatesia ne m eshte:"+ a);
        return a;
    }
    public double cmtomm(double a) {
        a = a *10;
        System.out.println("Gjatesia ne mm eshte:" + a);
        return a;
    }
    public double mtomm(double a) {
        a = a*1000;
        System.out.println("Gjatesia ne mm eshte:" + a);
        return a;
    }
}
