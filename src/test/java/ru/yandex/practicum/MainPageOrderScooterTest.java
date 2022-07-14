package ru.yandex.practicum;

import com.codeborne.selenide.Configuration;
import org.junit.Before;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;
import static org.junit.Assert.assertNotNull;

public class MainPageOrderScooterTest {
 //Если проверка не в firefox, надо закомментировать
    @Before
    public void setup() {
        Configuration.browser = "firefox";
    }

    @Test
    public void pressSmallButtonOrder(){
        MainPageScooterElements pressButton = open(MainPageScooterElements.URL_MAIN, MainPageScooterElements.class);
        pressButton.clickButtonCookie();
        pressButton.clickSmallButtonOrder();
        OrderPageScooterElements registrationOrder = page(OrderPageScooterElements.class);
        registrationOrder.orderStep1("Оля", "Петрова","Улица Гороховая", "Черкизовская","89456214579");
        registrationOrder.orderStep2("25.04.2022","Нет комментарий");
        registrationOrder.orderStep3();
        assertNotNull(registrationOrder.getTextOrderRegistation());
    }

    @Test
    public void pressBigButtonOrder(){
        MainPageScooterElements pressButton = open(MainPageScooterElements.URL_MAIN, MainPageScooterElements.class);
        pressButton.clickBigButtonOrder();
        OrderPageScooterElements registrationOrder = page(OrderPageScooterElements.class);
        registrationOrder.orderStep1("Валя", "Смирнова","Улица Бестужевых", "Сокольники","81112223344");
        registrationOrder.orderStep2("01.05.2022","Хотим самокат со звонком");
        registrationOrder.orderStep3();
        assertNotNull(registrationOrder.getTextOrderRegistation());
    }

}