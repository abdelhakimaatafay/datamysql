package com.example.datamysql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        if (userRepository.count() == 0) {
            userRepository.deleteAll();

            userRepository.save(new User("User1", "user1@example.com"));
            userRepository.save(new User("User2", "user2@example.com"));
            userRepository.save(new User("User3", "user3@example.com"));
            userRepository.save(new User("User4", "user4@example.com"));
            userRepository.save(new User("User5", "user5@example.com"));
        }
    }
}
