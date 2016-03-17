
package selectsort;


public class Selectsort {

     public static void imprimir(int array[]){   //este metodo imprime el vector
        
        for(int k=0;k<array.length;k++){       //este for recorre todo el vector 
            System.out.print(array[k] + " ");
        }
    }    
    
    public static void selec(int array[]){
       
       for (int i = 0; i < array.length-1; i++) {
           
           int minimo= i;
           for (int j = i+1; j < array.length; j++) {
               
               if (array[j] < array[minimo]) {
                   
                   minimo=j;
                   
                   
               }
               
           }
           int aux = array[i];
           array[i]=array[minimo];
           array[minimo]=aux;
           imprimir(array);
           System.out.println("");
       }
       
       
   }  
    
    public static void main(String[] args) {
        int[] vect = new int[5];
        
        for (int i = 0; i < 5; i++) {
            
            vect[i]=(int) (1 +  Math.random()*100);
        }
        
        selec(vect);
        
        imprimir(vect);
        System.out.println("");
    }
    
}
