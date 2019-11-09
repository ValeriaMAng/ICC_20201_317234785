import java.util.ArrayList;
import java.util.Arrays;

public class Control{

    //Metodo que determina si una palabra es palíndromo o no lo es.
    public static boolean problema1(String palabra){
	
	    int ini = 0;
	    int fin = palabra.length() - 1;
	    boolean palindromo = true;
	    while(ini < fin){
	        if(palabra.charAt(ini) != palabra.charAt(fin)){
		        palindromo = false;
	        }
	        ini++;
	        fin--;
	    } return palindromo;
    }

    //Metodo que dado un arreglo A y un número K, determinar si hay 2 números en el arreglo que sumen K.
    public static boolean problema2(int[] arreglo, int k){
	   
	    boolean resultado = false;
        for(int a = 0; a < arreglo.length; a++){
	        for(int b = 1; b < arreglo.length; b++){
		        if(arreglo[a] + arreglo[b] == k){
		            resultado = true;
		        }
	        }
	    } return resultado;
    }

    //Metodo que dado un arreglo A, retornar el mismo arreglo pero ordenado. 
    public static void problema3(int[] arreglo){
       
        for ( int a = 0; a < (arreglo.length-1);a++){
            for (int b = a+1; b < arreglo.length; b++){
                if (arreglo[a]>arreglo[b]){
                    int variableauxiliar=arreglo[a];
                    arreglo[a] = arreglo[b];
                    arreglo[b] = variableauxiliar;
                }
            }
        }
    }
    
    //Metodo que realiza una Búsqueda binaria, Dado un arreglo ordenado A, buscar un número K y regresar true si está, false en otro caso.
    public static boolean problema4(int[] arreglo, int buscando){
	
	    boolean numero = false;
        for(int a = 0; a < arreglo.length; a++){
	        if(arreglo[a] == buscando){
		        numero = true;
	        }
        } return numero;
    }

    //Metodo para saber si un número K es primo
    public static boolean problema5(int n){

        if (n == 1) return false;
            for (int a = 2; a < n; a++){
                if (n%a == 0) return false;
            }
	    return true;
    }
    
    //Metodo que regresa todos los números primos menores a un numero N.
    public static int[] problema6(int n){
	
        int cont = 0;
        for(int a = 1; a <= n; a++){
            if(problema5(a)){
                cont++;
            }
        }
        int[]primos = new int[cont];
        int contador = 0;
        for(int b = 1; b < n; b++){
            if(problema5(b)){
                primos[contador] = b;
                contador++;
            }
        } return primos;
    }


    public static void main(String[] args) {
        String resultado = "";
        int[] desordenado = {9,8,7,6,5,4,3,2,1};
        int[] ordenado    = {1,2,3,4,5,6,7,8,9};
        int[] primos10 = {2,3,5,7};
        if(problema1("oso")==true && problema1("palabra")==false)resultado+="P1 bien\n";else resultado+="P1 mal\n";
        if(problema2(desordenado, 17)==true) resultado+="P2 bien\n";else resultado+="P2 mal\n";
        problema3(desordenado);
        if(Arrays.equals(desordenado,ordenado) == true)resultado+="P3 bien\n";else resultado+="P3 mal\n";
        if(problema4(desordenado,2)== true && problema4(desordenado,18)== false)resultado+="P4 bien\n";else resultado+="P4 mal\n";
        if(problema5(7)==true && problema5(6)==false)resultado+="P5 bien\n";else resultado+="P5 mal\n";
        if(Arrays.equals(problema6(10), primos10) == true)resultado+="P6 bien\n";else resultado+="P6 mal\n";
        System.out.println(resultado);   
    }

}


