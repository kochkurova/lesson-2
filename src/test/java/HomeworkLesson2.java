import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
class HomeworkLesson2 {
    @Test
    void homework () {
        // Откройте страницу Selenide в Github
        open("https://github.com/selenide/selenide");
        // Перейдите в раздел Wiki проекта
        $("[data-tab-item=i5wiki-tab]").click();
        // Убедитесь, что в списке страниц (Pages) есть страница SoftAssertions
        $("[data-filterable-for=wiki-pages-filter]").$(".wiki-more-pages-link").$("button").click();
        $("[data-filterable-for=wiki-pages-filter]").shouldHave(text("SoftAssertions"));
        // Откройте страницу Soft assertions, проверьте что внутри есть пример кода для JUnit5
        $("[data-filterable-for=wiki-pages-filter]").$(byText("SoftAssertions")).click();
        $(".gollum-markdown-content").shouldHave(text("Using JUnit5 extend test class:"));
    }
}