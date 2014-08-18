
package generated.gio20.gio;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GMenu
    extends GMenuModel
{


    static {
        BridJ.register();
    }

    public GMenu() {
        super();
    }

    public GMenu(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected static native long g_menu_new();

    public static Pointer gmenu__new() {
        return Pointer.pointerToAddress(GMenu.g_menu_new());
    }

    protected native void g_menu_append(
        @Ptr
        long menu,
        @Ptr
        long label,
        @Ptr
        long detailed_action);

    public void append(Pointer label, Pointer detailed_action) {
        this.g_menu_append(Pointer.pointerTo(this, GMenu.class).getPeer(), Pointer.getPeer(label), Pointer.getPeer(detailed_action));
    }

    protected native void g_menu_append_item(
        @Ptr
        long menu,
        @Ptr
        long item);

    public void append_item(Pointer<GMenuItem> item) {
        this.g_menu_append_item(Pointer.pointerTo(this, GMenu.class).getPeer(), Pointer.getPeer(item));
    }

    protected native void g_menu_append_section(
        @Ptr
        long menu,
        @Ptr
        long label,
        @Ptr
        long section);

    public void append_section(Pointer label, Pointer<GMenuModel> section) {
        this.g_menu_append_section(Pointer.pointerTo(this, GMenu.class).getPeer(), Pointer.getPeer(label), Pointer.getPeer(section));
    }

    protected native void g_menu_append_submenu(
        @Ptr
        long menu,
        @Ptr
        long label,
        @Ptr
        long submenu);

    public void append_submenu(Pointer label, Pointer<GMenuModel> submenu) {
        this.g_menu_append_submenu(Pointer.pointerTo(this, GMenu.class).getPeer(), Pointer.getPeer(label), Pointer.getPeer(submenu));
    }

    protected native void g_menu_freeze(
        @Ptr
        long menu);

    public void freeze() {
        this.g_menu_freeze(Pointer.pointerTo(this, GMenu.class).getPeer());
    }

    protected native void g_menu_insert(
        @Ptr
        long menu, int position,
        @Ptr
        long label,
        @Ptr
        long detailed_action);

    public void insert(int position, Pointer label, Pointer detailed_action) {
        this.g_menu_insert(Pointer.pointerTo(this, GMenu.class).getPeer(), position, Pointer.getPeer(label), Pointer.getPeer(detailed_action));
    }

    protected native void g_menu_insert_item(
        @Ptr
        long menu, int position,
        @Ptr
        long item);

    public void insert_item(int position, Pointer<GMenuItem> item) {
        this.g_menu_insert_item(Pointer.pointerTo(this, GMenu.class).getPeer(), position, Pointer.getPeer(item));
    }

    protected native void g_menu_insert_section(
        @Ptr
        long menu, int position,
        @Ptr
        long label,
        @Ptr
        long section);

    public void insert_section(int position, Pointer label, Pointer<GMenuModel> section) {
        this.g_menu_insert_section(Pointer.pointerTo(this, GMenu.class).getPeer(), position, Pointer.getPeer(label), Pointer.getPeer(section));
    }

    protected native void g_menu_insert_submenu(
        @Ptr
        long menu, int position,
        @Ptr
        long label,
        @Ptr
        long submenu);

    public void insert_submenu(int position, Pointer label, Pointer<GMenuModel> submenu) {
        this.g_menu_insert_submenu(Pointer.pointerTo(this, GMenu.class).getPeer(), position, Pointer.getPeer(label), Pointer.getPeer(submenu));
    }

    protected native void g_menu_prepend(
        @Ptr
        long menu,
        @Ptr
        long label,
        @Ptr
        long detailed_action);

    public void prepend(Pointer label, Pointer detailed_action) {
        this.g_menu_prepend(Pointer.pointerTo(this, GMenu.class).getPeer(), Pointer.getPeer(label), Pointer.getPeer(detailed_action));
    }

    protected native void g_menu_prepend_item(
        @Ptr
        long menu,
        @Ptr
        long item);

    public void prepend_item(Pointer<GMenuItem> item) {
        this.g_menu_prepend_item(Pointer.pointerTo(this, GMenu.class).getPeer(), Pointer.getPeer(item));
    }

    protected native void g_menu_prepend_section(
        @Ptr
        long menu,
        @Ptr
        long label,
        @Ptr
        long section);

    public void prepend_section(Pointer label, Pointer<GMenuModel> section) {
        this.g_menu_prepend_section(Pointer.pointerTo(this, GMenu.class).getPeer(), Pointer.getPeer(label), Pointer.getPeer(section));
    }

    protected native void g_menu_prepend_submenu(
        @Ptr
        long menu,
        @Ptr
        long label,
        @Ptr
        long submenu);

    public void prepend_submenu(Pointer label, Pointer<GMenuModel> submenu) {
        this.g_menu_prepend_submenu(Pointer.pointerTo(this, GMenu.class).getPeer(), Pointer.getPeer(label), Pointer.getPeer(submenu));
    }

    protected native void g_menu_remove(
        @Ptr
        long menu, int position);

    public void remove(int position) {
        this.g_menu_remove(Pointer.pointerTo(this, GMenu.class).getPeer(), position);
    }

    protected native void g_menu_remove_all(
        @Ptr
        long menu);

    public void remove_all() {
        this.g_menu_remove_all(Pointer.pointerTo(this, GMenu.class).getPeer());
    }

}
