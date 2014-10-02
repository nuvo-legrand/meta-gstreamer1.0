include gstreamer1.0-plugins-good.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=a6f89e2100d9b6cdffcea4f398e37343 \
                    file://common/coverage/coverage-report.pl;beginline=2;endline=17;md5=a4e1830fce078028c8f0974161272607 \
                    file://gst/replaygain/rganalysis.c;beginline=1;endline=23;md5=b60ebefd5b2f5a8e0cab6bfee391a5fe"
SRC_URI[md5sum] = "534ca03c00361d940008d36ac5c45966"
SRC_URI[sha256sum] = "5876a74402f2a24d1d3ae9163c32466bdc7a565696dddeef65e6a9a93efc5537"
S = "${WORKDIR}/gst-plugins-good-${PV}"

