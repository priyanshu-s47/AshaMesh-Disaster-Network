package com.ashamesh.sosservice.repository;

import com.ashamesh.sosservice.model.SosCall;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface SosCallRepository extends JpaRepository<SosCall , Long> {


}
