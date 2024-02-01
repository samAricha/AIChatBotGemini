package presentation.screens.chat_screens

import domain.model.ChatMessageModel
import domain.model.ChatStatusModel


data class ChatUiState(
    val messages: List<ChatMessageModel> = emptyList(),
    val status: ChatStatusModel = ChatStatusModel.Idle,
    val apiKey: String = ""
)