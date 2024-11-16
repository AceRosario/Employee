public class Manager extends Employee {
    private double pctBonus;
    private double travelExpense;

    public Manager(String n, double s,double pct, double te) {
        super(n, s);
        this.pctBonus = pct;
        this.travelExpense = te;
    }

    public double getPctBonus() {
        return pctBonus;
    }

    public double getTravelExpense() {
        return travelExpense;
    }

    public double getComputeBonus() {
        double bonus = (salary * pctBonus) + 500;
        return bonus;
    }
}
