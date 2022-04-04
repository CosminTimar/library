package book;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public record BookServices(BookRepository bookRepository) {

    public Book addBook(BookRegistrationRequest request){
        Book book = Book.builder()
                .name(request.name())
                .authorName(request.authorName())
                .descriptions(request.description())
                .build();
        bookRepository.save(book);

        return book;
    }

    public List<Book> getAllBooks() {
       return bookRepository.findAll();
    }

    public Book findBookById(int id) {
        return bookRepository.findBookById(id);
    }

    public Book updateBook(Book book) {
        return bookRepository.save(book);
    }
    public void deleteBook(int id){
        bookRepository.deleteBookById(id);
    }
}
