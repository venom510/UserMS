package com.hoteladvisor.user.service;

import com.hoteladvisor.user.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.argThat;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class UserServiceTest {
    private static final String TEST_USER_NAME = "testUser";

    @Mock
    private UserRepository userRepository;
    @InjectMocks
    private UserServiceImpl userService;

    @Test
    void testAddUserWhenHotelNameIsNull() {
        assertThrows(IllegalArgumentException.class, () -> userService.addUser(null));
    }

    @Test
    void testAddUser() {
        var user = userService.addUser(TEST_USER_NAME);
        verify(userRepository, times(1)).save(argThat(h -> TEST_USER_NAME.equals(h.getUserName())));
    }
}