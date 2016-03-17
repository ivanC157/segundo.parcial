
package insertion;

import java.util.Scanner;


public class Insertion {
public static void imprimir(int array[]){   //este metodo imprime el vector
        
        for(int k=0;k<array.length;k++){       //este for recorre todo el vector 
            System.out.print(array[k] + " ");
        }
    }
  public static int tam; 
    public static void main(String[] args) {
        
        Scanner ac = new Scanner(System.in);
        System.out.println("Dame la cantidad de numeros: ");

tam=ac.nextInt();                //damos los parametros del vector

int[] vect = new int[tam];       //declaramos el vector

for(int i=0;i<tam;i++){          //llenamos el vector 
    System.out.println("Dame el valor " + (i+1));
    
    vect[i]= ac.nextInt();
    
}


for(int i = 1; i<vect.length;i++){
    int aux=vect[i];
    int j = i;
    while(j > 0 && vect[j-1] > aux){
        vect[j]=vect[j-1];
        j--;
    
    }

    vect[j]=aux;
    
    imprimir(vect);
        System.out.println(" ");
    
    
}




    }
    
}
