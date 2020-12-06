package hello.hellospring.cralwer;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainParserImpl implements MainParser {
    @Override
    public List<String> getAllHref(String html) {
        Document parse = Jsoup.parse(html);
        Elements aList = parse.getElementsByTag("a");

        List<String> parserResultList = new ArrayList<String>();

        for (org.jsoup.nodes.Element a : aList) {
            String href = a.attr("href");
            parserResultList.add(href);
        }

        return parserResultList;
    }
}
