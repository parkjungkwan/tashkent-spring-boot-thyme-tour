package texas.sbq.tour.mapper;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Repository;

import texas.sbq.tour.hotel.Hotel;

@Repository
public interface HotelMapper {
	public void createHotel(HashMap<String,String> map);
	public void insertHotel(Hotel hotel);
	public List<Hotel> selectHotelList();
}
