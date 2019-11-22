package testbank.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Module")
public class Module {

	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int moduleId;
	
	@ManyToOne
	@JoinColumn(name = "student_id")
	private User student;
	
	@ManyToOne
	@JoinColumn(name = "test_id")
	private TestModule testModule;
	
	@ManyToOne
	@JoinColumn(name = "course_id")
	private Course course;
	
	private String reportName;
	
	private double studentGrade;
	
	private Date createdDate;

	public int getModuleId() {
		return moduleId;
	}

	public void setModuleId(int moduleId) {
		this.moduleId = moduleId;
	}

	public User getStudent() {
		return student;
	}

	public void setStudent(User student) {
		this.student = student;
	}

	public TestModule getTestModule() {
		return testModule;
	}

	public void setTestModule(TestModule testModule) {
		this.testModule = testModule;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public String getReportName() {
		return reportName;
	}

	public void setReportName(String reportName) {
		this.reportName = reportName;
	}

	public double getStudentGrade() {
		return studentGrade;
	}

	public void setStudentGrade(double studentGrade) {
		this.studentGrade = studentGrade;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	
	
}
