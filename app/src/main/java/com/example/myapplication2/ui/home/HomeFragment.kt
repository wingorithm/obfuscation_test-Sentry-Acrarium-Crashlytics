package com.example.myapplication2.ui.home

//import io.sentry.Sentry
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.myapplication2.databinding.FragmentHomeBinding
import com.google.firebase.crashlytics.ktx.crashlytics
import com.google.firebase.ktx.Firebase


class HomeFragment : Fragment() {
    private val TAG : String? = HomeFragment::class.simpleName
    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

//    @RequiresApi(Build.VERSION_CODES.O)
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
            sleep1()
//            throw NullPointerException("hello nulol")
//            stackOverflow2()
//            Sentry.captureMessage("testing message")
//            sleep1()
        }
        binding.sendError.setOnClickListener {
//            send_report()
//            try {
//                throw ConcurrentModificationException("hello nulol")
//            } catch (er: ConcurrentModificationException) {
////                ACRA.errorReporter.handleException(er)
////                Sentry.captureException(er)
//                Firebase.crashlytics.log("TOLONG ADA ERROR")
//                Log.i("ERRORNYA", er.toString(), er)
//            }
            chain2()
//            val errorlist = arrayListOf<Error>(OutOfMemoryError("OutOfMemory"), ClassCircularityError("ClassCircularity"), IllegalAccessError("IllegalAccess"))
//            for (er in errorlist){
//                throw er
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
            Thread.sleep((10 * 1000).toLong())
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
//                Firebase.crashlytics.log("TOLONG ADA ERROR")
//                ACRA.errorReporter.handleException(e)
//                Sentry.captureException(e)
//                Firebase.crashlytics.recordException(e)
//                Log.i("tag", "infokan")
//            }
//        }
//        for (er in errorlist){
//            try {
//                throw er
//            } catch (er: Error) {
//                er.printStackTrace()
//                Firebase.crashlytics.log(er.toString())
//                    Sentry.captureException(er)
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

//    @RequiresApi(Build.VERSION_CODES.O)
    private fun send_report(){
//        val start1 = LocalTime.now()
//        while (true) {
//            try {
//                throw IllegalAccessError("IllegalAccess")
//            } catch (er: IllegalAccessError) {
////                Sentry.captureException(er)
//                ACRA.errorReporter.handleException(er)
//            }
//            if (ChronoUnit.SECONDS.between(start1, LocalDateTime.now()) >= 30) break
//        }

//        AcraActivity().trackBreadcrumb("in Dashboard now")
//        ACRA.errorReporter.putCustomData("Event at ${System.currentTimeMillis()}", "Send Button Pressed")
    }

    private fun chain(){
        try {
            val ex = NumberFormatException("chain1")
            ex.initCause(NullPointerException("chain2"))
            throw ex
        }catch (ex : NumberFormatException){
            Firebase.crashlytics.recordException(ex)
            ex.printStackTrace()
        }
    }
    private fun chain2(){
        try {
            val numbers = IntArray(5)
            val divisor = 0
            for (i in numbers.indices) {
                val result = numbers[i] / divisor
                println(result)
            }
        } catch (e: ArithmeticException) {
            throw RuntimeException("Error: division by zero", e)
        }
    }


}