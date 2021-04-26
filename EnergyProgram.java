/*
* This program tells the user the energy that an object
* could release given its mass.
*
* @author  Patrick Gemmell
* @version 1.0
* @since   2021-04-23
*/

import java.util.Scanner;

public final class EnergyProgram {
    private EnergyProgram() {

    }
  /**
   * This function converts mass directly to energy.
   * @param args
   */
  public static void main(final String[] args) {

    // Constants
    final double speedOfLight = 2.998 * Math.pow(10, 8);
    final double bombConstant = 4 * Math.pow(10, 12);

    // Input
    Scanner massInput = new Scanner(System.in);
    System.out.println("Enter the mass of the object (in kilograms):");
    double objectMass = massInput.nextDouble();

    // Process
    double energyReleased = objectMass * Math.pow(speedOfLight, 2);
    double numberOfBombs = energyReleased / bombConstant;

    // Output
    System.out.println();
    System.out.println(energyReleased + "j " + numberOfBombs);
  }
}
