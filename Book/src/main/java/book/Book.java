package book;

import lombok.*;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Book {
    private String name;
    private String authorName;
    private int numberOfPages;
    private String descriptions;
    private double price;
    private LocalDate dateOfAppearance;
}
