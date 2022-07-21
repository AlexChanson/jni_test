#include <jni.h>
#include <stdio.h>
#include "com_alexscode_jnidemo_NativeWrapper.h"

JNIEXPORT jintArray

JNICALL Java_com_alexscode_jnidemo_NativeWrapper_solve(JNIEnv *jenv, jobject jthis, jobject jargument) {
    printf(" native code running ...\n ");
    jintArray solution = jenv->NewIntArray(42);
    return solution;
}