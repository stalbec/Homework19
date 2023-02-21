public enum SunSystem {
    EARTH("Earth is blue"),
    MARS("Mars is red"),
    SATURN("Saturn gas planet"),
    Jupiter("Saturn is the biggest planet"),
    ;

    private String descriptionOfPlanet;
    SunSystem(String descriptionOfPlanet){
        this.descriptionOfPlanet = descriptionOfPlanet;
    }

    public String getDescriptionOfPlanet() {
        return descriptionOfPlanet;
    }
}
