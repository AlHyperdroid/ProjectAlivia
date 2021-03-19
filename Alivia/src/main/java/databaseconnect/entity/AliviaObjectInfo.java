package databaseconnect.entity;

public class AliviaObjectInfo {

    private int id;
    private String source_name;
    private String url;
    private String description;
    private String img;

    public AliviaObjectInfo() {
    }

    public AliviaObjectInfo(int id, String source_name, String url, String description, String img) {
        this.id = id;
        this.source_name = source_name;
        this.url = url;
        this.description = description;
        this.img = img;

    }

    public AliviaObjectInfo(int id, String source_name, String url, String description) {
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.url = img;
    }

    @Override
    public String toString() {
        return "PhotoSites{" +
                "id=" + id +
                ", source_name='" + source_name + '\'' +
                ", url='" + url + '\'' +
                ", description='" + description + '\'' +
                ", img='" + img + '\'' +
                '}';
    }
}

