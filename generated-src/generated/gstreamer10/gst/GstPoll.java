
package generated.gstreamer10.gst;

import generated.glib20.glib.GPollFD;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-1.0")
public class GstPoll
    extends StructObject
{


    public GstPoll() {
        super();
    }

    public GstPoll(Pointer pointer) {
        super(pointer);
    }

    protected native boolean gst_poll_add_fd(
        @Ptr
        long set,
        @Ptr
        long fd);

    public boolean add_fd(Pointer fd) {
        return this.gst_poll_add_fd(Pointer.pointerTo(this, GstPoll.class), Pointer.getPeer(fd));
    }

    protected native boolean gst_poll_fd_can_read(
        @Ptr
        long set,
        @Ptr
        long fd);

    public boolean fd_can_read(Pointer fd) {
        return this.gst_poll_fd_can_read(Pointer.pointerTo(this, GstPoll.class), Pointer.getPeer(fd));
    }

    protected native boolean gst_poll_fd_can_write(
        @Ptr
        long set,
        @Ptr
        long fd);

    public boolean fd_can_write(Pointer fd) {
        return this.gst_poll_fd_can_write(Pointer.pointerTo(this, GstPoll.class), Pointer.getPeer(fd));
    }

    protected native boolean gst_poll_fd_ctl_read(
        @Ptr
        long set,
        @Ptr
        long fd, boolean active);

    public boolean fd_ctl_read(Pointer fd, boolean active) {
        return this.gst_poll_fd_ctl_read(Pointer.pointerTo(this, GstPoll.class), Pointer.getPeer(fd), active);
    }

    protected native boolean gst_poll_fd_ctl_write(
        @Ptr
        long set,
        @Ptr
        long fd, boolean active);

    public boolean fd_ctl_write(Pointer fd, boolean active) {
        return this.gst_poll_fd_ctl_write(Pointer.pointerTo(this, GstPoll.class), Pointer.getPeer(fd), active);
    }

    protected native boolean gst_poll_fd_has_closed(
        @Ptr
        long set,
        @Ptr
        long fd);

    public boolean fd_has_closed(Pointer fd) {
        return this.gst_poll_fd_has_closed(Pointer.pointerTo(this, GstPoll.class), Pointer.getPeer(fd));
    }

    protected native boolean gst_poll_fd_has_error(
        @Ptr
        long set,
        @Ptr
        long fd);

    public boolean fd_has_error(Pointer fd) {
        return this.gst_poll_fd_has_error(Pointer.pointerTo(this, GstPoll.class), Pointer.getPeer(fd));
    }

    protected native void gst_poll_fd_ignored(
        @Ptr
        long set,
        @Ptr
        long fd);

    public void fd_ignored(Pointer fd) {
        this.gst_poll_fd_ignored(Pointer.pointerTo(this, GstPoll.class), Pointer.getPeer(fd));
    }

    protected native void gst_poll_free(
        @Ptr
        long set);

    public void free() {
        this.gst_poll_free(Pointer.pointerTo(this, GstPoll.class));
    }

    protected native void gst_poll_get_read_gpollfd(
        @Ptr
        long set,
        @Ptr
        long fd);

    public void get_read_gpollfd(Pointer<GPollFD> fd) {
        this.gst_poll_get_read_gpollfd(Pointer.pointerTo(this, GstPoll.class), Pointer.getPeer(fd));
    }

    protected native boolean gst_poll_read_control(
        @Ptr
        long set);

    public boolean read_control() {
        return this.gst_poll_read_control(Pointer.pointerTo(this, GstPoll.class));
    }

    protected native boolean gst_poll_remove_fd(
        @Ptr
        long set,
        @Ptr
        long fd);

    public boolean remove_fd(Pointer fd) {
        return this.gst_poll_remove_fd(Pointer.pointerTo(this, GstPoll.class), Pointer.getPeer(fd));
    }

    protected native void gst_poll_restart(
        @Ptr
        long set);

    public void restart() {
        this.gst_poll_restart(Pointer.pointerTo(this, GstPoll.class));
    }

    protected native boolean gst_poll_set_controllable(
        @Ptr
        long set, boolean controllable);

    public boolean set_controllable(boolean controllable) {
        return this.gst_poll_set_controllable(Pointer.pointerTo(this, GstPoll.class), controllable);
    }

    protected native void gst_poll_set_flushing(
        @Ptr
        long set, boolean flushing);

    public void set_flushing(boolean flushing) {
        this.gst_poll_set_flushing(Pointer.pointerTo(this, GstPoll.class), flushing);
    }

    protected native int gst_poll_wait(
        @Ptr
        long set, Object timeout);

    public int wait(Object timeout) {
        return this.gst_poll_wait(Pointer.pointerTo(this, GstPoll.class), timeout);
    }

    protected native boolean gst_poll_write_control(
        @Ptr
        long set);

    public boolean write_control() {
        return this.gst_poll_write_control(Pointer.pointerTo(this, GstPoll.class));
    }

    @Ptr
    protected native long gst_poll_new(boolean controllable);

    public Pointer _new(boolean controllable) {
        return Pointer.pointerToAddress(this.gst_poll_new(controllable));
    }

    @Ptr
    protected native long gst_poll_new_timer();

    public Pointer new_timer() {
        return Pointer.pointerToAddress(this.gst_poll_new_timer());
    }

}
