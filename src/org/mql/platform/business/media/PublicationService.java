package org.mql.platform.business.media;

import java.util.List;

import org.mql.platform.models.Activity;
import org.mql.platform.models.Event;
import org.mql.platform.models.News;

/**
 * 
 * Service responsible for managing publications: activities, events and news
 * 
 * @author mehdithe
 *
 */

public interface PublicationService {
	
	/* select all the activities (same thing for events and news)*/ 
	List<Activity> getAllActivities();

	List<Event> getAllEvents();

	List<News> getAllNews();
	
	/* select activities by id (same thing for event and news)*/ 
	Activity getActivity(Long id);

	Event getEvent(Long id);

	News getNews(Long id);
	
	/* Add or update an activity if it doesn't exist (same thing for event and news)*/ 
	boolean addOrUpdateActivity(Activity activity);

	boolean addOrUpdateEvent(Event event);

	boolean addOrUpdateNews(News news);
	
	/* delete an activity by id (same thing for event and news)*/ 
	void deleteActivity(Long id);

	void deleteEvent(Long id);

	void deleteNews(Long id);
}
