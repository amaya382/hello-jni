#include <stdio.h>
#include "Interface.h"

JNIEXPORT void JNICALL Java_Interface_action(JNIEnv* env, jobject thisObj){
  printf("Hello JNI!(Scala)\n");
}

