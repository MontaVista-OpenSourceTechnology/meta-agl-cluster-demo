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
    "

# fonts
TTF_FONTS = " \
    ttf-bitstream-vera \
    ttf-dejavu-sans \
    ttf-dejavu-sans-mono \
    ttf-dejavu-serif \
    source-han-sans-cn-fonts \
    source-han-sans-jp-fonts \
    source-han-sans-tw-fonts \
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
    connman \
    connman-client \
    connman-tools \
    cluster-connman-conf \
    iproute2 \
    dhcp-client \
    ${TTF_FONTS} \
    ${AGL_APPS} \
    ${AGL_APIS} \
"
