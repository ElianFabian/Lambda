package elianfabian.lambda.common.util.callback

import com.zhuinden.simplestack.Backstack

interface OnMainBackstackIsInitializedCallback {
	fun onMainBackstackIsInitialized(backstack: Backstack)
}
