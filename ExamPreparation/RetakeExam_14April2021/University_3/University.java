package university;

import java.util.ArrayList;
import java.util.List;

public class University {
    private int capacity;
    public List<Student> students;

    public University(int capacity) {
        this.capacity = capacity;
        this.students = new ArrayList<>();
    }

    public int getCapacity() {
        return capacity;
    }

    public List<Student> getStudents() {
        return students;
    }

    public int getStudentCount() {
        return this.getStudents().size();
    }

    public String registerStudent(Student student) {
        String result = "";
        if (this.students.size() < this.capacity) {
            if (!this.students.contains(student)) {
                this.students.add(student);
                result = String.format("Added student %s %s", student.getFirstName(), student.getLastName());
            } else {
                result = "Student is already in the university";
            }
        } else {
            result = "No seats in the university";
        }
        return result;
    }

    public String dismissStudent(Student student) {
        String out = "";
        if (!this.students.remove(student)) {
            out = "Student not found";
        } else {
            this.students.remove(student);
            out = String.format("Removed student %s %s", student.getFirstName(), student.getLastName());
        }
        return out;
    }

    public Student getStudent(String firstName, String lastName) {
        Student student = null;
        for (Student currentStudent : students) {
            if (currentStudent.getFirstName().equals(firstName)
                    && currentStudent.getLastName().equals(lastName)) {
                student = currentStudent;
            }
        }
        return student;
    }

    public String getStatistics() {
        StringBuilder out = new StringBuilder();
        for (Student currentStudent : this.students) {
            out.append("==Student: First Name = ").append(currentStudent.getFirstName())
                    .append(", Last Name = ").append(currentStudent.getLastName())
                    .append(", Best Subject = ").append(currentStudent.getBestSubject())
                    .append(System.lineSeparator());
        }
        return out.toString().trim();
    }
}
