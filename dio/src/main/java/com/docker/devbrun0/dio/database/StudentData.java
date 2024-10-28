package java.com.docker.devbrun0.dio.database;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class StudentData {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int studentID;  // Corresponds to AlunoID

    private String firstName;   // Corresponds to Nome
    private String lastName; // Corresponds to Sobrenome
    private String address; // Corresponds to Endereco
    private String city;   // Corresponds to Cidade
    private String host;     // Corresponds to Host

    // Constructor
    public StudentData(int studentID, String firstName, String lastName, String address, String city, String host) {
        this.studentID = studentID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.host = host;
    }

    // Getters and Setters
    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }
}
