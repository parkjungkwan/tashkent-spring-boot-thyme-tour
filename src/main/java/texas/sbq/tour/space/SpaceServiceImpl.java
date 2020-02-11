package texas.sbq.tour.space;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import texas.sbq.tour.mapper.SpaceMapper;
import texas.sbq.tour.util.Printer;


@Service
public class SpaceServiceImpl implements SpaceService {
			@Autowired SpaceMapper spcaMapper;
			@Autowired Printer printer;

	@Override
	public void saveTourList(List<Space> param) {
		for(int i= 0; i<param.size();i++) {	
			spcaMapper.insertSaveList(param.get(i));
		}
	
	}

}
