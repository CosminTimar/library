package book;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public record BookServices(BookRepository bookRepository) {

    public void registerBook(BookRegistrationRequest request){
        Book book = Book.builder()
                .name(request.name())
                .authorName(request.authorName())
                .descriptions(request.description())
                .build();
        bookRepository.save(book);
    }

    public List<Book> getAllBooks() {
       return bookRepository.findAll();
    }

    public Book getBookById(int id) {
        return bookRepository.getById(id);
    }
}
