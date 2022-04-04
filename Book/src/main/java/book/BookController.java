package book;

import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(path = "/api/v1/book")
public record BookController(BookServices bookServices) {

    @PostMapping
    public void registerBook(@RequestBody BookRegistrationRequest book) {
        bookServices.registerBook(book);
    }

    @GetMapping("/all")
    public List<Book> getAllBooks(){
       return bookServices.getAllBooks();
    }

    @GetMapping(value = "/{id}")
    public Book getBookById(@PathVariable int id){
        return bookServices.getBookById(id);
    }
}
