package com.springframework.mypetclinic.repositories;

import com.springframework.mypetclinic.model.Specialty;
import org.springframework.data.repository.CrudRepository;

public interface SpecialityRepository extends CrudRepository<Specialty, Long> {
}
