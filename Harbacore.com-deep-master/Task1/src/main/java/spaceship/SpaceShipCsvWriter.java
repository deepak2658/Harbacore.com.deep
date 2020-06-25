package spaceship;
import com.opencsv.CSVWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SpaceShipCsvWriter {
        public void doWriter() throws IOException{
            CSVWriter writer = new CSVWriter(new FileWriter("spacename.csv"),';','"','/',CSVWriter.DEFAULT_LINE_END);
            List<String[]> therows = new ArrayList<>();
            String[] header = new String[]{"id","name","crew","launchdate"};
            therows.add(header);
            String[] row1 = new String[]{"id","name","crew","launchdate"};
            String[] row2 = new String[]{"id","name","crew","launchdate"};
            therows.add(row1);
            therows.add(row2);

            writer.writeAll(therows);
            writer.close();
        }

}

