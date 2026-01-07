package arrayList;



import java.util.ArrayList;
import java.util.List;

record Professor(String name, String specialization) 
{
	
}

class Department 
{
    private String nameOfDept;
    private List<Professor> professors;

    public Department(String nameOfDept) 
    {
        this.nameOfDept = nameOfDept;
        this.professors = new ArrayList<>();
    }

    public void addProfessor(Professor professor) {
        this.professors.add(professor);
    }

    public String getNameOfDept() {
        return nameOfDept;
    }

    public List<Professor> getProfessors() {
        return professors;
    }
}

public class ArrayListDemo7 {
    public static void main(String[] args) {
        Department dept = new Department("CSE");
        dept.addProfessor(new Professor("James", "Java"));
        dept.addProfessor(new Professor("Dennis", "C"));
        dept.addProfessor(new Professor("Lee", "HTML"));

        System.out.println("List of professors in " + dept.getNameOfDept() + " department:");
        dept.getProfessors().forEach(System.out::println);

        dept = new Department("EEE");
        dept.addProfessor(new Professor("Scott", "Digital Elec"));
        dept.addProfessor(new Professor("Allen", "Engineering Drawing"));
        dept.addProfessor(new Professor("Smith", "Logic Design"));

        System.out.println("List of professors in " + dept.getNameOfDept() + " department:");
        dept.getProfessors().forEach(System.out::println);
    }
}
