package com.revature.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.models.SubjectTypes;

@Repository
public interface SubjectTypesRepository extends JpaRepository<SubjectTypes, Integer> {

}
