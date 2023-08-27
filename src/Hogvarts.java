public class Hogvarts {
    private String fullName;
    private int magic;
    private int distanceMagic;

    public int getMagic() {
        return magic;
    }

    public int getDistanceMagic() {
        return distanceMagic;
    }

    public String getFullName() {
        return fullName;
    }

    public Hogvarts(String fullName, int magic, int distanceMagic) {
        this.fullName = fullName;
        this.magic = magic;
        this.distanceMagic = distanceMagic;
    }

    @Override
    public String toString() {
        return "Hogvarts{" +
                "fullName='" + fullName + '\'' +
                ", magic=" + magic +
                ", distanceMagic=" + distanceMagic +
                '}';
    }

    public void compare(Hogvarts hogvarts) {
        if (magic + distanceMagic > hogvarts.getMagic() + hogvarts.getDistanceMagic()) {
            System.out.println("самый сильный маг в Хогвартс " + hogvarts.getFullName());
        } else {
            System.out.println(hogvarts.getFullName() + " самый сильный маг в Хогвартс ");
        }
        }
    }




