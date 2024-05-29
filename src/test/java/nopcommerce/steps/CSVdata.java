package nopcommerce.steps;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVdata {

    public static Object[][] readCSV(String filePath) throws IOException {
        List<Object[]> records = new ArrayList<>();
        try (FileReader reader = new FileReader(filePath);
             CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT.withHeader())) {
            for (CSVRecord csvRecord : csvParser) {
                records.add(new Object[]{
                        csvRecord.get("gender"),
                        csvRecord.get("firstName"),
                        csvRecord.get("lastName"),
                        csvRecord.get("day"),
                        csvRecord.get("month"),
                        csvRecord.get("year"),
                        csvRecord.get("email"),
                        csvRecord.get("companyName"),
                        csvRecord.get("password"),
                        csvRecord.get("confirmPassword")
                });
            }
        }
        return records.toArray(new Object[0][]);
    }
}
