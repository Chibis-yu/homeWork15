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
    public void compare(Hogvarts hogvarts) {
        if (loyalty + honesty + industriouness > getLoyalty() + getHonesty() + getIndustriouness()) {
            System.out.println(hogvarts.getFullName() + " самый сильный на факультете Пуффендуй");
        } else {
            System.out.println(" самый сильный на факультете Пуффендуй " + hogvarts.getFullName());
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

