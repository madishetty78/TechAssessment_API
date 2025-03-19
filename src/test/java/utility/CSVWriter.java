package utility;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class CSVWriter {

    private String filePath;
    public CSVWriter(String filePath) {
        this.filePath = filePath;
    }

    public void writeCSV(String filePath, List<Map<String, String>> data) {
        if (data == null || data.isEmpty()) {
            throw new IllegalArgumentException("Data list is empty or null");
        }

        try (FileWriter writer = new FileWriter(filePath)) {
            // Write CSV header
            Map<String, String> headerMap = data.get(0);
            String header = String.join(",", headerMap.keySet());
            writer.write(header + "\n");

            // Write CSV rows
            for (Map<String, String> row : data) {
                String rowData = String.join(",", row.values());
                writer.write(rowData + "\n");

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
