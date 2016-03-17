
package heapsort;


public class Heapsort {

    public static int vect[];
    
    public static void bajarnodo(int[]a,int star, int last){
        
       int nodoRaiz = 0;
       while(nodoRaiz * 2 +1 <= last){
           int hijo = nodoRaiz * 2 + 1;
       
           System.out.println("ultimo--> " + last + " NodoRaiz--> " + nodoRaiz + " hijo--> " + hijo);
           //si el hijo tiene un germano y su valor es menor... evaluamos ese nodo
           if(hijo +1 <= last && a[hijo] < a[hijo + 1]){
               
               hijo = hijo + 1; //hijo de la derecha
               
           }
        if(a[nodoRaiz] < a[hijo]){
            int aux= a[nodoRaiz];
            a[nodoRaiz] = a[hijo];
            a[hijo] = aux;
            nodoRaiz = hijo;
            
        }else{
            return;
        }   
           
       }
        
        
    }
    
    public static void hacerHeap(int[]a, int tam){
        
        int start= (tam-2)/2;
        bajarnodo(a, start, tam-1);
        start--;
        
    }
    
    
    
    public static void heapsort(int[] a){
        int tam = a.length;
        
       
        //para posicionarnos en el valor maximo
        hacerHeap(a, tam);
        
        
        int ultima = tam-1;
        
        while(ultima>0){
            
         //aqui vamos  hacer el intercambio del valor maximo del monticulo con el ultimo elemento 
         
         int aux = a[ultima];
         a[ultima]= a[0];
         a[0]=aux;
        imprimir(a);
            System.out.println("");
         //Regerees el maximo a la ultia posicion del arbol 
         bajarnodo(a,0,ultima-1);
         ultima--;
         
            
            
        }
        
        
        
    }
    
    public static void imprimir(int[] a){
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
    
    public static void main(String[] args) {
       
       int[]vect= {25,15, 20, 3, 5, 10};
        
        heapsort(vect);
        
        for (int i = 0; i < vect.length; i++) {
            System.out.print(vect[i] + " ");
        }
  
        
        
        
        
        
        
        
    }
    
}
