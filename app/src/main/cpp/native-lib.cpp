#include <jni.h>
#include <string>
#include "PrimeNumber.h"

extern "C" JNIEXPORT jboolean JNICALL
Java_com_example_nitinnegi_ndksample_MainActivity_isPrime(
        JNIEnv *env,
        jobject /* this */, jint number) {

    PrimeNumber primeNumber(number);
    return primeNumber.isPrime();
//    std::string hello = "Hello from C++";
    // return env->NewStringUTF(hello.c_str());
}
