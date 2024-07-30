package com.example.ESUNBANKBackend.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.ESUNBANKBackend.entity.Employee;

@Repository
public interface EmployeeDao extends JpaRepository<Employee,Long>{

    @Query("SELECT r FROM Employee r WHERE "
    + "(:emp_id IS null OR r.emp_id = :emp_id) AND"
    + "(:name IS NULL OR r.name LIKE %:name%)")
    public List<Employee> findEmployee(
        @Param("emp_id") Long emp_id,
        @Param("name") String name
    );

    public Optional<Employee> findByFloorSeatSeq(Long floorSeatSeq);
}
