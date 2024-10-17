package guru.springframework.srping5webapp.repositories;

import guru.springframework.srping5webapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
