public class Main {

    public static void main(String[] args) {

        Planet earth = new Planet();
        earth.setColor("blue");
        earth.setName("earth");
        earth.setSize("10");


        System.out.println(generateOutput(earth));

    }

    private static String generateOutput(Planet planet){

        String output = "Planet name: " + planet.getName() + "\nPlanet color: " + planet.getColor() + "\nPlanet size: " + planet.getSize();
        return output;
    }
}
