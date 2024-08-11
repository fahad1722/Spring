package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entities.Student;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

//		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
//		StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
//		INSERT
//		Student student = new Student();
//		student.setId(19);
//		student.setName("S1");
//		student.setCity("hitech");
//
//		int result = studentDao.insert(student);
//
//		System.out.println("Number of records inserted:" + result);

//		UPDATE
//		Student student = new Student();
//		student.setId(178);
//		student.setName("SH");
//		student.setCity("hitech");
//
//		int result = studentDao.change(student);
//
//		System.out.println("Number of records updated:" + result);

//		DELETE
//		int result = studentDao.delete(177);
//		System.out.println("Number of records deleted:" + result);

// 		SELECT
//		Student student = studentDao.getStudent(17);
//		System.out.println(student);
//
//		List<Student> students = studentDao.getAllStudents();
//		for (Student s : students) {
//			System.out.println(s);
//		}
//
//	}
		ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);
		StudentDao studentDao = context.getBean("studentDao", StudentDao.class);

		List<Student> students = studentDao.getAllStudents();
		for (Student s : students) {
			System.out.println(s);
		}
	}
}
