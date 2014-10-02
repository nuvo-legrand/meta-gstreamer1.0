include gstreamer1.0-plugins-bad.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=73a5855a8119deb017f5f13cf327095d \
                    file://gst/tta/filters.h;beginline=12;endline=29;md5=8a08270656f2f8ad7bb3655b83138e5a \
                    file://COPYING.LIB;md5=21682e4e8fea52413fd26c60acb907e5 \
                    file://gst/tta/crc32.h;beginline=12;endline=29;md5=27db269c575d1e5317fffca2d33b3b50"
SRC_URI[md5sum] = "77c6bf4b7a328f03860a59171aa1bec5"
SRC_URI[sha256sum] = "a6840080c469d0db51d6d4d0f7c42c97b3c8c01942f24401c61b1ad36726b97c"
S = "${WORKDIR}/gst-plugins-bad-${PV}"

