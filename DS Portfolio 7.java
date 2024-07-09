import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PartsInventoryControl {

    private static final int LOW_COUNT_THRESHOLD = 5;
    private static final int OUT_OF_STOCK_THRESHOLD = 0;

    private Map<String, Part> partsMap = new HashMap<>();

    public static void main(String[] args) {
        PartsInventoryControl pic = new PartsInventoryControl();
        pic.loadMasterFile("Program7Master.txt");
        pic.processTransactionFile("Program7Transaction.txt");
        pic.printReport();
    }

    private void loadMasterFile(String fileName) {
        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine().trim();
                if (!line.isEmpty()) {
                    String[] fields = line.split("\\s+");
                    String partId = fields[0];
                    String partName = fields[1];
                    int quantityOnHand = Integer.parseInt(fields[2]);
                    int orderPoint = Integer.parseInt(fields[3]);
                    String jobSite = fields[4];
                    partsMap.put(partId, new Part(partId, partName, quantityOnHand, orderPoint, jobSite));
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private void processTransactionFile(String fileName) {
        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine().trim();
                if (!line.isEmpty()) {
                    String[] fields = line.split("\\s+");
                    String partId = fields[0];
                    String jobSite = fields[1];
                    int quantityChange = Integer.parseInt(fields[2]);
                    if (partsMap.containsKey(partId)) {
                        Part part = partsMap.get(partId);
                        part.updateQuantity(jobSite, quantityChange);
                    }
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private void printReport() {
        for (Part part : partsMap.values()) {
            System.out.printf("%-10s %-20s %-10s %-10s %-10s%n",
                    part.getPartId(), part.getPartName(), part.getQuantityOnHand(),
                    part.getOrderPoint(), part.getJobSite());
            if (part.getQuantityOnHand() < OUT_OF_STOCK_THRESHOLD) {
                System.out.println(" OUT OF STOCK ");
            } else if (part.getQuantityOnHand() <= LOW_COUNT_THRESHOLD) {
                System.out.println(" LOW COUNT ");
            }
        }
    }

    private static class Part {
        private String partId;
        private String partName;
        private Map<String, Integer> quantityByJobSite = new HashMap<>();
        private int orderPoint;
        private String jobSite;

        public Part(String partId, String partName, int quantityOnHand, int orderPoint, String jobSite) {
            this.partId = partId;
            this.partName = partName;
            this.quantityByJobSite.put(jobSite, quantityOnHand);
            this.orderPoint = orderPoint;
            this.jobSite = jobSite;
        }

        public String getPartId() {
            return partId;
        }

        public String getPartName() {
            return partName;
        }

        public int getQuantityOnHand() {
            int totalQuantity = 0;
            for (int quantity : quantityByJobSite.values()) {
                totalQuantity += quantity;
            }
            return totalQuantity;
        }

        public int getOrderPoint() {
            return orderPoint;
        }

        public String getJobSite() {
            return jobSite