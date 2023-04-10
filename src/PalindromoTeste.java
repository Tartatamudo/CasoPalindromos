import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromoTeste {

    @Test
    void hacerCadaLetraMinuscula() {
        assertEquals("abcdefghijklmnñopqrstuvxyz", Palindromo.hacerCadaLetraMinuscula("ABCDEFGHIJKLMNÑOPQRSTUVXYZ"));


    }

    @Test
    void hacerCadenaIdonea() {
        assertEquals("holacomoestas", Palindromo.HacerCadenaIdonea("¿¿¿Hola, cómo estás???"));

    }

    @Test
    void esPalindromo() {
        assertEquals(true, Palindromo.esPalindromo("ojorojo"));
        assertEquals(false, Palindromo.esPalindromo("ahabccbaaa"));
        assertEquals(true, Palindromo.esPalindromo("lateleletal"));
        assertEquals(false, Palindromo.esPalindromo(""));
        assertEquals(false, Palindromo.esPalindromo("123456789=pop/&%$#+"));
        //LA SIGUIENTE PRUEBA FUE HECHA POR CHAT GPT NO MIA NO DEMUESTRA NINGUN PENSAMIENTO DEL CREADOR DE ESTE CODIGO GRACIAS:D
        assertEquals(false, Palindromo.esPalindromo("¡¡¡A la gorda drogala!!!   "));
    }
}