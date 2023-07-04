
package com.danilo.challenge;

public class Challenge {

    public static void main(String[] args) {
                
        int[] entradaNum = {1,4,3,9};
        int[] entradaNum2 = {1,2,4,4};

        System.out.println("--- 1° Algoritmo ---");
        System.out.println("Resultado 1°: " + primerAlgoritmo(entradaNum));
        System.out.println("Resultado 2°: " + primerAlgoritmo(entradaNum2));
        System.out.println("--- 2° Algoritmo ---");
        System.out.println("Resultado 1°: " + segundoAlgoritmo(entradaNum));
        System.out.println("Resultado 2°: " + segundoAlgoritmo(entradaNum2));
                  
    }
    
    private static boolean primerAlgoritmo(int[] nums){
        
        /*1° Algoritmo:  Recursos infinitos - Tiempo de ejecución no importa - Desarrollo en el menor tiempo posible*/
        //Fuerza bruta: Es facil de desarrollar, lo que hace este algoritmo es probar todas las combinaciones posibles del Array. 
        //Itera aunque ya haya sido encontrado el resultado que buscamos. Esto consume mayor cantidad de recursos porque sigue iterando innecesariamente.
        int requiredSum = 8;
        boolean flag = false;
        
        for( int x = 0 ; x < nums.length ; x++){
            for(int y = x+1 ; y < nums.length ; y++ ){
                if( nums[x] + nums[y] == requiredSum )
                    flag = true;
            }
        }         
        return flag;
    }
    
     private static boolean segundoAlgoritmo(int[] nums){
        /*2° Algoritmo: Recursos son un bien preciado - Tiempo de ejecución si importa - Tiempo de desarrollo no es importante.*/
        //Con este Algoritmo se intenta probar todas las combinaciones del Array, pero sujetas a condiciones que nos ahorran iteraciones innecesarias. 
        //Contiene un condicional que si el valor de la posicion del Array que esta iterando es > 8 no lo compara con el resto de los numeros. Eso nos ahorra en hacer comparaciones que nunca van a dar 8. (Doy por sentado que trabajamos sólo con numeros positivos)
        //Y además si en una de las comparaciones encontramos el valor buscado, a través del break rompemos el ciclo y retornamos el resultado true. Para evitar seguir haciendo operaciones cuando ya sabemos que nuestro resultado es verdadero.  
         int requiredSum = 8;
         boolean flag = false;
     
         outerLoop: for( int x = 0 ; x < nums.length ; x++){  
            if(nums[x] <= requiredSum){
               for(int y = x+1 ; y < nums.length ; y++ ){
                   if( nums[x] + nums[y] == 8 ){
                       flag = true;
                       break outerLoop;    
                   }
                }           
            }        
        } 
        return flag;
     }
}
