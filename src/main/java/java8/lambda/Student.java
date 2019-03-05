package java8.lambda;

public class Student {
	private String id;
	
	private Integer grade;
	
	private String classId;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getGrade() {
		return grade;
	}

	public void setGrade(Integer grade) {
		this.grade = grade;
	}

	public String getClassId() {
		return classId;
	}

	public void setClassId(String classId) {
		this.classId = classId;
	}

	public Student(String id, Integer grade, String classId){
		this.id = id;
		this.grade = grade;
		this.classId = classId;
	}
}
