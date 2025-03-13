package com.db.study.studyjpa.jpa.service;

import com.db.study.studyjpa.jpa.domain.entity.User;
import com.db.study.studyjpa.jpa.dto.UserDto;
import com.db.study.studyjpa.jpa.repository.*;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

@Service
@Validated
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    @Transactional
    public User svSaveChildUser (@Valid UserDto userDto){
        User user = new User();
        user.setName(userDto.getName());
        user.setAge(userDto.getAge());
        user.setPhone(userDto.getPhone());
        return userRepository.save(user);
    };

    @Override
    @Transactional
    public User svSaveAdultUser (@Valid UserDto userDto){
        User user = new User();
        user.setName(userDto.getName());
        user.setAge(userDto.getAge());
        user.setPhone(userDto.getPhone());
        return userRepository.save(user);
    };
}

