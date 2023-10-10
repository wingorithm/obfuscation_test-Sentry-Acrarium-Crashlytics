package com.example.myapplication2

import android.app.Application
import android.content.Context
import android.util.Log
import android.widget.Toast
import com.github.anrwatchdog.ANRWatchDog
import org.acra.ACRA
import org.acra.BuildConfig
import org.acra.ReportField
import org.acra.config.httpSender
import org.acra.config.toast
import org.acra.data.StringFormat
import org.acra.ktx.initAcra
import org.acra.security.TLS
import org.acra.sender.HttpSender

class AcraActivity : Application() {
    override fun onCreate() {
        super.onCreate()
        ANRWatchDog().setIgnoreDebugger(true).setANRListener { error ->
            ACRA.errorReporter.handleException(error)
        }.start()
        trackBreadcrumb("AcraActivity.onCreate()")
    }
    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base)

        initAcra {
            ACRA.DEV_LOGGING = true
            buildConfigClass = BuildConfig::class.java
            reportFormat = StringFormat.JSON
            httpSender {
//              "5.9.3"
                uri = "http://10.61.41.84:8080/report"
//                uri = "http://p090mhp550606:8080/report"
//                uri = "https://acrarium-crashreport-dev.apps.ocpdev.dti.co.id/report"
                basicAuthLogin = "AKDDknjbH51pkMQC"
                basicAuthPassword = "hGjVDIJkoUPJYWrh"

//                5.8.4
//                basicAuthLogin = "oUkNOJevVIHcs8I5"
//                basicAuthPassword = "1dtEuSjhWCCDgfGu"
                httpMethod = HttpSender.Method.POST
//                certificatePath = "asset://devapps.pem"
                connectionTimeout = 5000
                socketTimeout = 20000
                dropReportsOnTimeout = false
                compress = false
//                tlsProtocols = arrayOf(TLS.V1_3, TLS.V1_2, TLS.V1_1, TLS.V1)
                //---the following options allow you to configure a self signed certificate
                //keyStoreFactoryClass = MyKeyStoreFactory::class.java
                //certificatePath = "asset://mycert.cer"
                //resCertificate = R.raw.mycert
                //certificateType = "X.509"
            }
//            notification {
//                title = getString(R.string.notification_title)
//                text = getString(R.string.notification_text)
//                channelName = getString(R.string.notification_channel)
//                channelDescription = getString(R.string.notification_channel_desc)
//                resChannelImportance = NotificationManager.IMPORTANCE_MAX
////                channelImportance = untuk versi terbaru
//
//                resIcon = R.drawable.notification_icon
//                sendButtonText = getString(R.string.notification_send)
//                discardButtonText = getString(R.string.notification_discard)
//                sendOnClick = false
//            }

            toast {
                text = getString(R.string.notification_text)
                length = Toast.LENGTH_LONG
            }


        }
    }

    fun trackBreadcrumb(event: String) {
        ACRA.errorReporter.putCustomData("Event at ${System.currentTimeMillis()}", event)
    }
}