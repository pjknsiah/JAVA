import java.io.*;
import java.util.*;

// Class to read responses from input and save to a file
class SurveyResponse {
    public static void saveResponses() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter survey responses separated by commas:");
        String inputLine = scanner.nextLine().trim();
        String[] parts = inputLine.split(",");
        scanner.close();

        String filePath = "output.txt";
        try (PrintWriter writer = new PrintWriter(new FileWriter(filePath))) {
            for (String part : parts) {
                String trimmed = part.trim();
                try {
                    int num = Integer.parseInt(trimmed);
                    if (num < 1 || num > 5) {
                        System.err.println("Invalid response: " + num + " (must be 1-5)");
                        continue;
                    }
                    writer.println(num);
                } catch (NumberFormatException e) {
                    System.err.println("Invalid response format: " + trimmed);
                }
            }
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }
}

// Class to process the survey responses from the file
class SurveyProcessor {
    public static Map<Integer, Integer> processResponses() {
        String filePath = "output.txt";
        List<Integer> responses = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                try {
                    int num = Integer.parseInt(line.trim());
                    responses.add(num);
                } catch (NumberFormatException e) {
                    System.err.println("Skipping invalid number: " + line);
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
            return new HashMap<>();
        }

        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : responses) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        return frequencyMap;
    }
}

// Class to write and display the survey results
class SurveyResults {
    public static void writeAndDisplayResults(Map<Integer, Integer> frequencyMap) {
        if (frequencyMap == null || frequencyMap.isEmpty()) {
            System.out.println("No data to process.");
            return;
        }

        String outputPath = "surveyoutput.txt";
        try (PrintWriter writer = new PrintWriter(new FileWriter(outputPath))) {
            for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
                String line = "Rating " + entry.getKey() + ": " + entry.getValue() + " times";
                writer.println(line);
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }
}

// Main class to test the application
public class TestSurveyApp {
    public static void main(String[] args) {
        SurveyResponse.saveResponses();
        Map<Integer, Integer> frequencies = SurveyProcessor.processResponses();
        SurveyResults.writeAndDisplayResults(frequencies);
    }
}