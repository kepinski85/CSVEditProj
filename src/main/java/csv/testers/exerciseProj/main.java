package csv.testers.exerciseProj;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;


public class main {
    private static final String SAMPLE_CSV_FILE_PATH = "People.csv";



    public static void main(String[] args) throws IOException {

        try (
                Reader reader = Files.newBufferedReader(Paths.get(SAMPLE_CSV_FILE_PATH));
                CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT
                        .withFirstRecordAsHeader()
                        .withIgnoreHeaderCase()
                        .withTrim())
        ) {
            for (CSVRecord csvRecord : csvParser) {
                // Accessing values by Header names
                String name = csvRecord.get("Name");
                String rate = csvRecord.get("Rate");
                String inventory = csvRecord.get("Inventory");


                System.out.println("Record No - " + csvRecord.getRecordNumber());
                System.out.println("---------------");
                System.out.println("Name : " + name);
                System.out.println("Rating : " + rate);
                System.out.println("Inventory : " + inventory);
                System.out.println("---------------\n\n");
            }
            //test

        }
            mkFile file = new mkFile();
            file.makeFile();
    }



}
