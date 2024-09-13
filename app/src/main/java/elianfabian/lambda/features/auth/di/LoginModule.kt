package elianfabian.lambda.features.auth.di

import com.zhuinden.simplestack.ServiceBinder
import com.zhuinden.simplestackextensions.servicesktx.add
import elianfabian.lambda.common.util.simplestack.CoroutineScopedServiceModule
import elianfabian.lambda.features.auth.presentation.login.LoginViewModel

data object LoginModule : CoroutineScopedServiceModule() {

	override fun bindModuleServices(serviceBinder: ServiceBinder) {
		val viewModel = LoginViewModel(
			backstack = serviceBinder.backstack,
		)

		with(serviceBinder) {
			add(viewModel)
		}
	}
}
