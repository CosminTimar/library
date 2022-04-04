package book;

public record BookRegistrationRequest(
        String name,
        String authorName,
        String description
) {
}
