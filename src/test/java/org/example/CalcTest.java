package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

class CalcTest {

    @Test
    @DisplayName("Проверка суммирования")
    @Timeout(10)
    void summ() {
        Calc calc = new Calc();
        int result = calc.summ(1,6);
        Assertions.assertEquals(7, result, "Не тот ответ");
    }
}