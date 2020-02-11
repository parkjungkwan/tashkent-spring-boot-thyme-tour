package texas.sbq.tour.tour;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import texas.sbq.tour.mapper.TourMapper;
import texas.sbq.tour.util.Printer;


@Service
public class TourServiceImpl implements TourSevice {
	@Autowired TourMapper tourMapper;
	@Autowired Printer printer;
	
	@Override
	public Tour findTourByPlace(String place) {
	Tour tour = tourMapper.selectTourByPlace(place);
		return tour;
	}

}
