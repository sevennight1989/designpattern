package af.co.design;

/**
 * 建造者
 * 
 * @author ZhangPeng-PC
 * 
 */
public class Student {
	String name = "";
	int number = -1;
	String sex = "";
	int age = -1;
	String school = "";

	public Student(StudentBuilder builder) {
		
		name = builder.name;
		number = builder.number;
		sex = builder.sex;
		age = builder.age;
		school = builder.school;
	}
	
	

	@Override
	public String toString() {
		return "Student [name=" + name + ", number=" + number + ", sex=" + sex
				+ ", age=" + age + ", school=" + school + "]";
	}



	static class StudentBuilder {
		String name = "";
		int number = -1;
		String sex = "";
		int age = -1;
		String school = "";

		public StudentBuilder setName(String name) {
			this.name = name;
			return this;
		}

		public StudentBuilder setNumber(int number) {
			this.number = number;
			return this;
		}

		public StudentBuilder setSex(String sex) {
			this.sex = sex;
			return this;
		}

		public StudentBuilder setage(int age) {
			this.age = age;
			return this;
		}

		public StudentBuilder setSchool(String school) {
			this.school = school;
			return this;
		}

		public Student build() {
			return new Student(this);
		}

	}
}
