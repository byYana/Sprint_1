package ru.yandex.practicum;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class OrderPageScooterElements {

    public static final String ORDER_CONFIRMATION = "Заказ оформлен";

// локатор текста Для кого самокат
    @FindBy(how = How.CLASS_NAME,using = "Order_Header__BZXOb")
    private SelenideElement textOrder;
    // локатор поля Имя
    @FindBy(how = How.XPATH,using = ".//input[@placeholder='* Имя']")
    private SelenideElement name;
    // локатор поля Фамилия
    @FindBy(how = How.XPATH,using = ".//input[@placeholder='* Фамилия']")
    private SelenideElement surname;
    // локатор поля Адрес: куда привезти заказ
    @FindBy(how = How.XPATH,using = ".//input[@placeholder='* Адрес: куда привезти заказ']")
    private SelenideElement address;
    // локатор поля Станция метро
    @FindBy(how = How.XPATH,using = ".//input[@placeholder='* Станция метро']")
    private SelenideElement metro;
    // локатор поля Телефон
    @FindBy(how = How.XPATH,using = ".//input[@placeholder='* Телефон: на него позвонит курьер']")
    private SelenideElement telephone;
    // локатор кнопки Далее
    @FindBy(how = How.XPATH,using = ".//div[@class='Order_NextButton__1_rCA']/button[text()='Далее']")
    private SelenideElement buttonNext;
    // локатор текста Error поля Имя
    @FindBy(how = How.XPATH,using = ".//div[text()='Введите корректное имя']")
    private SelenideElement nameError;
    // локатор текста Error поля Фамилия
    @FindBy(how = How.XPATH,using = ".//div[text()='Введите корректную фамилию']")
    private SelenideElement surnameError;
    // локатор  текста Error поля Адрес. Поле есть, но не работает :)
    @FindBy(how = How.XPATH,using = ".//div[text()='Введите корректный адрес']")
    private SelenideElement addressError;
    // локатор  текста Error поля Метро
    @FindBy(how = How.CLASS_NAME,using = "select-search__input")
    private SelenideElement metroError;
    // локатор текста Error поля telephone
    @FindBy(how = How.XPATH,using = ".//div[text()='Введите корректный номер']")
    private SelenideElement telephoneError;
    // локатор элемента станции метро
    @FindBy(how = How.XPATH,using = ".//button[@class='Order_SelectOption__82bhS select-search__option']/div[@class='Order_Text__2broi']")
    private SelenideElement elementMetro;


// Про аренду
    // локатор текста Про аренду
    @FindBy(how = How.CLASS_NAME,using = "Order_Header__BZXOb")
    private SelenideElement textRent;
    // локатор кнопки Назад
    @FindBy(how = How.CLASS_NAME,using = "Button_Button__ra12g Button_Middle__1CSJM Button_Inverted__3IF-i")
    private SelenideElement buttonBack;
    // локатор кнопки Заказать
    @FindBy(how = How.XPATH,using = ".//div[@class='Order_Buttons__1xGrp']/button[text()='Заказать']")
    private SelenideElement buttonOrder;
    // локатор поля Когда пиривезти самокат
    @FindBy(how = How.XPATH,using = ".//input[@placeholder='* Когда привезти самокат']")
    private SelenideElement when;
    // локатор поля Срок аренды
    @FindBy(how = How.CLASS_NAME,using = "Dropdown-control")
    private SelenideElement rentTime;
    // локатор текст поля выбора цвета самоката
    @FindBy(how = How.CLASS_NAME,using = "Order_Title__3EKne")
    private SelenideElement textScooterColor;
    // локатор чекбокса черный жемчуг
    @FindBy(how = How.XPATH,using = ".//label[@for='black']")
    private SelenideElement blackCheckbox;
    // локатор чекбокса серая безысходность
    @FindBy(how = How.XPATH,using = ".//label[@for='grey']")
    private SelenideElement greyCheckbox;
    // локатор поля Комментарий для курьера
    @FindBy(how = How.XPATH,using = ".//input[@placeholder='Комментарий для курьера']")
    private SelenideElement comment;
    // локатор элемента срока аренды
    @FindBy(how = How.XPATH,using = ".//div[@class='Dropdown-menu']/div[text()='сутки']")
    private SelenideElement elementRental;

    // локатор окна Хотите оформить заказ?
    @FindBy(how = How.CLASS_NAME,using = "Order_Modal__YZ-d3")
    private SelenideElement orderWindow;
    // локатор текста окна Хотите оформить заказ?
    @FindBy(how = How.CLASS_NAME,using = "Order_ModalHeader__3FDaJ")
    private SelenideElement textOrderWindow;
    // локатор кнопки Нет
    @FindBy(how = How.LINK_TEXT,using = "Нет")
    private SelenideElement buttonNo;
    // локатор кнопки Да
    @FindBy(how = How.XPATH,using = ".//div[@class='Order_Buttons__1xGrp']//button[text()='Да']")
    private SelenideElement buttonYes;

    // локатор текста Заказ оформлен
    @FindBy(how = How.CLASS_NAME,using = "Order_ModalHeader__3FDaJ")
    private SelenideElement textOrderRegistation;
    // локатор кнопки Посмотреть статус
    @FindBy(how = How.XPATH,using = ".//button[text()='Посмотреть статус']")
    private SelenideElement buttonStatus;

    public OrderPageScooterElements() {
    }


    public void orderStep1(String newName, String newSurname, String newAddress, String newMetro, String newTelefone){
        textOrder.should(Condition.exist);
        name.setValue(newName);
        surname.setValue(newSurname);
        address.setValue(newAddress);
        metro.setValue(newMetro);
        elementMetro.click();
        telephone.setValue(newTelefone);
        buttonNext.click();

    }

    public void orderStep2(String newWhen, String newComment){
        textRent.should(Condition.exist);
        when.setValue(newWhen).sendKeys(Keys.ENTER);
        rentTime.click();
        elementRental.click();
        blackCheckbox.click();
        comment.setValue(newComment);
        buttonOrder.click();
    }
    public void orderStep3(){
        textOrderWindow.should(Condition.exist);
        buttonYes.click();
    }
    public String getTextOrderRegistation(){
        return textOrderRegistation.getText();
    }


}
