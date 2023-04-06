import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalinTest {

    @Test
    void hacerCadaLetraMinusculaTest() {
        assertEquals("abcdefghijklmnñopqrstuvxyz", Palindromos.hacerCadaLetraMinuscula("aBCDEFGHIJKLMNÑOPQRSTUVXYZ"));
    }

    @Test
    void hacerCadenaIdoneaTest() {
        assertEquals("hola", Palindromos.HacerCadenaIdonea("H##$o[¨[¨**L   ,.,-´{´0897895a"));
        assertEquals("", Palindromos.HacerCadenaIdonea("   3552352532$%#%#,.,---:;:436346362466346-,577544556@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@6445223523564765679078890}+´}´+}´}}+++}+}+}´+{{{{{---..,,,..<<<<      .--,._,.--.,.--,.-,.-.-,--.-.´+´+´´}´+}+}}}´+}´+}´+}+´+}+}+}¿'0'9809786756435243547568798089'¿90'0'09'+´+}}+´{ñ´{-,-,,.-.,<<<++'098765432$"));
    }

    @Test
    void esPalindromoTest() {
        assertEquals(true, Palindromos.esPalindromo("kerek"));
        assertEquals(false, Palindromos.esPalindromo("kerek*"));
        assertEquals(false, Palindromos.esPalindromo("KEREK1"));
        assertEquals(false, Palindromos.esPalindromo(""));
    }

}