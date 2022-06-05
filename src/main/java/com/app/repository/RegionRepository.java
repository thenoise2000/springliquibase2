package com.app.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.domain.Region;

public interface RegionRepository extends JpaRepository<Region, Long>{

	Optional<Region> findByName(String name);
}
