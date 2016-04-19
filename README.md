## hello-jni

### common

* env
  * fedora 23
  * openjdk 1.8.0_77
  * scala 2.10.4
  * gcc 5.3.1
* files
  * `Interface.*`: interface
  * `Main.*`: entry point
  * `Impl.cpp`: implementation of `Interface.*`

### java

```shell
# set path
export LD_LIBRARY_PATH=$LD_LIBRARY_PATH:`pwd`

# compile interface
javac Interface.java

# create header file
javah -jni Interface

# compile implementation
# need to adjust java_sdk path
gcc -I/etc/alternatives/java_sdk/include -I/etc/alternatives/java_sdk/include/linux -shared -fPIC -o libImpl.so Impl.cpp

# compile caller
javac Main.java

# exec with native implementation
java Main
```

### scala

```shell
# set path
export LD_LIBRARY_PATH=$LD_LIBRARY_PATH:`pwd`

# compile interface
scalac Interface.scala

# create header file
javah -jni Interface

# compile implementation
# need to adjust java_sdk path
gcc -I/etc/alternatives/java_sdk/include -I/etc/alternatives/java_sdk/include/linux -shared -fPIC -o libImpl.so Impl.cpp

# compile caller
scalac Main.scala

# exec with native implementation
scala Main
```
