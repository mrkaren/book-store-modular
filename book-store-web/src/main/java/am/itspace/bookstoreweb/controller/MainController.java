package am.itspace.bookstoreweb.controller;

import am.itspace.bookstorecommon.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @Autowired
    private BookRepository bookRepository;

    @GetMapping("/")
    public String mainPage() {
        return "main";
    }

}
