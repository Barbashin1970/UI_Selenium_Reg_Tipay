package data;

import org.apache.commons.lang3.RandomStringUtils;

public class RandomCompany {
    public static final String COMPANY = RandomStringUtils.randomAlphabetic(1).toUpperCase()
            + RandomStringUtils.randomAlphabetic(8).toLowerCase() + " Game Company Limited" ;
    public static final String OGRN = RandomStringUtils.randomNumeric(13);
    public static final String INN = "54" + RandomStringUtils.randomNumeric(8);
    public static final String ADDRESS = "Post address: " + RandomStringUtils.randomNumeric(3) + ", "
            + RandomStringUtils.randomAlphabetic(1).toUpperCase()
            + RandomStringUtils.randomAlphabetic(8).toLowerCase() + " Street, RUSSIA, 6" + RandomStringUtils.randomNumeric(5);

    public static final String BIK = "045" + RandomStringUtils.randomNumeric(6);
    public static final String BANK = "New " + RandomStringUtils.randomNumeric(4) + " Level Bank";
    public static final String CORR = RandomStringUtils.randomNumeric(17);
    public static final String ACCOUNT = RandomStringUtils.randomNumeric(20);

    public static final String NAME = RandomStringUtils.randomAlphabetic(1).toUpperCase()
            + RandomStringUtils.randomAlphabetic(8).toLowerCase() + " Python Java C Junior" ;

    public static final String PHONE = "913" + RandomStringUtils.randomNumeric(7);
    public static final String EMAIL = "banksnab@gmail.com";


}
