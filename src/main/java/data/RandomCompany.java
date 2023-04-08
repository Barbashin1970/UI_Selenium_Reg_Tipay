package data;

import org.apache.commons.lang3.RandomStringUtils;

public class RandomCompany {
    public static final String COMPANY = RandomStringUtils.randomAlphabetic(1).toUpperCase()
            + RandomStringUtils.randomAlphabetic(8).toLowerCase() + " Company Limited" ;
    public static final String OGRN = RandomStringUtils.randomNumeric(13);
    public static final String INN = RandomStringUtils.randomNumeric(10);
    public static final String ADDRESS = RandomStringUtils.randomNumeric(3) + ", "
            + RandomStringUtils.randomAlphabetic(1).toUpperCase()
            + RandomStringUtils.randomAlphabetic(8).toLowerCase() + " Street";
}
