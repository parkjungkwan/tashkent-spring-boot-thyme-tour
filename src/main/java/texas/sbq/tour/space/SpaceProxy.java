package texas.sbq.tour.space;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import lombok.Data;
import texas.sbq.tour.mapper.SpaceMapper;

@Data
@Component
public class SpaceProxy {
		@Autowired SpaceMapper spaceMapper;
		
		
}
