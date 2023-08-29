public class Kogtevran extends Hogvarts{
    private int smart;
    private int wise;
    private int witty;
    private int creative;

    public Kogtevran (String fullName, int smart, int wise, int witty, int creative, int magic, int distanceMagic) {
        super(fullName, magic, distanceMagic);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.creative = creative;
    }
    public int getSmart() {
        return smart;
    }

    public int getWise() {
        return wise;
    }

    public int getWitty() {
        return witty;
    }

    public int getCreative() {
        return creative;
    }
    public void studentCompareKogtevran(Kogtevran student) {
        int sum1 = this.getSmart() + this.getWise() + this.getWitty() + this.getCreative();
        int sum2 = student.getSmart() + student.getWise() + student.getWitty() + student.getCreative();
        if (sum1 > sum2) {
            System.out.println(this.getFullName() + " самый сильный на факультете Когтевран ");
        } else {
            System.out.println(" самый сильный на факультете Когтевран " + student.getFullName());
        }
    }

    @Override
    public String toString() {
        return "Kogtevran{" +
                "smart=" + smart +
                ", wise=" + wise +
                ", witty=" + witty +
                ", creative=" + creative +
                "} " + super.toString();
    }
}
