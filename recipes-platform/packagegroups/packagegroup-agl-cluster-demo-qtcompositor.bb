SUMMARY = "The software for AGL Cluster Demo Qtwayland Compositor"
DESCRIPTION = "A set of packages belong to AGL Cluster Demo Qtwayland Compositor"

LICENSE = "MIT"

inherit packagegroup

PACKAGES = "\
    packagegroup-agl-cluster-demo-qtcompositor \
    "

ALLOW_EMPTY_${PN} = "1"

RDEPENDS_${PN} += "\
    packagegroup-agl-profile-cluster-qtcompositor \
    "

AGL_SERVICE = " \
    agl-service-bluetooth \
    agl-service-can-low-level \
    agl-service-data-persistence \
    agl-service-gps \
    agl-service-network \
    agl-service-unicens \
    agl-service-hvac \
    agl-service-nfc \
    agl-service-identity-agent \
    "

SMARTDEVICELINK = "${@bb.utils.contains('DISTRO_FEATURES', 'agl-sdl', \
    'sdl-core', '', d)}"

# fonts
TTF_FONTS = " \
    ttf-bitstream-vera \
    ttf-dejavu-sans \
    ttf-dejavu-sans-mono \
    ttf-dejavu-serif \
    "

AGL_APPS = " \
    cluster-gauges-qtcompositor \
    "

RDEPENDS_${PN}_append = " \
    libva-utils \
    linux-firmware-ralink \
    connman \
    connman-client \
    connman-tools \
    cluster-connman-conf \
    iproute2 \
    dhcp-client \
    can-utils \
    most \
    ${TTF_FONTS} \
    ${AGL_SERVICE} \
    ${AGL_APPS} \
    ${SMARTDEVICELINK} \
"
