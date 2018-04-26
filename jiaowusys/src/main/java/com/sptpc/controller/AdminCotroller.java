package com.sptpc.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.druid.stat.TableStat.Mode;
import com.sptpc.domain.College;
import com.sptpc.domain.Course;
import com.sptpc.domain.Student;
import com.sptpc.domain.Teacher;
import com.sptpc.service.CollegeService;
import com.sptpc.service.CourseService;
import com.sptpc.service.StudentService;
import com.sptpc.service.TeacherService;

@Controller
public class AdminCotroller {
	@Autowired
	private StudentService studentService;
	@Autowired
	private CollegeService collegeService;
	@Autowired
	private CourseService courseService;
	@Autowired
	private TeacherService teacherService;
	
	@RequestMapping("ctr_showStudent")
	public ModelAndView showStudent(HttpSession session){
		List<Student> studentList = null;
		studentList = studentService.getAllStudent();
		ModelAndView mv = new ModelAndView("admin/showStudent");
		mv.addObject("studentList", studentList);
		
		return mv;		
	}
	@RequestMapping(value="ctr_addStudent", method=RequestMethod.GET)
	public ModelAndView addStudent(){
		ModelAndView mv = new ModelAndView("admin/addStudent");
		List<College> cList = collegeService.getAllCollege();
		
		mv.addObject("collegeList", cList);
		return mv;
	}
	
	@RequestMapping(value="ctr_addStudent", method=RequestMethod.POST)
	public ModelAndView sumbitStudentForm(Student student){
		//调用服务层 把表单中的内容(Student对象) 保存到数据库中
		ModelAndView mv;
		int n = studentService.saveStudent(student);
		if(n == 0){
			mv = new ModelAndView("admin/addStudent");
		}else{
			mv = new ModelAndView("redirect:ctr_showStudent");
		}
		
		return mv;
	}
	//学生信息修改
	@RequestMapping(value="ctr_editStudent", method=RequestMethod.GET)
	public ModelAndView editStudent( @RequestParam("id") String userID){
		ModelAndView mv = new ModelAndView("admin/editStudent");
		Student student = studentService.getStudentByID(userID);
		List<College> list = collegeService.getAllCollege();
		mv.addObject("student",student);
		mv.addObject("collegeList",list);
		return mv;
	}
	
	//学生信息修改
		@RequestMapping(value="ctr_editStudent", method=RequestMethod.POST)
		public ModelAndView editStudentSubmit(Student student){
			ModelAndView mv = new ModelAndView("admin/editStudent");
			int n = studentService.updateStudent(student);
			if(n==0){
				mv = new ModelAndView("admin/editStudent");
			}else{
				mv = new ModelAndView("redirect:ctr_addStudent");
			}
			return mv;
		}
	
	//删除学生信息
	@RequestMapping(value="ctr_removeStudent", method=RequestMethod.GET)	
	public ModelAndView removeStudent(@RequestParam("id") String userID){
		int n = studentService.deleteStudentByID(userID);
		ModelAndView mv;
		mv = new ModelAndView("redirect:ctr_showStudent");
		return mv;
	}
	//课程信息管理
	@RequestMapping(value="ctr_showCourse")
	public ModelAndView showCourse(HttpSession session){
		List<Course> courseList = null;
		courseList = courseService.getAllCourse();
		ModelAndView mv = new ModelAndView("admin/showCourse");
		mv.addObject("courseList", courseList);
		return mv;		
	}
	//课程信息修改
	@RequestMapping(value="ctr_editCourse", method=RequestMethod.GET)
	public ModelAndView editCourse( @RequestParam("id") String userID){
		ModelAndView mv = new ModelAndView("admin/editCourse");
		Course course = courseService.findCourseByID(userID);
		List<College> list = collegeService.getAllCollege();
		List<Teacher> teacherlist = teacherService.getAllTeacher();
		mv.addObject("course",course);
		mv.addObject("collegeList",list);
		mv.addObject("teacherList",teacherlist);
		return mv;
	}
	//更新课程信息修改
	@RequestMapping(value="ctr_editCourse", method=RequestMethod.POST)
	public ModelAndView editCourseSubmit(Course course){
		ModelAndView mv;
		int n = courseService.updateCourse(course);
		if(n==0){
			mv = new ModelAndView("admin/editCourse");
		}else{
			mv = new ModelAndView("redirect:ctr_showCourse");
		}
		return mv;
	}
	
}
