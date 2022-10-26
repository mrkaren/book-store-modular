package am.itspace.bookstorerest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"am.itspace.bookstorerest.*", "am.itspace.bookstorecommon.*"})
@EntityScan(basePackages = "am.itspace.bookstorecommon.*")
@EnableJpaRepositories(basePackages = "am.itspace.bookstorecommon.*")
public class BookStoreRestApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookStoreRestApplication.class, args);
    }

}
