gir2java
========

This is an experimental parser and generator that creates Java bindings sources from
[GObject Introspection](https://wiki.gnome.org/action/show/Projects/GObjectIntrospection) .gir XML files.
[XOM](http://www.xom.nu/) is used for parsing the XMLs. The generated Java code is built and exported using
[CodeModel](https://codemodel.java.net/). The native interoperability
library used is [BridJ](https://code.google.com/p/bridj/).

## Status

Currently, gir2java is capable of:
 * generating enums for ```<enumeration>``` and ```<bitfield>``` elements found in .girs
 * using ```<package>``` elements to generate package names
 * creating empty interfaces for opaque structs
 * creating classes for ```<record>``` and ```<class>``` elements with fields
 * tracking types defined in the .gir files, and resolving references to them
 * handling array types to some degree
 * reading a static mappings list
 * keeping a diagnostic list of referenced, and defined types, and their difference to help identify any external dependencies
 * parsing the given files in topologically sorted order based on includes, which means the parser should see type definitions before references to them
 * generating class-specific and namespace-wide functions/methods

While it currently seems that a modern system provides enough information in .gir files to generate a GStreamer bindings set from them down to GLib primitive types, a previous effort was made to generate low-level GLib/GObject bindings using a different approach at [gstreamer-1.x-java](https://github.com/octachoron/gstreamer-1.x-java). This is because GObject and below were expected to be special and not able to be generated from .gir files, especially following a [discussion](https://mail.gnome.org/archives/gir-devel-list/2014-July/msg00003.html) on gir-devel-list.

## Building

The repository contains an Eclipse (3.8.1) project that you can import straight to your workspace. You can run the Gir2Java class, which will print usage information.

An Ant buildfile is also provided. To try and build a set of bindings to the point of having generated class files, put your input .gir files into the ```gir``` directory, and run the ```compile-bindings``` target. It takes care of compiling gir2java, running the parser, and compiling the results. An ```ant clean``` might help if you encounter any problems. If you are not just curious about the layout of the generated code, this step is definitely recommended, as an example output is already present in the generated-src directory, and it is not cleared before generation. Compile-time errors in the generated code may still occur, unfortunately.

GLib, GObject, Gio, GModule, Gst-1.0, GstBase-1.0, and GstVideo-1.0, however, should build without errors on an Ubuntu 14.04 amd64 system.

## Testing

There is a ```run-tests``` build target you can run, which generates and compiles everything, then runs all the test cases. Currently, you should see a simple GList test, a test that plays a video file using a playbin, and one that assembles and runs a simple video pipeline.
