package com.example.webAppDemo.model;
import lombok.*;

import javax.persistence.*;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table (name = "blogsite_person")
public class Person {
    @Getter
    @Setter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    private long id;
    @Getter
    @Setter
    @Column (name = "name")
    private String name;







}
