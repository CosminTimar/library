package book;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Entity
public class Book {
    @Id
    private int id;
    private String name;
    private String authorName;
    private int numberOfPages;
    private String descriptions;
    private double price;
    private LocalDate dateOfAppearance;
}
