package point.repository;

import org.springframework.data.repository.CrudRepository;

import point.model.UserRecord;

public interface UserRepository extends CrudRepository<UserRecord, String>{

}
