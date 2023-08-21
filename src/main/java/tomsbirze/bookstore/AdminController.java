package tomsbirze.bookstore;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import tomsbirze.bookstore.domain.Book;

@RestController
@RequestMapping("/admin")
@CrossOrigin(origins = "http://localhost:5173")
public class AdminController {

    private final BookstoreService bookstoreService;

    public AdminController(BookstoreService bookstoreService) {
        this.bookstoreService = bookstoreService;
    }

    @PutMapping("/addbook")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveBook(@Valid @RequestBody Book book) {
        bookstoreService.saveBook(book);
    }

    @DeleteMapping("/clearbooks")
    public void clearBooks() {
        bookstoreService.clearBooks();
    }
}
