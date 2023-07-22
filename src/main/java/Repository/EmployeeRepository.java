package Repository;

import EntityClass.Employee;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends jpaRepository<Employee,Long>{

}
