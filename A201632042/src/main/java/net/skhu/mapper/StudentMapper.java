package net.skhu.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import net.skhu.dto.Student;

@Mapper
public interface StudentMapper {
    Student findOne(int id);
    Student findByStudentNumber(String st);
    List<Student> findAll();
    List<Student> findByName(String stt);
    void insert(Student student);
    void update(Student student);
    void delete(int id);
}

