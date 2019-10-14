package linhVu.model;

import javax.persistence.*;

@Entity
@Table(name="blogs")
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String description;
    private String content;
    private String dateCreate;
    @ManyToOne
//    @JoinColumn(name = "category_id") - xác định khóa ngoại, nếu có nhiều bảng thì không nên để khóa ngoại.
    private Category category;

    public Blog() {
    }

    public Blog(String title, String description, String content, String dateCreate) {
        this.title = title;
        this.description = description;
        this.content = content;
        this.dateCreate = dateCreate;
    }

    public Blog(Long id, String title, String description, String content, String dateCreate) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.content = content;
        this.dateCreate = dateCreate;
    }

    public Blog(String title, String description, String content, String dateCreate, Category category) {
        this.title = title;
        this.description = description;
        this.content = content;
        this.dateCreate = dateCreate;
        this.category = category;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(String dateCreate) {
        this.dateCreate = dateCreate;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Blog{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", content='" + content + '\'' +
                ", dateCreate='" + dateCreate + '\'' +
                '}';
    }
}
