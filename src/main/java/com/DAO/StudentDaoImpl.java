package com.DAO;

import java.util.ArrayList;
import java.util.List;

import com.model.Student;

public class StudentDaoImpl implements StudentDao {
	
   //list is working as a database
   List<Student> students;

   public StudentDaoImpl(){
      students = new ArrayList<Student>();
      Student student1 = new Student("Cindreella",0);
      Student student2 = new Student("Ramya",1);
      students.add(student1);
      students.add(student2);		
   }
   
   public void deleteStudent(Student student) {
      students.remove(student.getRollNo());
      System.out.println("Student: Roll No " + student.getRollNo() + ", deleted from database");
   }

   //retrive list of students from the database
   
   public List<Student> getAllStudents() {
      return students;
   }

   
   public Student getStudent(int rollNo) {
      return students.get(rollNo);
   }

   
   public void updateStudent(Student student) {
      students.get(student.getRollNo()).setName(student.getName());
      System.out.println("Student: Roll No " + student.getRollNo() + ", updated in the database");
   }
}