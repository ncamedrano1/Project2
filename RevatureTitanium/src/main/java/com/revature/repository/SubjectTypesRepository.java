package com.revature.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.revature.models.SubjectTypes;

@Repository
public interface SubjectTypesRepository extends JpaRepository<SubjectTypes, Integer>  {

}
