
package generated.gio20.gio;

import generated.gobject20.gobject.GObject;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GCredentials
    extends GObject
{


    public GCredentials() {
        super();
    }

    public GCredentials(Pointer pointer) {
        super(pointer);
    }

    protected native int g_credentials_get_unix_pid(
        @Ptr
        long credentials);

    public int get_unix_pid() {
        return this.g_credentials_get_unix_pid(Pointer.pointerTo(this, GCredentials.class));
    }

    protected native long g_credentials_get_unix_user(
        @Ptr
        long credentials);

    public long get_unix_user() {
        return this.g_credentials_get_unix_user(Pointer.pointerTo(this, GCredentials.class));
    }

    protected native boolean g_credentials_is_same_user(
        @Ptr
        long credentials,
        @Ptr
        long other_credentials);

    public boolean is_same_user(Pointer other_credentials) {
        return this.g_credentials_is_same_user(Pointer.pointerTo(this, GCredentials.class), Pointer.getPeer(other_credentials));
    }

    protected native boolean g_credentials_set_unix_user(
        @Ptr
        long credentials, long uid);

    public boolean set_unix_user(long uid) {
        return this.g_credentials_set_unix_user(Pointer.pointerTo(this, GCredentials.class), uid);
    }

    @Ptr
    protected native long g_credentials_to_string(
        @Ptr
        long credentials);

    public Pointer to_string() {
        return Pointer.pointerToAddress(this.g_credentials_to_string(Pointer.pointerTo(this, GCredentials.class)));
    }

    protected native Pointer g_credentials_get_native(
        @Ptr
        long credentials, IntValuedEnum<GCredentialsType> native_type);

    public Pointer get_native(IntValuedEnum<GCredentialsType> native_type) {
        return this.g_credentials_get_native(Pointer.pointerTo(this, GCredentials.class), native_type);
    }

    protected native void g_credentials_set_native(
        @Ptr
        long credentials, IntValuedEnum<GCredentialsType> native_type, Pointer _native);

    public void set_native(IntValuedEnum<GCredentialsType> native_type, Pointer _native) {
        this.g_credentials_set_native(Pointer.pointerTo(this, GCredentials.class), native_type, _native);
    }

}
