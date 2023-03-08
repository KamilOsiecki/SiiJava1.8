package org.example;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class UtilTest {

    public static Stream<Arguments> dataProvider() {
        return Stream.of(
                Arguments.of("Rozwiązania i usługi IT, inżynierii i BPO - Sii Polska", "https://www.sii.pl"),
                Arguments.of("Onet – Jesteś na bieżąco", "http://www.onet.pl/"),
                Arguments.of("Kotuszkowo- blog o kotach", "http://www.kotuszkowo.pl/"),
                Arguments.of("Filmweb - filmy takie jak Ty!", "http://www.filmweb.pl/"),
                Arguments.of("WebDriver | Selenium", "https://www.selenium.dev/documentation/en/webdriver/")
        );
    }
}