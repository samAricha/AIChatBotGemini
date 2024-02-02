
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import platform.StatusBarColors
import presentation.screens.chat_screens.ChatScreen
import presentation.theme.AIChatBotGeminiTheme

@Composable
fun App() {
    AIChatBotGeminiTheme{
        StatusBarColors(
            statusBarColor = MaterialTheme.colorScheme.background,
            navBarColor = MaterialTheme.colorScheme.background,
        )
        ChatScreen()
    }
}