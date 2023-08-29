public class Puffenduy extends Hogvarts {

    private int industriouness;
    private int loyalty;
    private int honesty;


    public Puffenduy (String fullName, int industriouness, int loyalty, int honesty, int magic, int distanceMagic) {
        super(fullName, magic, distanceMagic);
        this.industriouness = industriouness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }
    public int getIndustriouness() {
        return industriouness;
    }
    public int getLoyalty() {
        return loyalty;
    }
    public int getHonesty() {
        return honesty;
    }

    public void studentComparePuffenduy(Puffenduy student) {
        int sum1 = this.getIndustriouness() + this.getLoyalty() + this.getHonesty();
        int sum2 = student.getIndustriouness() + student.getLoyalty() + student.getHonesty();
        if (sum1 > sum2) {
            System.out.println(this.getFullName() + " самый сильный на факультете Пуффендуй");
        } else {
            System.out.println(" самый сильный на факультете Пуффендуй " + student.getFullName());
        }
    }

    @Override
    public String toString() {
        return "Puffenduy{" +
                "industriouness=" + industriouness +
                ", loyalty=" + loyalty +
                ", honesty=" + honesty +
                "} " + super.toString();
    }
}

