public class Employee2 {
    int empId;
    String empName;
    double basicSalary;
    double allowances;
    double deductions;

    public Employee2(int empIdP, String empNameP, double basicSalaryP, double allowancesP, double deductionsP) {
        empId = empIdP;
        empName = empNameP;
        basicSalary = basicSalaryP;
        allowances = allowancesP;
        deductions = deductionsP;
    }

    public double calculateTotalSalary() {
        return basicSalary + allowances - deductions;
    }

    public int getEmpId() {
        return empId;
    }
    public void setEmpId(int empIdP) {
        empId = empIdP;
    }

    public String getEmpName() {
        return empName;
    }
    public void setEmpName(String empNameP) {
        empName = empNameP;
    }

    public double getBasicSalary() {
        return basicSalary;
    }
    public void setBasicSalary(double basicSalaryP) {
        basicSalary = basicSalaryP;
    }

    public double getAllowances() {
        return allowances;
    }
    public void setAllowances(double allowancesP) {
        allowances = allowancesP;
    }

    public double getDeductions() {
        return deductions;
    }
    public void setDeductions(double deductionsP) {
        deductions = deductionsP;
    }
        public static void main(String[] args) {
            Employee2 employee = new Employee2(10021, "Samuel", 10000, 5000, 2000);
    
            double totalSalary = employee.calculateTotalSalary();
    
            System.out.println("Employee ID: " + employee.getEmpId());
            System.out.println("Employee Name: " + employee.getEmpName());
            System.out.println("Basic Salary: " + employee.getBasicSalary());
            System.out.println("Allowances: " + employee.getAllowances());
            System.out.println("Deductions: " + employee.getDeductions());
            System.out.println("Net Salary: " + totalSalary);
        }
    } 

