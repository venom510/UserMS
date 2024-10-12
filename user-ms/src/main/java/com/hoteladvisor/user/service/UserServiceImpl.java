package com.hoteladvisor.user.service;

import com.hoteladvisor.user.entity.User;
import com.hoteladvisor.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public final class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Override
    public User addUser(String userName) {
        if (userName == null || userName.isBlank()) {
            log.error("User name can't be blank!");
            throw new IllegalArgumentException("User name can't be blank!");
        }
        return userRepository.save(User.builder().userName(userName).build());
    }
}
