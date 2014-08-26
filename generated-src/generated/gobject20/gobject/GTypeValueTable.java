
package generated.gobject20.gobject;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gobject-2.0")
public class GTypeValueTable
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GTypeValueTable() {
        super();
    }

    public GTypeValueTable(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected static native long g_type_value_table_peek(long type);

    public static Pointer<GTypeValueTable> peek(long type) {
        return Pointer.pointerToAddress(GTypeValueTable.g_type_value_table_peek(type), GTypeValueTable.class);
    }

    @Field(0)
    public Pointer gtypevaluetable_field_lcopy_format() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    public GTypeValueTable gtypevaluetable_field_lcopy_format(Pointer gtypevaluetable_field_lcopy_format) {
        this.io.setPointerField(this, 0, gtypevaluetable_field_lcopy_format);
        return this;
    }

    @Field(1)
    public Pointer gtypevaluetable_field_collect_format() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GTypeValueTable gtypevaluetable_field_collect_format(Pointer gtypevaluetable_field_collect_format) {
        this.io.setPointerField(this, 1, gtypevaluetable_field_collect_format);
        return this;
    }

}
