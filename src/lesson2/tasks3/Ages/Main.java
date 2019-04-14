package lesson2.tasks3.Ages;

public class Main {
    public static void main(String[] args) {
        int vasyaAge = 25;
        int katyaAge = 22;
        int mishaAge = 23;

        System.out.println("Min age = " + getMinAge(vasyaAge, katyaAge, mishaAge));
        System.out.println("Middle age = " + getMiddleAge(vasyaAge, katyaAge, mishaAge));
        System.out.println("Max age = " + getMaxAge(vasyaAge, katyaAge, mishaAge));
    }

    private static int getMiddleAge(int vasyaAge, int katyaAge, int mishaAge) {
        if (vasyaAge >= katyaAge && vasyaAge <= mishaAge || vasyaAge <= katyaAge && vasyaAge >= mishaAge) {
            return vasyaAge;
        }

        if (katyaAge >= vasyaAge && katyaAge <= mishaAge || katyaAge <= vasyaAge && katyaAge >= mishaAge ) {
            return katyaAge;
        }

        return mishaAge;
    }

    private static int getMaxAge(int vasyaAge, int katyaAge, int mishaAge) {
        int maxAge = vasyaAge;
        maxAge = maxAge < katyaAge ? katyaAge : maxAge;
        maxAge = maxAge < mishaAge ? mishaAge : maxAge;
        return maxAge;
    }

    private static int getMinAge(int vasyaAge, int katyaAge, int mishaAge) {
        int minAge = vasyaAge;
        minAge = minAge > katyaAge ? katyaAge : minAge;
        minAge = minAge > mishaAge ? mishaAge : minAge;
        return minAge;
    }
}
