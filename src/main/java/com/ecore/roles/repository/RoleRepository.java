package com.ecore.roles.repository;

import com.ecore.roles.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface RoleRepository extends JpaRepository<Role, UUID> {
    Optional<Role> findByUserIdAndTeamId(UUID userId, UUID teamId);

    Optional<Role> findByName(String name);
}
