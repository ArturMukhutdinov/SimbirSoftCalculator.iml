package ru.simbirsof.calculator;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class CalculatorPage {

        @FindBy(how = How.XPATH,using = "//*[@id=\"cwos\"]")
        private SelenideElement calculatorField;

        @FindBy(how = How.CSS,using = ".ElumCf > tbody:nth-child(1) > tr:nth-child(4) > td:nth-child(1) > div:nth-child(1) > div:nth-child(1)")
        private SelenideElement numberOne;

        @FindBy(how = How.CSS,using = ".ElumCf > tbody:nth-child(1) > tr:nth-child(4) > td:nth-child(2) > div:nth-child(1) > div:nth-child(1)")
        private SelenideElement numberTwo;

        @FindBy(how = How.CSS,using = ".ElumCf > tbody:nth-child(1) > tr:nth-child(4) > td:nth-child(3) > div:nth-child(1) > div:nth-child(1)")
        private SelenideElement numberThree;

        @FindBy(how = How.CSS,using = ".ElumCf > tbody:nth-child(1) > tr:nth-child(3) > td:nth-child(4) > div:nth-child(1) > div:nth-child(1)")
        private SelenideElement multiply;

        @FindBy(how = How.CSS,using = ".ElumCf > tbody:nth-child(1) > tr:nth-child(4) > td:nth-child(4) > div:nth-child(1) > div:nth-child(1)")
        private SelenideElement minus;

        @FindBy(how = How.CSS,using = ".ElumCf > tbody:nth-child(1) > tr:nth-child(5) > td:nth-child(4) > div:nth-child(1) > div:nth-child(1)")
        private SelenideElement plus;

        @FindBy(how = How.CSS,using = ".UUhRt")
        private SelenideElement equals;

        public void setNumberOne() {
        numberOne.click();
    }

        public void setMultiply() {
        multiply.click();
    }

        public void setNumberTwo() {
        numberTwo.click();
    }

        public void setMinus() {
        minus.click();
    }

        public void setNumberThree() {
        numberThree.click();
    }

        public void setPlus() {
        plus.click();
    }

        public void setEquals() {
        equals.click();
    }

        public boolean getCalculatorField(){
            calculatorField.shouldHave(Condition.exactText(String.valueOf(0)));
            return calculatorField.isDisplayed();
        }


}