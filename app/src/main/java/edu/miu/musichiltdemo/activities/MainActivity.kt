package edu.miu.musichiltdemo.activities

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import dagger.hilt.android.AndroidEntryPoint
import edu.miu.musichiltdemo.ui.screen.SongsScreeen
import edu.miu.musichiltdemo.ui.theme.MusicHiltDemoTheme
import edu.miu.musichiltdemo.ui.viewmodel.MusicViewModel

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MusicHiltDemoTheme {
                val musicViewModel: MusicViewModel = hiltViewModel()
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    SongsScreeen(
                        musicViewModel = musicViewModel,
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun MainScreenPreview() {
    MusicHiltDemoTheme {
        val musicViewModel: MusicViewModel = hiltViewModel()
        Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
            SongsScreeen(
                musicViewModel = musicViewModel,
                modifier = Modifier.padding(innerPadding)
            )
        }
    }
}