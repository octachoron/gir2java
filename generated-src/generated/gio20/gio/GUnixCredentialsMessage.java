
package generated.gio20.gio;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GUnixCredentialsMessage
    extends GSocketControlMessage
{


    static {
        BridJ.register();
    }

    public GUnixCredentialsMessage() {
        super();
    }

    public GUnixCredentialsMessage(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected static native long g_unix_credentials_message_new();

    public static Pointer<GSocketControlMessage> gunixcredentialsmessage__new() {
        return Pointer.pointerToAddress(GUnixCredentialsMessage.g_unix_credentials_message_new(), GSocketControlMessage.class);
    }

    @Ptr
    protected static native long g_unix_credentials_message_new_with_credentials(
        @Ptr
        long credentials);

    public static Pointer<GSocketControlMessage> new_with_credentials(Pointer<GCredentials> credentials) {
        return Pointer.pointerToAddress(GUnixCredentialsMessage.g_unix_credentials_message_new_with_credentials(Pointer.getPeer(credentials)), GSocketControlMessage.class);
    }

    public static native boolean g_unix_credentials_message_is_supported();

    @Ptr
    protected native long g_unix_credentials_message_get_credentials(
        @Ptr
        long message);

    public Pointer<GCredentials> get_credentials() {
        return Pointer.pointerToAddress(this.g_unix_credentials_message_get_credentials(Pointer.pointerTo(this, GUnixCredentialsMessage.class).getPeer()), GCredentials.class);
    }

    @Field(0)
    public GSocketControlMessage gunixcredentialsmessage_field_parent_instance() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GUnixCredentialsMessage gunixcredentialsmessage_field_parent_instance(GSocketControlMessage gunixcredentialsmessage_field_parent_instance) {
        this.io.setNativeObjectField(this, 0, gunixcredentialsmessage_field_parent_instance);
        return this;
    }

    @Field(1)
    public Pointer gunixcredentialsmessage_field_priv() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GUnixCredentialsMessage gunixcredentialsmessage_field_priv(Pointer gunixcredentialsmessage_field_priv) {
        this.io.setPointerField(this, 1, gunixcredentialsmessage_field_priv);
        return this;
    }

}
