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

    public String fixMachine(Game gM, TicketStation tS ) {
        if(this.role == "mechanic") {
            int condition = 0;
            if (gM != null && tS == null) {
                 condition = gM.getCondition();
            } else {
                 condition = tS.getCondition();
            }

            switch(condition) {
                case 10:
                    condition = 10;
                    break;
                case 9:
                    condition = 10;
                    break;
                case 8:
                    condition = 10;
                    break;
                case 7:
                    condition = 10;
                    break;
                case 6:
                    condition = 7;
                    break;
                case 5:
                    condition = 7;
                    break;
                case 4:
                    condition = 7;
                    break;

                default:
                    condition = 6;
                    break;
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
