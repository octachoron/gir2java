
package generated.gio20.gio;

import generated.gobject20.gobject.GObject;
import org.bridj.BridJ;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GMountOperation
    extends GObject
{


    static {
        BridJ.register();
    }

    public GMountOperation() {
        super();
    }

    public GMountOperation(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected static native long g_mount_operation_new();

    public static Pointer gmountoperation__new() {
        return Pointer.pointerToAddress(GMountOperation.g_mount_operation_new());
    }

    protected native boolean g_mount_operation_get_anonymous(
        @Ptr
        long op);

    public boolean get_anonymous() {
        return this.g_mount_operation_get_anonymous(Pointer.pointerTo(this, GMountOperation.class).getPeer());
    }

    protected native int g_mount_operation_get_choice(
        @Ptr
        long op);

    public int get_choice() {
        return this.g_mount_operation_get_choice(Pointer.pointerTo(this, GMountOperation.class).getPeer());
    }

    @Ptr
    protected native long g_mount_operation_get_domain(
        @Ptr
        long op);

    public Pointer get_domain() {
        return Pointer.pointerToAddress(this.g_mount_operation_get_domain(Pointer.pointerTo(this, GMountOperation.class).getPeer()));
    }

    @Ptr
    protected native long g_mount_operation_get_password(
        @Ptr
        long op);

    public Pointer get_password() {
        return Pointer.pointerToAddress(this.g_mount_operation_get_password(Pointer.pointerTo(this, GMountOperation.class).getPeer()));
    }

    @Ptr
    protected native long g_mount_operation_get_username(
        @Ptr
        long op);

    public Pointer get_username() {
        return Pointer.pointerToAddress(this.g_mount_operation_get_username(Pointer.pointerTo(this, GMountOperation.class).getPeer()));
    }

    protected native void g_mount_operation_set_anonymous(
        @Ptr
        long op, boolean anonymous);

    public void set_anonymous(boolean anonymous) {
        this.g_mount_operation_set_anonymous(Pointer.pointerTo(this, GMountOperation.class).getPeer(), anonymous);
    }

    protected native void g_mount_operation_set_choice(
        @Ptr
        long op, int choice);

    public void set_choice(int choice) {
        this.g_mount_operation_set_choice(Pointer.pointerTo(this, GMountOperation.class).getPeer(), choice);
    }

    protected native void g_mount_operation_set_domain(
        @Ptr
        long op,
        @Ptr
        long domain);

    public void set_domain(Pointer domain) {
        this.g_mount_operation_set_domain(Pointer.pointerTo(this, GMountOperation.class).getPeer(), Pointer.getPeer(domain));
    }

    protected native void g_mount_operation_set_password(
        @Ptr
        long op,
        @Ptr
        long password);

    public void set_password(Pointer password) {
        this.g_mount_operation_set_password(Pointer.pointerTo(this, GMountOperation.class).getPeer(), Pointer.getPeer(password));
    }

    protected native void g_mount_operation_set_username(
        @Ptr
        long op,
        @Ptr
        long username);

    public void set_username(Pointer username) {
        this.g_mount_operation_set_username(Pointer.pointerTo(this, GMountOperation.class).getPeer(), Pointer.getPeer(username));
    }

    @Field(0)
    public GObject field_parent_instance() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GMountOperation field_parent_instance(GObject field_parent_instance) {
        this.io.setNativeObjectField(this, 0, field_parent_instance);
        return this;
    }

    @Field(1)
    public Pointer field_priv() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GMountOperation field_priv(Pointer field_priv) {
        this.io.setPointerField(this, 1, field_priv);
        return this;
    }

    protected native void g_mount_operation_reply(
        @Ptr
        long op, IntValuedEnum<GMountOperationResult> result);

    public void reply(IntValuedEnum<GMountOperationResult> result) {
        this.g_mount_operation_reply(Pointer.pointerTo(this, GMountOperation.class).getPeer(), result);
    }

    protected native void g_mount_operation_set_password_save(
        @Ptr
        long op, IntValuedEnum<GPasswordSave> save);

    public void set_password_save(IntValuedEnum<GPasswordSave> save) {
        this.g_mount_operation_set_password_save(Pointer.pointerTo(this, GMountOperation.class).getPeer(), save);
    }

    protected native IntValuedEnum<GPasswordSave> g_mount_operation_get_password_save(
        @Ptr
        long op);

    public IntValuedEnum<GPasswordSave> get_password_save() {
        return this.g_mount_operation_get_password_save(Pointer.pointerTo(this, GMountOperation.class).getPeer());
    }

}
