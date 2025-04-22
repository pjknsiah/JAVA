import java.io.*;
import java.util.Scanner;

class SurveyResponse {
    public void readAndSaveResponses(InputStream inputStream) {
        try {
            Scanner scanner = new Scanner(inputStream);
            File outputFile = new File("output.txt");
            PrintWriter writer = new PrintWriter(outputFile);
            while (scanner.hasNext()) {
                String token = scanner.next();
                try {
                    int response = Integer.parseInt(token);
                    writer.println(response);
                } catch (NumberFormatException e) {
                    System.err.println("Invalid response: " + token);
                }
            }
            writer.close();
            scanner.close();
        } catch (IOException e) {
            System.err.println("Error saving responses: " + e.getMessage());
        }
    }
}

class SurveyProcessor {
    public int[] processSurvey() {
        int[] frequency = new int[5];
        try {
            File inputFile = new File("output.txt");
            Scanner scanner = new Scanner(inputFile);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                try {
                    int response = Integer.parseInt(line.trim());
                    if (response >= 1 && response <= 5) {
                        frequency[response - 1]++;
                    } else {
                        System.err.println("Invalid response: " + response);
                    }
                } catch (NumberFormatException e) {
                    System.err.println("Invalid line: " + line);
                }
            }
            scanner.close();
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
            return new int[5]; // Return zeros if file cannot be read
        }
        return frequency;
    }
}

class SurveyResults {
    public void displayResults(int[] frequency, OutputStream outputStream) {
        try {
            File outputFile = new File("surveyoutput.txt");
            PrintWriter fileWriter = new PrintWriter(outputFile);
            PrintWriter streamWriter = new PrintWriter(new OutputStreamWriter(outputStream));
            for (int i = 0; i < 5; i++) {
                String line = "Rating " + (i + 1) + ": " + frequency[i];
                fileWriter.println(line);
                streamWriter.println(line);
            }
            fileWriter.close();
            streamWriter.flush();
        } catch (IOException e) {
            System.err.println("Error writing results: " + e.getMessage());
        }
    }
}

public class SurveyApp {
    public static void main(String[] args) {
        String responses = "4 2 3 4 5 1 2 2 3 4 3 4 5 2 1 5 5 4 2 17";
        InputStream inputStream = new ByteArrayInputStream(responses.getBytes());
        
        SurveyResponse surveyResponse = new SurveyResponse();
        surveyResponse.readAndSaveResponses(inputStream);
        
        SurveyProcessor surveyProcessor = new SurveyProcessor();
        int[] frequency = surveyProcessor.processSurvey();
        
        SurveyResults surveyResults = new SurveyResults();
        surveyResults.displayResults(frequency, System.out);
    }
}