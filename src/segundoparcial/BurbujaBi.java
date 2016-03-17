
package burbujabi;

import java.util.Scanner;
import java.util.Random;

public class BurbujaBi {

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

Random rnd = new Random();


//tam  =   (int) (1 +  Math.random()*100);
//        System.out.println(tam);


int[] vect = new int[tam];       //declaramos el vector

for(int i=0;i<tam;i++){          //llenamos el vector 
    System.out.println("Dame el valor " + (i+1));
    
    vect[i]= ac.nextInt(); //(int) (1 +  Math.random()*100);
    
}
   

int izquierda =1;              //este lo iniciamos en uno que es donde se inicia el vector 
int derecha=vect.length;       // este es el tamaño del vector
int aux;                       //este auxiliar nos permitira guardar la variable cuando se este comparando
int ultimo=vect.length-1;      //esta variable nos indica donde debe iniciar el siguiente ciclo for
int comp=0;
do{

    //lectura por la izquierda
    
    for(int i = vect.length-1; i>0;i--){  
    comp++;
    if(vect[i-1] > vect[i]){
        
        aux=vect[i];
        vect[i]=vect[i-1];
        vect[i-1]=aux;
        ultimo=i;              //con esto hacemos que nuestra varible se acerque al centro 
        
        
    }
    imprimir(vect);
        System.out.println("");
}

izquierda=ultimo+1;            //actualizamos el valor de la varible y asi recorre solo hasta el valor marcado en ultimo
    
//lectura por la derecha    

  for(int j = izquierda; j<vect.length;j++){
    comp++;
    if(vect[j-1] > vect[j]){
        
        aux=vect[j];
        vect[j]=vect[j-1];
        vect[j-1]=aux;
        ultimo=j;                   //con esto hacemos que nuestra varible se acerque al centro 
  
        
    }
    imprimir(vect);
      System.out.println("");
}

derecha=ultimo-1;             //actualizamos el valor de la varible y asi recorre solo hasta el valor marcado en ultimo






}while(derecha>=izquierda);     //el ciclo do while permitira que se repita hasta que esten todos ordenados
        
imprimir(vect);
        System.out.println("comp:  "+comp);

    }
    
}
