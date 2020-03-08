# Add project specific ProGuard rules here.
# You can control the set of applied configuration files using the
# proguardFiles setting in build.gradle.
#
# For more details, see
#   http://developer.android.com/guide/developing/tools/proguard.html

# If your project uses WebView with JS, uncomment the following
# and specify the fully qualified class name to the JavaScript interface
# class:
 -keepclassmembers class fqcn.of.javascript.interface.for.webview {
   public *;
}

# Uncomment this to preserve the line number information for
# debugging stack traces.
#-keepattributes SourceFile,LineNumberTable

# If you keep the line number information, uncomment this to
# hide the original source file name.
#-renamesourcefileattribute SourceFile
#指定代码的压缩级别
-optimizationpasses 5



 #优化  不优化输入的类文件
-dontoptimize

# 比如第一行就保证了所有Activity的子类不要被混淆
 -keep public class * extends android.app.Activity

 -keep public class * extends androidx.appcompat.app.AppCompatActivity

 -keep public class * extends android.content.Intent
 -keep public class * extends android.os.Bundle