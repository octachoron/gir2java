
package generated.gio20.gio;

import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GIOSchedulerJob
    extends StructObject
{


    public GIOSchedulerJob() {
        super();
    }

    public GIOSchedulerJob(Pointer pointer) {
        super(pointer);
    }

    protected native boolean g_io_scheduler_job_send_to_mainloop(
        @Ptr
        long job, Object func, Pointer user_data, Object notify);

    public boolean send_to_mainloop(Object func, Pointer user_data, Object notify) {
        return this.g_io_scheduler_job_send_to_mainloop(Pointer.pointerTo(this, GIOSchedulerJob.class), func, user_data, notify);
    }

    protected native void g_io_scheduler_job_send_to_mainloop_async(
        @Ptr
        long job, Object func, Pointer user_data, Object notify);

    public void send_to_mainloop_async(Object func, Pointer user_data, Object notify) {
        this.g_io_scheduler_job_send_to_mainloop_async(Pointer.pointerTo(this, GIOSchedulerJob.class), func, user_data, notify);
    }

}
