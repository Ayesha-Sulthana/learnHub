package Pennant.LearnHub.LearnHub.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Pennant.LearnHub.LearnHub.Model.Video;
import Pennant.LearnHub.LearnHub.Repository.VideoRepository;

@Service
public class VideoService 
{
	
	@Autowired 
	private VideoRepository videoRepository;

	public List<Video> getAllVideos()
	{
		return videoRepository.findAll();
	}

	public Video getVideoById(int id) 
	{
		Optional<Video> video = videoRepository.findById(id);
		if(video.isPresent())
		{
			Video vid = video.get();
			return vid;
		}
		else
			return null;
	}

	public Video getVideoByTitle(String title) 
	{
		List<Video> videos = videoRepository.findAll();
		for(Video vid: videos)
		{
			if(vid.getTitle().equals(title))
				return vid;
		}
		return null;
	}

	
	
}
