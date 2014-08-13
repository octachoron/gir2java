
package generated.gio20.gio;

import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gio-2.0")
public class GProxyAddressEnumerator
    extends StructObject
{


    public GProxyAddressEnumerator() {
        super();
    }

    public GProxyAddressEnumerator(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public Pointer<GProxyAddressEnumeratorPrivate> field_priv() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    public GProxyAddressEnumerator field_priv(Pointer<GProxyAddressEnumeratorPrivate> field_priv) {
        this.io.setPointerField(this, 0, field_priv);
        return this;
    }

    @Field(1)
    public GSocketAddressEnumerator field_parent_instance() {
        return this.io.getNativeObjectField(this, 1);
    }

    @Field(1)
    public GProxyAddressEnumerator field_parent_instance(GSocketAddressEnumerator field_parent_instance) {
        this.io.setNativeObjectField(this, 1, field_parent_instance);
        return this;
    }

}
