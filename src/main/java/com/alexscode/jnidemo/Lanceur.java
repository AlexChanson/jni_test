package com.alexscode.jnidemo;

import java.util.Arrays;

public class Lanceur {
    public static void main(String[] args) {
        //Charger le so/dll
        System.loadLibrary("demo");

        NativeWrapper nw = new NativeWrapper();
        AnObject ao = new AnObject(10);

        System.out.println(nw.notNative());

        int[] res;
        try {
            res = nw.solve(ao);
        } catch (UnsatisfiedLinkError e){
            System.out.println("Shared library not loaded");
            res = new int[]{};
        }

        System.out.println(Arrays.toString(res));

    }
}
