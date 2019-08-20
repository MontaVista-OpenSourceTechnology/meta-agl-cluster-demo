SUMMARY = "The software for demo platform of AGL cluster profile"
DESCRIPTION = "A set of packages belong to AGL Cluster Demo Platform"

LICENSE = "MIT"

inherit packagegroup

PACKAGES = "\
    packagegroup-agl-cluster-demo-platform \
    "

ALLOW_EMPTY_${PN} = "1"

RDEPENDS_${PN} += "\
    packagegroup-agl-profile-cluster-qt5 \
    packagegroup-agl-ttf-fonts \
    packagegroup-agl-source-han-sans-ttf-fonts \
    packagegroup-agl-networking \
    "


AGL_APPS = " \
    cluster-dashboard \
    cluster-receiver \
    "

AGL_APIS = " \
    agl-service-windowmanager \
    "

RDEPENDS_${PN}_append = " \
    wayland-ivi-extension \
    cluster-windowmanager-conf \
    hmi-debug \
    libva-utils \
    linux-firmware-ralink \
    ${AGL_APPS} \
    ${AGL_APIS} \
"
