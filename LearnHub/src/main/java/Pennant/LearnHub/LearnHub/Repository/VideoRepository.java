package Pennant.LearnHub.LearnHub.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import Pennant.LearnHub.LearnHub.Model.Video;

@Repository
public interface VideoRepository extends JpaRepository<Video, Integer>{

}
