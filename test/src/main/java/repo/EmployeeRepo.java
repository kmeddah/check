package repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {
	public void deleteEmployeeById(Long id);

	Optional<Employee> findEmployeeById(Long id);
	
}
