package com.coolway.entity;

import jdk.nashorn.internal.ir.annotations.Ignore;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@NoArgsConstructor
public class Student {

    String id;

    String name;

    int age;
}