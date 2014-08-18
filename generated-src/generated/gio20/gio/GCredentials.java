
package generated.gio20.gio;

import generated.gobject20.gobject.GObject;
import org.bridj.BridJ;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GCredentials
    extends GObject
{


    static {
        BridJ.register();
    }

    public GCredentials() {
        super();
    }

    public GCredentials(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected static native long g_credentials_new();

    public static Pointer gcredentials__new() {
        return Pointer.pointerToAddress(GCredentials.g_credentials_new());
    }

    protected native int g_credentials_get_unix_pid(
        @Ptr
        long credentials);

    public int get_unix_pid() {
        return this.g_credentials_get_unix_pid(Pointer.pointerTo(this, GCredentials.class).getPeer());
    }

    protected native long g_credentials_get_unix_user(
        @Ptr
        long credentials);

    public long get_unix_user() {
        return this.g_credentials_get_unix_user(Pointer.pointerTo(this, GCredentials.class).getPeer());
    }

    protected native boolean g_credentials_is_same_user(
        @Ptr
        long credentials,
        @Ptr
        long other_credentials);

    public boolean is_same_user(Pointer other_credentials) {
        return this.g_credentials_is_same_user(Pointer.pointerTo(this, GCredentials.class).getPeer(), Pointer.getPeer(other_credentials));
    }

    protected native boolean g_credentials_set_unix_user(
        @Ptr
        long credentials, long uid);

    public boolean set_unix_user(long uid) {
        return this.g_credentials_set_unix_user(Pointer.pointerTo(this, GCredentials.class).getPeer(), uid);
    }

    @Ptr
    protected native long g_credentials_to_string(
        @Ptr
        long credentials);

    public Pointer to_string() {
        return Pointer.pointerToAddress(this.g_credentials_to_string(Pointer.pointerTo(this, GCredentials.class).getPeer()));
    }

    protected native void g_credentials_set_native(
        @Ptr
        long credentials, IntValuedEnum<GCredentialsType> native_type,
        @Ptr
        long _native);

    public void set_native(IntValuedEnum<GCredentialsType> native_type, Pointer _native) {
        this.g_credentials_set_native(Pointer.pointerTo(this, GCredentials.class).getPeer(), native_type, Pointer.getPeer(_native));
    }

    @Ptr
    protected native long g_credentials_get_native(
        @Ptr
        long credentials, IntValuedEnum<GCredentialsType> native_type);

    public Pointer get_native(IntValuedEnum<GCredentialsType> native_type) {
        return Pointer.pointerToAddress(this.g_credentials_get_native(Pointer.pointerTo(this, GCredentials.class).getPeer(), native_type));
    }

}
