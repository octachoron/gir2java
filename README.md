gir2java
========

This is an experimental parser and generator that creates Java bindings sources from
[GObject Introspection](https://wiki.gnome.org/action/show/Projects/GObjectIntrospection) .gir XML files.
[XOM](http://www.xom.nu/) is used for parsing the XMLs. The generated Java code is built and exported using
[CodeModel](https://codemodel.java.net/). The native interoperability
library used is [BridJ](https://code.google.com/p/bridj/).

## Status

Currently, gir2java is capable of:
 * generating enums for enumeration elements found in .girs
 * making some sense of packages and namespaces
 * creating empty interfaces for opaque structs
 * creating the beginnings of classes for ```<record>``` elements with fields

This is an experiment, and will likely become a part of [gstreamer-1.x-java](https://github.com/octachoron/gstreamer-1.x-java)
on top of its low-level bindings.

## Building

The repository contains an Eclipse (3.8.1) project that you can import straight to your workspace. There is no build file yet,
just run the Gir2Java class from Eclipse.
