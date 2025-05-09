// Lớp trừu tượng Employee
abstract class Employee {
    public abstract double calculateBonus(double performanceScore);
}

// Lớp Manager kế thừa Employee
class Manager extends Employee {
    @Override
    public double calculateBonus(double performanceScore) {
        return 0.2 * performanceScore;
    }
}

// Lớp Developer kế thừa Employee
class Developer extends Employee {
    @Override
    public double calculateBonus(double performanceScore) {
        return 0.1 * performanceScore;
    }
}

// Kiểm tra chức năng
public class Main {
    public static void main(String[] args) {
        Employee manager = new Manager();
        Employee developer = new Developer();

        double score = 1000;
        System.out.println("Manager bonus: " + manager.calculateBonus(score));
        System.out.println("Developer bonus: " + developer.calculateBonus(score));
    }
}
