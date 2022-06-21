
package com.ap.portfolio.security.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.ap.portfolio.security.enums.RoleName;
import com.ap.portfolio.security.model.Role;


public interface RoleRepository extends JpaRepository<Role, Integer> {
    Optional<Role> findByRoleName(RoleName roleName);
}

