package ru.yandex.practicum;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Condition.enabled;

public class MainPageScooterElements {

    //КНОПКИ на основной странице
    public static final String URL_MAIN = "https://qa-scooter.praktikum-services.ru/";
    public static final String ANSWER_1 = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
    public static final String ANSWER_2 = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
    public static final String ANSWER_3 = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. " +
            "Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
    public static final String ANSWER_4 = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
    public static final String ANSWER_5 = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";
    public static final String ANSWER_6 = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";
    public static final String ANSWER_7 = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";
    public static final String ANSWER_8 = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";

    // локатор кнопки Яндекс
    @FindBy(how = How.CLASS_NAME,using = "Header_LogoYandex__3TSOI")
    private SelenideElement logoYandex;
    // локатор маленькой кнопки заказать
    @FindBy(how = How.XPATH,using = ".//div[@class='Header_Nav__AGCXC']/button[text()='Заказать']")
    private SelenideElement buttonSmallOrder;
    // локатор кнопки Статус заказа
    @FindBy(how = How.XPATH,using = ".//div[@class='Header_Nav__AGCXC']/button[text()='Статус заказа']")
    private SelenideElement buttonStatus;
    // локатор большой кнопки кнопки заказа
    @FindBy(how = How.XPATH,using = ".//div[@class='Home_FinishButton__1_cWm']/button[text()='Заказать']")
    private SelenideElement buttonBigOrder;
    // локатор кнопки Да все привыкли
    @FindBy(how = How.CLASS_NAME,using = "App_CookieButton__3cvqF")
    private SelenideElement buttonCookie;

    /* ВОПРОСЫ О ВАЖНОМ. посмотрела в интернете, нашла вариант работы со списками, но пока с таким не знакома (2ой спринт).
        Если есть другие варианты как можно реализовать, буду благодарна если напишете.*/
    // локатор аккордиона 0
    @FindBy(how = How.XPATH,using = ".//div[@class='accordion__heading']/div[text()='Сколько это стоит? И как оплатить?']")
    private SelenideElement accordion0;
    // локатор панель аккордиона 0
    @FindBy(how = How.XPATH,using = ".//div[@class='accordion__panel']/p[text()='Сутки — 400 рублей. Оплата курьеру — наличными или картой.']")
    private SelenideElement textAccordiona0;

    // локатор аккордиона 1
    @FindBy(how = How.XPATH,using = ".//div[@class='accordion__heading']/div[text()='Хочу сразу несколько самокатов! Так можно?']")
    private SelenideElement accordion1;
    // локатор панель аккордиона 1
    @FindBy(how = How.XPATH,using = ".//*[contains(text(),'Пока что у нас так:')]")
    private SelenideElement textAccordiona1;

    // локатор аккордиона 2
    @FindBy(how = How.XPATH,using = ".//div[@class='accordion__heading']/div[text()='Как рассчитывается время аренды?']")
    private SelenideElement accordion2;
    // локатор панель аккордиона 2
    @FindBy(how = How.XPATH,using = ".//*[contains(text(),'Допустим, вы оформляете заказ на 8 мая')]")
    private SelenideElement textAccordiona2;

    // локатор аккордиона 3
    @FindBy(how = How.XPATH,using = ".//div[@class='accordion__heading']/div[text()='Можно ли заказать самокат прямо на сегодня?']")
    private SelenideElement accordion3;
    // локатор панель аккордиона 3
    @FindBy(how = How.XPATH,using = ".//div[@class='accordion__panel']/p[text()='Только начиная с завтрашнего дня. Но скоро станем расторопнее.']")
    private SelenideElement textAccordiona3;

    // локатор аккордиона 4
    @FindBy(how = How.XPATH,using = ".//div[@class='accordion__heading']/div[text()='Можно ли продлить заказ или вернуть самокат раньше?']")
    private SelenideElement accordion4;
    // локатор панель аккордиона 4
    @FindBy(how = How.XPATH,using = ".//*[contains(text(),'Пока что нет!')]")
    private SelenideElement textAccordiona4;

    // локатор аккордиона 5
    @FindBy(how = How.XPATH,using = ".//div[@class='accordion__heading']/div[text()='Вы привозите зарядку вместе с самокатом?']")
    private SelenideElement accordion5;
    // локатор панель аккордиона 5
    @FindBy(how = How.XPATH,using = ".//*[contains(text(),'Самокат приезжает к вам с полной зарядкой')]")
    private SelenideElement textAccordiona5;

    // локатор аккордиона 6
    @FindBy(how = How.XPATH,using = ".//div[@class='accordion__heading']/div[text()='Можно ли отменить заказ?']")
    private SelenideElement accordion6;
    // локатор панель аккордиона 6
    @FindBy(how = How.XPATH,using = ".//*[contains(text(),'Да, пока самокат не привезли')]")
    private SelenideElement textAccordiona6;

    // локатор аккордиона 7
    @FindBy(how = How.XPATH,using = ".//div[@class='accordion__heading']/div[text()='Я жизу за МКАДом, привезёте?']")
    private SelenideElement accordion7;
    // локатор панель аккордиона 7
    @FindBy(how = How.XPATH,using = ".//div[@class='accordion__panel']/p[text()='Да, обязательно. Всем самокатов! И Москве, и Московской области.']")
    private SelenideElement textAccordiona7;
    // ВОПРОСЫ О ВАЖНОМ
    // локатор текст Вопросы о важном
    @FindBy(how = How.LINK_TEXT,using = "Вопросы о важном")
    private SelenideElement textVopros;
    // локатор текста Как это работает
    @FindBy(how = How.LINK_TEXT,using = "Как это работает")
    private SelenideElement textHowWork;
    // локатор текста Самокат на пару дней
    @FindBy(how = How.CLASS_NAME,using = "Home_Header__iJKdX")
    private SelenideElement textScooterForDay;
    // локатор текст под тестом Самокат на пару дней №1
    @FindBy(how = How.PARTIAL_LINK_TEXT,using = "Привезём его прямо к вашей двери")
    private SelenideElement textUnderLogo1;
    // локатор текст под тестом Самокат на пару дней №2
    @FindBy(how = How.PARTIAL_LINK_TEXT,using = "Он лёгкий и с мощными колёсами")
    private SelenideElement textUnderLogo2;
    // локатор картинки самоката №1
    @FindBy(how = How.XPATH,using = ".//div[@class='Home_BluePrint__TGX2n']/img[@alt='Scooter blueprint']")
    private SelenideElement scooterImg1;
    // локатор картинки самоката №2
    @FindBy(how = How.XPATH,using = ".//div[@class='Home_Scooter__3YdJy']/img[@alt='Scooter blueprint']")
    private SelenideElement scooterImg2;
    // локатор слова Самокет в Логотипе
    @FindBy(how = How.CLASS_NAME,using = "Header_LogoScooter__3lsAR")
    private SelenideElement logoScooter;
    // локатор слово Учебный тренажер
    @FindBy(how = How.CLASS_NAME,using = "Header_Disclaimer__3VEni")
    private SelenideElement textNearLogo;
    // локатор окна куки
    @FindBy(how = How.CLASS_NAME,using = "App_CookieConsent__1yUIN")
    private SelenideElement cookieWindow;
    // локатор текста окна куки
    @FindBy(how = How.CLASS_NAME,using = "App_CookieText__1sbqp")
    private SelenideElement textCookieWindow;
    // локатор стрелки прокрутки
    @FindBy(how = How.CLASS_NAME,using = "Home_ArrowDown__fnDme Home_Animated__17o7s Home_Bounce__O19_v")
    private SelenideElement ArrowDown;

    // ИНФОРМАЦИЯ О САМОКАТЕ
    // локатор модели самоката
    @FindBy(how = How.CLASS_NAME,using = "Home_Row__jdQW2")
    private SelenideElement scooterModel;
    // локатор текста максимальной скорости самоката
    @FindBy(how = How.XPATH,using = ".//div[@class='Home_Column__xlKDK']/button[text()='Максимальная скорость']")
    private SelenideElement textScooterSpeed;
    // локатор текста расстояния без подзярядки
    @FindBy(how = How.XPATH,using = ".//div[@class='Home_Column__xlKDK']/button[text()='Проедет без поздарядки']")
    private SelenideElement textScooterDistance;
    // локатор текста сколько выдержит веса
    @FindBy(how = How.XPATH,using = ".//div[@class='Home_Column__xlKDK']/button[text()='Выдерживает вес']")
    private SelenideElement textScooterWeight;
    // локатор значения максимальной скорости самоката
    @FindBy(how = How.XPATH,using = ".//div[@class='Home_Column__xlKDK']/button[text()='40 км/ч']")
    private SelenideElement valueScooterSpeed;
    // локатор значения расстояния без подзярядки
    @FindBy(how = How.XPATH,using = ".//div[@class='Home_Column__xlKDK']/button[text()='80 км']")
    private SelenideElement valueScooterDistance;
    // локатор значения сколько выдержит веса
    @FindBy(how = How.XPATH,using = ".//div[@class='Home_Column__xlKDK']/button[text()='120 кг']")
    private SelenideElement valueScooterWeight;
    // КАК ЭТО РАБОТАЕТ
    // локатор пункта 1
    @FindBy(how = How.XPATH,using = ".//div[@class='Home_StatusCircle__3_aTp']/div[text()='1']")
    private SelenideElement point1;
    // локатор текст пункта 1
    @FindBy(how = How.XPATH,using = ".//div[@class='Home_Status__YkfmH']/div[text()='Заказываете самокат']")
    private SelenideElement textPoint1;
    // локатор коментарий пункта 1
    @FindBy(how = How.XPATH,using = ".//div[@class='Home_StatusDescription__3WGl5']/div[text()='Выбираете, когда и куда привезти']")
    private SelenideElement commentPoint1;
    // локатор пункта 2
    @FindBy(how = How.XPATH,using = ".//div[@class='Home_StatusCircle__3_aTp']/div[text()='2']")
    private SelenideElement point2;
    // локатор текст пункта 2
    @FindBy(how = How.XPATH,using = ".//div[@class='Home_Status__YkfmH']/div[text()='Курьер привозит самокат']")
    private SelenideElement textPoint2;
    // локатор коментарий пункта 2
    @FindBy(how = How.XPATH,using = ".//div[@class='Home_StatusDescription__3WGl5']/div[text()='А вы — оплачиваете аренду']")
    private SelenideElement commentPoint2;
    // локатор пункта 3
    @FindBy(how = How.XPATH,using = ".//div[@class='Home_StatusCircle__3_aTp']/div[text()='3']")
    private SelenideElement point3;
    // локатор текст пункта 3
    @FindBy(how = How.XPATH,using = ".//div[@class='Home_Status__YkfmH']/div[text()='Катаетесь']")
    private SelenideElement textPoint3;
    // локатор коментарий пункта 3
    @FindBy(how = How.XPATH,using = ".//div[@class='Home_StatusDescription__3WGl5']/div[text()='Сколько часов аренды осталось — видно на сайте']")
    private SelenideElement commentPoint3;
    // локатор пункта 4
    @FindBy(how = How.XPATH,using = ".//div[@class='Home_StatusCircle__3_aTp']/div[text()='4']")
    private SelenideElement point4;
    // локатор текст пункта 4
    @FindBy(how = How.XPATH,using = ".//div[@class='Home_Status__YkfmH']/div[text()='Курьер забирает самокат']")
    private SelenideElement textPoint4;
    // локатор коментарий пункта 4
    @FindBy(how = How.XPATH,using = ".//div[@class='Home_StatusDescription__3WGl5']/div[text()='Когда аренда заканчивается']")
    private SelenideElement commentPoint4;
    // Статус заказа
    // локатор поля "Введите номер заказа"
    @FindBy(how = How.CLASS_NAME,using = "Input_Input__1iN_Z Header_Input__xIoUq")
    private SelenideElement orderNumber;
    // локатор
    @FindBy(how = How.CLASS_NAME,using = "Button_Button__ra12g Header_Button__28dPO")
    private SelenideElement buttonGo;

    public void clickAccordion1(){
        accordion0.click();
    }
    public String getTextAnswer1(){
        return textAccordiona0.getText();
    }
    public void clickAccordion2(){
        accordion1.shouldBe(enabled).click();
    }
    public String getTextAnswer2(){
        return textAccordiona1.should(Condition.visible).getText();
    }
    public void clickAccordion3(){
        accordion2.shouldBe(enabled).click();
    }
    public String getTextAnswer3(){
        return textAccordiona2.should(Condition.visible).getText();
    }
    public void clickAccordion4(){
        accordion3.shouldBe(enabled).click();
    }
    public String getTextAnswer4(){
        return textAccordiona3.should(Condition.visible).getText();
    }
    public void clickAccordion5(){
        accordion4.shouldBe(enabled).click();
    }
    public String getTextAnswer5(){
        return textAccordiona4.should(Condition.visible).getText();
    }
    public void clickAccordion6(){
        accordion5.shouldBe(enabled).click();
    }
    public String getTextAnswer6(){
        return textAccordiona5.should(Condition.visible).getText();
    }
    public void clickAccordion7(){
        accordion6.shouldBe(enabled).click();
    }
    public String getTextAnswer7(){
        return textAccordiona6.should(Condition.visible).getText();
    }
    public void clickAccordion8(){
        accordion7.shouldBe(enabled).click();
    }
    public String getTextAnswer8(){
        return textAccordiona7.should(Condition.visible).getText();
    }
    public void clickSmallButtonOrder(){
        buttonSmallOrder.click();
    }
    public void clickBigButtonOrder(){
        buttonBigOrder.click();
    }
    public void clickButtonCookie(){
        buttonCookie.click();
    }
    public String checkCookie(){return textCookieWindow.getText();}
}

