
package generated.gio20.gio;

import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GUnixCredentialsMessage
    extends GSocketControlMessage
{


    public GUnixCredentialsMessage() {
        super();
    }

    public GUnixCredentialsMessage(Pointer pointer) {
        super(pointer);
    }

    public native boolean g_unix_credentials_message_is_supported();

    @Ptr
    protected native long g_unix_credentials_message_get_credentials(
        @Ptr
        long message);

    public Pointer<GCredentials> get_credentials() {
        return Pointer.pointerToAddress(this.g_unix_credentials_message_get_credentials(Pointer.pointerTo(this, GUnixCredentialsMessage.class)), Pointer.class);
    }

    @Field(0)
    public GSocketControlMessage field_parent_instance() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GUnixCredentialsMessage field_parent_instance(GSocketControlMessage field_parent_instance) {
        this.io.setNativeObjectField(this, 0, field_parent_instance);
        return this;
    }

    @Field(1)
    public Pointer field_priv() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GUnixCredentialsMessage field_priv(Pointer field_priv) {
        this.io.setPointerField(this, 1, field_priv);
        return this;
    }

}
