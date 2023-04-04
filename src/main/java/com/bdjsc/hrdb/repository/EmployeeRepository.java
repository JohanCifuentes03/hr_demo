package com.bdjsc.hrdb.repository;

import com.bdjsc.hrdb.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {

}
