package ru.simbirsof.calculator;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class GooglePage {

        public static final String GOOGLE = "http://google.com";

        @FindBy(how = How.CSS,using = ".gLFyf")
        private SelenideElement searchField;

        public void setSearchField(String calculator) {
        searchField.setValue(calculator);
        searchField.sendKeys(Keys.ENTER);
    }

}