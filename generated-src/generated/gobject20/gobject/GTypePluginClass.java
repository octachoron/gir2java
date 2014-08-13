
package generated.gobject20.gobject;

import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gobject-2.0")
public class GTypePluginClass
    extends StructObject
{


    public GTypePluginClass() {
        super();
    }

    public GTypePluginClass(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public GTypeInterface field_base_iface() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GTypePluginClass field_base_iface(GTypeInterface field_base_iface) {
        this.io.setNativeObjectField(this, 0, field_base_iface);
        return this;
    }

    @Field(1)
    public Object field_complete_type_info() {
        return this.io.getNativeObjectField(this, 1);
    }

    @Field(1)
    public GTypePluginClass field_complete_type_info(Object field_complete_type_info) {
        this.io.setNativeObjectField(this, 1, field_complete_type_info);
        return this;
    }

    @Field(2)
    public Object field_use_plugin() {
        return this.io.getNativeObjectField(this, 2);
    }

    @Field(2)
    public GTypePluginClass field_use_plugin(Object field_use_plugin) {
        this.io.setNativeObjectField(this, 2, field_use_plugin);
        return this;
    }

    @Field(3)
    public Object field_complete_interface_info() {
        return this.io.getNativeObjectField(this, 3);
    }

    @Field(3)
    public GTypePluginClass field_complete_interface_info(Object field_complete_interface_info) {
        this.io.setNativeObjectField(this, 3, field_complete_interface_info);
        return this;
    }

    @Field(4)
    public Object field_unuse_plugin() {
        return this.io.getNativeObjectField(this, 4);
    }

    @Field(4)
    public GTypePluginClass field_unuse_plugin(Object field_unuse_plugin) {
        this.io.setNativeObjectField(this, 4, field_unuse_plugin);
        return this;
    }

}
