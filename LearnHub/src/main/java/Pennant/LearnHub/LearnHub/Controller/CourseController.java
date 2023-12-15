package Pennant.LearnHub.LearnHub.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Pennant.LearnHub.LearnHub.Model.Course;
import Pennant.LearnHub.LearnHub.Service.CourseService;

@RestController
@RequestMapping("/api/courses")
public class CourseController 
{
	@Autowired
    private CourseService courseService;
	
	@GetMapping("/Course/getAllCourses")
    public List<Course> getAllCourses() 
	{
        return courseService.getAllCourses();
    }
	
	@GetMapping("/Course/getByCode/{code}")
	public Course getBranchByCode(@PathVariable int code)
	{
		return courseService.getCourseByCode(code);
	}
	
	@GetMapping("/Course/getByName/{name}")
	public Course getCourseByName(@PathVariable String name)
	{
		return courseService.getCourseByName(name);
	}
	
	
	
}
