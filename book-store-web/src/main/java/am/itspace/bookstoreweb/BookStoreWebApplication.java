package am.itspace.bookstoreweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.persistence.Entity;

@SpringBootApplication
@ComponentScan(basePackages = {"am.itspace.bookstoreweb.*", "am.itspace.bookstorecommon.*"})
@EntityScan(basePackages = "am.itspace.bookstorecommon.*")
@EnableJpaRepositories(basePackages = "am.itspace.bookstorecommon.*")
public class BookStoreWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookStoreWebApplication.class, args);
    }

}
