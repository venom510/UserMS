package com.hoteladvisor.user.entity;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class UserTest {
    private static final String TEST_USER_NAME = "testUser";

    @Test
    void testInitialValues() {
        User user = User.builder().userName(TEST_USER_NAME).build();
        assertEquals(TEST_USER_NAME, user.getUserName());
        assertEquals(0, user.getNumberOfRatings());
        assertFalse(user.isExpertUser());
    }
}