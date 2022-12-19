package com.development.pos.EzyBuild.dto.request;

import lombok.*;

@AllArgsConstructor

@NoArgsConstructor

@Data  //@ToString, @Getter, @Setter, hashcode
public class CustomerDto {
    private String name;
    private String address;
    private double salary;


}
