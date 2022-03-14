package junit;//prod brunch

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class Les11TestForGroup extends TestBase {
    @Test
    void foundReviews() {
        step("Open page yandex.ru", ()-> {
            open("https://yandex.ru/");
        });
        step("Click in input", ()-> {
            $("input#text").click();
        });
        step("Write text 'Ikea'", ()-> {
            $("input#text").setValue("ikea");
        });
        step("Click button 'Search'", ()-> {
            $(".search2__button").$("button").click();
        });
        step("Composite block should have 'Reviews' ", ()-> {
            $("div .reviews").shouldHave(Condition.text("Отзывы"));
        });
    }
}

