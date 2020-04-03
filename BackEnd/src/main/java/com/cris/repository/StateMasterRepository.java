package com.cris.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cris.model.StateMaster;

@Repository
public interface StateMasterRepository extends JpaRepository<StateMaster, Integer>{

	List<StateMaster> findAll();

}
