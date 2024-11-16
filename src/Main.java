import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String name, in;
        double salary, pctBonus, bonus, travelExpense;
        int optionCount;

        in = JOptionPane.showInputDialog("Enter number of Workers:");
        int numWorkers = Integer.parseInt(in);

        in = JOptionPane.showInputDialog("Enter number of Managers:");
        int numManagers = Integer.parseInt(in);

        in = JOptionPane.showInputDialog("Enter number of Executives:");
        int numExecutives = Integer.parseInt(in);

        int totalEmployees = numWorkers + numManagers + numExecutives;
        Employee[] emp = new Employee[totalEmployees];
        int empIndex = 0;

        for (int i = 0; i < numWorkers; i++) {
            name = JOptionPane.showInputDialog("Enter name for Worker #" + (i + 1) + ":");
            salary = Double.parseDouble(JOptionPane.showInputDialog("Enter salary for Worker #" + (i + 1) + ":"));
            pctBonus = Double.parseDouble(JOptionPane.showInputDialog("Enter bonus percentage for Worker #" + (i + 1) + ":"));
            emp[empIndex++] = new Worker(name, salary, pctBonus);
        }

        for (int i = 0; i < numManagers; i++) {
            name = JOptionPane.showInputDialog("Enter name for Manager #" + (i + 1) + ":");
            salary = Double.parseDouble(JOptionPane.showInputDialog("Enter salary for Manager #" + (i + 1) + ":"));
            pctBonus = Double.parseDouble(JOptionPane.showInputDialog("Enter bonus percentage for Manager #" + (i + 1) + ":"));
            travelExpense = Double.parseDouble(JOptionPane.showInputDialog("Enter travel expense for Manager #" + (i + 1) + ":"));
            emp[empIndex++] = new Manager(name, salary, pctBonus, travelExpense);
        }

        for (int i = 0; i < numExecutives; i++) {
            name = JOptionPane.showInputDialog("Enter name for Executive #" + (i + 1) + ":");
            salary = Double.parseDouble(JOptionPane.showInputDialog("Enter salary for Executive #" + (i + 1) + ":"));
            pctBonus = Double.parseDouble(JOptionPane.showInputDialog("Enter bonus percentage for Executive #" + (i + 1) + ":"));
            travelExpense = Double.parseDouble(JOptionPane.showInputDialog("Enter travel expense for Executive #" + (i + 1) + ":"));
            optionCount = Integer.parseInt(JOptionPane.showInputDialog("Enter option count for Executive #" + (i + 1) + ":"));
            emp[empIndex++] = new Executive(name, salary, pctBonus, travelExpense, optionCount);
        }

        StringBuilder outAll = new StringBuilder();
        for (Employee employee : emp) {
            name = employee.getName();
            salary = employee.getSalary();
            bonus = employee.computeBonus();

            outAll.append("Name: ").append(name).append("\n");
            outAll.append("Salary: ").append(salary).append("\n");
            outAll.append("PercentBonus: ").append(employee instanceof Worker ? ((Worker) employee).getPctBonus() :
                    (employee instanceof Manager ? ((Manager) employee).getPctBonus() : ((Executive) employee).getPctBonus())).append("\n");
            outAll.append("Total Bonus: ").append(bonus).append("\n\n");
        }

        JOptionPane.showMessageDialog(null, outAll.toString());
    }
}
