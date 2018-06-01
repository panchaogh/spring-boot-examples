package top.pcstar.springbootthymeleaf.domain;

/**
 * @Author: PanChao
 * @Description: User实体类
 * @Date: Created in 16:10 2018/6/1
 */
public class User {
    private long id; // 用户的唯一标识
    private String name;
    private String email;
    public User(){

    }
    public User(long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
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
