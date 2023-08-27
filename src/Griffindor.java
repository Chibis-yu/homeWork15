public class Griffindor extends Hogvarts {
        private int nobility;
        private int honor;
        private int bravery;

        public void compare(Hogvarts hogvarts) {
            if (getNobility() + getHonor() + getBravery() < nobility + honor + bravery) {
                System.out.println(hogvarts.getFullName() + " самый сильный на факультете Гриндорс");
            } else {
                System.out.println(" самый сильный на факультете Гриндорс " + hogvarts.getFullName());
            }
        }
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

    @Override
    public String toString() {
        return "Griffindor{" +
                "nobility=" + nobility +
                ", honor=" + honor +
                ", bravery=" + bravery +
                "} " + super.toString();
    }
}
