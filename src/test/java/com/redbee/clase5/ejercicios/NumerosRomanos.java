package com.redbee.clase5.ejercicios;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Escribe una función que traduzca de números romanos a decimales romanToDecimal(roman). En aras de mantener el kata
 * simple, asumamos que ya vienen validados los números.
 *
 * Los números romanos, del sistema de numeración de la antigua Roma usaba combinaciones de letras del alfabeto latino
 * para representar valores. Consta de siete símbolos:
 *
 * | Símbolo | Valor |
 * | I       | 1     |
 * | V       | 5     |
 * | X       | 10    |
 * | L       | 50    |
 * | C       | 100   |
 * | D       | 500   |
 * | M       | 1000  |
 *
 * Ejemplos:
 *
 * MMVI = 1000 + 1000 + 5 + 1 = 2006
 * MCMXLIV = 1000 + (1000 - 100) + (50 - 10) + (5 - 1) = 1944
 */
@DisplayName("Laboratorio para ejercicio de numeros romanos")
public class NumerosRomanos {

    @Test
    void devolverValorDeI(){
        final var correctResult = 1;
        final var result = RomanTranslator.romanToDecimal("I");

        Assertions.assertEquals(correctResult, result);
    }
    @Test
    void devolverValorDeXI(){
        final var correctResult = 11;
        final var result = RomanTranslator.romanToDecimal("XI");

        Assertions.assertEquals(correctResult, result);
    }

    @Test
    void devolverValorDeXXI(){
        final var correctResult = 21;
        final var result = RomanTranslator.romanToDecimal("XXI");

        Assertions.assertEquals(correctResult, result);
    }

    @Test
    void devolverValorDeMCMXLIV(){
        final var correctResult = 1944;
        final var result = RomanTranslator.romanToDecimal("MCMXLIV");

        Assertions.assertEquals(correctResult, result);
    }
}
