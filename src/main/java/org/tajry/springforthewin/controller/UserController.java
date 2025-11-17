package org.tajry.springforthewin.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.tajry.springforthewin.dto.UserDto;
import org.tajry.springforthewin.service.UserService;

import java.util.List;

@RestController
public class UserController {

    private UserService userService;


    @GetMapping
    public List<UserDto> getUsers(){
        return userService.getAllUsers();
    }


}
