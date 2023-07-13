package com.xarfram.raddle

import android.annotation.SuppressLint
import android.net.Uri
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.browser.customtabs.CustomTabsIntent
import androidx.browser.customtabs.CustomTabsIntent.COLOR_SCHEME_SYSTEM
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainContent()
        }
    }
}

@Composable
fun MainContent(darkTheme: Boolean = isSystemInDarkTheme()) {
    val url = "https://www.raddle.me"
    val context = LocalContext.current

    val intent = CustomTabsIntent.Builder()
        .setUrlBarHidingEnabled(true)
        .setShowTitle(false)
        .setColorScheme(COLOR_SCHEME_SYSTEM)
        .build()
    intent.launchUrl(context, Uri.parse(url))
}