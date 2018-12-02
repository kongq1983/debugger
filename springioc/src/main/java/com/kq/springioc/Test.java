package com.kq.springioc;

/**
 * Created by qikong on 18/12/2.
 */
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kq.springioc.entity.Student;
import com.kq.springioc.entity.Teacher;

/**
 * TODO
 * @author kongqi
 * @date  2018-04-17 08:43
 * @since
 */
public class Test {


    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:/*.xml");
        Student stu = ac.getBean(Student.class);
        System.out.println(stu);
        Student stu1 = (Student)ac.getBean("student");
        System.out.println(stu1);
        Teacher teacher = (Teacher)ac.getBean("teacher");
        System.out.println(teacher);
    }
}
