
package generated.gobject20.gobject;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gobject-2.0")
public class GTypePluginClass
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GTypePluginClass() {
        super();
    }

    public GTypePluginClass(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public Pointer field_use_plugin() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    public GTypePluginClass field_use_plugin(Pointer field_use_plugin) {
        this.io.setPointerField(this, 0, field_use_plugin);
        return this;
    }

    @Field(1)
    public GTypeInterface field_base_iface() {
        return this.io.getNativeObjectField(this, 1);
    }

    @Field(1)
    public GTypePluginClass field_base_iface(GTypeInterface field_base_iface) {
        this.io.setNativeObjectField(this, 1, field_base_iface);
        return this;
    }

    @Field(2)
    public Pointer field_unuse_plugin() {
        return this.io.getPointerField(this, 2);
    }

    @Field(2)
    public GTypePluginClass field_unuse_plugin(Pointer field_unuse_plugin) {
        this.io.setPointerField(this, 2, field_unuse_plugin);
        return this;
    }

    @Field(3)
    public Pointer field_complete_type_info() {
        return this.io.getPointerField(this, 3);
    }

    @Field(3)
    public GTypePluginClass field_complete_type_info(Pointer field_complete_type_info) {
        this.io.setPointerField(this, 3, field_complete_type_info);
        return this;
    }

    @Field(4)
    public Pointer field_complete_interface_info() {
        return this.io.getPointerField(this, 4);
    }

    @Field(4)
    public GTypePluginClass field_complete_interface_info(Pointer field_complete_interface_info) {
        this.io.setPointerField(this, 4, field_complete_interface_info);
        return this;
    }

}
