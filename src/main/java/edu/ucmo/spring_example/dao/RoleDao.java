package edu.ucmo.spring_example.dao;

import edu.ucmo.spring_example.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleDao extends JpaRepository<Role, Integer> {
    Role findByRole(String role);

}
