/*
Write a Java program to create a class called Employee with private instance variables employee_id, employee_name, and employee_salary.
Provide public getter and setter methods to access and modify the id and name variables,
and salary variable
and display the details of employee in a formatted String*/

class employee{
    private int employee_id;
    private String employee_name;
    private int  employee_salary;

//


    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
    }

    public String getEmployee_name() {
        return employee_name;
    }

    public void setEmployee_salary(int employee_salary) {
        this.employee_salary = employee_salary;
    }

    public int getEmployee_salary() {
        return employee_salary;
    }
    String display()
    {
        return "id:"+ employee_id+" Name:" +employee_name + " Salary:"+employee_salary;


    }
}

public class jp1 {
    public static void main(String[] args) {
      employee obj= new employee();
      obj.setEmployee_id(101);
      obj.setEmployee_name("Rushikesh");
      obj.setEmployee_salary(1234557);
//        System.out.println(obj.getEmployee_id());
//        System.out.println(obj.getEmployee_name());
//        System.out.println(obj.getEmployee_salary());
        System.out.println(obj.display());

    }
}
