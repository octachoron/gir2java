
package generated.glib20.glib;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("glib-2.0")
public class GTestSuite
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GTestSuite() {
        super();
    }

    public GTestSuite(Pointer pointer) {
        super(pointer);
    }

    protected native void g_test_suite_add(
        @Ptr
        long suite,
        @Ptr
        long test_case);

    public void add(Pointer<GTestCase> test_case) {
        this.g_test_suite_add(Pointer.pointerTo(this, GTestSuite.class).getPeer(), Pointer.getPeer(test_case));
    }

    protected native void g_test_suite_add_suite(
        @Ptr
        long suite,
        @Ptr
        long nestedsuite);

    public void add_suite(Pointer nestedsuite) {
        this.g_test_suite_add_suite(Pointer.pointerTo(this, GTestSuite.class).getPeer(), Pointer.getPeer(nestedsuite));
    }

}
