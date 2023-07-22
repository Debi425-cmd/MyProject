package Repository;

import EntityClass.Employee;

public interface jpaRepository<T, T1> {
    Employee save(Employee employee);

}
