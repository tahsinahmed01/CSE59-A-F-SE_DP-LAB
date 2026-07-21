 class ConfigurationManager {
    private static volatile ConfigurationManager instance;

    private ConfigurationManager(){
        System.out.println("Reading heavy config file from disk... (Only happens once)");

    }
    public static ConfigurationManager getINSTANCE(){
        if(instance == null){
            synchronized(ConfigurationManager.class){
                if(instance == null){
                    instance = new ConfigurationManager();
                }
            }
        }
        return instance;
    }
}
public class Main1{
    public static void main(String[] args) {
        ConfigurationManager config1 = ConfigurationManager.getINSTANCE();
        ConfigurationManager config2 = ConfigurationManager.getINSTANCE();

        System.out.println("Same instance in MEMORY? " + (config1 == config2));
    }

}
