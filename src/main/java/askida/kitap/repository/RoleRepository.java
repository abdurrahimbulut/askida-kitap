package askida.kitap.repository;

import askida.kitap.model.Role;
import org.hibernate.validator.constraints.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import askida.kitap.model.ERole;
import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, UUID> {
    Optional<Role> findByName(ERole name);
}
