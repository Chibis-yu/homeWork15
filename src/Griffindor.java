public class Griffindor<student2> extends Hogvarts {
    private int nobility;
    private int honor;
    private int bravery;

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    public Griffindor(String fullName, int nobility, int honor, int bravery, int magic, int distanceMagic) {
        super(fullName, magic, distanceMagic);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public static void studentCompareGriffindor(Griffindor student1, Griffindor student2) {
        int sum1 = student1.getNobility() + student1.getHonor() + student1.getBravery();
        int sum2 = student2.getNobility() + student2.getHonor() + student2.getBravery();
        if (sum1 > sum2) {
            System.out.println(student1.getFullName() + " самый сильный на факультете Гриффиндор");
        } else {
            System.out.println(" самый сильный на факультете Гриффиндор " + student2.getFullName());
        }
    }

    @Override
    public String toString() {
        return "Griffindor{" +
                "nobility=" + nobility +
                ", honor=" + honor +
                ", bravery=" + bravery +
                "} " + super.toString();
    }

    }


