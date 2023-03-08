package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@Execution(ExecutionMode.CONCURRENT)
public class TitleTest extends BaseTest {

    @ParameterizedTest(name = "{arguments}")
    @MethodSource("org.example.UtilTest#dataProvider")
    @Tag("Regression")
    @DisplayName("Validate correct page title")
    void shouldValidateCorrectTitle(String expectedTitle, String url) {
        //GIVEN
        driver.get(url);
        //WHEN
        String actualTitle = driver.getTitle();
        //THEN
        assertThat(actualTitle).isEqualTo(expectedTitle);
    }
}