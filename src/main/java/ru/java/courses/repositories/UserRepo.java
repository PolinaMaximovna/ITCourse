package ru.java.courses.repositories;

import org.springframework.data.repository.CrudRepository;
import ru.java.courses.domain.User;

public interface UserRepo extends CrudRepository<User, Long> {
}
