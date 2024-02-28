package org.ctrlacv.service;

import org.ctrlacv.dto.EmployeeDTO;
import org.ctrlacv.dto.EmployeeLoginDTO;
import org.ctrlacv.dto.EmployeePageQueryDTO;
import org.ctrlacv.entity.Employee;
import org.ctrlacv.result.PageResult;

public interface EmployeeService {

    /**
     * 员工登录
     * @param employeeLoginDTO
     * @return
     */
    Employee login(EmployeeLoginDTO employeeLoginDTO);

    void save(EmployeeDTO employeeDTO);

    PageResult pageQuery(EmployeePageQueryDTO employeePageQueryDTO);

    void startOrStop(Long id, Integer status);

    Employee getById(Long id);

    void update(EmployeeDTO employeeDTO);
}
