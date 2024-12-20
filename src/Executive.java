public class Executive extends Employee {
    private double pctBonus;
    private double travelExpense;
    private int optionCount;

    public Executive(String n, double s, double pctB, double te, int oc) {
        super(n, s);
        this.pctBonus = pctB;
        this.travelExpense = te;
        this.optionCount = oc;
    }

    public double getPctBonus() {
        return pctBonus;
    }

    public double getTravelExpense(){
        return travelExpense;
    }

    public int getOptionCount(){
        return optionCount;
    }

    public double computeBonus(){
        double bonus = (salary * pctBonus) + 1000;
        return bonus;    }
}
