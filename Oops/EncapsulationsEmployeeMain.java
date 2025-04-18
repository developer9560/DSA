public class EncapsulationsEmployeeMain {
    public static void main(String[]  args){
        EncapsulationEmployee e= new EncapsulationEmployee();
        e.setName("Suraj kumar");
        e.setId(24);
        e.setSalary(10000);
        System.out.println("Name: "+e.getName());
        System.out.println("Id: "+e.getId());
        System.out.println("Salary: "+e.getSalary());
        
    }
}
