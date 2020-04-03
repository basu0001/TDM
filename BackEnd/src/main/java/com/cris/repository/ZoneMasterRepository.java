package com.cris.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.cris.model.*;


	@Repository
	public interface ZoneMasterRepository extends JpaRepository<ZoneMaster,Integer>{
}

