package elianfabian.lambda.common.util.simplestack.compose

import androidx.compose.runtime.Composable
import com.zhuinden.simplestack.Backstack
import elianfabian.lambda.ui.theme.LambdaThee

@Composable
fun BasePreview(
	content: @Composable () -> Unit,
) {
	BackstackProvider(backstack = Backstack()) {
		LambdaThee {
			content()
		}
	}
}
