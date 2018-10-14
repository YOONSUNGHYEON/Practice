package net.skhu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import net.skhu.dto.Department;
import net.skhu.dto.Professor;
import net.skhu.mapper.DepartmentMapper;
import net.skhu.mapper.ProfessorMapper;
import net.skhu.mapper.StudentMapper;

@Controller
@RequestMapping("/c201632042")
public class ProfessorController {
	@Autowired StudentMapper studentMapper;
	@Autowired DepartmentMapper departmentMapper;
	@Autowired ProfessorMapper professorMapper;

	@RequestMapping(value="edit", method=RequestMethod.GET)
	public String edit(Model model, @RequestParam("id") int id) {
		Professor professor = professorMapper.findOne(id);
		model.addAttribute("professor", professor);
		List<Department> departments = departmentMapper.findAll();
		model.addAttribute("departments", departments);
		return "c201632042/edit";
	}

	@RequestMapping("list1")
	public String list1(Model model) {
		List<Professor> professors = professorMapper.findAll();
		model.addAttribute("professors", professors);
		return "c201632042/list1";
	}

	@RequestMapping(value="list2", method=RequestMethod.GET)
	public String list2(Model model,  @RequestParam("departmentId") int id) {
		List<Professor> professors = professorMapper.findId(id);
		model.addAttribute("professors", professors);
		return "c201632042/list2";
	}



}
