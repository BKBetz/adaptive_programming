package arcade;

public class Employee {
    private String name;
    private String role;

    public Employee(String nm, String rL) {
        this.name = nm;
        this.role = rL;
    }

    public void setName(String nm) {this.name = nm;}

    public String getName() {return this.name;}

    public void setEmployeeRole(String rL){
        this.role = rL;
    }

    public String getEmployeeRole() {
        return this.role;
    }

    public String fixMachine(Game gM, TicketStation tS ) {
        if(this.role == "mechanic") {
            String condition = "";
            if (gM != null && tS == null) {
                 condition = gM.getCondition();
            } else {
                 condition = tS.getCondition();
            }

            switch(condition) {
                case "optimal":
                    condition = "optimal";
                default:
                    condition = "good";
            }

            if (gM != null && tS == null) {
                gM.setCondition(condition);
            } else {
                tS.setCondition(condition);
            }

            return "The machine has been fixed";
        }
        else {
            return "you're not a mechanic";
        }
    }

    @Override
    public String toString() {
        String formattedString = String.format(
                "Name:%s role:%s \n",
                this.name, this.role
        );
        return formattedString;
    }
}
