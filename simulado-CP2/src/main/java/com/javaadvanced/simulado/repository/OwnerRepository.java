package com.javaadvanced.simulado.repository;

import com.javaadvanced.simulado.entity.Owner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Optional;

@Repository
public interface OwnerRepository extends JpaRepository<Owner,Integer> {

    Optional<Owner> findById(Long aLong);

    Collection<Owner> findByNameNot(String name);

    Optional<Owner> findByName(String name);

    @Query(nativeQuery = true, value= "SELECT * FROM owners WHERE email = :email")
    Optional<Owner> findByEmail(String email);

}