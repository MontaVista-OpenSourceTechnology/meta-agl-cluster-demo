SUMMARY     = "Minimal cluster demo gauges that can be used standalone"
DESCRIPTION = "AGL HMI Application for demonstrating instrument cluster gauges as a wayland compositor"
HOMEPAGE    = "https://gerrit.automotivelinux.org/gerrit/#/admin/projects/apps/agl-cluster-demo-gauges"
SECTION     = "apps"

LICENSE     = "Apache-2.0 & BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ae6497158920d9524cf208c09cc4c984 \
                    file://app/cluster-gauges.qml;beginline=10;endline=49;md5=54187d50b29429abee6095fe8b7c1a78"

SRC_URI = "gitsm://gerrit.automotivelinux.org/gerrit/apps/agl-cluster-demo-gauges;protocol=https;branch=${AGL_BRANCH}"
SRCREV  = "${AGL_APP_REVISION}"

PV = "1.0+git${SRCPV}"
S  = "${WORKDIR}/git"

# build-time dependencies
DEPENDS += "qtquickcontrols2 qtwebsockets"

inherit pkgconfig cmake_qt5 aglwgt

RDEPENDS_${PN} += " \
	qtquickcontrols \
	qtquickcontrols-qmlplugins \
	qtquickcontrols2 \
	qtquickcontrols2-qmlplugins \
	qtwebsockets \
	qtwebsockets-qmlplugins \
	kms-conf \
"
