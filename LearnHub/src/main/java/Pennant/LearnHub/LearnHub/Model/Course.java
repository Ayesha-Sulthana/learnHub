package Pennant.LearnHub.LearnHub.Model;

import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Course {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int code;
	private String name;
    
    @OneToMany(mappedBy = "course")
    private List<Video> videos;
    
   
	public Course()
	{
		
	}
	

	public Course(int code, String name, List<Video> videos) {
		super();
		this.code = code;
		this.name = name;
		this.videos = videos;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Video> getVideos() {
		return videos;
	}

	public void setVideos(List<Video> videos) {
		this.videos = videos;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(code, name, videos);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Course other = (Course) obj;
		return code == other.code && Objects.equals(name, other.name) && Objects.equals(videos, other.videos);
	}
    
	@Override
	public String toString() {
		return "Course [code=" + code + ", name=" + name + ", videos=" + videos + "]";
	}

	
}
