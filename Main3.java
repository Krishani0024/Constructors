class OldPhone {
    protected String name = "Unknown"; 
}

class NewPhone extends OldPhone {

}

public class Main3 {
    public static void main(String[] args) {
        NewPhone mgr = new NewPhone();
        mgr.name = "Mary"; 
        String mgrName = mgr.name; 
        System.out.println("Manager Name: " + mgrName);

        OldPhone emp = new OldPhone();
        emp.name = "Tom"; 
        String empName = emp.name; 
        System.out.println("Employee Name: " + empName);
    }
}

