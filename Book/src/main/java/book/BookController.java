package book;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/book")
public record BookController(BookServices bookServices) {

    @GetMapping("/all")
    public List<Book> getAllBooks() {
        return bookServices.getAllBooks();
    }
}
