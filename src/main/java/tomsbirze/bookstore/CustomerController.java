package tomsbirze.bookstore;

import org.springframework.web.bind.annotation.*;
import tomsbirze.bookstore.domain.Book;

import java.util.List;


@RestController
@RequestMapping("/customer")
@CrossOrigin
public class CustomerController {
    private final BookstoreService bookstoreService;

    public CustomerController(BookstoreService bookstoreService) {
        this.bookstoreService = bookstoreService;
    }

    @GetMapping("/books")
    public List<Book> getBooks(
            @RequestParam(value = "pageNo", defaultValue = "0", required = false) int pageNo,
            @RequestParam(value = "pageSize", defaultValue = "50", required = false) int pageSize
    ){
        return bookstoreService.getBooksSubset(pageNo, pageSize);
    }
}
