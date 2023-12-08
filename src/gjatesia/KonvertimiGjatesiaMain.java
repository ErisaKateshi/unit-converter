package gjatesia;

import java.util.Scanner;

public class KonvertimiGjatesiaMain {
    public static void llogaritjaEdistances(){
        Scanner scanner=new Scanner(System.in);
        KonvertimiIGjatesise distanca=new KonvertimiIGjatesise();
        while(true){
            System.out.println("Distance Conversion Menu:");
            System.out.println("1. Meters to Kilometers");
            System.out.println("2. Kilometers to Meters");
            System.out.println("3. Meters to CentiMeters");
            System.out.println("4. CentiMeters to Meters");
            System.out.println("5. CentiMeters to MM");
            System.out.println("6. Meters to MM");
            System.out.println("7. Exit");
            System.out.print("Choose a distance conversion option: ");
            int zgjidhja=scanner.nextInt();
            if (zgjidhja==7){
                System.out.println("Exit");
                break;
            }
            switch (zgjidhja){
                case 1:
                    System.out.println("me vendos nr qe do te konvertosh");
                    double nr=scanner.nextDouble();
                    distanca.mtokm(nr);
                    break;
                case 2:
                    System.out.println("Vendos nr qe do te konvertosh");
                    double nr2= scanner.nextDouble();
                    distanca.kmtom(nr2);
                    break;
                case 3:
                    System.out.println("Vendos nr qe do te konvertosh");
                    double nr3= scanner.nextDouble();
                    distanca.mtocm(nr3);
                    break;
                case 4:
                    System.out.println("Vendos nr qe do te konvertosh");
                    double nr4= scanner.nextDouble();
                    distanca.cmtom(nr4);
                    break;
                case 5:
                    System.out.println("Vendos nr qe do te konvertosh");
                    double nr5= scanner.nextDouble();
                    distanca.cmtomm(nr5);
                    break;
                case 6:
                    System.out.println("Vendos nr qe do te konvertosh");
                    double nr6= scanner.nextDouble();
                    distanca.mtomm(nr6);
                    break;
                default:
                    System.out.println("Invalid choise");
                    break;


            }

        }
    }

}
