
package tp4_ej3;
 
import java.util.Scanner;


public class TP4_EJ3 {

 
    public static void main(String[] args) {
    Scanner Lector = new Scanner(System.in);
    int[] numeros = new int [10];
    System.out.println("ingrese 10 valores enteros : "); 
    int contador = 0;
    while(contador < 10){
        numeros[contador] = Lector.nextInt();
        contador ++;
    }
    float promedio = 0.0f;  
    for (int indice = 0; indice < 10; indice++){
        if(indice % 2 == 0){
        promedio = promedio + numeros[indice];
            }
    }
    promedio = promedio / 5.0f;
    System.out.println("promedio de pos pres = " + promedio);
    }
    
}
