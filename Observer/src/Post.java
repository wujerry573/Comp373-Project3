public class Post {
    private String name;
    private String content;
    private String datePublished;

    public Post(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setDatePublished(String datePublished) {
        this.datePublished = datePublished;
    }

    public String getName() {
        return name;
    }

    public String getContent() {
        return content;
    }

    public String getDatePublished() {
        return datePublished;
    }
}
