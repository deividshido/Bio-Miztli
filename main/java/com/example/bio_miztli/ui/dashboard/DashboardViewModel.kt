package com.example.bio_miztli.ui.dashboard

import android.content.pm.PackageManager
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.budiyev.android.codescanner.AutoFocusMode
import com.budiyev.android.codescanner.CodeScanner
import com.budiyev.android.codescanner.CodeScannerView
import com.budiyev.android.codescanner.DecodeCallback
import com.budiyev.android.codescanner.ScanMode
import com.example.bio_miztli.R

class DashboardViewModel : ViewModel() {
    
    private val _text = MutableLiveData<String>().apply {
        value = "This is dashboard Fragment"

        
    }
    
    val text: LiveData<String> = _text

    
}