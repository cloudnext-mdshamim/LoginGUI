package net.javaguides.springboot.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.javaguides.springboot.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	
}