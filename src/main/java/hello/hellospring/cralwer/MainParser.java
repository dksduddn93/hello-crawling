package hello.hellospring.cralwer;

import java.util.List;

/*
이 인터페이스는 페이지를 방문해서 그 페이지에 모든 <a href> 링크를 list의 형태로 반환하는 functional interface입니다.
(String html) => List<String>
 */
interface MainParser {
    List<String> getAllHref(String html);
}
