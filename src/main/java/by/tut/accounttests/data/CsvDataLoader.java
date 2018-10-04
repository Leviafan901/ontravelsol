package by.tut.accounttests.data;

import by.tut.accounttests.domain.UserAccount;
import by.tut.accounttests.parsers.csv.CsvParser;

public class CsvDataLoader {

	public static UserAccount load(String dataOrConfigFilePath) {
		return CsvParser.parse(dataOrConfigFilePath);
	}
}
