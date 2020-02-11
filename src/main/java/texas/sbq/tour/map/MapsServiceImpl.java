package texas.sbq.tour.map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import texas.sbq.tour.mapper.MapMapper;
import texas.sbq.tour.util.Printer;


@Service
public class MapsServiceImpl implements MapsService{
	@Autowired MapMapper mapMapper;
	@Autowired Printer printer;

	@Override
	public Maps findMapsByPlace(String place) {
		Maps t = mapMapper.selectMapsByPlace(place);
		return t;
	}

}
