package book;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServices {

    public List<Book> getAllBooks(){

        return List.of(Book.builder()
                .authorName("Marius")
                .name("Chiar el")
                .build()
        );
    }
}
