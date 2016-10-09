#netlib-native-test

## Purpose
This is meant to provide a simple test of whether netlib-native has been loaded successfully.

## Usage
```
git clone https://github.com/jasonmar/netlib-native-test.git
cd netlib-native-test
sbt run
```

## Output if netlib-native is loaded successfully
```
Oct 09, 2016 1:10:38 AM com.github.fommil.jni.JniLoader liberalLoad
com.github.fommil.netlib.NativeSystemBLAS
INFO: successfully loaded /var/folders/gh/fb1w67114bxb0ppk7n6zz029y1sc7h/T/jniloader1703049998782096207netlib-native_system-osx-x86_64.jnilib
Oct 09, 2016 1:10:38 AM com.github.fommil.jni.JniLoader load
INFO: already loaded netlib-native_system-osx-x86_64.jnilib
com.github.fommil.netlib.NativeSystemLAPACK
2447
1931
1603
2042
1568
```

## References
http://fommil.github.io/scalax14
https://github.com/fommil/netlib-java

