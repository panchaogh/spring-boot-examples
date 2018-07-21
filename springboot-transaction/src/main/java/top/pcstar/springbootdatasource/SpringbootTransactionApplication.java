package top.pcstar.springbootdatasource;

        import org.springframework.boot.SpringApplication;
        import org.springframework.boot.autoconfigure.SpringBootApplication;
        import org.springframework.boot.context.properties.EnableConfigurationProperties;
        import top.pcstar.springbootdatasource.config.DBConfig1;
        import top.pcstar.springbootdatasource.config.DBConfig2;

@SpringBootApplication
@EnableConfigurationProperties({DBConfig1.class, DBConfig2.class})
public class SpringbootTransactionApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootTransactionApplication.class, args);
    }
}
