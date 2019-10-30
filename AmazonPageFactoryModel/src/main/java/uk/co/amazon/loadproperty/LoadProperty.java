package uk.co.amazon.loadproperty;

import uk.co.amazon.basepage.BasePage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by : Divyesh Patel
 * since : Wednesday  30/10/2019
 * Time  : 15:11
 **/

public class LoadProperty extends BasePage {

    static Properties prop;

    static FileInputStream input;

    String projectPath = System.getProperty("user.dir");

    public String getProperty(String key) {
        prop = new Properties();

        try {
            input = new FileInputStream(projectPath + "\\src\\test\\java\\uk\\co\\amazon\\resources\\propertiesfile\\config.properties");
            prop.load(input);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return prop.getProperty(key);
    }
}
