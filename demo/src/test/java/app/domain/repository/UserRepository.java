package app.domain.repository;

import app.domain.model.user.User;
import java.util.Optional;

public interface UserRepository {
    void save(User user);
    Optional<User> findById(String id);
}
