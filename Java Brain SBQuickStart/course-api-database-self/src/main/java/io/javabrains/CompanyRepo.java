package io.javabrains;

import org.springframework.data.jpa.repository.JpaRepository;

import io.javabrains.entity.Company;

public interface CompanyRepo extends JpaRepository<Company, Integer> {

}
