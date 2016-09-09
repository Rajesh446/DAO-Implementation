package com.controller;

import com.DAO.StudentDao;
import com.DAO.StudentDaoImpl;
import com.model.Student;

public class DaoPatternDemo {
   public static void main(String[] args) {
      StudentDao studentDao = new StudentDaoImpl();

      //print all students
      for (Student student : studentDao.getAllStudents()) {
         System.out.println("Student: [RollNo : " + student.getRollNo() + ", Name : " + student.getName() + " ]");
      }


      //update student
      Student student =studentDao.getAllStudents().get(0);
      student.setName("Rajesh");
      studentDao.updateStudent(student);

      Student student1 =studentDao.getAllStudents().get(1);
      student1.setName("Raj");
      studentDao.updateStudent(student1);

      //get the student
      studentDao.getStudent(0);
      System.out.println("Student: [RollNo : " + student.getRollNo() + ", Name : " + student.getName() + " ]");		

      //print all students
   
      studentDao.getStudent(1);
      System.out.println("Student: [RollNo : " + student1.getRollNo() + ", Name : " + student1.getName() + " ]");		

   }
}