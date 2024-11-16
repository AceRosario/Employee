public class Worker extends Employee {
    private double pctBonus;

    public Worker(String n, double s, double pctB) {
        super(n, s); // used to call employee?
        this.pctBonus = pctB;

    }
    public double getPctBonus(){
        return pctBonus;
    }

    public double computeBonus(){
        double bonus = (salary * pctBonus);
        return bonus;
    }



}
