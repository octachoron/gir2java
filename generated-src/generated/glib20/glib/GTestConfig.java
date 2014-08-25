
package generated.glib20.glib;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("glib-2.0")
public class GTestConfig
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GTestConfig() {
        super();
    }

    public GTestConfig(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public boolean gtestconfig_field_test_initialized() {
        return this.io.getBooleanField(this, 0);
    }

    @Field(0)
    public GTestConfig gtestconfig_field_test_initialized(boolean gtestconfig_field_test_initialized) {
        this.io.setBooleanField(this, 0, gtestconfig_field_test_initialized);
        return this;
    }

    @Field(1)
    public boolean gtestconfig_field_test_quick() {
        return this.io.getBooleanField(this, 1);
    }

    @Field(1)
    public GTestConfig gtestconfig_field_test_quick(boolean gtestconfig_field_test_quick) {
        this.io.setBooleanField(this, 1, gtestconfig_field_test_quick);
        return this;
    }

    @Field(2)
    public boolean gtestconfig_field_test_perf() {
        return this.io.getBooleanField(this, 2);
    }

    @Field(2)
    public GTestConfig gtestconfig_field_test_perf(boolean gtestconfig_field_test_perf) {
        this.io.setBooleanField(this, 2, gtestconfig_field_test_perf);
        return this;
    }

    @Field(3)
    public boolean gtestconfig_field_test_verbose() {
        return this.io.getBooleanField(this, 3);
    }

    @Field(3)
    public GTestConfig gtestconfig_field_test_verbose(boolean gtestconfig_field_test_verbose) {
        this.io.setBooleanField(this, 3, gtestconfig_field_test_verbose);
        return this;
    }

    @Field(4)
    public boolean gtestconfig_field_test_quiet() {
        return this.io.getBooleanField(this, 4);
    }

    @Field(4)
    public GTestConfig gtestconfig_field_test_quiet(boolean gtestconfig_field_test_quiet) {
        this.io.setBooleanField(this, 4, gtestconfig_field_test_quiet);
        return this;
    }

    @Field(5)
    public boolean gtestconfig_field_test_undefined() {
        return this.io.getBooleanField(this, 5);
    }

    @Field(5)
    public GTestConfig gtestconfig_field_test_undefined(boolean gtestconfig_field_test_undefined) {
        this.io.setBooleanField(this, 5, gtestconfig_field_test_undefined);
        return this;
    }

}
