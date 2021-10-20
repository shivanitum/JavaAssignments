import java.util.*;
import java.io.*;
import java.util.stream.Collectors;

public class Student{
    int id,age,yearOfEnrollment;
    String name,gender,engDepartment;
    double perTillDate;
    Student(int id,String name,int age,String gender,String engDepartment,int yearOfEnrollment,double perTillDate)
    {
        this.id=id;
        this.age=age;
        this.yearOfEnrollment=yearOfEnrollment;
        this.name=name;
        this.gender=gender;
        this.engDepartment=engDepartment;
        this.perTillDate=perTillDate;
    }
    public String getAllDetails()
    {  return id+" "+name+" "+age+" "+engDepartment+" "+yearOfEnrollment+" "+perTillDate+" "+gender ; }
    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    public int getAge() {
        return age;
    }
    public double getPerTillDate() {
        return perTillDate;
    }
    public int getYearOfEnrollment() {
        return yearOfEnrollment;
    }
    public String getEngDepartment() {
        return engDepartment;
    }
    public String getGender() {
        return gender;
    }
    public static void main(String args[])
   {
       List<Student> studentList=new ArrayList<>();
       studentList.add(new Student(111, "Jiya Brein", 17, "Female", "Computer Science", 2018, 70.8));
       studentList.add(new Student(122, "Paul Niksui", 18, "Male", "Mechanical", 2016, 50.2));
       studentList.add(new Student(133, "Martin Theron", 17, "Male", "Electronic", 2017, 90.3));
       studentList.add(new Student(144, "Murali Gowda", 18, "Male","Electrical", 2018, 80));
       studentList.add(new Student(155, "Nima Roy", 19, "Female", "Textile", 2016, 70));
       studentList.add(new Student(166, "Iqbal Hussain", 18, "Male", "Security", 2016, 70));
       studentList.add(new Student(177, "Manu Sharma", 16, "Male", "Chemical", 2018, 70));
       studentList.add(new Student(188, "Wang Liu", 20, "Male", "Computer Science", 2015, 80));
       studentList.add(new Student(199, "Amelia Zoe", 18, "Female", "Computer Science", 2016, 85));
       studentList.add(new Student(200, "Jaden Dough", 18, "Male", "Security", 2015, 82));
       studentList.add(new Student(211, "Jasna Kaur", 20, "Female", "Electronic", 2019, 83));
       studentList.add(new Student(222, "Nitin Joshi", 19, "Male", "Textile", 2016, 60.4));
       studentList.add(new Student(233, "Jyothi Reddy", 16, "Female", "Computer Science", 2015, 45.6));
       studentList.add(new Student(244, "Nicolus Den", 16, "Male", "Electronic", 2017, 95.8));
       studentList.add(new Student(255, "Ali Baig", 17, "Male", "Electronic", 2018, 88.4));
       studentList.add(new Student(266, "Sanvi Pandey", 17, "Female", "Electronic", 2019, 72.4));
       studentList.add(new Student(277, "Anuj Chettiar", 18, "Male", "Computer Science", 2017, 57.5));
       System.out.println("1.names of all departments in the college:");
       studentList.stream() .map(Student::getEngDepartment).distinct().forEach(System.out::println);
       System.out.println("2.names of all students who have enrolled after 2018:");
       studentList.stream().filter(s->s.getYearOfEnrollment()>2018).map(Student::getName).forEach(System.out::println);
       System.out.println("3.details of all male student in the computer sci department:");
       studentList.stream().filter(s->s.getGender().equals("Male")).filter(s->s.getEngDepartment().equals("Computer Science")).map(Student::getAllDetails).forEach(System.out::println);
       Map<String, Long> counting = studentList.stream().collect(Collectors.groupingBy(Student::getGender, Collectors.counting()));
       System.out.println("4.male and female students count:  "+counting);
       Map<String, Long> countInDepartments = studentList.stream().collect(Collectors.groupingBy(Student::getEngDepartment, Collectors.counting()));
       System.out.println("5.number of students in each department: "+countInDepartments);
       Map<String, Long> countOfMaleAndFemaleInDept = studentList.stream().filter(s->s.getEngDepartment().equals("Computer Science")).collect(Collectors.groupingBy(Student::getGender, Collectors.counting()));
       System.out.println("6.male and female students in the computer science department: "+countOfMaleAndFemaleInDept);
       System.out.println("7.average age of male and female students: "+studentList.stream().collect(Collectors.groupingBy(Student::getGender,Collectors.averagingInt(p -> p.getAge()))));
       System.out.println("8.average percentage achieved in each department: "+studentList.stream().collect(Collectors.groupingBy(Student::getEngDepartment,Collectors.averagingInt(p -> (int) p.getPerTillDate()))));
       System.out.println("9.student having highest percentage: "+studentList.stream().collect(Collectors.maxBy(Comparator.comparing(Student::getPerTillDate))).map(Student::getAllDetails));
       System.out.println("10.youngest male student in the Electronic department: "+studentList.stream().filter(s->s.getGender().equals("Male")).filter(s->s.getEngDepartment().equals("Electronic")).collect(Collectors.minBy(Comparator.comparing(Student::getAge))).map(Student::getAllDetails));

   }
}
