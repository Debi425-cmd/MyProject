package Service;

import EntityClass.Employee;
import InfoClass.EmployeeInfo;
import Repository.EmployeeRepository;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Slf4j
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public Employee createEmployee(EmployeeInfo employeeInfo) {
        Employee employee = new Employee();
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.map(employeeInfo, employee);
        employee = employeeRepository.save(employee);
        return employee;
    }

}
