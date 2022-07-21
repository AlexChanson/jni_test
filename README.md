
### Compile classes and generate headers
```
javac -h src/main/cpp/ -d target/classes/ src/main/java/com/alexscode/jnidemo/*
```

### Compile shared object
May be necessary to point JAVA_HOME to a JDK 
```
export JAVA_HOME=/usr/lib/jvm/java-18-openjdk
g++ -fPIC -I${JAVA_HOME}/include -I${JAVA_HOME}/include/linux -shared -o lib/libdemo.so src/main/cpp/*.cpp
```

### Running java
``
-Djava.library.path=lib/
``