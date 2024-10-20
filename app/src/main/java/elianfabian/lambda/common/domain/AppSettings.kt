package elianfabian.lambda.common.domain

import kotlinx.coroutines.flow.Flow

interface AppSettings {
	suspend fun getCurrentFirebaseEnvironment(): String
	suspend fun saveCurrentFirebaseEnvironment(value: String)
	fun firebaseEnvironmentFlow(): Flow<String>
}
