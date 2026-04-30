package org.multipaz.eventlogger

import org.multipaz.cbor.DataItem
import kotlin.time.Instant

data class EventVerificationIso18013AnnexA(
    override val identifier: String = "",
    override val timestamp: Instant = Instant.DISTANT_PAST,
    override val appData: Map<String, DataItem> = emptyMap(),
    override val verificationData: EventVerificationData,
    // The raw data from the verification event.
    val uri: String,
    val request: DataItem,
    val response: DataItem,
    val sessionTranscript: DataItem,
    val appId: String?,
    val origin: String?,
    val readerEngagement: DataItem
): EventVerification(identifier, timestamp, appData, verificationData) {
    override fun copy(
        identifier: String,
        timestamp: Instant,
        appData: Map<String, DataItem>
    ): Event = copy(
        identifier = identifier,
        timestamp = timestamp,
        appData = appData,
        verificationData = this.verificationData
    )
}