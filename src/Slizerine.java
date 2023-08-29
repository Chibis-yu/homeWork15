public class Slizerine extends Hogvarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public Slizerine(String fullName, int cunning, int determination, int ambition, int resourcefulness, int lustForPower, int magic, int distanceMagic) {
        super(fullName, magic, distanceMagic);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public void studentCompareSlizerine(Slizerine student) {
        int sum1 = this.getCunning() + this.getDetermination() + this.getAmbition() + this.getResourcefulness() + this.getLustForPower();
        int sum2 = student.getCunning() + student.getDetermination() + student.getAmbition() + student.getResourcefulness() + student.getLustForPower();
        if (sum1 > sum2) {
            System.out.println(this.getFullName() + " самый сильный на факультете Слизерине ");
        } else {
            System.out.println(" самый сильный на факультете Слизерине " + student.getFullName());
        }
    }

    @Override
    public String toString() {
        return "Slizerine{" +
                "cunning=" + cunning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", lustForPower=" + lustForPower +
                "} " + super.toString();
    }
}
