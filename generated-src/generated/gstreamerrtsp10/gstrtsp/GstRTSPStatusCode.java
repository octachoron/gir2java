
package generated.gstreamerrtsp10.gstrtsp;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GstRTSPStatusCode
    implements IntValuedEnum<GstRTSPStatusCode>
{

    GSTRTSP_STATUS_CODE_INVALID(0L),
    GSTRTSP_STATUS_CODE_CONTINUE(100L),
    GSTRTSP_STATUS_CODE_OK(200L),
    GSTRTSP_STATUS_CODE_CREATED(201L),
    GSTRTSP_STATUS_CODE_LOW_ON_STORAGE(250L),
    GSTRTSP_STATUS_CODE_MULTIPLE_CHOICES(300L),
    GSTRTSP_STATUS_CODE_MOVED_PERMANENTLY(301L),
    GSTRTSP_STATUS_CODE_MOVE_TEMPORARILY(302L),
    GSTRTSP_STATUS_CODE_SEE_OTHER(303L),
    GSTRTSP_STATUS_CODE_NOT_MODIFIED(304L),
    GSTRTSP_STATUS_CODE_USE_PROXY(305L),
    GSTRTSP_STATUS_CODE_BAD_REQUEST(400L),
    GSTRTSP_STATUS_CODE_UNAUTHORIZED(401L),
    GSTRTSP_STATUS_CODE_PAYMENT_REQUIRED(402L),
    GSTRTSP_STATUS_CODE_FORBIDDEN(403L),
    GSTRTSP_STATUS_CODE_NOT_FOUND(404L),
    GSTRTSP_STATUS_CODE_METHOD_NOT_ALLOWED(405L),
    GSTRTSP_STATUS_CODE_NOT_ACCEPTABLE(406L),
    GSTRTSP_STATUS_CODE_PROXY_AUTH_REQUIRED(407L),
    GSTRTSP_STATUS_CODE_REQUEST_TIMEOUT(408L),
    GSTRTSP_STATUS_CODE_GONE(410L),
    GSTRTSP_STATUS_CODE_LENGTH_REQUIRED(411L),
    GSTRTSP_STATUS_CODE_PRECONDITION_FAILED(412L),
    GSTRTSP_STATUS_CODE_REQUEST_ENTITY_TOO_LARGE(413L),
    GSTRTSP_STATUS_CODE_REQUEST_URI_TOO_LARGE(414L),
    GSTRTSP_STATUS_CODE_UNSUPPORTED_MEDIA_TYPE(415L),
    GSTRTSP_STATUS_CODE_PARAMETER_NOT_UNDERSTOOD(451L),
    GSTRTSP_STATUS_CODE_CONFERENCE_NOT_FOUND(452L),
    GSTRTSP_STATUS_CODE_NOT_ENOUGH_BANDWIDTH(453L),
    GSTRTSP_STATUS_CODE_SESSION_NOT_FOUND(454L),
    GSTRTSP_STATUS_CODE_METHOD_NOT_VALID_IN_THIS_STATE(455L),
    GSTRTSP_STATUS_CODE_HEADER_FIELD_NOT_VALID_FOR_RESOURCE(456L),
    GSTRTSP_STATUS_CODE_INVALID_RANGE(457L),
    GSTRTSP_STATUS_CODE_PARAMETER_IS_READONLY(458L),
    GSTRTSP_STATUS_CODE_AGGREGATE_OPERATION_NOT_ALLOWED(459L),
    GSTRTSP_STATUS_CODE_ONLY_AGGREGATE_OPERATION_ALLOWED(460L),
    GSTRTSP_STATUS_CODE_UNSUPPORTED_TRANSPORT(461L),
    GSTRTSP_STATUS_CODE_DESTINATION_UNREACHABLE(462L),
    GSTRTSP_STATUS_CODE_INTERNAL_SERVER_ERROR(500L),
    GSTRTSP_STATUS_CODE_NOT_IMPLEMENTED(501L),
    GSTRTSP_STATUS_CODE_BAD_GATEWAY(502L),
    GSTRTSP_STATUS_CODE_SERVICE_UNAVAILABLE(503L),
    GSTRTSP_STATUS_CODE_GATEWAY_TIMEOUT(504L),
    GSTRTSP_STATUS_CODE_RTSP_VERSION_NOT_SUPPORTED(505L),
    GSTRTSP_STATUS_CODE_OPTION_NOT_SUPPORTED(551L);
    public final long value;

    GstRTSPStatusCode(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GstRTSPStatusCode> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GstRTSPStatusCode> fromValue(long value) {
        return FlagSet.fromValue(value, this.values());
    }

}
