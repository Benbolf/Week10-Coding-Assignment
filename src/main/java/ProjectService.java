package projects.service:
	
import projects.dao.ProjectDao;
import projects.enbtity.Project;



public class ProjectService {
	private ProjectDao projectDao = new ProjectDao();
	
	
	
	
	public Project addProject(Project project) {
		return projectDao.insertProject(project);
	}
}
