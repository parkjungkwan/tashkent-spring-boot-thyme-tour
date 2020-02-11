package texas.sbq.tour.map;

import java.util.List;

import org.springframework.stereotype.Component;
@Component
public interface MapsService {

	public Maps findMapsByPlace(String place);
}
