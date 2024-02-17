// CommissionEmployee.java - Update comment to "Gross salary" instead of "Gross sales"
public class CommissionEmployee extends Employee {
    private double commissionRate;
    private double grossSalary; // Changed from grossSales to grossSalary

    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double commissionRate, double grossSalary) {
        super(firstName, lastName, socialSecurityNumber);
        this.commissionRate = commissionRate;
        this.grossSalary = grossSalary; // Changed from grossSales to grossSalary
    }

    // Getters and setters
    public double getCommissionRate() { return commissionRate; }
    public double getGrossSalary() { return grossSalary; } // Changed from getGrossSales to getGrossSalary
    public void setCommissionRate(double commissionRate) { this.commissionRate = commissionRate; }
    public void setGrossSalary(double grossSalary) { this.grossSalary = grossSalary; } // Changed from setGrossSales to setGrossSalary
}