package dataLayer;

public class Activity {
	
	private String activityId;
	private String elementId;
	private String projectId;
	private String sprintId;
	
	private String title;
	private String description;
	
	private String timeExpected;
	private String timeSpent;
	
	private String respUser;
	
	
	public Activity(){
		
	}
	
	public String getActivityId() {
		return activityId;
	}
	
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}
	
	public String getProjectId() {
		return projectId;
	}
	
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}
	
	public String getSprintId() {
		return sprintId;
	}
	
	public void setSprintId(String sprintId) {
		this.sprintId = sprintId;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getTimeExpected() {
		return timeExpected;
	}
	
	public void setTimeExpected(String timeExpected) {
		this.timeExpected = timeExpected;
	}
	
	public String getTimeSpent() {
		return timeSpent;
	}
	
	public void setTimeSpent(String timeSpent) {
		this.timeSpent = timeSpent;
	}
	
	public String getRespUser() {
		return respUser;
	}
	
	public void setRespUser(String respUser) {
		this.respUser = respUser;
	}
	
}
