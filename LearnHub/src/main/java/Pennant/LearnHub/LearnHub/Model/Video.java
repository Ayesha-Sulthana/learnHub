package Pennant.LearnHub.LearnHub.Model;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Video {

	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String title;

    private String videoUrl;  // S3 URL or path

    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;

    
    public Video()
    {
    	
    }
    
	public Video(int id, String title, String videoUrl, Course course) {
		super();
		this.id = id;
		this.title = title;
		this.videoUrl = videoUrl;
		this.course = course;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getVideoUrl() {
		return videoUrl;
	}

	public void setVideoUrl(String videoUrl) {
		this.videoUrl = videoUrl;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	@Override
	public int hashCode() {
		return Objects.hash(course, id, title, videoUrl);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Video other = (Video) obj;
		return Objects.equals(course, other.course) && id == other.id && Objects.equals(title, other.title)
				&& Objects.equals(videoUrl, other.videoUrl);
	}

	@Override
	public String toString() {
		return "Video [id=" + id + ", title=" + title + ", videoUrl=" + videoUrl + ", course=" + course + "]";
	}
    
    
    
}
