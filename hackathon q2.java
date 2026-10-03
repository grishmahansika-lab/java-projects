import java.util.Scanner;

public class SolarDataTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Panel ID: ");
        int panelId = scanner.nextInt();

        System.out.print("Enter Energy Generated (kWh): ");
        double energyGenerated = scanner.nextDouble();

        System.out.print("Enter Number of Solar Panels: ");
        int numberOfPanels = scanner.nextInt();

        System.out.print("Enter System Status (A/I/etc.): ");
        char systemStatus = scanner.next().charAt(0);

        System.out.println("\n--- Rooftop Solar System Details ---");
        System.out.println("Panel ID: " + panelId);
        System.out.println("Energy Generated: " + energyGenerated + " kWh");
        System.out.println("Number of Panels: " + numberOfPanels);
        System.out.println("System Status: " + systemStatus);

        scanner.close();
    }
}