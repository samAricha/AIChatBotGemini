package domain.repository

import domain.model.ChatStatusModel

interface GeminiRepository {
    suspend fun generate(
        prompt: String,
        images: List<ByteArray> = emptyList()
    ): ChatStatusModel

    fun getApiKey(): String

    fun setApiKey(key: String)
}
