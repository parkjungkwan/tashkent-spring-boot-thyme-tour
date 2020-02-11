package texas.sbq.tour.mapper;

import java.util.HashMap;

import org.springframework.stereotype.Repository;

import texas.sbq.tour.schdule.Schedule;

@Repository
public interface ScheduleMapper {
	
	public void createSchedule(HashMap<String,String> map);
	public void insertSchedule(Schedule schedule);
}
