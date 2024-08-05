package API.helper;

import java.io.File;

public class Utility {
    public static File getJSONSchemaFile(String JSONFile){
        return new File("src/test/java/API/helper/JSONSchemaData/" + JSONFile);
    }
}
