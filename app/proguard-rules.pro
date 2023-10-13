# Add project specific ProGuard rules here.
# You can control the set of applied configuration files using the
# proguardFiles setting in build.gradle.
#
# For more details, see
#   http://developer.android.com/guide/developing/tools/proguard.html

# If your project uses WebView with JS, uncomment the following
# and specify the fully qualified class name to the JavaScript interface
# class:
#-keepclassmembers class fqcn.of.javascript.interface.for.webview {
#   public *;
#}

# Uncomment this to preserve the line number information for
# debugging stack traces.
#-keepattributes SourceFile,LineNumberTable

# If you keep the line number information, uncomment this to
# hide the original source file name.
#-renamesourcefileattribute SourceFile

#-obfuscationdictionary "C:\Users\U550606\Android\proguard\gistfile1.txt"
#-classobfuscationdictionary "C:\Users\U550606\Android\proguard\gistfile1.txt"
#-packageobfuscationdictionary "C:\Users\U550606\Android\proguard\gistfile1.txt"
#
#-mergeinterfacesaggressively
#-overloadaggressively
#-repackageclasses 'com.example.myapplication2'

# Restore some Source file names and restore approximate line numbers in the stack traces,
# otherwise the stack traces are pretty useless

#=============Sentry================





#=============ACRA 5.9.3================ -> support R8 full mode & Fix: Proguard configuration for ACRA 5.9
#-keepattributes SourceFile,LineNumberTable
#
#-keep class * implements org.acra.plugins.Plugin {*;}
#
#-keep enum org.acra.** {*;}
#
#-keepclassmembers class * implements org.acra.config.Configuration { <init>(...); }
#
#-keep interface org.acra.ErrorReporter
#-keep interface org.acra.attachment.DefaultAttachmentProvider
#
#-dontwarn android.support.**
#
#-dontwarn com.faendir.kotlin.autodsl.DslInspect
#-dontwarn com.faendir.kotlin.autodsl.DslMandatory
-dontwarn com.google.auto.service.AutoService
-dontwarn javax.annotation.processing.AbstractProcessor #ini dari missing class
-dontwarn javax.annotation.processing.SupportedOptions #ini dari missing class
