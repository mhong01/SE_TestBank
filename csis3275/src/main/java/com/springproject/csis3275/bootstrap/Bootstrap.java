package com.springproject.csis3275.bootstrap;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.springproject.csis3275.model.Course;
import com.springproject.csis3275.model.User;
import com.springproject.csis3275.repositories.CourseRepository;
import com.springproject.csis3275.repositories.UserRepository;

@Component
public class Bootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private UserRepository userRepository;
    
    private CourseRepository courseRepository;

    public Bootstrap(UserRepository userRepository, CourseRepository courseRepository) {
        this.userRepository = userRepository;
        this.courseRepository = courseRepository;
    }
    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    private void initData() {
        User hongle = new User();
        hongle.setFullName("Minh Hong Le");
        hongle.setEmail("hong.le@gmail.com");
        hongle.setStudentId("300299969");
        hongle.setUserType(1);
        hongle.setPassword("root");
        hongle.setCourseCode("CSIS3275");
        
       
        User vinicius = new User();
        vinicius.setFullName("Matos Alves, Vinicius");
        vinicius.setEmail("vinicius@gmail.com");
        vinicius.setStudentId("300292888");
        vinicius.setUserType(1);
        vinicius.setPassword("root");
        vinicius.setCourseCode("CSIS3275");
        
        User Elvis = new User();
        Elvis.setFullName("Akumbom, Elvis Vukesu");
        Elvis.setEmail("Elvis@gmail.com");
        Elvis.setStudentId("300292888");
        Elvis.setUserType(1);
        Elvis.setPassword("root");
        Elvis.setCourseCode("CSIS3275");
        
        User Dang = new User();
        Dang.setFullName("Dang, Huu Tu Anh");
        Dang.setEmail("Dang@gmail.com");
        Dang.setStudentId("300305726");
        Dang.setUserType(1);
        Dang.setPassword("root");
        Dang.setCourseCode("CSIS3275");
        
        User Pylayev = new User();
        Pylayev.setFullName("Pylayev, Evgeny");
        Pylayev.setEmail("Pylayev@gmail.com");
        Pylayev.setStudentId("300301386");
        Pylayev.setUserType(1);
        Pylayev.setPassword("root");
        Pylayev.setCourseCode("CSIS3275");
        
        User professor = new User();
        professor.setFullName("Mahmood, Al-Humaimidi");
        professor.setUserType(0);
        professor.setEmail("");

        userRepository.save(hongle);
        userRepository.save(vinicius);
        userRepository.save(Elvis);
        userRepository.save(Dang);
        userRepository.save(Pylayev);
        userRepository.save(professor);
        
        initCourseData(professor);
       
    }

    private void initCourseData(User professor) {
    	Course course = new Course();
    	
    	course.setCourseCode("CSIS 3275");
    	course.setProfessor(professor);
    	
    	courseRepository.save(course);
    }

}
