package com.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.model.Student;
import com.service.StudentService;

@Controller
public class HomeController {

	@Autowired
	private StudentService service;

	@RequestMapping("/")
	public String HomePage() {
		return "index";
	}

	@RequestMapping("/login")
	public String loginPage() {
		return "login";
	}

	@RequestMapping("/reg")
	public String registerPage() {
		return "registration";
	}

	@RequestMapping("/profile")
	public String profile(@RequestParam String username, @RequestParam String password, Model model) {

		List<Student> stu = service.loginChek(username, password);

		if (stu != null) {
			model.addAttribute("data", stu);

			return "profile";
		} else {
			return "login";
		}

	}

	@RequestMapping("/success")
	public String saveData(@ModelAttribute Student stu, Model model) {

		service.saveStudent(stu);
		List<Student> list = service.getStudent();
		model.addAttribute("data", list);
		return "profile";
	}

	@RequestMapping("/delete")
	private String deleteStudent(@RequestParam int rollno, Model model) {

		List<Student> list = service.deleteStudent(rollno);
		model.addAttribute("data", list);
		return "profile";

	}

	@RequestMapping("/edit")
	public String editStudent(@RequestParam int rollno, Model model) {
		model.addAttribute("data", rollno);
		return "edit";
	}

	@RequestMapping("/result")
	public String edit(@RequestParam int rollno, @RequestParam String name, @RequestParam String address, Model model) {

		List<Student> list = service.editStudent(rollno, name, address);
		model.addAttribute("data", list);
		return "profile";
	}

}
