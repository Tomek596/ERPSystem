package com.tomq.ERPSystem.repository;

import com.tomq.ERPSystem.entity.Operator;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface OperatorRepository extends JpaRepository<Operator, Long> {

    Optional<Operator> findByLogin(String login);

}
