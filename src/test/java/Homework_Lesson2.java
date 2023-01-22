import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
class Homework_Lesson2 {
    @Test
    void Homework () {
        // Откройте страницу Selenide в Github
        open("https://github.com/selenide/selenide");
        // Перейдите в раздел Wiki проекта
        $("[data-tab-item=i5wiki-tab]").click();
        // Убедитесь, что в списке страниц (Pages) есть страница Soft assertions
        $(".markdown-body").$$("ul").first().shouldHave(text("Soft assertions"));
        // Откройте страницу Soft assertions, проверьте что внутри есть пример кода для JUnit5
        $(".markdown-body").$$("ul").first().$(byText("Soft assertions")).click();
        $(".gollum-markdown-content").shouldHave(text("Using JUnit5 extend test class:"));
    }
}