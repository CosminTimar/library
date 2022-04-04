package book;

import org.springframework.stereotype.Service;

@Service
public record BookServices(BookRepository bookRepository) {

    public void getAllBooks(BookRegistrationRequest request){
        Book book = Book.builder()
                .name(request.name())
                .authorName(request.authorName())
                .descriptions(request.description())
                .build();
        bookRepository.save(book);
    }
}
