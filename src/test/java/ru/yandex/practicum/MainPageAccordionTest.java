package ru.yandex.practicum;

import com.codeborne.selenide.Configuration;
import org.junit.Before;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;
import static org.junit.Assert.assertTrue;

public class MainPageAccordionTest {
    // Открываем наши тесты в firefox
    @Before
    public void setup() {
        Configuration.browser = "firefox";
    }

    @Test
    public void questionList1() {
        MainPageScooterElements question1 = open(MainPageScooterElements.URL_MAIN, MainPageScooterElements.class);
        question1.clickAccordion1();
        String answer1 = question1.getTextAnswer1();
        assertTrue(answer1.equals(question1.ANSWER_1));
    }

    @Test
    public void questionList2() {
        MainPageScooterElements question2 = open(MainPageScooterElements.URL_MAIN, MainPageScooterElements.class);
        question2.clickAccordion2();
        String answer2 = question2.getTextAnswer2();
        assertTrue(answer2.equals(question2.ANSWER_2));
    }

    @Test
    public void questionList3() {
        MainPageScooterElements question3 = open(MainPageScooterElements.URL_MAIN, MainPageScooterElements.class);
        question3.clickAccordion3();
        String answer3 = question3.getTextAnswer3();
        System.out.println(answer3);
        assertTrue(answer3.equals(question3.ANSWER_3));
    }

    @Test
    public void questionList4() {
        MainPageScooterElements question4 = open(MainPageScooterElements.URL_MAIN, MainPageScooterElements.class);
        question4.clickAccordion4();
        String answer4 = question4.getTextAnswer4();
        System.out.println(answer4);
        assertTrue(answer4.equals(question4.ANSWER_4));
    }

    @Test
    public void questionList5() {
        MainPageScooterElements question5 = open(MainPageScooterElements.URL_MAIN, MainPageScooterElements.class);
        question5.clickAccordion5();
        String answer5 = question5.getTextAnswer5();
        assertTrue(answer5.equals(question5.ANSWER_5));
    }

    @Test
    public void questionList6() {
        // открываем страницу и создаётся экземпляр класса страницы
        MainPageScooterElements question6 = open(MainPageScooterElements.URL_MAIN, MainPageScooterElements.class);
        question6.clickAccordion6();
        String answer6 = question6.getTextAnswer6();
        assertTrue(answer6.equals(question6.ANSWER_6));
    }

    @Test
    public void questionList7() {
        // открываем страницу и создаётся экземпляр класса страницы
        MainPageScooterElements question7 = open(MainPageScooterElements.URL_MAIN, MainPageScooterElements.class);
        question7.clickAccordion7();
        String answer7 = question7.getTextAnswer7();
        assertTrue(answer7.equals(question7.ANSWER_7));
    }

    @Test
    public void questionList8() {
        // открываем страницу и создаётся экземпляр класса страницы
        MainPageScooterElements question8 = open(MainPageScooterElements.URL_MAIN, MainPageScooterElements.class);
        question8.clickAccordion8();
        String answer8 = question8.getTextAnswer8();
        assertTrue(answer8.equals(question8.ANSWER_8));
    }
}

