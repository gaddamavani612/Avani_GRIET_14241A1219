import java.util.Date;
import java.util.Scanner;
import java.util.*;
import java.io.*;
/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
int index;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		// Add your implementation here
for(int i=1;i<=index;i++)
System.out.println(Student[i]);
		return null;
	}

	@Override
	public void setStudents(Student[] students) {
int c=index;
for(int i=1;i<arr.length(students);i++)
{
student[c+1]=student[i];
c++;
}
index=c;
		// Add your implementation here




	}

	@Override
	public Student getStudent(int index) {
		// Add your implementation here
 
System.out.println("index:"+index);
System.out.println("\nstudent:"+student);

		return null;
	}

	@Override
	public void setStudent(Student student, int index) {

      
		// Add your implementation here
        
	}

	@Override
	public void addFirst(Student student) {
Student.addFirst(student);       
		// Add your implementation here

	}

	@Override
	public void addLast(Student student) {
Student.addLast(student);
		// Add your implementation here
	}

	@Override
	public void add(Student student, int index) {
       
    Student.add(student,index);

		// Add your implementation here
	}

	@Override
	public void remove(int index) {
Student.remove(index);

		// Add your implementation here
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
Student.remove(student);
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
Student.removeFrom(index);
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
	}


	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		return null;
	}
}
