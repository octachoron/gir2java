
package generated.gstreamer10.gst;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-1.0")
public class GstPollFD
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GstPollFD() {
        super();
    }

    public GstPollFD(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public int field_fd() {
        return this.io.getIntField(this, 0);
    }

    @Field(0)
    public GstPollFD field_fd(int field_fd) {
        this.io.setIntField(this, 0, field_fd);
        return this;
    }

    @Field(1)
    private int field_idx() {
        return this.io.getIntField(this, 1);
    }

    @Field(1)
    private GstPollFD field_idx(int field_idx) {
        this.io.setIntField(this, 1, field_idx);
        return this;
    }

    protected native void gst_poll_fd_init(
        @Ptr
        long fd);

    public void init() {
        this.gst_poll_fd_init(Pointer.pointerTo(this, GstPollFD.class).getPeer());
    }

}
