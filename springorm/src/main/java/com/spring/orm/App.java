package com.spring.orm;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.entities.Student;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/orm/config.xml");
		StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
		Student student = new Student(179, "Fahad", "Nzbbb");
		// int r = studentDao.insert(student);
		// System.out.println(r);
		int i = 179;
//		studentDao.deleteStudent(i);
		// student.setStudentCity("Hyderabad");
		// studentDao.updateStudent(student);
		List<Student> students = studentDao.getAllStudents();
		for (Student s : students) {
			System.out.println(s);
		}
	}
}
