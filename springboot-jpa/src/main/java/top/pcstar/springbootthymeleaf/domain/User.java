package top.pcstar.springbootthymeleaf.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @Author: PanChao
 * @Description: User实体类
 * @Date: Created in 16:10 2018/6/1
 */
@Entity //实体
public class User {
    @Id //主键
    @GeneratedValue(strategy = GenerationType.IDENTITY) //自增策略
    private Long id; // 用户的唯一标识
    private String name;
    private String email;

    protected User() { //无参构造器设置为protected，防止直接使用
    }

    public User(Long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
