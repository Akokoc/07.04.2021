package telran.items;

public class WebSite extends NewsPortal{
    String  author;

    public WebSite(String name, String url, String author) {
        super(name, url);
        this.author = author;
    }

    public WebSite(){

    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
