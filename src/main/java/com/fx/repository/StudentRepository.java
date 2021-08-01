package com.fx.repository;

import com.fx.entity.Student;

import java.util.Collection;

/**
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2020-2021</p>
 *
 * @author LiuFeiFan
 * @version 1.0
 * @date 2021-07-31 18:12
 */
public interface StudentRepository {
    public Collection<Student> findAll();
    public Student findById(long id);
    public void saveOrUpdate(Student student);
    public void deleteById(long id);
}
