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

    public void compare(Hogvarts hogvarts) {
        if (creative + witty + wise + smart > getCreative() + getWitty() + getWise() + getSmart()) {
            System.out.println(hogvarts.getFullName() + " самый сильный на факультете Когтевран");
        } else {
            System.out.println(" самый сильный на факультете Когтевран " + hogvarts.getFullName());
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
