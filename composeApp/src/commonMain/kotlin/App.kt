
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import platform.StatusBarColors
import presentation.screens.chat_screens.ChatScreen
import presentation.theme.AIChatBotGeminiTheme
import presentation.theme.Cream2

@Composable
fun App() {
    AIChatBotGeminiTheme{
        StatusBarColors(
            statusBarColor = Cream2,
            navBarColor = MaterialTheme.colorScheme.background,
        )
        ChatScreen()
    }
}