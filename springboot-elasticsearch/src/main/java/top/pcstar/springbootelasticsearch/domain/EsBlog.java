package top.pcstar.springbootelasticsearch.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.io.Serializable;

/**
 * @Author: PanChao
 * @Description: Blog文档
 * @Date: Created in 10:36 2018/6/3
 */
@Document(indexName = "blog",type = "blog") //主键
public class EsBlog implements Serializable {
    public static final long seriaVersionUID = 1L;
    @Id //文档
    private String id; //id
    private String title; //标题
    private String summary; //摘要
    private String content; //正文

    public EsBlog() { //JPA规范要求，防止直接使用

    }

    public EsBlog(String title, String summary, String content) {
        this.title = title;
        this.summary = summary;
        this.content = content;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "EsBlog{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", summary='" + summary + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
