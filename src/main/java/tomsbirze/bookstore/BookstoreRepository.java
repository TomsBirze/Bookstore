package tomsbirze.bookstore;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tomsbirze.bookstore.domain.Book;

@Repository
public interface BookstoreRepository extends JpaRepository<Book, Integer> {
    boolean existsByTitle(String title);

}
