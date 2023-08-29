public class Hogvarts {
    private String fullName;
    private int magic;
    private int distanceMagic;

    public Hogvarts(String fullName, int magic, int distanceMagic) {
        this.fullName = fullName;
        this.magic = magic;
        this.distanceMagic = distanceMagic;
    }

    public String getFullName() {
        return fullName;
    }

    public int getMagic() {
        return magic;
    }

    public int getDistanceMagic() {
        return distanceMagic;
    }
    public void studentCompareHogvarts(Hogvarts student) {
        int sum1 = this.getMagic() + this.getDistanceMagic();
        int sum2 = student.getMagic() + student.getDistanceMagic();
        if (sum1 > sum2) {
            System.out.println(this.getFullName() + " самый сильный в Университете Хогвартс ");
        } else {
            System.out.println(" самый сильный в Университете Хогвартс " + student.getFullName());
        }
    }

    @Override
    public String toString() {
        return fullName + " имя " + " магия " + magic + " расстояние магии " + distanceMagic;
    }
}




