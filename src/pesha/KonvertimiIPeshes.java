package pesha;

public class KonvertimiIPeshes {
    public double grtokg(double a){
        a=a/1000;
        System.out.println("Konvertimi eshte"+ a);
        return a;
    }
    public double poundstokg(double a) {
        a = a / 2.225;
        System.out.println("Konvertimi eshte" + a);
        return a;
    }
    public double kgtopounds(double a){
        a=a*2.225;
        System.out.println("Konvertimi eshte"+ a);
        return a;
    }


}
