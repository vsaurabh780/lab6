package com.greatLearning.studentManagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.greatLearning.studentManagement.entity.Student;
import com.greatLearning.studentManagement.repository.StudentRepository;

import java.util.List;

import javax.transaction.Transactional;

@Repository
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepository studentRepository;

	@Transactional
	public List<Student> findAll() {

		List<Student> students = studentRepository.findAll();

		return students;
	}

	@Transactional
	public Student findById(int id) {

		Student student = new Student();

		// Find record with Id from the database table
		student = studentRepository.findById(id).get();

		return student;
	}

	@Transactional
	public void save(Student theStudent) {

		studentRepository.save(theStudent);

	}

	@Transactional
	public void deleteById(int id) {

		studentRepository.deleteById(id);

	}

}

