
package generated.gio20.gio;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gio-2.0")
public class GProxyAddressEnumerator
    extends GSocketAddressEnumerator
{


    static {
        BridJ.register();
    }

    public GProxyAddressEnumerator() {
        super();
    }

    public GProxyAddressEnumerator(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public GSocketAddressEnumerator gproxyaddressenumerator_field_parent_instance() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GProxyAddressEnumerator gproxyaddressenumerator_field_parent_instance(GSocketAddressEnumerator gproxyaddressenumerator_field_parent_instance) {
        this.io.setNativeObjectField(this, 0, gproxyaddressenumerator_field_parent_instance);
        return this;
    }

    @Field(1)
    public Pointer<GProxyAddressEnumeratorPrivate> field_priv() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GProxyAddressEnumerator field_priv(Pointer<GProxyAddressEnumeratorPrivate> field_priv) {
        this.io.setPointerField(this, 1, field_priv);
        return this;
    }

}
