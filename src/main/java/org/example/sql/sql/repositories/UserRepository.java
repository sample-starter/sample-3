package org.example.example.sql.repositories;

import org.example.example.sql.entities.User;
import org.example.springframework.data.jpa.repository.JpaRepository;
import org.example.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
