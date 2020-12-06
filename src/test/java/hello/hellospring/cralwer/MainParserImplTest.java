package hello.hellospring.cralwer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MainParserImplTest {

    /*
    TEST 코드 작성방법
    BDD 스타일로 작성합니다.

    GIVEN 주어진 환경
    WHEN 어떤 값이 주어졌을 때
    THEN 그 결과가 이렇게 되어야 한다.
     */

    @Test
    void 링크가_2개_이상_잇을때_2개의_리스트를_반환한다() {
        // GIVEN
        String testHtml = "<html>\n" +
                "<body>\n" +
                "    <a href=\"https://www.naver.com\">LINK</a>\n" +
                "    <a href=\"https://www.google.com\">LINK</a>\n" +
                "</body>>\n" +
                "\n" +
                "</html>";
        List<String> resultLinks = Arrays.asList("https://www.naver.com", "https://www.google.com");
        MainParser p = new MainParserImpl();

        // WHEN
        List<String> testResult = p.getAllHref(testHtml);

        // THEN
        Assertions.assertEquals(resultLinks, testResult);
    }

    @Test
    @DisplayName("링크가_0개_있을때_빈_리스트를_반환한다")
    void test03() {
        // GIVEN
        String testHtml = "<html>\n" +
                "<body>\n" +
                "</body>>\n" +
                "\n" +
                "</html>";
        List<String> resultLinks = Collections.emptyList();
        MainParser p = new MainParserImpl();

        // WHEN
        List<String> testResult = p.getAllHref(testHtml);

        // THEN
        assert testResult.isEmpty();
    }
    /*
    테스트의 기본은 항상 경계조건을 테스트 합니다.
    테스트 하다 보면 input이 String인 얘는 어떻게 테스트하지? 10개 짜면 내가 모든 케이스를 커버할 수 있는것일까?
    (String s) => Integer;
    인풋에 들어올 수 있는 모든 케이스를 테스트 할 수 있는가? (테스트 커버리지와 관련이 있다)

    return이 void인 함수는 테스트 가능한가?
     */
}