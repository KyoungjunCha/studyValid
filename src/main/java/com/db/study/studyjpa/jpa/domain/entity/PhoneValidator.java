package com.db.study.studyjpa.jpa.domain.entity;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import java.util.regex.Pattern;

public class PhoneValidator implements ConstraintValidator<Phone, String> {

    private static final Pattern PHONE_PATTERN = Pattern.compile("\\d{3}-\\d{4}-\\d{4}");

    @Override
    public void initialize(Phone constraintAnnotation) {
        // 초기화 작업이 필요하다면 추가 할거 없으면 안해도됨
        // 초기화는 isValid 에서 한번만 돌아감
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (value == null) {
            // null인 경우 다른 애노테이션(@NotNull)으로 검증
            return true;
        }
        return PHONE_PATTERN.matcher(value).matches();
    }
}