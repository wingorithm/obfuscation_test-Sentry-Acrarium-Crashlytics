package com.example.myapplication2.ui.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.myapplication2.AcraActivity
import com.example.myapplication2.databinding.FragmentDashboardBinding
import org.acra.ACRA

class DashboardFragment : Fragment() {

    private var _binding: FragmentDashboardBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View {
        val dashboardViewModel =
                ViewModelProvider(this).get(DashboardViewModel::class.java)

        _binding = FragmentDashboardBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textDashboard
        dashboardViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }

        AcraActivity().trackBreadcrumb("in Dashboard now")
//        ACRA.errorReporter.putCustomData("Event at ${System.currentTimeMillis()}", "in Dashboard now")

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}