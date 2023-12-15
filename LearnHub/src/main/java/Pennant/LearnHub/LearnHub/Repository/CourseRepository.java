package Pennant.LearnHub.LearnHub.Repository;

import org.springframework.stereotype.Repository;
import Pennant.LearnHub.LearnHub.Model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface CourseRepository extends JpaRepository<Course, Integer> 
{

}
