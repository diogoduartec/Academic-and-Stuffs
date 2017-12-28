package polymorphism.classes;

public class PaymentRecord {
    public void paymentRecord(Employee employee){
        System.out.println("Payment Recording:");
        employee.calculatePayment();
        System.out.println("Name: "+employee.name+"     Salary: "+employee.salary);
        if(employee instanceof Manager)
            System.out.println("Profit Sharing: "+((Manager) employee).getProfitSharing());
        else if(employee instanceof Seller)
            System.out.println("Sales Amount: "+((Seller) employee).getSalesAmount());
    }

}
