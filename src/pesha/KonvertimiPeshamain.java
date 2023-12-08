package pesha;

import java.util.Scanner;

public class KonvertimiPeshamain {
    public static void llogaritjaPesha(){
        Scanner scanner=new Scanner(System.in);
        KonvertimiIPeshes pesha=new KonvertimiIPeshes();
        while (true){

            System.out.println("Weight Conversion Menu:");
            System.out.println("1. Gram to Kilograms");
            System.out.println("2. Pounds to Kilograms");
            System.out.println("3. Kilograms to Pounds");
            System.out.println("4. Exit");
            System.out.print("Choose a weight conversion option: ");
            int zgjedhje= scanner.nextInt();
            if(zgjedhje==4){
                System.out.println("Exit");
                break;
            }
            switch(zgjedhje){
                case 1:
                    System.out.println("Jep numrin");
                    double nr1=scanner.nextDouble();
                    pesha.grtokg(nr1);
                    break;
                case 2:
                    System.out.println("Vendos numrin");
                    double nr2=scanner.nextDouble();
                    pesha.poundstokg(nr2);
                    break;
                case 3:
                    System.out.println("Vendos numrin");
                    double nr3= scanner.nextDouble();
                    pesha.kgtopounds(nr3);
                    break;
                default:
                    System.out.println("Invalid choise");
                    break;



            }



        }

    }
}
