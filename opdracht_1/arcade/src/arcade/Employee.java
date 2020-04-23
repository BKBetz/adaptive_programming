package arcade;

public class Employee {
    private String name;
    private String role;

    public Employee(String nm, String rL) {
        this.name = nm;
        this.role = rL;
    }
    public void setEmployeeRole(String rL){
        this.role = rL;
    }

    public String getEmployeeRole() {
        return this.role;
    }

    public void fixMachine(Object mc) {

    }
}
