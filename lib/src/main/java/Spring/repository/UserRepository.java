package Spring.repository;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringApplication;

public interface UserRepository
{
	@Repository
	public interface UserRepository extends CrudRepository<User, Long> {}

}
