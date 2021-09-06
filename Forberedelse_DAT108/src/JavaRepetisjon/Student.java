package JavaRepetisjon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Student implements Comparable<Student> {

	private String studnr;
	private String fornavn;
	private String etternavn;
	private String studiested;

	public Student(String studnr, String fornavn, String etternavn, String studiested) {
		this.studnr = studnr;
		this.fornavn = fornavn;
		this.etternavn = etternavn;
		this.studiested = studiested;
	}

	public String getStudnr() {
		return studnr;
	}

	public void setStudnr(String studnr) {
		this.studnr = studnr;
	}

	public String getFornavn() {
		return fornavn;
	}

	public void setFornavn(String fornavn) {
		this.fornavn = fornavn;
	}

	public String getEtternavn() {
		return etternavn;
	}

	public void setEtternavn(String etternavn) {
		this.etternavn = etternavn;
	}

	public String getStudiested() {
		return studiested;
	}

	public void setStudiested(String studiested) {
		this.studiested = studiested;
	}

	@Override
	public String toString() {
		return "" + studnr + " " + fornavn + " " + etternavn + " "
				+ studiested + "";
	}

	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((studnr == null) ? 0 : studnr.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (studnr == null) {
			if (other.studnr != null)
				return false;
		} else if (!studnr.equals(other.studnr))
			return false;
		return true;
	}

	public static void main(String[] args) {
		List<Student> liste = new ArrayList<>();

		Student stud1 = new Student("323", "Per", "Persen", "HVL");
		Student stud2 = new Student("124", "Atle", "Persen", "HVL");
		Student stud3 = new Student("033", "Pernille", "Persen", "HVL");
		Student stud4 = new Student("233", "Kari", "Persen", "HVL");
		Student stud5 = new Student("426", "Ola", "Persen", "HVL");

		liste.add(stud1);
		liste.add(stud2);
		liste.add(stud3);
		liste.add(stud4);
		liste.add(stud5);
		
		
		System.out.println(liste);
		
		Collections.sort(liste);
		
		System.out.println(liste);
		

//		Comparator sammenligner = new Comparator<Student>() {
//
//			public int compare(Student s1, Student s2) {
//
//				return String.valueOf(s1.studnr).compareTo(s2.studnr);
//
//			}
//		};
//
//		System.out.println(liste);
//		
//		liste.sort(sammenligner);
//
//
//		System.out.println(liste);
	}

	@Override
	public int compareTo(Student t) {
		
		//return studnr.compareTo(t.studnr);
		int sml =  etternavn.compareTo(t.etternavn);
		if (sml != 0) {
			return sml;
			
		} else {
			return fornavn.compareTo(t.fornavn);
		}
		
		
	}

}


















