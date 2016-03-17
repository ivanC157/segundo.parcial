
package bubble;


public class Bubble {
 public static void imprimir(int array[]){   //este metodo imprime el vector
        
        for(int k=0;k<array.length;k++){       //este for recorre todo el vector 
            System.out.print(array[k] + " ");
        }
    }          
    public static void bubble(int array[]){
  
     int cont=0;
     
     int aux;
     for(int i=0; i<array.length-1 ; i++ ){
            for(int j=i+1 ; j < array.length ; j++){
               cont++; 
                if(array[j]<array[i]){
                    // Intercambiar los valores
                    aux = array[j];
                    array[j] = array[i];
                    array[i] = aux;
                }
            }
                }
     
    }
    public static void main(String[] args) {
     
        int[] vect = new int[5];
        
        for (int i = 0; i < 5; i++) {
            
            vect[i]=(int) (1 +  Math.random()*100);
        }
        
        bubble(vect);
        
        imprimir(vect);
        
    }
    
}
