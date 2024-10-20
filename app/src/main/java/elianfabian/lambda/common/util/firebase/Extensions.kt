@file:Suppress("NOTHING_TO_INLINE")

package elianfabian.lambda.common.util.firebase

import com.google.firebase.firestore.CollectionReference
import com.google.firebase.firestore.DocumentReference
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.Source
import elianfabian.lambda.common.util.AppBuildConfig

private const val RootCollectionName = "@ROOT"
private const val DocumentNameForSubCollection = "-"


fun FirebaseFirestore.rootCollectionForEnvironment(
	environment: String,
): CollectionReference {
	if (AppBuildConfig.Flavors.IsDevelopment) {
		return collection(environment).subCollection(RootCollectionName)
	}
	return collection(RootCollectionName)
}

fun CollectionReference.subCollection(collectionPath: String): CollectionReference {
	return document(DocumentNameForSubCollection).collection(collectionPath)
}

inline fun DocumentReference.getFromServer() = get(Source.SERVER)

inline fun CollectionReference.getFromServer() = get(Source.SERVER)
