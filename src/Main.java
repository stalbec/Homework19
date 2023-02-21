public class Main {
    public static void main(String[] args) {
        SunSystem[] sunSystems = SunSystem.values();
        for (SunSystem s:sunSystems) {
            System.out.println(s +"  "+ s.getDescriptionOfPlanet());

        }
    }
}