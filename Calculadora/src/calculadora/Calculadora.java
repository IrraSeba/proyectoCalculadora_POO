package calculadora;

import java.util.List;

public class Calculadora {

    public int sumar(List<Integer> numeros) {
        int suma = 0;
        for (int i = 0; i < numeros.size(); i++) {
            suma += numeros.get(i);
        }
        return suma;
    }

//    public int restar(List<Integer> numeros) {
//            
//    }
//
//    public int multi(int n1, int n2) {
//            
//    }
//
//    public int dividir(int n1, int n2) {
//            
//    }
}
