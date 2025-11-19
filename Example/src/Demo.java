import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student1 implements Comparable<Student1> {
	int alter;
	String name;

	public Student1(int alter, String name) {

		this.alter = alter;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [alter=" + alter + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Student1 o) {
		if (this.alter % 10 > o.alter % 10) {
			return 1;
		} else if (this.alter % 10 < o.alter % 10) {
			return -1;
		} else {
			return 0;
		}
	}
	
}

	public class Demo {

		public static void main(String[] args) {
			List<Student1> num = new ArrayList<>();

			num.add(new Student1(23, "Ahmed"));
			num.add(new Student1(25, "Delyar"));
			num.add(new Student1(22, "Telman"));
			num.add(new Student1(21, "Lava"));

			Comparator<Student1> com = new Comparator<>() {

				@Override
				public int compare(Student1 o1, Student1 o2) {
					if (o1.alter % 10 > o2.alter % 10) {
						return 1;
					} else if (o1.alter % 10 < o2.alter % 10) {
						return -1;
					} else {
						return 0;
					}

				}

			};

			Collections.sort(num, com);
			for(Student1 i : num) {
				System.out.println(i);
			}
			
		}

	}

