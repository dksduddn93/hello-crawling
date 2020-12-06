package hello.hellospring.jsoup;


import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class JsoupTest {

    @Test
    public void test01() throws IOException {
        String URL = "https://heodolf.tistory.com/18";

        // 2. Connection 생성
        Connection conn = Jsoup.connect(URL);

        // 3. HTML 파싱.
        Document html = conn.get(); // conn.post();

        // 4. HTML 출력
        System.out.println( html.toString() );
    }

    @Test
    public void test02() throws IOException {
        String URL = "https://heodolf.tistory.com/18";

        // 2. Connection 생성
        Connection conn = Jsoup.connect(URL);

        // 3. HTML 파싱.
        Document html = conn.get(); // conn.post();

        Elements select = html.select("#header > div > h1 > a");

        System.out.println( select );
    }
}
