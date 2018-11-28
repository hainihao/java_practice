package com.tulun.src3;

import lombok.*;

import java.io.Serializable;

/**
 * @author:liguozheng
 * @Date:2018/11/28
 * @time:21:11
 * @description:
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Student1802 implements Serializable {

    private static final long serialVersionUID = 1601038827581673146L;

    private String name;
    private int age;
    private String sex;

}
