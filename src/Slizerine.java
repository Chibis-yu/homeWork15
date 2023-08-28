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

    public static void studentCompareSlizerine(Slizerine student1, Slizerine student2) {
        int sum1 = student1.getCunning() + student1.getDetermination() + student1.getAmbition() + student1.getResourcefulness() + student1.getLustForPower();
        int sum2 = student2.getCunning() + student2.getDetermination() + student2.getAmbition() + student2.getResourcefulness() + student2.getLustForPower();
        if (sum1 > sum2) {
            System.out.println(student1.getFullName() + " самый сильный на факультете Слизерине ");
        } else {
            System.out.println(" самый сильный на факультете Слизерине " + student2.getFullName());
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
