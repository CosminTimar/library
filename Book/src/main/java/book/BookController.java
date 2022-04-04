package book;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(path = "/api/v1/book")
public record BookController(BookServices bookServices) {

    @PostMapping
    public ResponseEntity<Book> addBook(@RequestBody BookRegistrationRequest book) {
        Book newBook = bookServices.addBook(book);
        return new ResponseEntity<>(newBook, HttpStatus.CREATED);

    }

    @GetMapping("/all")
    public ResponseEntity<List<Book>> getAllBooks(){
       List<Book> bookList = bookServices.getAllBooks();
       return new ResponseEntity<>(bookList,HttpStatus.OK);
    }

    @GetMapping("/getById/{id}")
    public ResponseEntity<Book> getBookById(@PathVariable("id") int id){
        Book book = bookServices.findBookById(id);
        return new ResponseEntity<>(book,HttpStatus.FOUND);
    }

    @PostMapping("/update")
    public ResponseEntity<Book> updateBook(@RequestBody Book book){
        Book updateBook = bookServices.updateBook(book);
        return new ResponseEntity<>(updateBook,HttpStatus.OK);
    }
}
