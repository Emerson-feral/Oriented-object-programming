public class Employee extends People {
    
    private String department;
    private Boolean working;

    public void changeWork(){
        this.setWorking(!working);
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    
    public Boolean getWorking() {
        return working;
    }

    public void setWorking(Boolean working) {
        this.working = working;
    }
}
