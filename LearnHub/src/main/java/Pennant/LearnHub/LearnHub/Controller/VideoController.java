package Pennant.LearnHub.LearnHub.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Pennant.LearnHub.LearnHub.Model.Video;
import Pennant.LearnHub.LearnHub.Service.VideoService;

@RestController
@RequestMapping("/api/videos")
public class VideoController 
{

	@Autowired
    private VideoService videoService;
	
	@GetMapping("/Videos/getAllVideos")
    public List<Video> getAllVideos() 
	{
        return videoService.getAllVideos();
    }
	
	@GetMapping("/Video/getById/{id}")
	public Video getVideoById(@PathVariable int id)
	{
		return videoService.getVideoById(id);
	}
	
	@GetMapping("/Video/getByTitle/{title}")
	public Video getVideoByTitle(@PathVariable String title)
	{
		return videoService.getVideoByTitle(title);
	}
	
	
}

