package com.microservicesample.department.service;

import com.microservicesample.department.entity.Department;
import com.microservicesample.department.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;

    public Department saveDepartment(Department department) {
        log.info("inside saveDepartment method od DepartmentService");
       return departmentRepository.save(department);
    }

    public Department findDepartmentById(Long departmentId) {
        log.info("inside finDepartmentById method od DepartmentService");
        return departmentRepository.findByDepartmentId(departmentId);
    }
}
