package com.db.study.studyjpa.jpa.controller;

import com.db.study.studyjpa.jpa.domain.entity.User;
import com.db.study.studyjpa.jpa.dto.UserDto;
import com.db.study.studyjpa.jpa.group.AdultGroup;
import com.db.study.studyjpa.jpa.group.ChildrenGroup;
import com.db.study.studyjpa.jpa.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/test")
@RequiredArgsConstructor
@Slf4j
public class UserController {

    private final UserService userService;

    @PostMapping("/adult")
    public ResponseEntity<String> ctlSaveAdultUser(@RequestBody @Validated(AdultGroup.class) UserDto userDto) {
        User user = userService.svSaveAdultUser(userDto);
        return ResponseEntity.ok("성인 회원가입 성공! 생성된 User의 ID: " + user.getId());
    }

    @PostMapping("/child")
    public ResponseEntity<String> ctlSaveChildUser(@RequestBody @Validated(ChildrenGroup.class) UserDto userDto) {
        User user = userService.svSaveChildUser(userDto);
        return ResponseEntity.ok("ask 회원가입 성공! 생성된 User의 ID: " + user.getId());
    }
}
