package com.cruddemo;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cruddemo.Repository.StudentRepository;
import com.cruddemo.entity.student;

@SpringBootTest
class ApplicationTests {
	
	@Autowired
	private StudentRepository studentRepo;
	private Optional findById;

	@Test
	void saveStudent() {
		student s = new student();
		s.setName("mike");
		s.setCourse("java Development Course");
		s.setFee(20000);
		studentRepo.save(s);
	}
    @Test
	void deleteOneStudent() {
		studentRepo.deleteById(1);
	}
    @Test
    void getStudentInfo() {
    	Optional<student> findById = studentRepo.findById(2);
    	student student = findById.get();
    	System.out.println(student.getId());
    	System.out.println(student.getName());
    	System.out.println(student.getCourse());
    	System.out.println(student.getFee());
    }
    
    @Test
	void updateStudent() {
		student s = new student();
		s.setId(3);
		s.setName("mike");
		s.setCourse("java developer course");
		s.setFee(20000);
		studentRepo.save(s);
}
}