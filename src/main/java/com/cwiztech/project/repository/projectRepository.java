package com.cwiztech.project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cwiztech.project.model.Project;

public interface projectRepository extends JpaRepository<Project, Long> {
	
	@Query(value = "select * from TBLPROJECT where ISACTIVE='Y'", nativeQuery = true)
	public List<Project> findActive(); 

}
