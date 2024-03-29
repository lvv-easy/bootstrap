package project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.entity.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

    public Role findRoleByRole(String role);
}
