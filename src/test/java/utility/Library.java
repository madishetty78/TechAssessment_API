package utility;

import org.testng.Assert;

import java.io.*;
import java.nio.file.Paths;
import java.sql.*;
import java.util.*;


public class Library {

    private Connection connection;

    ArrayList<String> InstID = new ArrayList<String>();
    ArrayList<String> InstName = new ArrayList<String>();
    ArrayList<String> InstISIN = new ArrayList<String>();
    ArrayList<String> InstUnitPrice = new ArrayList<String>();

    ArrayList<String> PosID = new ArrayList<String>();
    ArrayList<String> PosInstID = new ArrayList<String>();
    ArrayList<String> PosQty = new ArrayList<String>();

    ArrayList<String> OutID = new ArrayList<String>();
    ArrayList<String> OutPosID = new ArrayList<String>();
    ArrayList<String> OutISIN = new ArrayList<String>();
    ArrayList<String> OutQty = new ArrayList<String>();
    ArrayList<String> OutTotalPrice = new ArrayList<String>();

    public String getDetailsFromProperty(String param) throws IOException {
        InputStream input = new FileInputStream("config.properties");
        Properties prop = new Properties();
        prop.load(input);
        return prop.getProperty(param);
    }

    public void readCsvValues(String fileName) {
        String InstrumentDetails_filePath = Paths.get("src/test/resources/app/in/"+ fileName + ".csv").toAbsolutePath().toString();
        String line;
        int lineCount = 0;
        if (fileName.equals("InstrumentDetails") )
        {
            String[] fields ={};

            try (BufferedReader br = new BufferedReader(new FileReader(InstrumentDetails_filePath))) {
                while ((line = br.readLine()) != null) {
                    // Split the line into fields using comma as the delimiter
                    fields = line.split(",");

                    if (fields.length > 0) {
                        InstID.add(fields[0]);
                        InstName.add(fields[1]);
                        InstISIN.add(fields[2]);
                        InstUnitPrice.add(fields[3]);
                    }
                    System.out.printf("%5S %5S %10S %10S ",InstID.get(lineCount), InstName.get(lineCount), InstISIN.get(lineCount), InstUnitPrice.get(lineCount));
                    System.out.println();
                    lineCount++;
                }
                System.out.println("Total number of columns in Instrument Details: " + fields.length);
                System.out.println("Total number rows Instrument Details: " + lineCount);
                System.out.println();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        else if(fileName.equals("PositionDetails"))
        {
            String[] fields ={};

            try (BufferedReader br = new BufferedReader(new FileReader(InstrumentDetails_filePath))) {
                while ((line = br.readLine()) != null) {
                    // Split the line into fields using comma as the delimiter
                    fields = line.split(",");

                    if (fields.length > 0) {
                        PosID.add(fields[0]);
                        PosInstID.add(fields[1]);
                        PosQty.add(fields[2]);
                    }
                    System.out.printf("%5S %12S %8S ",PosID.get(lineCount), PosInstID.get(lineCount), PosQty.get(lineCount));
                    System.out.println();
                    lineCount++;
                }
                System.out.println("Total number of columns in Position Details: " + fields.length);
                System.out.println("Total number rows Position Details: " + lineCount);
                System.out.println();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public void transformNGenerateReport() {
        String PositionReport_filePath = Paths.get("src/test/resources/app/out/PositionReport.csv").toAbsolutePath().toString();

        // Add Headers to the Output report PositionReport.csv
        OutID.add("ID");
        OutPosID.add("PositionID");
        OutISIN.add("ISIN");
        OutQty.add("Quantity");
        OutTotalPrice.add("Total Price");

        System.out.printf("%5S %10S %10S %10S %11S",OutID.get(0), OutPosID.get(0), OutISIN.get(0),OutQty.get(0),OutTotalPrice.get(0));
        System.out.println();

        CSVWriter csvWriter = new CSVWriter(PositionReport_filePath);
        try {
            ArrayList<Map<String, String>> poiData = new ArrayList<>();

            // Data Processing Logic
            for (int i = 1; i < InstID.size(); i++) {
                for (int j = 1; j < PosInstID.size(); j++) {
                    if (InstID.get(i).equals(PosInstID.get(j))) {

                        LinkedHashMap<String, String> poItems = new LinkedHashMap<>();

                        poItems.put("ID", PosInstID.get(j));
                        poItems.put("PositionID",PosID.get(j));
                        poItems.put("ISIN", InstISIN.get(j));
                        poItems.put("Quantity", PosQty.get(j));

                        OutID.add(PosInstID.get(j));
                        OutPosID.add(PosID.get(j));
                        OutISIN.add(InstISIN.get(j));
                        OutQty.add(PosQty.get(j));

                        Double total = Double.parseDouble(PosQty.get(j)) * Double.parseDouble(InstUnitPrice.get(i));
                        OutTotalPrice.add(Double.toString(total));

                        poItems.put("Total Price", Double.toString(total));
                        poiData.add(poItems);
                        break;
                    }
                }

                System.out.printf("%5S %10S %10S %10S %11S", OutID.get(i), OutPosID.get(i), OutISIN.get(i), OutQty.get(i), OutTotalPrice.get(i));
                System.out.println();
            }
            csvWriter.writeCSV(PositionReport_filePath, poiData);
        }catch (Exception e) {
            e.printStackTrace();
        }

    }


}
