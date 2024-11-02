package dev.abhisek.webhooks_springboot.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.abhisek.webhooks_springboot.entities.SchoolData;

public interface SchoolDataRepository extends JpaRepository<SchoolData, Integer> {

}
