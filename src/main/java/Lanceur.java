public class Lanceur {
    public static void main(String[] args) {
        //Charger le so/dll
        //System.loadLibrary("mabibjni");

        NativeWrapper nw = new NativeWrapper();
        AnObject ao = new AnObject(10);

        System.out.println(nw.notNative());

        try {
            System.out.println(nw.solve(ao));
        } catch (UnsatisfiedLinkError e){
            System.out.println("Shared library not loaded");
        }

        System.out.println("Fallback ...");

    }
}
