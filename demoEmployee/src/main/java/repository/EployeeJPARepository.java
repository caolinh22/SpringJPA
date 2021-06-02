package repository;

import entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EployeeJPARepository extends JpaRepository<Employee, Integer> {
}
