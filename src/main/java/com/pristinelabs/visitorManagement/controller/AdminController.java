package com.pristinelabs.visitorManagement.controller;

import com.pristinelabs.visitorManagement.dto.UserDto;
import com.pristinelabs.visitorManagement.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;
    @PostMapping("/createUser")
    ResponseEntity<Long> createUser(@RequestBody UserDto userDto) {
        Long id = adminService.createUser(userDto);
        return ResponseEntity.ok(id);
    }

}
