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
    public static void studentCompareHogvarts(Hogvarts student1, Hogvarts student2) {
        int sum1 = student1.getMagic() + student1.getDistanceMagic();
        int sum2 = student2.getMagic() + student2.getDistanceMagic();
        if (sum1 > sum2) {
            System.out.println(student1.getFullName() + " самый сильный в Университете Хогвартс ");
        } else {
            System.out.println(" самый сильный в Университете Хогвартс " + student2.getFullName());
        }
    }

    @Override
    public String toString() {
        return fullName + " имя " + " магия " + magic + " расстояние магии " + distanceMagic;
    }
}




