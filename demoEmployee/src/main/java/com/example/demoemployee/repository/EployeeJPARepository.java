package com.example.demoemployee.repository;

import com.example.demoemployee.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EployeeJPARepository extends JpaRepository<Employee, Integer> {
}
