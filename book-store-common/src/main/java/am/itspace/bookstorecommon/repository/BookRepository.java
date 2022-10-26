package am.itspace.bookstorecommon.repository;

import am.itspace.bookstorecommon.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Integer> {

    List<Book> findTop20ByOrderByIdDesc();

}
