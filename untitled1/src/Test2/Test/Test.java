package Test2.Test;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) throws IOException {
        List<Article> articleList = new ArrayList<>();
        Document doc = org.jsoup.Jsoup.connect("http://www.gearbest.com/temperature-control-mods/pp_594262.html").get();
        Elements bElements = doc.getElementsByAttributeValue("class", "my_shop_price");

        bElements.forEach(bElement -> {
            Element Element = bElement.child(0);
            String url = Element.attr("orgp");
            String name = Element.attr("orgp");

            articleList.add(new Article(url, name));
        });
        articleList.forEach(System.out::println);

    }
}

class Article {
    private String url;
    private String name;

    public Article(String url, String name) {
        this.url = url;
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public String getName() {
        return name;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Article{" +
                "url='" + url + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
