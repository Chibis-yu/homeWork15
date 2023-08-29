public class Griffindor extends Hogvarts {
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

    public void studentCompareGriffindor(Griffindor student) {
        int sum1 = this.getNobility() + this.getHonor() + this.getBravery();
        int sum2 = student.getNobility() + student.getHonor() + student.getBravery();
        if (sum1 > sum2) {
            System.out.println(this.getFullName() + " самый сильный на факультете Гриффиндор");
        } else {
            System.out.println(" самый сильный на факультете Гриффиндор " + student.getFullName());
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


