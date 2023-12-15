package Pennant.LearnHub.LearnHub.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Pennant.LearnHub.LearnHub.Model.Course;
import Pennant.LearnHub.LearnHub.Repository.CourseRepository;

@Service
public class CourseService 
{

	@Autowired 
	CourseRepository courseRepository;
	
	public List<Course> getAllCourses() 
	{		
		return courseRepository.findAll();
	}

	public Course getCourseByCode(int code) 
	{
		Optional<Course> course = courseRepository.findById(code);
		if(course.isPresent())
		{
			Course cou = course.get();
			return cou;
		}
		else
			return null;
	}

	public Course getCourseByName(String name) 
	{
		List<Course> courses = courseRepository.findAll();
		for(Course br: courses)
		{
			if(br.getName().equals(name))
				return br;
		}
		return null;
	}
	
	
	

}
