package NOSQL_MongoDB_HW.repository;

import NOSQL_MongoDB_HW.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

    // Find by exact name
    List<User> findByName(String name);

    // Find by name containing (case-insensitive)
    List<User> findByNameContainingIgnoreCase(String name);

    // Find by email
    Optional<User> findByEmail(String email);

    // Find by age greater than
    List<User> findByAgeGreaterThan(Integer age);

    // Find by age less than
    List<User> findByAgeLessThan(Integer age);

    // Find by age between
    List<User> findByAgeBetween(Integer minAge, Integer maxAge);

    // Check if email exists
    boolean existsByEmail(String email);
}