
package generated.gobject20.gobject;

import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gobject-2.0")
public class GTypeValueTable
    extends StructObject
{


    public GTypeValueTable() {
        super();
    }

    public GTypeValueTable(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public Pointer field_collect_format() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    public GTypeValueTable field_collect_format(Pointer field_collect_format) {
        this.io.setPointerField(this, 0, field_collect_format);
        return this;
    }

    @Field(1)
    public Pointer field_lcopy_format() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GTypeValueTable field_lcopy_format(Pointer field_lcopy_format) {
        this.io.setPointerField(this, 1, field_lcopy_format);
        return this;
    }

    @Ptr
    protected native long g_type_value_table_peek(long type);

    public Pointer peek(long type) {
        return Pointer.pointerToAddress(this.g_type_value_table_peek(type));
    }

}
