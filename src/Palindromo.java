import java.util.*;
import java.util.Scanner;
public class Palindromo {

    public static String hacerCadaLetraMinuscula(String cadena){
            return cadena.toLowerCase();
        }
        //Remplazar las letras por minusculas
        public static String HacerCadenaIdonea(String cadena){
            String resultado = cadena.replaceAll("[^a-zA-Z]", "");

            resultado = hacerCadaLetraMinuscula(resultado);

            return resultado;

        }

        //verificador de palindromos
        public static Boolean esPalindromo(String cadena){

            List<String> resultado = Arrays.asList(cadena.split(""));

            Collections.reverse(resultado);

            String strResultado = "".join("",resultado);

            if (!strResultado.contains(cadena)||strResultado.equals("")) {
                return false;
            }
            else{
                return true;
            }
        }

        //imprimir el es o no es
        public static void imprimir (Boolean bool){
            if (bool == true){
                System.out.println("Es palindromo");
            }else{
                System.out.println("No es palindromo");
            }
        }

        //TECLADO
        public static String Ingresarcadena(){
            Scanner teclado = new Scanner(System.in);
            String cadena = teclado.nextLine();
            return cadena;
        }

        public static void main(String[] args) {
            imprimir(esPalindromo(HacerCadenaIdonea(Ingresarcadena())));
        }

}
