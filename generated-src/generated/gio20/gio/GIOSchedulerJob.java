
package generated.gio20.gio;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GIOSchedulerJob
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GIOSchedulerJob() {
        super();
    }

    public GIOSchedulerJob(Pointer pointer) {
        super(pointer);
    }

    protected native boolean g_io_scheduler_job_send_to_mainloop(
        @Ptr
        long job,
        @Ptr
        long func,
        @Ptr
        long user_data,
        @Ptr
        long notify);

    public boolean send_to_mainloop(Pointer func, Pointer user_data, Pointer notify) {
        return this.g_io_scheduler_job_send_to_mainloop(Pointer.pointerTo(this, GIOSchedulerJob.class).getPeer(), Pointer.getPeer(func), Pointer.getPeer(user_data), Pointer.getPeer(notify));
    }

    protected native void g_io_scheduler_job_send_to_mainloop_async(
        @Ptr
        long job,
        @Ptr
        long func,
        @Ptr
        long user_data,
        @Ptr
        long notify);

    public void send_to_mainloop_async(Pointer func, Pointer user_data, Pointer notify) {
        this.g_io_scheduler_job_send_to_mainloop_async(Pointer.pointerTo(this, GIOSchedulerJob.class).getPeer(), Pointer.getPeer(func), Pointer.getPeer(user_data), Pointer.getPeer(notify));
    }

}
