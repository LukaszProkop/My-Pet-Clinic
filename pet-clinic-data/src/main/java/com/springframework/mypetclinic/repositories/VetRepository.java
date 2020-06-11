package com.springframework.mypetclinic.repositories;

import com.springframework.mypetclinic.model.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetRepository extends CrudRepository<Vet, Long> {
}
