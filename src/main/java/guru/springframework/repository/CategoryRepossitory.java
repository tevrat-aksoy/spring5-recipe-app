package guru.springframework.repository;

import guru.springframework.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepossitory extends CrudRepository<Category,Long> {
}
