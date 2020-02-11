package texas.sbq.tour.mapper;


import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Repository;

import texas.sbq.tour.map.Corona;
import texas.sbq.tour.map.Maps;


@Repository
public interface MapMapper {
		
	public void createMap(HashMap<String,String> paramMap);
	public Maps selectMapsByPlace(String place);
	public void insertMap(Maps param);
	public void createCorona(HashMap<String,String> paramMap);
	public void insertCorona(Corona param);
	public List<Corona> selectCoronaList();
	
}
