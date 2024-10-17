package guru.springframework.srping5webapp.repositories;

import guru.springframework.srping5webapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
