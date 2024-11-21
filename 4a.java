import java.util.Scanner;

public interface FixedDeposit {
    double getMAmount();
    void calculateInterest();
    void getDetails();
}

class CanaraBank implements FixedDeposit {
    Scanner s = new Scanner(System.in);
    String name;
    double principal;
    double period;
    double roi = 8.5; // Rate of Interest for Canara Bank
    double interestAmt;

    
    public void getDetails() {
        System.out.println("Enter your name:");
        name = s.nextLine();
        System.out.println("Enter the Principal amount:");
        principal = s.nextDouble();
        System.out.println("Enter the period of deposit (in years):");
        period = s.nextDouble();
    }

        public void calculateInterest() {
        interestAmt = (principal * period * roi) / 100;
    }

    public double getMAmount() {
        double totalBalance = principal + interestAmt;
        return totalBalance;
    }
}

    Scanner s = new Scanner(System.in);
    String name;
    double principal;
    double period;
    double roi = 8.75; // Rate of Interest for SBI
    double interestAmt;
    public void getDetails() {
        System.out.println("Enter your name:");
        name = s.nextLine();
        System.out.println("Enter the Principal amount:");
        principal = s.nextDouble();
        System.out.println("Enter the period of deposit (in years):");
        period = s.nextDouble();
    }

    public void calculateInterest() {
        interestAmt = (principal * period * roi) / 100;
    }

    public double getMAmount() {
        double totalBalance = principal + interestAmt;
        return totalBalance;
    }
}

public class TestBank {
    public static void main(String[] args) {
        double mAmount;
        
        SBI sbi = new SBI();
        CanaraBank cb = new CanaraBank();
        
        
        sbi.getDetails();
        sbi.calculateInterest();
        mAmount = sbi.getMAmount();
        System.out.println("Dear " + sbi.name + ", your Maturity Amount in SBI Bank is " + mAmount);
        
        cb.calculateInterest();
        mAmount = cb.getMAmount();
        System.out.println("Dear " + cb.name + ", your Maturity Amount in Canara Bank is " + mAmount);
    }
