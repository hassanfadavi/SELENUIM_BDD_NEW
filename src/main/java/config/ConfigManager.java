package config;

import enums.Environment;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class ConfigManager {


    public static final Properties properties=new Properties();
    public static final Logger logger= LogManager.getLogger(ConfigManager.class);

static {
     loadProperties();
}
    /**
     * Loads configuration properties from two files:
     * 1. A base configuration file (`config.properties`).
     * 2. An environment-specific configuration file, determined by the "env" property in the base config.
     * The configuration files are loaded into the `properties` object.
     */
    public static void loadProperties(){
        try{
            // Load the base configuration from "config.properties"
            //read,load and close
            FileInputStream baseConfig =new FileInputStream("src/main/resources/config/config.properties");
            properties.load(baseConfig);
            baseConfig.close();


            // Determine the environment (e.g., DEV, PROD) from the "env" property in the base config
            Environment env= Environment.valueOf(properties.getProperty("env").toUpperCase());
            // Construct the path to the environment-specific configuration file
            String envConfigPath="src/main/resources/config/"+env.name().toLowerCase() +"-config.properties";
            // Load the environment-specific configuration file
            FileInputStream envConfig=new FileInputStream((envConfigPath));
            properties.load(envConfig);
            envConfig.close();

            // Log the successful loading of configuration for the current environment
           logger.info("Configuration loaded for environment"+env);


        }catch (IOException e){
            // Log error in case of failure to load configuration files
            logger.error("failed to load configuration"+e);
            throw  new RuntimeException("configuration load failed");

        }

    }
    /**
     * Retrieves a property value by key from the loaded properties.
     *
     * @param key the property key
     * @return the corresponding property value, or null if the key doesn't exist
     */


    public static String getProperty(String key){
    return properties.getProperty(key);
    }
    /**
     * Retrieves a property value by key from the loaded properties, with a fallback default value.
     *
     * @param key the property key
     * @param defaultValue the default value to return if the key doesn't exist
     * @return the corresponding property value, or the default value if the key doesn't exist
     */

    public static String getProperty(String key,String defaultValue){
        return properties.getProperty(key,defaultValue);
    }
    /**
     * Retrieves the current environment based on the "env" property from the configuration.
     *
     * @return the environment (e.g., DEV, PROD) as an enum
     */


 public static Environment getEnvirnonmet(){
    return Environment.valueOf(properties.getProperty("env").toUpperCase());
 }



}
