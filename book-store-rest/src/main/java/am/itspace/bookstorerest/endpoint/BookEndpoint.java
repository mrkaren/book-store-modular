package am.itspace.bookstorerest.endpoint;

import am.itspace.bookstorecommon.model.Book;
import am.itspace.bookstorecommon.repository.BookRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class BookEndpoint {

    private final BookRepository bookRepository;

    @GetMapping("/api/books")
    public List<Book> getBooks() {
        return bookRepository.findTop20ByOrderByIdDesc();
    }

}
