

import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class FindInstrument {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        initializeInventory(inventory);

        Map properties = new HashMap();
        properties.put("builder", Builder.GIBSON);
        properties.put("backWood", Wood.MAPLE);
        InstrumentSpec clientSpec = new InstrumentSpec(properties);

        List<Instrument> matchingInstruments = inventory.search(clientSpec);
        if (!matchingInstruments.isEmpty()) {
            System.out.println("You might like these instruments:");
            for (Instrument instrument: matchingInstruments) {
                InstrumentSpec spec = instrument.getSpec();
                System.out.println("We have a " + 
                        spec.getProperty("instrumentType") + " with the following properties:");
                for (String propertyName : spec.getProperties().keySet()) {
                    if (propertyName.equals("instrumentType")) {
                        continue;
                    }
                    System.out.println("    " + propertyName + ": " + spec.getProperty(propertyName));
                }
                System.out.println("  You can have this " + 
                        spec.getProperty("instrumentType") + " for $" + 
                        instrument.getPrice() + "\n---");
            }
        } else {
            System.out.println("Sorry, we have nothing for you.");
        }
    }

    private static void initializeInventory(Inventory inventory) {
        Map properties = new HashMap();
        properties.put("instrumentType", InstrumentType.GUITAR);
        properties.put("builder", Builder.COLLINGS);
        properties.put("model", "CJ");
        properties.put("type", Type.ACOUSTIC);
        properties.put("numStrings", 6);
        properties.put("topWood", Wood.INDIAN_ROSEWOOD);
        properties.put("backWood", Wood.SITKA);
        inventory.addInstrument("11277", 3999.95, new InstrumentSpec(properties));

        properties.clear();
        properties.put("instrumentType", InstrumentType.GUITAR);
        properties.put("builder", Builder.MARTIN);
        properties.put("model", "D-18");
        properties.put("type", Type.ACOUSTIC);
        properties.put("numStrings", 6);
        properties.put("topWood", Wood.ADIRONDACK);
        properties.put("backWood", Wood.MAHOGANY);
        inventory.addInstrument("122784", 5495.95, new InstrumentSpec(properties));

        properties.clear();
        properties.put("instrumentType", InstrumentType.GUITAR);
        properties.put("builder", Builder.FENDER);
        properties.put("model", "Stratocastor");
        properties.put("type", Type.ELECTRIC);
        properties.put("numStrings", 6);
        properties.put("topWood", Wood.ALDER);
        properties.put("backWood", Wood.ALDER);
        inventory.addInstrument("V95693", 1499.95, new InstrumentSpec(properties));

        properties.clear();
        properties.put("instrumentType", InstrumentType.GUITAR);
        properties.put("builder", Builder.FENDER);
        properties.put("model", "Stratocastor");
        properties.put("type", Type.ELECTRIC);
        properties.put("numStrings", 6);
        properties.put("topWood", Wood.ALDER);
        properties.put("backWood", Wood.ALDER);
        inventory.addInstrument("V9512", 1549.95, new InstrumentSpec(properties));

        properties.clear();
        properties.put("instrumentType", InstrumentType.GUITAR);
        properties.put("builder", Builder.GIBSON);
        properties.put("model", "Les Paul");
        properties.put("type", Type.ELECTRIC);
        properties.put("numStrings", 6);
        properties.put("topWood", Wood.MAPLE);
        properties.put("backWood", Wood.MAPLE);
        inventory.addInstrument("70108276", 2295.95, new InstrumentSpec(properties));

        properties.clear();
        properties.put("instrumentType", InstrumentType.GUITAR);
        properties.put("builder", Builder.GIBSON);
        properties.put("model", "SG '61 Reissue");
        properties.put("type", Type.ELECTRIC);
        properties.put("numStrings", 6);
        properties.put("topWood", Wood.MAHOGANY);
        properties.put("backWood", Wood.MAHOGANY);
        inventory.addInstrument("82765501", 1890.95, new InstrumentSpec(properties));

        properties.clear();
        properties.put("instrumentType", InstrumentType.MANDOLIN);
        properties.put("builder", Builder.GIBSON);
        properties.put("model", "F5-G");
        properties.put("type", Type.ACOUSTIC);
        properties.put("topWood", Wood.MAPLE);
        properties.put("backWood", Wood.MAPLE);
        properties.put("style", Style.A);
        inventory.addInstrument("9019920", 5495.99, new InstrumentSpec(properties));

        properties.clear();
        properties.put("instrumentType", InstrumentType.BANJO);
        properties.put("builder", Builder.GIBSON);
        properties.put("model", "RB-3 Wreath"); 
        properties.put("numStrings", 5);
        properties.put("type", Type.ACOUSTIC);
        properties.put("backWood", Wood.MAPLE);
        inventory.addInstrument("8900231", 2945.95, new InstrumentSpec(properties));



    }
}
