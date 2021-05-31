package com.simbirsoft.spectr.repository;

import com.simbirsoft.spectr.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
