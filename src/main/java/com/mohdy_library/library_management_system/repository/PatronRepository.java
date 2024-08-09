package com.mohdy_library.library_management_system.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mohdy_library.library_management_system.model.Patron;

public interface PatronRepository extends JpaRepository<Patron, Long> {

}
