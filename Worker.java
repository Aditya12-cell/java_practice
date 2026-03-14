class employee{
    public int emp_id;
    public String name;
    public double emp_salary;

    public static String company_name = "ABC Company";

    public void printemp(){
        System.out.println("Employee id: "+emp_id);
        System.out.println("Employee name: "+name);
        System.out.println("Employee salary: "+emp_salary);
        System.out.println("Company name: "+company_name);
    }
}

 public class Worker {
     public static void main(String[] args) {
         employee e1 = new employee();
         employee e2 = new employee();

         e1.emp_id = 101;
         e1.name = "Aditya kumar";
         e1.emp_salary = 50000;

         e2.emp_id = 102;
         e2.name = "Aditya kumar";
         e2.emp_salary = 50000;

         e1.printemp();
         e2.printemp();
     }
    }