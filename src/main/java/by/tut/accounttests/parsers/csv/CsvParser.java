package by.tut.accounttests.parsers.csv;

import by.tut.accounttests.domain.UserAccount;
import by.tut.accounttests.exceptions.ParsingException;
import com.opencsv.CSVReader;

import java.io.*;

public class CsvParser {

    private static final int LOGIN = 0;
    private static final int PASSWORD = 1;

    public static UserAccount parse(String pathToCsvFile) {
    	boolean isEmptyPath = pathToCsvFile.isEmpty();
		if (isEmptyPath) {
			throw new IllegalArgumentException("Incorrect path to XML file!");
		}
        UserAccount userAccount = null;
        try (BufferedReader bufferedStream = new BufferedReader(new FileReader(pathToCsvFile));
                CSVReader reader = new CSVReader(bufferedStream)) {
            String[] line = reader.readNext();
            if (line != null) {
                userAccount = new UserAccount(line[LOGIN], line[PASSWORD]);
            }
        } catch (IOException e) {
        	throw new ParsingException("Parsing failed!", e);
        }
        return userAccount;
    }
}
