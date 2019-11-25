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
        hongle.setFirstName("Hong");
        hongle.setEmail("hong.le@gmail.com");
        hongle.setLastName("Le");
        hongle.setUserType(1);
        hongle.setPassword("doconmeo");
        
        User tomyDang = new User();
        tomyDang.setFirstName("Tomy");
        tomyDang.setEmail("tommy.dang@gmail.com");
        tomyDang.setLastName("Dang");
        tomyDang.setUserType(1);
        tomyDang.setPassword("root");
        

        User quangle = new User();
        quangle.setFirstName("Quang");
        quangle.setEmail("quang.le@gmail.com");
        hongle.setLastName("Le");
        hongle.setUserType(1);
        quangle.setPassword("doconmeo");
        
        User professor = new User();
        professor.setFirstName("Mahmood");
        professor.setLastName("Al-Humaimidi");
        professor.setUserType(0);
        professor.setEmail("");

        userRepository.save(hongle);
        userRepository.save(tomyDang);
        userRepository.save(quangle);
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
