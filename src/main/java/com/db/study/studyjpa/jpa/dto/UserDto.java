package com.db.study.studyjpa.jpa.dto;

import com.db.study.studyjpa.jpa.domain.entity.Phone;
import com.db.study.studyjpa.jpa.group.AdultGroup;
import com.db.study.studyjpa.jpa.group.ChildrenGroup;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

    @NotBlank(message = "이름 필수 백종현 바보",
            groups = {AdultGroup.class, ChildrenGroup.class})
    private String name;
    
    //그룹
    @Min(value = 19,message = "adult 인데 어떻게 나이가 그래요?",groups = {AdultGroup.class})
    @Max(value = 18,message = "child 인데 어떻게 나이가 그래요?",groups = {ChildrenGroup.class})
    private int age;

    //커스텀
    @Phone(message = "전화번호 형식이 올바르지 않습니다. (예: 010-1234-5678)", groups = {AdultGroup.class, ChildrenGroup.class})
    private String phone;

}