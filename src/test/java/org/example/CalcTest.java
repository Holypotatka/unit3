package org.example;

import org.junit.jupiter.api.*;

class CalcTest {
    @BeforeAll
    public static void beforeAll(){
        System.out.println("before all");
    }

    @BeforeEach
    public void beforeEach(){
        System.out.println("before each");
    }

    @AfterAll
    public static void afterAll(){
        System.out.println("after all");
    }

    @AfterEach
    public void afterEach(){
        System.out.println("after each");

    }
    @Test
    @DisplayName("Проверка суммирования 1")
    @Timeout(10)
    @Tag("summ")
    void summ1() {
        Calc calc = new Calc();
        int result = calc.summ(1,6);
        Assertions.assertEquals(7, result, "Не тот ответ");
    }

    @Test
    @DisplayName("Проверка суммирования 2")
    @Timeout(10)
    void summ2() {
        Calc calc = new Calc();
        int result = calc.summ(2,6);
        Assertions.assertEquals(8, result, "Не тот ответ");
    }
}