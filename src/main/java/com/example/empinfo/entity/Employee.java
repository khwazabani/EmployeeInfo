package com.example.empinfo.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;

@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "emp_id")
    @Schema(description = "Auto-generated employee id", accessMode = Schema.AccessMode.READ_ONLY, example = "1")
    private Long empId;

    @NotBlank(message = "empName is required")
    @Column(name = "emp_name", nullable = false, length = 100)
    @Schema(example = "Asha Rao")
    private String empName;

    @NotBlank(message = "empDesignation is required")
    @Column(name = "emp_designation", nullable = false, length = 100)
    @Schema(example = "Software Engineer")
    private String empDesignation;

    @NotNull(message = "empSalary is required")
    @PositiveOrZero(message = "empSalary must not be negative")
    @Column(name = "emp_salary", nullable = false)
    @Schema(example = "750000.00")
    private Double empSalary;

    public Employee() {
    }

    public Employee(Long empId, String empName, String empDesignation, Double empSalary) {
        this.empId = empId;
        this.empName = empName;
        this.empDesignation = empDesignation;
        this.empSalary = empSalary;
    }

    public Long getEmpId() {
        return empId;
    }

    public void setEmpId(Long empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpDesignation() {
        return empDesignation;
    }

    public void setEmpDesignation(String empDesignation) {
        this.empDesignation = empDesignation;
    }

    public Double getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(Double empSalary) {
        this.empSalary = empSalary;
    }
}
