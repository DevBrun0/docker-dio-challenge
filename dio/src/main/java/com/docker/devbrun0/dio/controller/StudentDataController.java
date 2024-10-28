package java.com.docker.devbrun0.dio.controller;

import java.com.docker.devbrun0.dio.database.StudentData;
import java.com.docker.devbrun0.dio.repository.StudentDataRepository;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.security.SecureRandom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentDataController {

    @Autowired
    private StudentDataRepository studentDataRepository; 

    @GetMapping("/insertData")
    public String insertData() {
        // Generate random values
        int randomStudentID = (int) (Math.random() * 999) + 1; // Generates a random ID between 1 and 999
        String randomFirstName = generateRandomString(8); 
        String hostName = getHostName(); 

        // Create a new record and save
        StudentData newStudentData = new StudentData(randomStudentID, randomFirstName, randomFirstName, randomFirstName, randomFirstName, hostName);
        studentDataRepository.save(newStudentData);

        return "New record created successfully!";
    }

    private String generateRandomString(int length) {
        SecureRandom random = new SecureRandom();
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            sb.append((char) ('A' + random.nextInt(26))); // Generates a random letter
        }
        return sb.toString();
    }

    private String getHostName() {
        try {
            return InetAddress.getLocalHost().getHostName(); // Gets the local host name
        } catch (UnknownHostException e) {
            e.printStackTrace();
            return "unknown"; // Returns 'unknown' in case of error
        }
    }
}
