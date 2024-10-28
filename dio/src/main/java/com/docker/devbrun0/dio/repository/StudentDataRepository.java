package java.com.docker.devbrun0.dio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.database.StudentData;

@Repository
public interface StudentDataRepository extends JpaRepository<StudentData, Integer> {
}
