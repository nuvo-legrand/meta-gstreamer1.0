include gstreamer1.0-plugins-ugly.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=a6f89e2100d9b6cdffcea4f398e37343 \
                    file://tests/check/elements/xingmux.c;beginline=1;endline=21;md5=4c771b8af188724855cb99cadd390068 "

SRC_URI[md5sum] = "239f055afb4ec0cf5ff8cde5a4a5bb9b"
SRC_URI[sha256sum] = "d581592a82cf3930361430d38436c30a58d8b6c249cad18f7f213b203e206d46"
S = "${WORKDIR}/gst-plugins-ugly-${PV}"

