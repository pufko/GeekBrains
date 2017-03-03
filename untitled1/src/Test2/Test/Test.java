package Test2.Test;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) throws IOException {
        List<Article> articleList = new ArrayList<>();
        Document doc = Jsoup.connect("http://www.gearbest.com/temperature-control-mods/pp_594262.html").get();
        Elements url = doc.getElementsByAttribute("orgp");
        String name = url.get(1).attr("orgp");

        System.out.println(url);
        System.out.println(name);
//
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
