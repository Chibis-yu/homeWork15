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

    public static void studentComparePuffenduy(Puffenduy student1, Puffenduy student2) {
        int sum1 = student1.getIndustriouness() + student1.getLoyalty() + student1.getHonesty();
        int sum2 = student2.getIndustriouness() + student2.getLoyalty() + student2.getHonesty();
        if (sum1 > sum2) {
            System.out.println(student1.getFullName() + " самый сильный на факультете Пуффендуй");
        } else {
            System.out.println(" самый сильный на факультете Пуффендуй " + student2.getFullName());
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

