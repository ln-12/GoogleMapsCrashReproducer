package com.example.viewplayground

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.ui.platform.ComposeView
import androidx.fragment.app.Fragment
import com.google.maps.android.compose.GoogleMap
import com.google.maps.android.compose.MarkerComposable

class MainFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = ComposeView(requireContext()).apply {
        setContent {
            MaterialTheme {
                GoogleMap {
                    MarkerComposable {
                        Text(text = "Hello, World!")
                    }
                }
            }
        }
    }
}
