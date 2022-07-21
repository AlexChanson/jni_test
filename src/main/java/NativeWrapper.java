public class NativeWrapper {

    public native int[] solve(AnObject ao);

    public String notNative(){
        return "I run in the JVM v" + System.getProperty("java.version");
    }
}
