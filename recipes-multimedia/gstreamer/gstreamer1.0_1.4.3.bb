include gstreamer1.0.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=6762ed442b3822387a51c92d928ead0d \
                    file://gst/gst.h;beginline=1;endline=21;md5=e059138481205ee2c6fc1c079c016d0d"

SRC_URI = " \
    http://gstreamer.freedesktop.org/src/gstreamer/gstreamer-${PV}.tar.xz \
    file://0001-Fix-crash-with-gst-inspect.patch \
    file://0001-scripts-Handle-gst-python-in-gst-uninstalled.patch \
    file://0002-capsfilter-Push-pending-events-before-a-buffer-also-.patch \
    file://0003-queue2-update-segment-position-on-GAP-events-to-calc.patch \
    file://0004-queue-update-segment-position-on-GAP-events-to-calcu.patch \
    file://0005-multiqueue-update-segment-position-on-GAP-events-to-.patch \
    file://0006-queue-Add-missing-break-in-switch.patch \
    file://0007-multiqueue-don-t-lock-multiqueue-when-pushing-serial.patch \
"

PRINC := "${@int(PRINC) + 1}"

SRC_URI[md5sum] = "7934fd965bbe1398f0ff1edeb7f1fd89"
SRC_URI[sha256sum] = "11f155784d28b85a12b50d2fc8f91c6b75d9ca325cc76aaffba1a58d4c9549c9"

S = "${WORKDIR}/gstreamer-${PV}"

