@file:Suppress("KotlinConstantConditions")

package elianfabian.lambda.common.util

import elianfabian.lambda.BuildConfig

object AppBuildConfig {

	const val IsDebug = BuildConfig.IS_DEBUG
	const val IsRelease = !IsDebug
	const val ApplicationId = BuildConfig.APPLICATION_ID
	const val BuildType = BuildConfig.BUILD_TYPE
	const val Flavor = BuildConfig.FLAVOR
	const val VersionCode = BuildConfig.VERSION_CODE
	const val VersionName = BuildConfig.VERSION_NAME

	const val DefaultLanguage = BuildConfig.DEFAULT_LANGUAGE
	val SupportedLanguages = BuildConfig.SUPPORTED_LANGUAGES.filterNotNull()


	object Flavors {
		const val IsDevelopment = BuildConfig.IS_DEVELOPMENT
		const val IsProduction = BuildConfig.IS_PRODUCTION
	}

	object Firebase {
		object Environment {
			const val Current = BuildConfig.FIREBASE_DEVELOPMENT_ENVIRONMENT

			const val Development = "development"
			const val Staging = "staging"

			val IsDevelopment = Current.contains("dev", ignoreCase = true)
			val IsStaging = Current.contains("staging", ignoreCase = true)
		}

		// In the last versions of the firebase-tools, when executing firebase "emulators:start" it crashes.
		// A version I found that works is: https://github.com/firebase/firebase-tools/releases/tag/v11.30.0
		// Edit: it seems that this version doesn't properly work, at least for Firestore
		const val EmulatorHost = BuildConfig.FIREBASE_EMULATOR_HOST
		const val UseEmulator = BuildConfig.USE_FIREBASE_EMULATOR
	}
}
