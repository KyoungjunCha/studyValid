package com.db.study.studyjpa.jpa.domain.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;


@Entity
@Table(name = "study_valid_user")
@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator ="my_idseq_gen_name")
    @SequenceGenerator(name="my_idseq_gen_name",sequenceName = "id_sequence",allocationSize = 1)
    @Column(name="id_seq")
    private Long id;

    private String name;

    private int age;

    private String phone;

}
