public class Java8_CheckJavaInstallation {
    public static void main(String[] args) {
        String javaVersion = System.getProperty("java.version");
        System.out.println("Java Version: "+javaVersion);

        if (javaVersion != null){
            System.out.println("Java is installed on your computer");
        }
        else{
            System.out.println("Java is not installed on your computer.");
        }

    }
}
