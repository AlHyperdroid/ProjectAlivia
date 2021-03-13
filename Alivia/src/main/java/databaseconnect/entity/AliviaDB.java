package databaseconnect.entity;

public class AliviaDB {

    private int id;
    private String source_name;
    private String url;
    private String tag;

    public AliviaDB() {
    }

    public AliviaDB(int id, String source_name, String url, String tag) {
        this.id = id;
        this.source_name = source_name;
        this.url = url;
        this.tag = tag;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSource_name() {
        return source_name;
    }

    public void setSource_name(String source_name) {
        this.source_name = source_name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    @Override
    public String toString() {
        return "PhotoSites{" +
                "id=" + id +
                ", source_name='" + source_name + '\'' +
                ", url='" + url + '\'' +
                ", tag='" + tag + '\'' +
                '}';
    }
}

