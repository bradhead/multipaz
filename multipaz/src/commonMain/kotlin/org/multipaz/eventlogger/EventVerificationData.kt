package org.multipaz.eventlogger

import org.multipaz.cbor.annotation.CborSerializable
import org.multipaz.verification.VerifiedPresentation

@CborSerializable
data class EventVerificationData(
    val documentsReceived: List<VerifiedPresentation>
) {
    companion object
}