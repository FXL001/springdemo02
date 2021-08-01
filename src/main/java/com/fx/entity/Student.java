package com.fx.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2020-2021</p>
 *
 * @author LiuFeiFan
 * @version 1.0
 * @date 2021-07-31 18:11
 */
@Data
@AllArgsConstructor
public class Student {
    private long id;
    private String name;
    private int age;
}
