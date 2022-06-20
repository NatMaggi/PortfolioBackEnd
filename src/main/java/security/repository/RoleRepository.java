
package security.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import security.enums.RoleName;
import security.model.Role;


public interface RoleRepository extends JpaRepository<Role, Integer> {
    Optional<Role> findByRoleName(RoleName roleName);
}

