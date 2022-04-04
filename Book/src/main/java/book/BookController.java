package book;

import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(path = "/api/v1/book")
public record BookController(BookServices bookServices) {

    @PostMapping
    public void getAllBooks(@RequestBody BookRegistrationRequest book) {
        bookServices.getAllBooks(book);
    }
}
