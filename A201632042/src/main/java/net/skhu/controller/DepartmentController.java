package net.skhu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import net.skhu.dto.Department;
import net.skhu.mapper.DepartmentMapper;
import net.skhu.mapper.StudentMapper;

@Controller
@RequestMapping("/home")
public class DepartmentController {

    @Autowired StudentMapper studentMapper;
    @Autowired DepartmentMapper departmentMapper;

    @RequestMapping("test1")
    public String test1(Model model) {
        List<Department> departments = departmentMapper.findAll();
        model.addAttribute("departments", departments);
        return "home/test1";
    }

    @RequestMapping("test2")
    public String test2(Model model) {
        model.addAttribute("number", 123);
        return "home/test2";
    }
}