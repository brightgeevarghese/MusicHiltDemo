package edu.miu.musichiltdemo.ui.screen

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import edu.miu.musichiltdemo.ui.viewmodel.MusicViewModel

@Composable
fun SongsScreeen(musicViewModel: MusicViewModel, modifier: Modifier = Modifier) {
    Text(
        text = "${musicViewModel.musicList.collectAsState().value}",
        modifier = modifier
    )
}