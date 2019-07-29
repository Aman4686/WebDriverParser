package Parsers;


import au.com.bytecode.opencsv.CSVWriter;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class WriteToCSV {

    public void writeFromList(ArrayList<AliProduct> aliProducts){
        try {
            File csv = new File("./result.csv");
            CSVWriter writer = new CSVWriter(new FileWriter(csv, true));

            for(AliProduct aliProduct : aliProducts){
                String [] record = aliProduct.toString().split(";");
                writer.writeNext(record);
            }

            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
