package elianfabian.lambda.features.auth.presentation.register

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import elianfabian.lambda.common.util.simplestack.FragmentKey
import elianfabian.lambda.common.util.simplestack.compose.ComposeKeyedFragment
import elianfabian.lambda.features.auth.di.RegisterModule
import kotlinx.parcelize.Parcelize

@Parcelize
data object RegisterKey : FragmentKey(
	serviceModule = RegisterModule,
) {
	override fun instantiateFragment() = RegisterFragment()

	class RegisterFragment : ComposeKeyedFragment() {

		@Composable
		override fun Content(innerPadding: PaddingValues) {
			RegisterScreen()
		}
	}
}
