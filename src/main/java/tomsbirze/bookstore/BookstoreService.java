package tomsbirze.bookstore;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import tomsbirze.bookstore.domain.Book;


import java.util.List;

@Service
public class BookstoreService {
    private final BookstoreRepository bookstoreRepository;

    public BookstoreService(BookstoreRepository bookstoreRepository) {
        this.bookstoreRepository = bookstoreRepository;
    }

    public void saveBook(Book book) {
        if (bookstoreRepository.existsByTitle(book.getTitle())) {
            throw new ResponseStatusException(HttpStatus.CONFLICT, "A book with that title already exists.");
        }
        bookstoreRepository.save(book);
    }

    public void clearBooks() {
        bookstoreRepository.deleteAll();
    }

    public List<Book> getBooksSubset(int pageNo, int pageSize) {
        Sort sort = Sort.by(Sort.Order.desc("id"));
        Pageable pageable = PageRequest.of(pageNo, pageSize, sort);
        Page<Book> bookPage = bookstoreRepository.findAll(pageable);
        return bookPage.getContent();
    }
}
