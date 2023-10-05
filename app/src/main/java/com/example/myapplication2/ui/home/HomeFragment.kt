package com.example.myapplication2.ui.home

import android.os.Build
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.myapplication2.databinding.FragmentHomeBinding
//import io.sentry.Sentry
import org.acra.ACRA
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.LocalTime
import java.time.temporal.ChronoUnit


class HomeFragment : Fragment() {
    private val TAG : String? = HomeFragment::class.simpleName
    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View {
        val homeViewModel = ViewModelProvider(this).get(HomeViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textHome
        homeViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }

        binding.gocrash.setOnClickListener {
//            sleep1()
//            stackOverflow2()
        }
        binding.sendError.setOnClickListener {
            send_report()
//            throw NullPointerException("hello nulol")
//            try {
//
//            } catch (er: ConcurrentModificationException) {
//                ACRA.errorReporter.handleException(er)
//                Sentry.captureException(er)
//            }

        }

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    private fun stackOverflow2() {
        stackOverflow2()
        stackOverflow2()
    }

    private fun sleep1() {
        try {
            Thread.sleep((8 * 1000).toLong())
        } catch (e: InterruptedException) {
            e.printStackTrace()
        }
//        val errorlist = arrayListOf<Error>(OutOfMemoryError("OutOfMemory"), ClassCircularityError("ClassCircularity"), IllegalAccessError("IllegalAccess"))
//        val exceptionlist = arrayListOf<Exception>( RuntimeException("Runtime"),ArithmeticException("Arithmetic") , CharacterCodingException(),ClassCastException("ClassCast") ,ConcurrentModificationException("ConcurrentModification"))
//        val exceptionlist = arrayListOf<Exception>(ConcurrentModificationException("ConcurrentModification"))
//        ACRA.errorReporter.putCustomData("custom Error", TAG + "send_report is running3")
//            throw ConcurrentModificationException("ConcurrentModification")
//        for (e in exceptionlist){
//            try {
//                throw e
//            } catch (e: Exception) {
//                e.printStackTrace()
//                ACRA.errorReporter.handleException(e)
//                Sentry.captureException(e)
//                Log.i("tag", "infokan")
//            }
//            for (er in errorlist){
//                try {
//                    throw er
//                } catch (er: Error) {
//                    Sentry.captureException(er)
//                }
//            }
//        }
//            stackOverflow() //-acra
//            throw IllegalArgumentException("IllegalArgument")
//            throw IndexOutOfBoundsException("IndexOutOfBounds")
//            throw IllegalStateException("IllegalState")
//            throw KotlinNullPointerException("KotlinNullPointer")
//            throw NoSuchElementException("NoSuchElement")
//            throw NullPointerException("NullPointer")
//            throw NumberFormatException("NumberFormat")
//            throw TypeCastException("TypeCast")

//            throw ArrayStoreException("ArrayStore")
    }

    @RequiresApi(Build.VERSION_CODES.O)
    private fun send_report(){
        val start1 = LocalTime.now()
        while (true) {
            try {
                throw IllegalAccessError("IllegalAccess")
            } catch (er: IllegalAccessError) {
//                Sentry.captureException(er)
                ACRA.errorReporter.handleException(er)
            }
            if (ChronoUnit.SECONDS.between(start1, LocalDateTime.now()) >= 30) break
        }

//        AcraActivity().trackBreadcrumb("in Dashboard now")
//        ACRA.errorReporter.putCustomData("Event at ${System.currentTimeMillis()}", "Send Button Pressed")
    }

}