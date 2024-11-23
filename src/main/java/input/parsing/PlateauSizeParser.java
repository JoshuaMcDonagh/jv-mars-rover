package input.parsing;

import entities.environment.PlateauSize;

// NOTE: Plateau size parser will only take String input.
//       Data validation should be handled with appropriate
//       verifier before data is passed in.
//
//       Verified string will return a RoverPosition with stated values.

public class PlateauSizeParser extends Parser <PlateauSize> {

    @Override
    public PlateauSize parse(String input){
        String[] coordinateValuesString = input.split(" ");
        int x = Integer.parseInt(coordinateValuesString[0]);
        int y= Integer.parseInt(coordinateValuesString[1]);

        if (x <= 0 && y <= 0) {
            x = PlateauSize.DEFAULT_X;
            y = PlateauSize.DEFAULT_Y;
            System.out.println("Invalid co-ordinate passed. Default values used.\n");
        } else if (x <= 0) {
            x = y;
            System.out.println("Invalid X coordinate. Y has been used for both.\n");
        } else if (y <= 0) {
            y = x;
            System.out.println("Invalid Y coordinate. X has been used for both.\n");
        }

        return new PlateauSize(x, y);
    }
}
