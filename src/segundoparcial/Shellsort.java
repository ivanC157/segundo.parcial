
package shellsort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Shellsort {

public static void imprimir( int t, int array[]){   //este metodo imprime el vector
        
        for(int k=0;k<t;k++){       //este for recorre todo el vector 
            System.out.print(array[k] + " ");
        }
        System.out.println("");
    }   



public static void shellsort(int tam, int vect[]){
    int tamaux=vect.length;
    for(int i =0;i<tamaux-tam;i++){
            int varaux = vect[i+tam];
            if(vect[i] > varaux){
            vect[i+tam] = vect[i];
            vect[i] = varaux;
        
            for(int j =i;j>=0+tam; j--){
                varaux = vect[j - tam];
                
                
              if(vect[j] < varaux){  
                vect[j - tam] = vect[j];
                vect[j] = varaux;
            
              }
              }
            
            }
      
        
        
        
       
   imprimir(tamaux,vect);
    
    }
    
    
    
}


    
    public static void main(String[] args) throws IOException {
         BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
         
        System.out.println("Dame el tamaño de la serie: ");
        int tam=Integer.parseInt(leer.readLine());
        
        int[] lista = new int[tam];
        for(int i = 0; i<tam;i++){
            
            lista[i]= (int)(1+Math.random()*50);
            
            
            
        }
      imprimir(tam, lista);
      
      while(tam > 1){
          tam = tam/2;
          System.out.println("Gap----->" + tam);
      shellsort(tam,lista);
      
      }
        
         
    }
    
}
