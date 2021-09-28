public class Technician extends Student {
    
    private Integer professionalRegister;
    
    public void practice(){
        
        System.out.println(this.getName() + " is practicing");
    }


    public Integer getProfessionalRegister() {
        return this.professionalRegister;
    }

    public void setProfessionalRegister(Integer professionalRegister) {
        this.professionalRegister = professionalRegister;
    }

}
