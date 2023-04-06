import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTeste {

    @Test
    void hacerCadaLetraMinuscula() {
        assertEquals("abcdefghijklmnñopqrstuvxyz", Main.hacerCadaLetraMinuscula("ABCDEFGHIJKLMNÑOPQRSTUVXYZ"));


    }

    @Test
    void hacerCadenaIdonea() {
        assertEquals("holacomoestas",Main.HacerCadenaIdonea("¿¿¿Hola, cómo estás???"));

    }

    @Test
    void esPalindromo() {
        assertEquals(true, Main.esPalindromo("ojorojo"));
        assertEquals(false, Main.esPalindromo("ahabccbaaa"));
        assertEquals(true, Main.esPalindromo("lateleletal"));
        assertEquals(false, Main.esPalindromo(""));
        assertEquals(false, Main.esPalindromo("123456789=pop/&%$#+"));
        //LA SIGUIENTE PRUEBA FUE HECHA POR CHAT GPT NO MIA NO DEMUESTRA NINGUN PENSAMIENTO DEL CREADOR DE ESTE CODIGO GRACIAS:D
        assertEquals(false, Main.esPalindromo("¡¡¡A la gorda drogala!!!   "));
    }
}