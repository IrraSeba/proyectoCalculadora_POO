package calculadora;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int op;
        
        while(true){
            System.out.println("Qué quiere hacer?");
            System.out.println("1.- Sumar");
            System.out.println("2.- Restar");
            System.out.println("3.- Dividir");
            System.out.println("4.- Multiplicar");
            System.out.println("Qué quiere hacer?");
            
            op = Integer.parseInt(scan.nextLine());
            
            if(op == 1){
                List<Integer> numeros = new ArrayList<>();
                
                System.out.println("Cuántos Números?: ");
                int cant = Integer.parseInt(scan.nextLine());
                
                int num;
                for (int i = 0; i < cant; i++) {
                    System.out.println("Ingrese número "+(i+1)+": ");
                    
                    num = Integer.parseInt(scan.nextLine());
                    numeros.add(num);
                }
            }
        }
    }
    
    
}
