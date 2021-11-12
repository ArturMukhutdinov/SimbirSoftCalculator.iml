package ru.simbirsof.calculator;

import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;
import static org.junit.Assert.assertTrue;
import static ru.simbirsof.calculator.GooglePage.GOOGLE;


public class CalculatorTest {

    @Test
    public void checkCalculatorWithZeroResult() {

        GooglePage main = open(GOOGLE, GooglePage.class);
        CalculatorPage calculator = page(CalculatorPage.class);


        main.setSearchField("Калькулятор");
        calculator.setNumberOne();
        calculator.setMultiply();
        calculator.setNumberTwo();
        calculator.setMinus();
        calculator.setNumberThree();
        calculator.setPlus();
        calculator.setNumberOne();
        calculator.setEquals();

        assertTrue("Значение должно быть ноль",calculator.getCalculatorField());
    }

}