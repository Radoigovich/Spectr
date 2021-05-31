package com.simbirsoft.spectr.repository;

import com.simbirsoft.spectr.entity.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message, Integer> {
}
