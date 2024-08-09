package com.mohdy_library.library_management_system.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mohdy_library.library_management_system.model.Patron;
import com.mohdy_library.library_management_system.repository.PatronRepository;

@Service
public class PatronService {
    @Autowired
    private PatronRepository patronRepository;

    public List<Patron> getAllPatron() {
        return patronRepository.findAll();
    }
}
