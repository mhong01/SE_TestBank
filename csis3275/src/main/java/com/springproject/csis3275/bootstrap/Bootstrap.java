package com.springproject.csis3275.bootstrap;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.springproject.csis3275.model.User;
import com.springproject.csis3275.repositories.UserRepository;

@Component
public class Bootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private UserRepository userRepository;

    public Bootstrap(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    private void initData() {
        User hongle = new User();
        hongle.setFullName("Hong Le");
        hongle.setEmail("hong.le@gmail.com");
        hongle.setUserName("hongle");
        hongle.setPassword("doconmeo");
        hongle.setEnabled(true);

        User quangle = new User();
        quangle.setFullName("Quang Le");
        quangle.setEmail("quang.le@gmail.com");
        quangle.setUserName("quangle");
        quangle.setPassword("doconmeo");
        quangle.setEnabled(true);

        userRepository.save(hongle);
        userRepository.save(quangle);
    }


}
