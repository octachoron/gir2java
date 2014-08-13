
package generated.gstreamerpbutils10.gstpbutils;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.ann.Ptr;

public enum GstInstallPluginsReturn
    implements IntValuedEnum<GstInstallPluginsReturn>
{

    GST_INSTALL_PLUGINS_RETURN_SUCCESS(0L),
    GST_INSTALL_PLUGINS_RETURN_NOT_FOUND(1L),
    GST_INSTALL_PLUGINS_RETURN_ERROR(2L),
    GST_INSTALL_PLUGINS_RETURN_PARTIAL_SUCCESS(3L),
    GST_INSTALL_PLUGINS_RETURN_USER_ABORT(4L),
    GST_INSTALL_PLUGINS_RETURN_CRASHED(100L),
    GST_INSTALL_PLUGINS_RETURN_INVALID(101L),
    GST_INSTALL_PLUGINS_RETURN_STARTED_OK(200L),
    GST_INSTALL_PLUGINS_RETURN_INTERNAL_FAILURE(201L),
    GST_INSTALL_PLUGINS_RETURN_HELPER_MISSING(202L),
    GST_INSTALL_PLUGINS_RETURN_INSTALL_IN_PROGRESS(203L);
    public final long value;

    GstInstallPluginsReturn(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GstInstallPluginsReturn> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GstInstallPluginsReturn> fromValue(long value) {
        return FlagSet.fromValue(value, this.values());
    }

    @Ptr
    protected native long gst_install_plugins_return_get_name(IntValuedEnum<GstInstallPluginsReturn> ret);

    public Pointer get_name(IntValuedEnum<GstInstallPluginsReturn> ret) {
        return Pointer.pointerToAddress(this.gst_install_plugins_return_get_name(ret));
    }

}
