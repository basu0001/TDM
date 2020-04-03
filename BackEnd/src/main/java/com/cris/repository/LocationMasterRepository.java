package com.cris.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cris.model.LocationMaster;

	@Repository
	public interface LocationMasterRepository extends JpaRepository<LocationMaster,Integer>{

}
