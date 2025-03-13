package com.db.study.studyjpa.jpa.service;

import com.db.study.studyjpa.jpa.domain.entity.User;
import com.db.study.studyjpa.jpa.dto.UserDto;
import jakarta.validation.Valid;


public interface UserService {

    User svSaveChildUser(@Valid UserDto userDto);

    User svSaveAdultUser(@Valid UserDto userDto);

}
