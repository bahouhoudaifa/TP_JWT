package ma.enset.security.tp_jwt.repository;

import ma.enset.security.tp_jwt.entity.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<AppUser, Long>{

    Optional<AppUser> findByEmail(String email);
    boolean existsByEmail(String email);

}