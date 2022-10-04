public class Employee {
    private String name;
    private int salary;
    private int workHours;
    private int hireYear;
    private int currentYear = 2021;

    public Employee(String name, int salary, int workHours, int hireYear) {
        setName(name);
        setSalary(salary);
        setWorkHours(workHours);
        setHireYear(hireYear);
        setCurrentYear(currentYear); // If you want to change the current year, you can add current year at
                                     // constructor.
        toStringg();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public double getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    public int getHireYear() {
        return hireYear;
    }

    public void setHireYear(int hireYear) {
        this.hireYear = hireYear;
    }

    public int getCurrentYear() {
        return currentYear;
    }

    public void setCurrentYear(int currentYear) {
        this.currentYear = currentYear;
    }

    public double salaryTax() {
        if (getSalary() < 1000) {
            return 0;
        } else
            return (getSalary() * 3) / 100;
    }

    public double bonus() {
        if (getWorkHours() > 40) {
            return ((getWorkHours() - 40) * 30);
        } else {
            return 0.0;
        }
    }

    public double raiseSalary() {
        double salaryYuzde5 = ((getSalary() * 5) / 100);
        double salaryYuzde10 = ((getSalary() * 10) / 100);
        double salaryYuzde15 = ((getSalary() * 15) / 100);

        boolean betweenZeroToNine = (getCurrentYear() - getHireYear() <= 9);
        boolean betweenTenToNineteen = (getCurrentYear() - getHireYear() >= 10)
                && (getCurrentYear() - getHireYear() <= 19);

        if (betweenZeroToNine) {
            return salaryYuzde5;
        } else if (betweenTenToNineteen) {
            return salaryYuzde10;
        } else {
            return salaryYuzde15;
        }
    }

    public void toStringg() {
        System.out.println("===================");
        double taxAndBonus = (getSalary() + bonus() - salaryTax());
        double workingYear = (getCurrentYear() - getHireYear());
        System.out.println("Employee's name\t\t\t\t: " + getName());
        System.out.println("Employee's hired year\t\t\t: " + getHireYear());
        System.out.println("Employee's salary\t\t\t: " + getSalary() + " TL");
        System.out.println("Tax\t\t\t\t\t: " + salaryTax() + " TL");
        System.out.println("Employee's bonus\t\t\t: " + bonus() + " TL");
        System.out.println("Working year\t\t\t\t: " + (int) workingYear +" Yıl");
        System.out.println("Employee's raise salary\t\t\t: " + raiseSalary() + " TL");
        System.out.println("Employee's salary with tax and bonus\t: " + taxAndBonus +" TL");
        System.out.println("Employee's final salary\t\t\t: " + (taxAndBonus + raiseSalary()) + " TL");
    }

}
