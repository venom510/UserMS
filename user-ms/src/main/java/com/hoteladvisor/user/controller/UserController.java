package com.hoteladvisor.user.controller;

import com.hoteladvisor.user.entity.User;
import com.hoteladvisor.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public final class UserController {
    private final UserService userService;

    @PostMapping
    public User addHotel(@RequestParam(name = "userName", required = true) String userName) {
        return userService.addUser(userName);
    }
}
