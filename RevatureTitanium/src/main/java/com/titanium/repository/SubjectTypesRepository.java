package com.titanium.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.titanium.models.SubjectTypes;

@Repository("subjectsRepository")
public interface SubjectTypesRepository {

	List<SubjectTypes> findAll();

	public String findSubjectNameById(Integer id);

}