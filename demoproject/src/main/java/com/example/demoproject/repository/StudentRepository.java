package com.example.demoproject.repository;  
import org.springframework.data.jpa.repository.JpaRepository;  
import org.springframework.stereotype.Repository;
import com.example.demoproject.model.Student;  
@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>  
{  
	
}
