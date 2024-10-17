package guru.springframework.srping5webapp.repositories;

import guru.springframework.srping5webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}
