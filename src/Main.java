import gjatesia.KonvertimiGjatesiaMain;
import pesha.KonvertimiPeshamain;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        KonvertimiGjatesiaMain distanca=new KonvertimiGjatesiaMain();  //objektet
        KonvertimiPeshamain pesha=new KonvertimiPeshamain();   //objektet
        while (true){
            System.out.println("Unit Conversion Menu:");
            System.out.println("1. Distance");
            System.out.println("2. Weight");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choise=scanner.nextInt();
            if (choise==3){
                System.out.println("Exit");
                        break;
            }
            switch (choise){
                case 1:
                    distanca.llogaritjaEdistances();
                    break;
                case 2:
                    pesha.llogaritjaPesha();
                    break;
                default:
                    System.out.println("Invalid choise");
                    break;
            }


        }

    }
}