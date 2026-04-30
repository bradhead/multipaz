package org.multipaz.eventlogger

import org.multipaz.cbor.DataItem
import kotlin.time.Instant

sealed class EventVerification(
    override val identifier: String = "",
    override val timestamp: Instant = Instant.DISTANT_PAST,
    override val appData: Map<String, DataItem> = emptyMap(),
    open val verificationData: EventVerificationData
): Event(identifier, timestamp, appData)
